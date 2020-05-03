package package2;

public class ReverseDigits2 {
    public static int reverseDigits(int number) {
        int a = number / 100; // 123/100=1
        int b = number % 100 / 10; // остаток от деления 123 на 100 = 23. 23 делим на 10 = 2
        int c = number % 10; // остаток от деления 123 на 10 = 3

        return c*100 + b*10 + a;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(678));
    }

}
