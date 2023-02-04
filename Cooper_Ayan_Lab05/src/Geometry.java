import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
    	 printMenu();

         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value = circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value = rectangleArea(length, width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = triangleArea(height, base);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value = circleCircumference(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = rectanglePerimeter(length, width);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = trianglePerimeter(side1, side2, side3);

               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   
   /**
    * The method printMenu creates a menu for the user to read and choose from. The program requires 
    * user input, so this menu displays that menu for the user to choose from.
    */
   
   public static void printMenu() {
	   System.out.println("This is a geometry calculator. Choose what you would like to calculate.");
	   System.out.println("1. Find the area of a circle.");
	   System.out.println("2. Find the area of the rectangle.");
	   System.out.println("3. Find the area of a triangle.");
	   System.out.println("4. Find the circumference of a circle.");
	   System.out.println("5. Find the perimeter of a rectangle.");
	   System.out.println("6. Find the perimeter of a triangle.");
	   System.out.println("Enter the number of your choice.");
   }
   
   
   
   // TASK #2 Create the value-returning methods here
   
   /**
    * The method circleArea calculates the area of a circle with a given radius. After the user provides a
    * number of for a radius when prompted, the method calculates the area of the circle (A = pi * r^2). 
    * @param radius The radius entered by the user.
    * @return The calculated area of the circle.
    */
   
   // Area of a circle
   public static double circleArea(double radius) {
	   double result;
	   result = Math.PI * Math.pow(radius, 2);
	   return result;	   
   }
   
   /**
    * The method rectangleArea calculates the area of a rectangle with given length and width. After the user
    * provides two numbers for the length and width when prompted, the method calculates the area of the
    * rectangle (A = l * w).
    * @param length The length entered by the user.
    * @param width The width entered by the user.
    * @return The calculated area if the rectangle.
    */
   
   // Area of a rectangle
   public static double rectangleArea(double length, double width) {
	   double result;
	   result = length * width;
	   return result;
   }
   
   /**
    * The method triangleArea calculates the area of a triangle with given base and height. After the user
    * provides two numbers for the height and base when prompted, the method calculates the area of the
    * triangle (A = 1/2 * (h * b)).
    * @param height The height entered by the user.
    * @param base The base entered by the user.
    * @return The calculated area of the triangle.
    */
   
   // Area of a triangle
   public static double triangleArea(double height, double base) {
	   double result;
	   result = (height * base) * 0.5;
	   return result;
   }
   
   /**
    * The method circleCircumference calculates the circumference of a circle with a given radius. After the
    * user provides a number for the radius when prompted, the method calculates the circumference of the
    * circle (C = 2 * pi * r).
    * @param radius The radius entered by the user.
    * @return The calculated circumference of the circle.
    */
   
   // Circumference of a circle
   public static double circleCircumference(double radius) {
	   double result;
	   result = Math.PI * radius * 2;
	   return result;
   }
   
   /**
    * The method rectanglePerimeter calculates the perimeter of a rectangle with given length and width.
    * After the user provides two numbers for the length and width when prompted, the method calculates the
    * perimeter of the rectangle (P = 2l * 2w).
    * @param length The length entered by the user.
    * @param width The width entered by the user.
    * @return The calculated perimeter if the rectangle.
    */
   
   // Perimeter of a rectangle
   public static double rectanglePerimeter(double length, double width) {
	   double result;
	   result = (length * 2) + (width * 2);
	   return result;
   }
   
   /**
    * The method trianglePerimeter calculates the perimeter of a triangle when given the length of three
    * sides. After the user provides three numbers for all sides of a triangle, the method calculates the
    * perimeter (P = side1 + side2 + side3).
    * @param side1 The length of the first side of the triangle.
    * @param side2 The length of the second side of the triangle.
    * @param side3 The length of the third side of the triangle.
 * @return 
    */
   
   //Perimeter of a triangle
   public static double trianglePerimeter(double side1, double side2, double side3) {
	   double result;
	   result = side1 + side2 + side3;	   
	   return result;
   }
   // TASK #4 Write javadoc comments for each method
}