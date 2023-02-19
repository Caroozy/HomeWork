package series3;

public class Item {

    private static int count=1;
    private long id=count;

    private String name;

    private int amount=100;

    private String category;

    public Item(long id, String name, int amount, String category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.category = category;
        count++;
    }

    public Item(int amount, String category) {
        this.amount = amount;
        this.category = category;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Item.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}
