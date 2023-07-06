package ru.netology.kmarusik;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1840;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}