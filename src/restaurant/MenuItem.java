package restaurant;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private boolean isNew;
    private String name;
    private float price;
    private String category;
    private String dateAdded = new SimpleDateFormat("MM.dd.yyyy").format(new Date());

    public void getDate() {
        System.out.println("Menu updated: " + dateAdded);
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
