package com.myfirsttest.testing.API;

import com.myfirsttest.testing.Model.Listing;
import java.util.ArrayList;

public class Data {
    private ArrayList<tempListing> listings;

    // constructor for a list of the listings available
    Data(ArrayList<tempListing> listings) {
        this.listings = listings;
    }

    public void print() {
        for (tempListing l : listings) {
            System.out.println(l.getAddress());
            System.out.println(l.getBedrooms());
            System.out.println("");
        }
    }
}
