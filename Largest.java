  import java.util.*;  //java library been imported
   public class Largest{  //class been named 
    public static void main(String[] args){    
     int a, b, c; //values to be used are be declared but values not assigned 
      Scanner f= new Scanner(System.in);   
       //new object called f was created
    System.out.println("enter integer vaue for a");
  a= f.nextInt();
  System.out.println("enter integer vaue for b");
  b= f.nextInt();
  System.out.println("enter integer vaue for c");
  c= f.nextInt();

  if (a > b && a > c)
      System.out.println("First number is largest.");
    else if (b > a && b > c)
      System.out.println("Second number is largest.");
    else if (c > a && c > b)
      System.out.println("Third number is largest.");
    else
      System.out.println("error");
  }
}

