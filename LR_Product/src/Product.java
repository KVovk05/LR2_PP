//методи setValue(), getValue(), toString()
public class Product {
    private int id;
    private String naming;

    public int getDaysToExp() {
        return daysToExp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", naming='" + naming + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", prodDate='" + prodDate + '\'' +
                ", daysToExp=" + daysToExp +
                ", price=" + price +
                ", amount=" + amount +
                "}\n";
    }

    public double getPrice() {
        return price;
    }

    public String getNaming() {
        return naming;
    }

    private String manufacturer;
    private String prodDate;
    private int daysToExp;
    private double price;
    private int amount;

    public void setId(int id) {
        this.id = id;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProdDate(String prodDate) {
        this.prodDate = prodDate;
    }

    public void setDaysToExp(int daysToExp) {
        this.daysToExp = daysToExp;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product(int id, String naming, String manufacturer, String prodDate, int daysToExp, double price, int amount) {
        this.id = id;
        this.naming = naming;
        this.manufacturer = manufacturer;
        this.prodDate = prodDate;
        this.daysToExp = daysToExp;
        this.price = price;
        this.amount = amount;
    }

}

