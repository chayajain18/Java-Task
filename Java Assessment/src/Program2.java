import java.util.Scanner;
public class Program2 {
    public static void splitString(String str)

    {

        StringBuffer alphabet = new StringBuffer(),

                num = new StringBuffer(), special = new StringBuffer();


        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i)))

                num.append(str.charAt(i));

            else if (Character.isAlphabetic(str.charAt(i)))

                alphabet.append(str.charAt(i));

            else

                special.append(str.charAt(i));

        }

        System.out.println("the numbers are"+num);

        System.out.println("the special characters are"+special);
    }

    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        splitString(str);

    }

}
