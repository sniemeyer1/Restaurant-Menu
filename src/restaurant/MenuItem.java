package restaurant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuItem {
    private boolean isNew;
    private String name;
    private double price;
    private String category;
    private String dateAdded = new SimpleDateFormat("MM.dd.yyyy").format(new Date());

    public MenuItem(String name, boolean isNew, double price, String category, String dateAdded){
        this.name = name;
        this.isNew = isNew;
        this.price = price;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public String toString(){
        if(!isNew) {
            return  "---------------" + "\n" +
                    getName() + "\n" +
                    "$" + getPrice();
        }else{
            return
                    "---------------" + "\n" +
                    "*NEW ITEM* " + getDateAdded() + "\n" +
                    getName() + "\n" +
                    "$" + getPrice();

        }
    }

    public void setDateAdded(String aDateAdded) {
        dateAdded = aDateAdded;
    }

    public String getDateAdded(){
        return dateAdded;
    }

//    public void getDate() {
//        System.out.println("Menu updated: " + dateAdded);
//    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aIsNew) {
        isNew = aIsNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        aName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }


}
