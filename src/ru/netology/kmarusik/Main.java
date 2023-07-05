package ru.netology.kmarusik;

public class Main {
    public static void main(String[] args) {
        /*
        int oneMilePrice = 20;
        int ticketPrice = 1840;
        int bonusMiles = ticketPrice / oneMilePrice;
        System.out.println("bonus miles: " + bonusMiles);
        */
        BonusMilesService service = new BonusMilesService();
        int price = 1840;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}