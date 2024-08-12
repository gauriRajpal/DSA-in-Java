import java.util.Scanner;

public class Bubble_sorting {
    public static void main(String[] args) {
        int a[] = new int[20];
        int n,i,x,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        System.out.println("Enter the element of the array:");
        for(i=0;i<n;i++){
            if(sc.hasNextInt())
                a[i]= sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    x=a[j];
                    a[j]=a[j+1];
                    a[j+1]=x;
                }
            }
        }   
        System.out.println("The elements in sorted array is:\n");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
