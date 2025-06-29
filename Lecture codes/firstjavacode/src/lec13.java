public class lec13 {
    public static void main(String []args){

        StringBuilder sb = new StringBuilder("Aryan");
        System.out.println(sb);

        //Character at index
        System.out.println(sb.charAt(2));

        //set character at index
        sb.setCharAt(0,'O');
        System.out.println(sb);

        //Insert function
        sb.insert(0,'T');
        System.out.println(sb);

        //To delete any character at index
        sb.delete(1,2); //Ending index is not countable.
        System.out.println(sb);

        //To add character to make a word (it won't affect the memory). Eg given below
        StringBuilder sn = new StringBuilder("h");
        sn.append("e");
        sn.append("l");
        sn.append("l");
        sn.append("o");
        System.out.println(sn);
        System.out.println(sn.length());

        //To reverse the string
        sn.reverse();
        System.out.println(sn);





    }
}
