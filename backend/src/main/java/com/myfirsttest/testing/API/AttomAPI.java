package com.myfirsttest.testing.API;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myfirsttest.testing.Model.Listing;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;


public class AttomAPI {
    public static List<tempListing> APICall() throws IOException, InterruptedException {
        String uriBuilder = "https://api.gateway.attomdata.com/propertyapi/v1.0.0/property/detail?";
        String uriBuilderEnd = "&latitude=34.0262912&longitude=-118.2859264";

        String propertyParam = "id";
        propertyParam = "&" + propertyParam.replace(" ", "&");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uriBuilder + propertyParam + uriBuilderEnd))
                .header("attom", "api.gateway.attomdata.com/propertyapi/v1.0.0/")
                .header("apikey", "8ab5ae16d5918e270ad7d65120ea00e0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        Data data = objectMapper.readValue(response.body(), Data.class);
        data.print();
        return data.getListings();
    }
}