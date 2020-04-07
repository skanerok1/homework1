import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите значение для нахождения факториала: ");
            Scanner input = new Scanner(System.in);
            int fact = input.nextInt();
            System.out.println("факториал равен ");
            System.out.println(factorial(fact).toString());
        }

    }

    static BigInteger factorial(int fac) {
        BigInteger list = BigInteger.valueOf(1);
        for (int i = 1; i <= fac; i++) {
            list = list.multiply(BigInteger.valueOf(i));
        }
        return list;

    }
}
