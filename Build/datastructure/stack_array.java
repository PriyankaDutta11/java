import java.util.Scanner;

class stack{
    int top=-1;
    int n=10;
    int a[]=new int[n];
    void push(Scanner sc){
        if(top==n-1){
            System.out.println("Overflow");
        }
        else{
            System.out.println("Enter data::");
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");

        }

    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            top=top-1;
            System.out.println("item deleted");
        }
    }
    void display(){
        System.out.println("items are::");
        for(int j=top;j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }
}


public class stack_array {
    public static void main(String[] args) {
        int d;
        Scanner sc =new Scanner(System.in);
        stack s=new stack();
        int l;
        do{
            System.out.println("Press 1 to perform push operation..");
            System.out.println("Press 2 to perform pop operation..");
            System.out.println("Press 3 to perform display operation..");
            System.out.println("Enter your choice::");
            d=sc.nextInt();
            switch(d){
                case 1:
                    s.push(sc);
                    break;

                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }
            System.out.println("Enter 0 to go back to the main menu");
            System.out.println("Enter any key to exit");
            l=sc.nextInt();
        } while(l==0);
        System.out.println("Exit succesfully");
    }

}
