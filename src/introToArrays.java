import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Richie
 */
public class introToArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //basic initialization of arrays
        int [] arrInt1 = {1,2,3};
        int [] arrInt2 = new int [3];
        String [] arrString1 = {"hello","world","java"};
        String [] arrString2 = new String [3];
        char [] arrChar1 = {'a','b','c'};
        char [] arrChar2 = new char [3];

        //conversion from String to character arrays
        String tester = "Hello";
        char [] specialArr = tester.toCharArray();

        //advanced initialization (the same goes for other data types)
       //System.out.print("Enter array size: ");
       //int size = sc.nextInt();
       //int [] specialInt = new int [size];
       //for (int i = 0; i < size ; i++) {
       //    specialInt[i] = sc.nextInt();
       //}

        //2d-array regular
        int [][] twoDintArr = {{1,2,3},
                               {4,5,6},
                               {7,8,9}}; //this is 3x3 array

        //irregular 2d-array
        int [][] weirdArr = {{1,2,3,4},
                             {5,6,7}};



        System.out.println(Arrays.deepToString(weirdArr));
    }
}
