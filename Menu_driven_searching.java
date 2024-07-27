import java.util.Scanner;
import java.io.*;

public class Menu_driven_searching{
    public static int ls(int[] a,int n,int y){
           for(int i=0;i<n;i++){
            if(a[i]==y);
           }
           return -1;
    }

    public static boolean issorted(int[] a,int n){
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1])
            return false;
        }
        return true;
    }

    public static int bs(int[] a,int n,int y){
        int mid,lb=0,ub=n-1;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(a[mid]<y)
                lb=mid+1;
            else if(a[mid]>y)
                ub=mid-1;
            else if(a[mid]==y)
                return (mid+1);        
        }
        return -1;
    }

    public static void main(String[] args){
        int a [] ;
        int n,x,y,z;
        char result;
        System.out.println("\nMenu-\n1.Linear search\n2.Binary search\n3.Exit\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array-");
        n = sc.nextInt();
    do{
        System.out.println("Enter the elements of the array");
        a = new int[n];
        for(int i=0;i<n;i++){
            if(sc.hasNextInt()){
             a[i]=sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to search");
        y = sc.nextInt();
        System.out.println("Enter the number of your choice");
        x = sc.nextInt();
        switch(x){
            case 1:
                  z= ls(a,n,y);
                  if(z>=0)
                     System.out.println("The element is found at the position-"+z);
                  else
                     System.out.println("The element not found");
                  break;
            case 2:
                  if(issorted(a,n)){
                    z=bs(a,n,y);
                    if(z>0){
                        System.out.println("The element is found in the position");
                        System.out.println(z);
                    }
                    else    
                        System.out.println("The element is not found");
                  }  
                  else
                     System.out.println("The array is not sorted");
                 break;  
            case 3 :   
                    return;
            default :
                System.out.println("Invalid choice! Enter from the given number.");              
        }
        System.out.println("\nDO YOU WANT TO CONTINUE?\n Y or N?\n");
             result = sc.next().charAt(0);
            try{
             Writer writer = new PrintWriter(System.out);
            writer.flush();
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    while(result =='y'||result=='Y');
    }
}


