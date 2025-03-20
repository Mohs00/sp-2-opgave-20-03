import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }


    public void addTitle(Title title) {
        titles.add(title);
    }

    // Udregner samlet betaling for alle titler
    public double calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalties();
        }
        return total;
    }

    public String getName() {
        return name;
    }
}