package com.myfirsttest.testing;

import com.myfirsttest.testing.API.RapidAPI;
import com.myfirsttest.testing.API.tempListing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class apiThread extends Thread{

    // int to determine which api to call
    // 1 - rapidAPI
    private int id;

    public apiThread(int id){
        this.id = id;
    }
    public void run(){
        if (id == 1){
            // call api
            List<tempListing> data = new ArrayList();
            try {
                data = RapidAPI.APICall();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // write to file
            try {
                PrintWriter writer = new PrintWriter(new FileWriter("listings1.txt"));
                for (tempListing log: data) {
                    writer.print(log);
                    writer.println();
                }
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
