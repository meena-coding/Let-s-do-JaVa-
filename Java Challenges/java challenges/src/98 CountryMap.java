import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class CountryMap {

    public static void main(String[] args) {

        Map<String, String> countryMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        countryMap.put("India","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Japan","Tokyo");
        countryMap.put("Colombia","Bogota");
        countryMap.put("Bangladesh","Dhaka");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Name of The Country: ");
        String country = sc.next();

        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));

        }else{
            System.out.printf("Sorry, We Don't Know the Capital Of %s", country);
        }
    }
}

