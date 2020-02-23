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
}
