import java.util.Arrays;//c этим заданием чтото не выходит =(

public class Main {
    public static void main(String[] args) {
        int [] marks= {100, 123, 31, 0, 1, 0, 1, 9, 444, 1};
        System.out.println(Arrays.toString(marks));
        boolean go = true;
        while (go) {
            go = false;
            for (int i = 1; i < marks.length; i++) {
                if (marks[i] > marks[i - 1]) {
                    int x = marks[i];
                    marks[i] = marks[i - 1];
                    marks[i - 1] = x;
                    go = true;
                }
            }
        }
        System.out.println(Arrays.toString(marks));

        int sum = 0;
        for (int i = 1; i < marks.length - 1; i++) {
            sum += marks[i];
        }
        System.out.println("Сумма= " + sum);
    }

    }
