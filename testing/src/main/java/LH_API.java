
import com.myfirsttest.testing.Model.Listing;

import java.io.IOException;
import java.util.Objects;
import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// request an access token

// info for now
public class LH_API {

    private String client_id = "public_sandbox";
    private String client_secret = "public_sandbox";

    public static void main(String[] args) throws Exception {
        String host = "https://api.listhub.com/odata/Property?$filter=PropertyType eq 'Residential Lease'";
        String charset = "UTF-8";
        String x_api_host = "api.listhub.com/odata/Property?$filter=PropertyType eq 'Residential Lease'";
        String x_api_key = "public_sandbox";
        String s = "";
        String query = String.format("s=%s", URLEncoder.encode(s, charset));
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

//         try {
//             OkHttpClient client = new OkHttpClient().newBuilder().build();
//             String builder = "https://api.listhub.com/odata/Property?$top=5";
//             Request request = new Request.Builder().url(builder).method("GET", null).addHeader(
//                     "Authorization",
//                     "YOUR AUTH KEY HERE")
//                     .build();
//             Response response = client.newCall(request).execute();

//             Gson gson = new GsonBuilder().registerTypeAdapter(Location.class, new MyDeserializer()).create();
// //            return gson.fromJson(Objects.requireNonNull(response.body()).string(), Location.class);
//         } catch (IOException ioe) {
//             ioe.printStackTrace();
//         }
// //        return null;
    }
}


// curl
curl -X POST 'https://api.listhub.com/oauth2/token' \
        --data grant_type=client_credentials \
        --data client_id=<client_id> \
        --data client_secret=<client_secret>


// make an API call using your token
curl 'https://api.listhub.com/odata/Property?$top=5' \
        -H 'Authorization: Bearer <access_token>'


        url -X POST 'https://api.listhub.com/oauth2/token' \
        --data grant_type=client_credentials \
        --data client_id=<client_id> \
        --data client_secret=<client_secret>
http

        POST /oauth2/token HTTP/1.1
        Host: api.listhub.com
        Content-Type: application/x-www-form-urlencoded
        cache-control: no-cache
        grant_type=client_credentials&client_id=<client_id>&client_secret=<client_secret>

// Once you have the access_token, pass it to the Syndication API in the Authorization header for every HTTP request:
 curl 'https://api.listhub.com/odata/Property?$top=5' \
         -H 'Authorization: Bearer <access_token>'