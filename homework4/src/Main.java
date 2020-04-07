public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int radius = 17;
        if(radius >= (Math.sqrt(Math.pow(a,2) + Math.pow(b,2)))/2)
            System.out.println("Круглая карточка закроет весь квадрат");
        else
            System.out.println("Карточка слишком маленькая, квадрат не закроется");
    }
}
