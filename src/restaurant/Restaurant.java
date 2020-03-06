package restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String [] args) {

        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();

        MenuItem fries = new MenuItem("French Fries", true, 5.0, "appetizer", "01.01.2020");
        menuList.add(fries);

        MenuItem soup = new MenuItem("Soup", false, 3.0, "appetizer", "01.09.2020");
        menuList.add(soup);

        MenuItem burger = new MenuItem("Burger", true, 7.0, "entree", "01.09.2020");
        menuList.add(burger);

        MenuItem hotdog = new MenuItem("Hot Dog", false, 6.0, "entree", "01.15.2020");
        menuList.add(hotdog);

        MenuItem iceCream = new MenuItem("Ice Cream", true, 2.0, "dessert", "02.01.2020");
        menuList.add(iceCream);

        MenuItem cake = new MenuItem("Cake", false, 4.0, "dessert", "02.01.2020");
        menuList.add(cake);

        MenuItem salad = new MenuItem("Salad", true, 6.0, "appetizer", "03.01.2020");
        menuList.add(salad);

        for (MenuItem menuItem : menuList) {
                System.out.println(menuItem);
        }
        System.out.println(fries);

    }
}

