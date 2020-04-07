import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean sost = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                sost = true;
        }
        if (sost == true)
            System.out.println("Число является составным");
        else
            System.out.println("Число является простым");
    }
}
