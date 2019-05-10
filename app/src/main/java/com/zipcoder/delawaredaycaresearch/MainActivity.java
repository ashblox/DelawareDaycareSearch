package com.zipcoder.delawaredaycaresearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
        protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.text_view_result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.delaware.gov/resource/afgx-7t5s.json/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LicensedChildCareAPI licensedChildCareAPI = retrofit.create(LicensedChildCareAPI.class);

        StartActivity activity = new StartActivity();

        Call<List<Daycare>> call = licensedChildCareAPI.get5StarDaycares(activity.getType());

        call.enqueue(new Callback<List<Daycare>>() {
            @Override
            public void onResponse(Call<List<Daycare>> call, Response<List<Daycare>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<Daycare> daycares = response.body();
                for (Daycare daycare : daycares) {
                    String content = "Name: " + daycare.getResource_name() + "\n";
                    content += "Age range: " + daycare.getAge_range() + "\n";
                    content += "Hours: " + daycare.getSite_opens_at() + " - " + daycare.getSite_closes_at() + "\n";
                    content += "Stars level: " + daycare.getDelaware_stars_level() + "\n";
                    content += "\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Daycare>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });

    }
}
