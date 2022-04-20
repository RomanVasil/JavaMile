public class Main {
    public static void main(String[] args) {

        long price = 1010;    // стоимость билета
        long priseMile = 20;  // стоимость одной бонусной милли

        long mile = price / priseMile;  // рассчет количества бонусных милль
        System.out.println(mile + " миль(и) начисленно");  //вывод на экран
    }
}
