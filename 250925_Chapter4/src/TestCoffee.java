public class TestCoffee {
    public static void main(String[] args){
        Coffee c1 = new Coffee("A1", "Kenya");
        c1.roast( 4);

        c1.grind(6);

        c1.brew();
    }
}
