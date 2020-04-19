package org.example;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File json = new File("src/main/resources/Organizers.json");
        List<Organizer> organizerList = mapper.readValue(json, new TypeReference<List<Organizer>>() {});
        File json2 = new File("src/main/resources/Places.json");
        List<Place2> placesList = mapper.readValue(json2, new TypeReference<List<Place2>>() {});

        Organizer x = organizerList.get(300);
        Place2 z= placesList.get(5);
        Place y = new Place(10,"stret","zip","city",00.55,55.55);
        System.out.println(x.getId() + "  " + x.getDesignation());
        System.out.println(y.getId() + "  " + y.getName()+" "+y.getCity()+" "+y.getLng());
        System.out.println(z.getId() + "  " + z.getName()+" "+z.getCity()+" "+z.getLng());

    }
}
