import java.util.Random;
import java.util.Scanner;

/**
 * @author Richie
 */
public class dataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //int userInput = sc.nextInt();
        //int randomNum = random.nextInt(2) ;
        //String userString = sc.next();
        //sc.nextLine();
        //char userChar = sc.next().charAt(0);



        //primitive data types
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        char charMin = Character.MIN_VALUE;
        char charMax = Character.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        boolean bootrue = true;
        boolean boofalse = false;


        //Non-primitive data type
        String string = "Hello world";
        System.out.println(string);


    }
}
