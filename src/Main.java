public class  Main {
    public static void main(String[] args) {

        /* Overloaded constructors = multiple constructors within a class with the same name,
                                    but have different parameters
                                    name + parameters = signature */

        Pizza pizza = new Pizza("thick crust", "tomato", "Mozzarella","Pepperoni");

        System.out.println("This are the ingredients to our Pizza");
        System.out.println();
        System.out.println(pizza.bread);

    }
}