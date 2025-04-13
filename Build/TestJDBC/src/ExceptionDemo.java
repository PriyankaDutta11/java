import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[5];

       try{
           System.out.println("I am in my first block!!");
           try{
               arr[6]=10;
           }
           catch(Exception e){
               System.out.println(e.getMessage());
           }
       }catch(Exception e){
           System.out.println(e.getMessage());
       }





    }
}
