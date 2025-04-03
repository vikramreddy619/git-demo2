import java.util.*;
public class practice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A ");
        int A=sc.nextInt();
        System.out.println("Enter the value of B ");
        int B=sc.nextInt();
        System.out.println("Enter the value of C ");
        int C=sc.nextInt();
        int Average=(A+B+C)/3;
        System.out.println("The Average of the A,B&C is " +Average);
    }
}