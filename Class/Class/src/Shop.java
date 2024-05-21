public class Shop {
    private String name;
    private int sales;
    private int budget;
    private String product;

    public Shop(String name, int sales, int budget, String product) {
        this.name = name;
        this.sales = sales;
        this.budget = budget;
        this.product = product;
    }

    public void displayInfo() {
        System.out.println("Shop Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Sales: " + this.sales);
        System.out.println("Budget: " + this.budget + " USD");
        System.out.println("Product: " + this.product);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSales() {
        return this.sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getBudget() {
        return this.budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}