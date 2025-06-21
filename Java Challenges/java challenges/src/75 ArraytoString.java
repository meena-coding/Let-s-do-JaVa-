class ArrayToString {

    public static void main(String[] args) {

        String [] arr = ArrayUtility.inputStringArray();

        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
