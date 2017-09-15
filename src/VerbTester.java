public class VerbTester
{

   public static void main(String[] args)
   {
      Verb word = new Verb("mop");
      System.out.println(word.getPast());
      System.out.println("Expected: mopped");
      
      word = new Verb("cry");
      System.out.println(word.getPast());
      System.out.println("Expected: cried");
      
      word = new Verb("run");
      System.out.println(word.getPast());
      System.out.println("Expected: ran");
      
      word = new Verb("walk");
      System.out.println(word.getPast());
      System.out.println("Expected: walked");
      
      word = new Verb("ride");
      System.out.println(word.getPast());
      System.out.println("Expected: rode");
      
      word = new Verb("see");
      System.out.println(word.getPast());
      System.out.println("Expected: saw");
      
      word = new Verb("ski");
      System.out.println(word.getPast());
      System.out.println("Expected: skied");
      
   }

}