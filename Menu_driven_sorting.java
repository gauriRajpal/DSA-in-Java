import java.util.Scanner;
import java.io.*;

public class Menu_driven_sorting{

public static void display(int[] a,int n){
    int i;
    System.out.println("The soerted array is:");
    for(i=0;i<n;i++)
        System.out.println(a[i]);
}

public static void bubbleSort(int[] a,int x){
int flag,t;
for(int i=0;i<x;i++){
    flag=0;
    for(int j=0;j<x-1;j++){
        if(a[j]>a[j+1]){
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
            flag=1;
        }
    }
    if(flag==0)
        break;
}
display(a, x);
}

public static void selectionSort(int[] a,int x){
    int min,t;
    for(int i=0;i<x-1;i++){
        min=i;
        for(int j=i+1;j<x;j++){
            if(a[min]>a[j])
                min=j;
        }
        if(min!=i){
            t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
    }
    display(a, x);
}

public static void insertionSort(int[] a,int x){
    int i,j,temp;
    for(i=1;i<x;i++){
        temp=a[i];
        for(j=i-1;j>=0 && a[j]>temp;j--){
            a[j+1]=a[j];
        }
        a[j+1]=temp;
    }
    display(a,x);
}

public static void main(String[] args) {
    int[] a;
    int n,x;
    char result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    n = sc.nextInt();
    System.out.println("Enter the elements of the array:");
    a = new int[n];
    for(int i=0;i<n;i++){
        if(sc.hasNextInt())
            a[i] = sc.nextInt();
    }
    System.out.println("\nMenu-\n1.Bubble sorting\n2.Selection sorting\n3.Insertion sorting\n4.Exit");
    do{
        System.out.println("Enter the choice from the menu:");
        x = sc.nextInt();
        switch(x){
            case 1:
                bubbleSort(a, n);
                break;
            case 2 :
                selectionSort(a, n);
                break;
            case 3:
                insertionSort(a,n);
                break;
            case 4: return;
            default:
                System.out.println("Invalid choice! Please enter the number from the menu.");
        }
        System.out.println("\nDO YOU WANT TO CONTINUE?\n   Y OR N?\n");
        result = sc.next().charAt(0);
        try{
            Writer writer = new PrintWriter(System.out);
            writer.flush();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    while(result=='y'||result=='Y');
}
}