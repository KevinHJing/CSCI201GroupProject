package com.myfirsttest.testing.Controller;

import com.myfirsttest.testing.Model.Listing;
import com.myfirsttest.testing.Model.User;
import com.myfirsttest.testing.Repository.ListingRepository;
import com.myfirsttest.testing.Repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listing")
public class ListingController {

//    @Autowired
    private ListingRepository listingRepository;
//    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get-all")
    public ResponseEntity<List<Listing>> getAllListings(){
        return ResponseEntity.ok(listingRepository.getAllListings());
    }

    @GetMapping("/add-favorite")
    public ResponseEntity<String> addToFav(@RequestHeader User user, @RequestParam Listing listing){
        if (listingRepository.findById(listing.getListingID()) == null){
            return ResponseEntity.badRequest().body("No listing found");
        }
        user.addFavListing(listing);
        return ResponseEntity.ok("Added successfully");
    }

}
