package f17comp1030nov28;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17COMP1030Nov28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grade1, grade2, grade3, grade4, grade5;
        
        //int[] - declares that is an array of integers
        //grades - is the name that we give the array (same as any other variable)
        //int[5] - indicates that it can hold 5 integers
        int[] grades = new int[8];
        
        Scanner keyboard = new Scanner(System.in);
        for (int i=0; i<grades.length ; i++)
        {
            System.out.printf("Enter the grade for course %d: ", i+1);
            grades[i] = keyboard.nextInt();
        }
        
        displayArrayContents(grades);
        System.out.printf("The average is %.1f%% %n", getAverage(grades));
    }
    
    /**
     * This method will display the contents of an integer array
     */
    public static void displayArrayContents(int[] array)
    {
        System.out.print("The array contents are: [");
        for (int i=0; i<array.length; i++)
        {
            System.out.printf("%5d", array[i]);
        }
        System.out.println("]");
    }
    
    /**
     * This method will calculate the average of an 
     * integer array and return a double with the average
     */
    public static double getAverage(int[] array)
    {
        double total=0;
        for (int i=0; i< array.length; i++)
        {
            total = total + array[i];
        }
        return total/array.length;
    }
}
