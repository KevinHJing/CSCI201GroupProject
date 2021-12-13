// package com.myfirsttest.testing.API;
//
// import com.google.gson.Gson;
// import com.google.gson.GsonBuilder;
// import java.io.IOException;
// import java.net.URI;
// import java.net.http.HttpClient;
// import java.net.http.HttpRequest;
// import java.net.http.HttpResponse;
//
//
// public class RapidAPI {
//     public void APICall() throws IOException, InterruptedException {
//         String uriBuilder = "https://realtymole-rental-estimate-v1.p.rapidapi.com/rentalPrice?";
//         String uriBuilderEnd = "&latitude=34.0262912&longitude=-118.2859264";
//
//         // take in all the parameters decided by the user
//         String propertyParam = "Apartment";
//         propertyParam = "&" + propertyParam.replace(" ", "&");
//         HttpRequest request = HttpRequest.newBuilder()
//                 .uri(URI.create(uriBuilder + propertyParam + uriBuilderEnd))
//                 .header("x-rapidapi-host", "realtymole-rental-estimate-v1.p.rapidapi.com")
//                 .header("x-rapidapi-key", "5457e7597emshdb22cef9334d853p100d88jsnd524cdff5ce8")
//                 .method("GET", HttpRequest.BodyPublishers.noBody())
//                 .build();
//         HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//         Gson gson = new GsonBuilder().create();
//         Data data = gson.fromJson(response.body(), Data.class);
//         data.print();
//     }
// }