package package2; //Татьяна74

public class AsString2 {
    static int addAsStrings(int n1,int n2) {
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        String str3 = str1 + str2;
        int n3 = Integer.parseInt(str3);
        return n3;
    }

    public static void main(String[] args) {
        System.out.println(addAsStrings(1, 2));
        System.out.println(addAsStrings(2, 1));
    }
}
