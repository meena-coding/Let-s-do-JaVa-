public class ForEachLoop {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Aryan","Bhartu", "Murti", "Muniraj", "Babu maan"
        };

//        printName(names);
        printNameForEach(names);
    }

    public static void printNameForEach(String[] names){

        for (String name : names ){
            System.out.println(name);
        }
    }

    public static void printName(String[] names){

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
