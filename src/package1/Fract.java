package package1;

public class Fract {
    static double fractional(double num) {
        return num % 1;
    }

    public static void main(String[] args) {
        System.out.println(fractional(1.53));
    }
}
