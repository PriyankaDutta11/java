import java.util.Scanner;
public class ExceptionDemo2 {
    public static void divisiondemo(int dividend,int divisor) throws ArithmeticException{
        System.out.println("The result is :"+dividend/divisor);
    }

    public static void main(String[] args) {
        divisiondemo(10,0);
    }
}
