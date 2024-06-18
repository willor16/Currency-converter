package com.wilmer.currencyconverter.conections;

import com.google.gson.Gson;
import com.wilmer.currencyconverter.Main.Main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ApiConexion {
    public ValuesMoney typeMoney(String type){

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7ae484cde71b4b7d8736b8d5/latest/"+type))
                .build();
        HttpResponse<String> response;
        try {
             response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), ValuesMoney.class);
    }


}
