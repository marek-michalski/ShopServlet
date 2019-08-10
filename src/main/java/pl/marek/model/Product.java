package pl.marek.model;

public class Product {
    private int id;
    private String name;
    private String desc;
    private int price;
    private int amount;
    private String photo;

    public Product(int id, String name, String desc, int price, int amount, String photo) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.amount = amount;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}