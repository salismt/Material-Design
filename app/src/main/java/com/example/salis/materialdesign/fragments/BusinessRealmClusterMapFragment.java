package com.example.salis.materialdesign.fragments;

import co.moonmonkeylabs.realmmapview.RealmClusterMapFragment;
import co.moonmonkeylabs.realmsfrestaurantdata.model.Business;

/**
 * Created by salis on 3/13/16.
 */
public class BusinessRealmClusterMapFragment extends RealmClusterMapFragment<Business> {

    @Override
    protected String getTitleColumnName() {
        return "name";
    }

    @Override
    protected String getLatitudeColumnName() {
        return "latitude";
    }

    @Override
    protected String getLongitudeColumnName() {
        return "longitude";
    }
}
