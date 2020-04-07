import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        DataOutputStream fov;
        try {
            fov = new DataOutputStream(new BufferedOutputStream
                    (new FileOutputStream("vlad.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 100 + 1);
            fov.writeInt(a);
        }
        fov.close();

        DataInputStream f1;
        try {
            f1 = new DataInputStream(new BufferedInputStream
                    (new FileInputStream("vlad.txt")));
        } catch (FileNotFoundException e) {
            System.out.println(" File not found");
            return;
        }

        int f1Read;
        int k = 0;
        int count = 0;
        for (int i = 0; i <=20; i++) {
            try {
                f1Read = f1.readInt();
                System.out.print(f1Read + " | ");
                k += f1Read;
                count++;
            } catch (FileNotFoundException|EOFException e) {
                break;
            }
        }
        System.out.println("\nКоличество элементов: "+ count);
        System.out.println("Сумма элементов: "+ k);
        System.out.println("Cреднее арифметическое: " + k/count);
        f1.close();
    }
}