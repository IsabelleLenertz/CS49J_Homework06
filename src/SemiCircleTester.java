public class SemiCircleTester
{
   public static void main(String[] args)
   {
       SemiCircle semi1 = new SemiCircle(100, 100, 60);
       
       //test contains
       //the center is not contained in the circle
       System.out.println();
       System.out.println("center contained: " + semi1.contains(100, 100));
       System.out.println("Expected: false");
       
       //the E W N points not contained
       System.out.println("E contained: " + semi1.contains(160, 100));
       System.out.println("Expected: false");
       System.out.println("W contained: " + semi1.contains(40, 100));
       System.out.println("Expected: false");
       System.out.println("N contained: " + semi1.contains(100, 40));
       System.out.println("Expected: false");
       
       //point in semi-circle
       System.out.println(semi1.contains(120, 75));
       System.out.println("Expected: true");
       
       //point in whole circle but not in semi circle
       System.out.println(semi1.contains(110, 120));
       System.out.println("Expected: false");
       
       SemiCircle black = new SemiCircle(50, 150, 40);
       SemiCircle red = new SemiCircle(100, 170, 40);
       SemiCircle green = new SemiCircle(90, 140, 40);
       SemiCircle blue = new SemiCircle(115, 165, 15);
       
       
       System.out.println("black & green intersect: " + black.intersects(green));
       System.out.println("Expected: true");
       System.out.println("green & black intersect: " + green.intersects(black));
       System.out.println("Expected: true");
      
       System.out.println("black & red intersect : " +black.intersects(red));
       System.out.println("Expected: true");
       System.out.println("red & black intersect : " +red.intersects(black));
       System.out.println("Expected: true");
       
       System.out.println("red & green intersect: " + red.intersects(green));
       System.out.println("Expected: true");
       System.out.println("green & red intersect: " + green.intersects(red));
       System.out.println("Expected: true");
       
       System.out.println("red & blue intersect : " + red.intersects(blue));
       System.out.println("Expected: false");   
       System.out.println("blue & red intersect : " + blue.intersects(red));
       System.out.println("Expected: false"); 
      
       System.out.println("black & blue intersect : " + black.intersects(blue));
       System.out.println("Expected: false");   
       System.out.println("blue & black intersect : " + blue.intersects(black));
       System.out.println("Expected: false"); 
       
       
   }
}