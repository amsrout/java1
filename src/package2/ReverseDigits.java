package package2;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int a = number % 10; // остаток от деления 456 на 10 будет 6 - первое число
        int b = number / 10 % 10; // 456 делим на 10 = 45. остаток от деления 45 на 10 будет 5 - второе число
        int c = number / 100; // 456 делим на 100 = 4 - третье число
        return a*100 + b*10 + c; // первое число умножаем на сотни, второе на десятки и складываем
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(456));
    }
}