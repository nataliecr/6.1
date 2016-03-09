import java.util.Scanner;

public class PentagonalNumber {  
  public static int getPentagonalNumber (int n){
    return n * (3 * n - 1) / 2;
  }   // getPentagonalNumber 
  
  public static void main(String[] args){
    for (int i = 1; i <= 100; i++){
      System.out.print(getPentagonalNumber(i) + " ");
      if (i % 10 == 0)
        System.out.println();
    } // for i
  } // main
} // class PentagonalNumber
