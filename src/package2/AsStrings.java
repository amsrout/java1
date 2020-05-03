package package2;

public class AsStrings {
    static int addAsStrings(int n1, int n2) {
        String s1 = String.valueOf(n1);
        String s2 = String.valueOf(n2);
        String s3 = s1 + s2;
        int n3 = Integer.valueOf(s3);
        return n3;
    }

    public static void main(String[] args) {
        System.out.println(addAsStrings(1, 2));
        System.out.println(addAsStrings(2, 1));
    }
}
