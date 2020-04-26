package package1;

public class Strings21 {
    static int addAsStrings(int n1, int n2) {
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        String result1 = str1 + str2; // или так str1 += str2; return str1
        return Integer.parseInt(result1);
    }

    public static void main(String[] args) {
        System.out.println(addAsStrings(1,2));
        System.out.println(addAsStrings(2,1));
    }
}
