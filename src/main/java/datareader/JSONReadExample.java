package datareader;

// Java program to read JSON from a file

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONReadExample
{
    public static void main(String[] args) throws Exception
    {
        //01. Step One - Locate the file
        FileReader fileReader = new FileReader("data/data.json");

        // 02. Step 02 - Bring/convert JSON file information in a Java Object
        // parsing file "data.json"
        Object obj = new JSONParser().parse(fileReader);


        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;

        // 03. Step 03 - Take out information from the java object
        // getting firstName and lastName
        String firstName = (String) jo.get("firstName");
        String lastName = (String) jo.get("lastName");

        // 04. Step 04 - Consume the information
        System.out.println(firstName);
        System.out.println(lastName);

        // 03. Step 03 - Take out information from the java object
        // getting age
        long age = (long) jo.get("age");
        // 04. Step 04 - Consume the information
        System.out.println(age);

        // getting address
        Map address = ((Map)jo.get("address"));

        // iterating address Map
        Iterator<Map.Entry> itr1 = address.entrySet().iterator();

        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        // getting phoneNumbers
        JSONArray ja = (JSONArray) jo.get("phoneNumbers");

        // iterating phoneNumbers or a json object
        Iterator itr2 = ja.iterator();

        while (itr2.hasNext())
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}

