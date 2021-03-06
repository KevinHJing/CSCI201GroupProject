package com.myfirsttest.testing.API;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myfirsttest.testing.Model.Listing;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;


public class RapidAPI {
    public static List<tempListing> APICall() throws IOException, InterruptedException {
        String uriBuilder = "https://realtymole-rental-estimate-v1.p.rapidapi.com/rentalPrice?";
        String uriBuilderEnd = "&latitude=34.0262912&longitude=-118.2859264";

        // take in all the parameters decided by the user
        String propertyParam = "Apartment";
        propertyParam = "&" + propertyParam.replace(" ", "&");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uriBuilder + propertyParam + uriBuilderEnd))
                .header("x-rapidapi-host", "realtymole-rental-estimate-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "5457e7597emshdb22cef9334d853p100d88jsnd524cdff5ce8")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        Data data = objectMapper.readValue(response.body(), Data.class);
        return data.getListings();
    }
}