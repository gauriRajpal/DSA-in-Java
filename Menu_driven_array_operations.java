import java.util.Scanner;
import java.io.*;

public class Menu_driven_array_operations {
    static int ls(int[] a ,int n,int x){
        for(int i =0;i<n;i++){
            if(a[i]==x)
                return i;
        }
        return -1;
    }

    static boolean isFull(int[] a ,int n){
        
        if(n==a.length){
            System.out.println("The array is full! Can't insert.");
            return true;
        }
        return false;
    }

    static boolean isEmpty(int[] a,int n){
        if(n==0){
            System.out.println("The array is empty! Can't delete");
            return true;
        }
        return false;
    }

    static int insertion(int[] a,int n,int x,int y){
        int i;
        if(y>n){
            System.out.println("Invalid position\n");
            return n;
        }
        else{
            for(i=n;i>=y;i--)
                a[i+1]=a[i];
        }
        a[y]=x;
        n++;
        return n;
    }

    static int deletionValue(int[] a,int x,int y){
        int i,p;
        p=ls(a,x,y);
        if(p==-1){
            System.out.println("\nElement not found.\n");
            return x;
        }
        for(i=p;i<x-1;i++)
            a[i]=a[i+1];
        x--;
        return x;
    }

    static int deletionPosition(int[] a,int n,int y){
        int i;
        y--;
        if(y>n){
            System.out.println("\nInvalid position\n");
            return n;
        }
        else{
            for(i=y;i<n-1;i++)
                a[i]=a[i+1];
            n--;
            return n;
        }
    }

    public static void main(String[] args) {
        int [] a=new int[20];
        int n,i,ch,x,y,z;
        char result;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nMenu-\n1.Insertion operation\n2.Deletion operation from value\n3.Deletion operation from position\n4.Exit\n ");
            System.out.println("Enter the size of the array:");
            n = sc.nextInt();
            System.out.println("Enter the elements of the array:");
           
            for( i=0;i<n;i++){
                if(sc.hasNextInt())
                    a[i] = sc.nextInt();
            }
            do{
                System.out.println("Enter the choice from the menu:");
                x = sc.nextInt();
                switch(x){
                    case 1:
                        if(isFull(a,n)){
                            break;
                        }
                        else{
                            System.out.println("Enter the element to be inserted ");
                            y=sc.nextInt();
                            System.out.println("Enter the position:");
                            ch = sc.nextInt();
                            ch--;
                                z=insertion(a,n,y,ch);
                                System.out.println("The array after insertion:\n");
                                for(i=0;i<z;i++)
                                    System.out.println(a[i]);
                        }
                        break;
                    case 2:
                        if(isEmpty(a, n)){
                            break;
                        }
                        else{
                            System.out.println("Enter the value to be deleted:");
                            y=sc.nextInt();
                            z=deletionValue(a,n,y);
                            System.out.println("The array after deletion:");
                            for(i=0;i<z;i++){
                                System.out.println(a[i]);
                            }
                        }
                        break;
                    case 3:
                        if(isEmpty(a, n))
                            break;
                        else{
                            System.out.println("Enter the position to delete from:\n");
                            ch=sc.nextInt();
                            z=deletionPosition(a,n,ch);
                            System.out.println("The array after deletion:\n");
                            for(i=0;i<z;i++){
                               System.out.println(a[i]);
                            }
                        }
                        break;
                    case 4: return;
                    default:System.out.println("Invalid choice! Enter the number from the menu.");
                }
                System.out.println("\nDO YOU WANT TO CONTINUE?\n  Y OR N?\n");
                result = sc.next().charAt(0);
                try{
                    Writer writer = new PrintWriter(System.out);
                    writer.flush();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            while(result=='Y'||result=='y');
        }
    }
}
