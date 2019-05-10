package com.zipcoder.delawaredaycaresearch;

import android.location.Location;

import com.google.gson.annotations.SerializedName;

public class Daycare {
    @SerializedName("resource_id")
    private int license_number;
    private String site_county;
    private String resource_name;
    private String resource_name_reversed;
    @SerializedName("resource_type")
    private String childcare_type;
    private String enforcement_action;
    private String intent_to_revoke;
    private String site_street_address;
    private String site_city;
    private String site_state;
    private String site_zip_code;
    private String phone_number;
    private String age_range;
    private int capacity;
    private String site_opens_at;
    private String site_closes_at;
    private String special_conditions;
    private String financial_arrangements;
    private String delaware_stars_level;
    private String geocoded_location_address;
    private String geocoded_location_state;
    private String geocoded_location_zip;
    private String geocoded_location_city;
    private int count;
    private Location geocoded_location;

    public int getLicense_number() {
        return license_number;
    }

    public String getSite_county() {
        return site_county;
    }

    public String getResource_name() {
        return resource_name;
    }

    public String getResource_name_reversed() {
        return resource_name_reversed;
    }

    public String getChildcare_type() {
        return childcare_type;
    }

    public String getEnforcement_action() {
        return enforcement_action;
    }

    public String getIntent_to_revoke() {
        return intent_to_revoke;
    }

    public String getSite_street_address() {
        return site_street_address;
    }

    public String getSite_city() {
        return site_city;
    }

    public String getSite_state() {
        return site_state;
    }

    public String getSite_zip_code() {
        return site_zip_code;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAge_range() {
        return age_range;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSite_opens_at() {
        return site_opens_at;
    }

    public String getSite_closes_at() {
        return site_closes_at;
    }

    public String getSpecial_conditions() {
        return special_conditions;
    }

    public String getFinancial_arrangements() {
        return financial_arrangements;
    }

    public String getDelaware_stars_level() {
        return delaware_stars_level;
    }

    public String getGeocoded_location_address() {
        return geocoded_location_address;
    }

    public String getGeocoded_location_state() {
        return geocoded_location_state;
    }

    public String getGeocoded_location_zip() {
        return geocoded_location_zip;
    }

    public String getGeocoded_location_city() {
        return geocoded_location_city;
    }

    public int getCount() {
        return count;
    }

    public Location getGeocoded_location() {
        return geocoded_location;
    }
}
