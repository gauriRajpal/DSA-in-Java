import java.util.Scanner;



public class stack_implementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x,y;
       Stack MyStack = new Stack(5);
        System.out.println("Menu-\n1.Push Operation\n2.Pop Operation\n3.Peek Operation\n4.Display\n5.Exit");
        do{
            System.out.println("Enter the choice from the menu-\n");
            x = sc.nextInt();
            switch (x) {
               case 1: System.out.println("Enter the element to push-\n");
                        y = sc.nextInt();
                        MyStack.push(y);
                    break;
                case 2: y=MyStack.pop();
                        System.out.println("The element poped is-\n"+ y);
                    break;
                case 3: y=MyStack.peek();
                            if(y>=0){
                            System.out.printf("The element at the peek is-\n%d\n", y);
                            }
                    break;
                case 4: System.out.println("The elements in the stack are-\n");
                        MyStack.traverse();
                        break;
            }
        }
        while(true);
    }      
}

class Stack{
    int a[];
    int top;
    int size;

    public Stack(int x){
        this.size = x;
        this.a = new int[size];
        this.top=-1;
    }

    public void push(int x){
        if(top==size-1){
            System.out.println("The stack is full\n");
            return;
        }
        a[++top] = x;
    }

    public int pop(){
        int x;
        if(top==-1){
            System.out.println("The satck is empty\n");
            return 0;
        }
        x = a[top];
        a[top] = a[top--];
        return x;
    }

    public int peek(){
        int x;
        if(top==-1){
            System.out.println("The stack is empty\n");
            return 0;
        }
        x=a[top];
        return x;
    }

    public void traverse(){
        if(top==-1){
            System.out.println("The stack is empty\n");
        }
        for(int i=0;i<=top;i++){
            System.out.println(a[i]+" ");
        }
    }
}
