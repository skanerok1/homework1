public class Main {
    public static void main(String[] args) {
        int s = 900;
        int sec;
        int m;
        int min, h;
        int hour;
        int day, d, w;

        sec = s % 60;
        m = (s-sec)/60;
        min = m % 60;
        h = (m-min)/60;
        hour = h % 24;
        day = (h-hour)/ 24 ;
        d = day % 7;
        w = day/7;

        System.out.println(w + " недель " +d+ " суток "+ hour +" часов "+ min +" минут "+ sec +" секунд ");
    }
}
