package in.MeenaCoding.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(); //<> is used to describe the data type. can also be keep empty (all data type will work), but if <String> then only Strings can be use and add further in list.


        strList.add("Aryan"); // to add String
        strList.add("Meena");

        strList.add(1," Muniraj "); // to add anything at particular index

        strList.remove(0); //to remove string at particular index.

        if(strList.contains("Meena")){   //to check if string exist in the list.

            System.out.println("Yes. meena exist in the list.");
            System.out.println(strList.indexOf("Meena"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));  // to get the string at particular index

        }
    }
}
