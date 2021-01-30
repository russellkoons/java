package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Russell";
//        player.health = 20;
//        player.weapon = "Bat";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Russell", 50, "Bat");
        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(50, true);

        System.out.println("initial page count is " + printer.getPagesPrinted());
        printer.printPages(4);
        System.out.println(printer.getPagesPrinted());
    }
}
