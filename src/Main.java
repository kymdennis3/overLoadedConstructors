public class  Main {
    public static void main(String[] args) {

        /* Overloaded constructors = multiple constructors within a class with the same name,
                                    but have different parameters
                                    name + parameters = signature */

        Pizza pizza = new Pizza("thick crust", "tomato", "Mozzarella","Pepperoni");

        System.out.println("This are the ingredients to our Pizza");
        System.out.println(); // creates a space between our lines
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);

    }
}