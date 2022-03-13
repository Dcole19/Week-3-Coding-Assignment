import java.lang.reflect.Array;
import java.util.Arrays;
public class week3CodingAssignment {
  public static void main(String[] args) {
   
   // 1.
    System.out.println("------Number 1------");
    
   int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 40};
   
    int partA = (ages[ages.length -1] - ages [0]);
     System.out.println(partA);
    
    for (partA = 0; partA < ages.length; partA++) {
      System.out.println(ages[partA]);
    }
    
    int sum = 0;
    for (int number : ages) {
      sum += number;
    }
    int average = sum / ages.length; 
    System.out.println(average);
    
    
    // 2.
    System.out.println("------Number 2------");
 
    
   String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
   sum = 0;
   for (int i = 0; i < names.length; i++) {
       sum += names[i].length();
   }
   average = sum / names.length;
   System.out.println("The average number of letters per name = " + average );
   
   
   String allNames = String.join(" ", names);
     System.out.println(allNames);
   
     // 3.
     System.out.println("------Number 3------");
   
     // Access the last element of an array
     
     String last = names[names.length-1];
     System.out.println(last);
     
     // 4.
     
     System.out.println("------ Number 4------");
   
     //Access the first element of an array
     
     System.out.println(names[0]);
     
     // 5.
     
     System.out.println("------Number 5------");
     
     int[]nameLengths = new int[names.length];
     for (int i = 0; i < names.length; i++) {
       nameLengths[i] = names[i].length();
     }
     
     // 6.
     
     System.out.println("------Number 6------");
     
     sum = 0;
     int i;
     for (i = 0; i < nameLengths.length; i++) {
       sum += nameLengths[i];
     }
     System.out.println("The sum of the elements = " + sum);
     
  
     // 7.
     
     System.out.println("------Number 7------");
     
          
     System.out.println(result("Hello", 3));
     
    // 8.
     
     System.out.println("------Number 8------");
       
     System.out.println(fullName("Bruce", "Wayne"));
 
   // 9.
     
     System.out.println("------Number 9------");
     
     int[] years = {21, 24, 13, 5, 33};
     System.out.println(sumGreaterThan100(years));
  
  // 10.
     
     System.out.println("------Number 10------");
     double[] numbers = {4.3, 2.2, .12, 8, 7.5};
     System.out.println(average(numbers));
  
  // 11.
     
     System.out.println("------ Number 11------");
     double[] secondNumbers = {4.9, 3.1, .34, 8.5, 5};
     System.out.println(firstArrayGreater(numbers, secondNumbers));
     
  // 12. 
     
     System.out.println("------Number 12------");
     boolean isHotOutside = true;
     double moneyInPocket = 8.00;
     System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
     
  // 13.
     System.out.println("------Number 13------");
     boolean haveHomework = false;
     boolean awake = true;
     boolean isAfterJune = true;
     if (timeToPlayGames(haveHomework, awake, isAfterJune)) {
       System.out.println("Tough!!!! go practice coding!!!");
     }else {
       System.out.println("Go practice coding!!");
     }
  }
  
  
 
// 7.
  public static String result (String text, int n) {
    String result = text;
     if (n >1)
       for (int count = 2; count <= n; count++)
         result += text;
          return result;
  }
  
  // 8. 
  public static String fullName(String firstName, String lastName) {
    String fullName = firstName + " "+ lastName;
    return fullName;
  }
  
  
  // 9.
  public static boolean sumGreaterThan100(int[] arr) {
    return Arrays.stream(arr).sum() > 100;
  }
  
  // 10.
  public static double average(double[] arr) {
    return Arrays.stream(arr).average().orElse(0);
  }
  
  // 11.
  public static boolean firstArrayGreater (double[] firstArray, double[] secondArray) {
    return average(firstArray) > average(secondArray);
  }
  
  // 12.
  public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
    return  (isHotOutside == true && moneyInPocket > 10.50); 
    
  }
  
  // 13.
  public static boolean timeToPlayGames (boolean haveHomework, boolean awake, boolean isAfterJune) {
    return (haveHomework == false && awake == true && isAfterJune == true);
    
  }
  
  
  }
