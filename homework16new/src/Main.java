import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[15];
        for (int j = 0; j < mas.length; j++) {
            mas[j] = (int) (Math.random() * 10);
        }
        System.out.print(Arrays.toString(mas));
        System.out.println();
        for (int i = 0; i < mas.length / 2; i++) {
            int tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }
        System.out.print(Arrays.toString(mas));
    }
}
