import java.util.Scanner;

public class Main
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    int[] myArray = new int[3];
    myArray.fill(1,2,3);
    System.out.println(myArray);
    System.out.println(myArray.toString());
  }
}