public class Main {
    public static void main(String[] args) {
        int price = 5678; // стоимость билета
        int mile = 200; // стоимость 1 мили
        int amountOfMiles = price / mile; // количество миль

        System.out.println((("На ваш счет будет зачислено ") + (amountOfMiles) + (" миль")));
    }
}
