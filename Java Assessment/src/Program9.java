import java.util.Arrays;
public class Program9
{

    // Main driver method
    public static void main(String[] args)
    {
        int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
            System.out.print("Elements of original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);

        System.out.println();
        System.out.println("Elements of array sorted in ascending order : "+ Arrays.toString(array));
    }
}
