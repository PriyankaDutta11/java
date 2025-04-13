import java.util.Scanner;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
           throw new RuntimeException("Sorry You can't vote");
        }else{
            System.out.println("You are eligible to vote!!");
        }
    }
}
