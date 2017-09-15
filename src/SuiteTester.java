public class SuiteTester
{
   public static void main(String[]args)
   {
       
       Suite r = new Suite("Ocean", "Fall", 1);
       System.out.println(r.getCost());
       System.out.println("Expected: 250.0");
       
       r = new Suite("ocean", "Winter", 3);
       System.out.println(r.getCost());
       System.out.println("Expected: 315.0");
       
       r = new Suite("street", "winter", 2);
       System.out.println(r.getCost());
       System.out.println("Expected: 150.0");

       r = new Suite("Street", "Winter", 4);
       System.out.println(r.getCost());
       System.out.println("Expected: 210.0");

       r = new Suite("street", "Winter", 5);
       System.out.println(r.getCost());
       System.out.println("Expected: 1000.0");    
       
       r = new Suite("Ocean", "Summer", 6);
       System.out.println(r.getCost());
       System.out.println("Expected: 1200.0");    
       
       
    }
}