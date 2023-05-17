package ro.sda.spring._1_;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JsonProcessor {
    public static void main(String[] args) {

        System.out.println(userToJson(new User("Manaila", "Catalin", 25, true)));

        System.out.println(arrayToJson(List.of(
                new User("Manaila", "Catalin", 25, true),
                new User("Messi", "Leo", 35, false)
        )));

    }

    private static JSONObject userToJson(User user){
        return new JSONObject(user);
    }

    private static JSONArray arrayToJson(List<User> list){
        return new JSONArray(list);
    }
}