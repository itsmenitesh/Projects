package com.getsomejokes.jokes.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class RandromJokes {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.api-ninjas.com/v1/jokes?limit=3");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept", "application/json");
        InputStream responseStream = connection.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(responseStream);
        System.out.println(root.path("fact").asText());
    }
//    static ArrayList<String> al = new ArrayList<>();
//    @PostMapping(value = "/jokes")
//    public String saveJokes(@RequestBody String jokes){
//        al.add(jokes);
//        return "jokes Saved";
//    }
//    @GetMapping(value = "/jokes")
//    public String getJokes(){
//
//        al.add("What did the snail who was riding on the turtle's back say?\n" +"\n"+"Wheeeee!");
//        al.add("What do you call a lazy kangaroo? \n"+"\n"+"A pouch potato.");
//        al.add("Why do we tell actors to \"break a leg? \n"+"\n"+"Because every play has a cast.");
//        al.add("What does a pig put on dry skin? \n"+"\n"+"Oinkment.");
//        al.add("How do you open a banana?\n"+"\n"+"With a mon-key.");
//
//        int randomeNumber = 0+ (int)(Math.random() * ((al.size()-1-0)+1));
//        return al.get(randomeNumber);
//    }

}
