public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = topping;


    }
    Pizza(String bread, String cheese, String sauce){
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }
    Pizza(String bread, String cheese) {
        this.bread = bread;
        this.cheese = cheese;
    }
    Pizza(String bread) {
        this.bread = bread;
    }
    Pizza() {
    }
}
