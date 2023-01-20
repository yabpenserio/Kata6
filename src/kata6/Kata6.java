package kata6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import static java.util.stream.Collectors.joining;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Kata6 {

    public static void main(String[] args) throws MalformedURLException, IOException, JAXBException{
        URL url = new URL("https://jsonplaceholder.typicode.com/albums");
        Albums albums = new Albums();
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        JsonArray json = gson.fromJson(read(url), JsonArray.class);
        for (JsonElement jsonElement : json) {
            Album a = gson.fromJson(jsonElement, Album.class);
            albums.add(a);
           // System.out.println(a.toString());
           // System.out.println(albums.size());
           // System.out.println(albums.get(albums.size()-1).getUserId());
        }
        JAXBContext jaxbContext = JAXBContext.newInstance( Albums.class );
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(albums, System.out);
        
        
    }
    private static String read(URL url) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            return reader.lines().collect(joining());
        }           
    }
    
}
