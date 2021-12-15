package com.myfirsttest.testing.Repository;

import com.myfirsttest.testing.Controller.ListingController;
import com.myfirsttest.testing.Model.Listing;
import com.myfirsttest.testing.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ListingRepository extends MongoRepository<Listing, String> {
    List<Listing> getAllListings();
    Listing findListingById(String listingId);
}
