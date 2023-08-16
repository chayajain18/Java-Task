import java.util.Scanner;
public class Program7 {
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return(n*factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=in.nextInt();
        int fact=factorial(n1);
        System.out.println("The Factorial of "+n1+" is "+fact);
    }
}
