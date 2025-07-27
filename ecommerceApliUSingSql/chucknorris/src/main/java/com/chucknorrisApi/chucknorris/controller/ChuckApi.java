package com.chucknorrisApi.chucknorris.controller;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChuckApi {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.chucknorris.io/jokes/random");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder responseContent = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            responseContent.append(line);
        }
        reader.close();
        connection.disconnect();

        // Parse the JSON response using Jackson
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(responseContent.toString());

        // Extract the "value" field from the response
        String joke = jsonNode.get("value").asText();
        System.out.println(joke);
    }
}
