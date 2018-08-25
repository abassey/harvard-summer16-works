public class PizzaParty  
{
    public static void main(String[] args)   
    {
        Pizza appetizer = new Pizza("Pepperoni", 16, 10.50, 10);
        Pizza mainCourse = new Pizza("Anchovy & Pineapple", 20, 11.95, 8); 
  
  
        printPizzaStats(appetizer);
        System.out.println();
        printPizzaStats(mainCourse);
    }
    
 public static void printPizzaStats(Pizza p)  
    {

    System.out.printf("Your %s pizza has %.2f square inches " + " per slice.\n", p.getName(),  p.areaPerSlice()); 
                
    System.out.printf("One slice costs $%.2f, which comes" + " to $%.3f per square inch.\n", p.costPerSlice(), p.costPerSquareInch());
    }
}