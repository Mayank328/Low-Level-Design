package DecoratorPattern;

public class Main{
    
    public static void main(String args[]){
        BasePizza BPizza = new ExtraCheese(new Farmhouse());
        System.out.println(BPizza.cost());
    }
}