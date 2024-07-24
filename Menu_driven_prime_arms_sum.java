import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class Menu_driven_prime_arms_sum {
    static int primenumber(int x){
        for(int i = 0;i<=x/2;i++){
            if(i%x==0)
            return 1;
        }
        return 0;
    }

    static int armstrongnumber(int x){
        int n,rem,dig=1;
        double result = 0.0;
        n=x/10;
        while(n!=0){
            n/=10;
            dig++;
        }
        n=x;
        while(n!=0){
            rem=n%10;
            result = result + Math.pow(rem,dig);
            n=n/10;
        }
        if(x==result)
            return 1;
        else
            return 0;
    }


    static int sumDigit(int x){
        int r,sum=0;
        while(x>0){
            r=x%10;
            sum = sum+r;
        }
        x = x/10;
        return(sum);
    }


    public static void main(String[] args) {
        char result;
        System.out.println("\nMenu-\n1.To check for prime number\n2.To check for armstrong number\n3.To add digits of number\n4.Exit\n");
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int a = sc.nextInt();
            System.out.println("Enter the number of your choice from the menu:");
            int b = sc.nextInt();
            switch(b){
            case 1 :
                    if(primenumber(a)==1)
                        System.out.println("The number is prime number!");
                    else
                        System.out.println("The number is not a prime number!"); 
                    break;
            case 2 :
                    if(armstrongnumber(a)==1)
                        System.out.println("The number is an armstrong number!");
                    else
                        System.out.println("The number is not an armstrong number!");           
                    break;
            case 3 :
                   int z = sumDigit(a);
                   System.out.println("The sum of the digits is:"+ z);
                   break;
            case 4 :
                return;
            default : System.out.println("Invalid choice! Enter from the given numbers.");
            }
            System.out.println("\nDO YOU WANT TO CONTINUE?\n Y or N?");
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

