package in.MeenaCoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("Aryan",40);
        map.put("Bharat",79);
        map.put("Swati",100);
        map.put("Mayank",40);

        System.out.println(map.size());
        System.out.println(map.get("Bharat"));
        System.out.println(map.containsKey("Mintu"));
        System.out.println(map.containsKey("Aryan"));

    }
}
