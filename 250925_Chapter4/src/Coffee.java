public class Coffee {
    String origin;
    String grade;
    int degreeOfRoasting;

    Coffee(String o){ origin = o ;}
    Coffee(String o, String g){
        origin = o;
        grade = g;
    }
    public void roast(int d) {
        System.out.println("Roasting... "+ origin + grade);
        degreeOfRoasting = d;
    }
    public void grind (int d){
        System.out.println("Grinding... degree of roast is " + degreeOfRoasting);
    }
    public void brew(){
        System.out.println("Brewing...");
    }
}
