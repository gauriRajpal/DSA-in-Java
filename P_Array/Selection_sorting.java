import java.util.Scanner;

public class Selection_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [20];
        int n,i,j,min,temp;
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++)
            if(sc.hasNextInt())
                a[i] = sc.nextInt();
        for(i=0;i<n-1;i++){
            min=i;
            for(j=i+1;j<n;j++){
                if(a[min]>a[j])
                    min=j;
            }
                if(min!=i){
                    temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
                
            }
        }
        System.out.println("The array in sorted manner is:");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}

