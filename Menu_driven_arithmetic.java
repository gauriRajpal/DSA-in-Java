import java.util.Scanner;
import java.io.*;

public class Menu_driven_arithmetic{
    private static final char res = 0;

    static void add(int x,int y){
        System.out.println("The answer is:"+ (x+y));
    }
    
    
    static void sub(int x,int y){
        if(x>y){
            System.out.println("The answer is: " + (x-y));
        }
        else{
            System.out.println("The answer is: "+ (y-x));
        }
    }
    
    
    static void mult(int x,int y){
        System.out.println("The answer is: "+ (x*y));
    }
    
    
    static void divi(int x,int y){
        System.out.println("The answer is: "+(x/y));
    }

     public static void main(String[] args) {
        char result;
        System.out.println("\nMenu-\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
        do{
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter the number of your choice:");
            int c = sc.nextInt();
            switch(c){
            case 1 :
                add(a,b);
                break;
            case 2 :
                sub(a,b);
                break;
            case 3 :
                mult(a,b);
                break;
            case 4 :
                divi(a,b);
                break;
            case 5 :
                 return;  
            default:
            System.out.println("Invalid choice! Enter from the given number.");    
            }
            System.out.println("\nDO YOU WANT TO CONTINUE?\n Y or N?");
             result = sc.next().charAt(0);
            try{
             Writer writer = new PrintWriter(System.out);
            writer.write(result);
            writer.flush();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        while(result =='y'||result=='Y');
     }
}