package com.myfirsttest.testing.Repository;

import com.myfirsttest.testing.Controller.ListingController;
import com.myfirsttest.testing.Model.Listing;

import java.util.List;

public interface ListingRepository {
    List<Listing> getAllListings();
    Listing findById(String listingId);
}
