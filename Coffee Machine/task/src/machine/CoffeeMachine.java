package machine;

import java.util.*;

public class CoffeeMachine {

    int water = 400;
    int milk = 540;
    int coffee_beans = 120;
    int cups = 9;
    int money = 550;
    int order;

    public static void main(String[] args) {
        CoffeeMachine cf = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);


//-------------------------------------------------------------------------------------------------------------------------------------------------
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = sc.next();

            if (input.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String Order = sc.next();
                if (Order.equals("back"))
                    continue;
                cf.order = Integer.parseInt(Order);
                if (cf.order == 1) { //espresso
                    if (cf.water >= 250)
                        cf.water -= 250;
                    else {
                        System.out.println("Sorry, not enough water!");
                        continue;
                    }
                    if (cf.coffee_beans >= 16)
                        cf.coffee_beans -= 16;
                    else {
                        System.out.println("Sorry, not enough coffee beans!");
                        continue;
                    }
                    cf.money += 4;
                    cf.cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (cf.order == 2) { //latte

                    if (cf.water >= 350)
                        cf.water -= 350;
                    else {
                        System.out.println("Sorry, not enough water!");
                        continue;
                    }
                    if (cf.milk >= 75)
                        cf.milk -= 75;
                    else {
                        System.out.println("Sorry, not enough milk!");
                        continue;
                    }
                    if (cf.coffee_beans >= 20)
                        cf.coffee_beans -= 20;
                    else {
                        System.out.println("Sorry, not enough coffee beans!");
                        continue;
                    }
                    cf.money += 7;
                    cf.cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                } else {  //cappuccino
                    if (cf.water >= 200)
                        cf.water -= 200;
                    else {
                        System.out.println("Sorry, not enough water!");
                        continue;
                    }
                    if (cf.milk >= 100)
                        cf.milk -= 100;
                    else {
                        System.out.println("Sorry, not enough milk!");
                        continue;
                    }
                    if (cf.coffee_beans >= 12)
                        cf.coffee_beans -= 12;
                    else {
                        System.out.println("Sorry, not enough coffee beans!");
                        continue;
                    }
                    cf.money += 6;
                    cf.cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                }


            } else if (input.equals("fill")) {
                int temp;
                System.out.println("Write how many ml of water do you want to add:");
                temp = sc.nextInt();
                cf.water += temp;
                System.out.println("Write how many ml of milk do you want to add:");
                temp = sc.nextInt();
                cf.milk += temp;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                temp = sc.nextInt();
                cf.coffee_beans += temp;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                temp = sc.nextInt();
                cf.cups += temp;
            } else if (input.equals("remaining")) {
                //start
                System.out.println("The coffee machine has:");
                System.out.println(cf.water + " of water");
                System.out.println(cf.milk + " of milk");
                System.out.println(cf.coffee_beans + " of coffee beans");
                System.out.println(cf.cups + " of disposable cups");
                System.out.println(cf.money + " of money");
                //end
            } else if (input.equals("take")) {
                System.out.println("I gave you $" + cf.money);
                cf.money = 0;
            } else {
                System.exit(0);
            }
        }//while ends

    }//main ends

}//class ends
