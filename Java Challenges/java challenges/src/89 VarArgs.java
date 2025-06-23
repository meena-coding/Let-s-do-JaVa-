class VarArgs {

    public static void main(String[] args) {

        System.out.println(concatenate("Aryan","Meena"));
        System.out.println(concatenate("Aryan"));
        System.out.println(concatenate("Subscribe","to","Meena","Coding"));
    }

    public static String concatenate (String... str){

        StringBuilder sb = new StringBuilder();

        for (String s : str) {
            sb.append(s).append(" ");

        }
        return sb.toString();
    }
}
