import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJson {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("D:\\JavaTraining\\SampleTestNGProj\\student.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            String course = (String)jsonObject.get("course");
            JSONArray subjects = (JSONArray)jsonObject.get("subjects");
            System.out.println("name: " + name);
            System.out.println("course: " + course);
            System.out.println("subjects:");
            Iterator iterator = subjects.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    }


