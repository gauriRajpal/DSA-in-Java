import java.util.Scanner;

public class Lowest_value_array{
public static void main(String[] args) {
    int n,i;
    Scanner sc = new Scanner(System.in);
   //int [] a = {3,5,1,3,2};
   int [] a = new int [20];
   System.out.println("Enter the size of the array:");
    n = sc .nextInt();
   System.out.println("Enter the elements of the array:");
   for( i=0;i<n;i++){
    if(sc.hasNextInt())
        a[i] = sc.nextInt();
}

   int minVal = a[0];
   for( i=0;i<n;i++){
    if(a[i]<minVal)
        minVal = a[i];
   }
   System.out.println("The lowest value is:"+minVal);
    }
}