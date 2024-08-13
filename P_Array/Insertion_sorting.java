import java.util.Scanner;

public class Insertion_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,temp;
        int a[] = new int[20];
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            if(sc.hasNextInt())
                a[i] = sc.nextInt();
        }
        for(i=1;i<n;i++){
            temp = a[i];
            for(j=i-1;j>=0 && a[j]>temp;j--){
                a[j+1] = a[j];
            }
            a[j+1]=temp;
        }
        System.out.println("The elements in the sorted array is:\n");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
