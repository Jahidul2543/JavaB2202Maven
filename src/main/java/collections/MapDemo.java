package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap is kind of Map class. HashMap object can hold or store Key, Value pair time of data
        // 1 Create container/object
        HashMap<String, String> students = new HashMap<>();  // Key Type: String, Value Type: String
        // Does students container has any Key Value Data already?
        // 2. Let's insert some Key value data inside the students container

        students.put("name", "Smrity");
        students.put("id", "102");
        students.put("course", "QA");

        // 3. Get value from the HashMap object
        System.out.println(students.get("id"));

        for(Map.Entry<String, String> entry : students.entrySet()){
            System.out.println(
                    "Key: " + entry.getKey()
                            +
                    " Value: " + entry.getValue());
        }

    }
}
