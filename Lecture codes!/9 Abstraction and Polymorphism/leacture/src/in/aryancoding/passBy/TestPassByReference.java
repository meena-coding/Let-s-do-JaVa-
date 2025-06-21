package in.aryancoding.passBy;

public class TestPassByReference {

    public static void main(String[] args) {

        point first = new point(4,8);
        System.out.println("first: " + first);
        move(first);
        System.out.println("first: " + first);

    }

    public static void move(point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class point{
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String  toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }


}
