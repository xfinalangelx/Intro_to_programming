import java.util.Arrays;

/**
 * @author Richie
 */
public class methods {
    public static void main(String[]test) {


    }

    //static void method without parameters
     static void printString(){
        System.out.println("here you go");
    }

    //static int method without parameters, the same you can do for other data types like double, String, Char and even arrays
    static int printInt(){
        int ret = 3;
        return ret;
    }

    //static boolean method, to check the range of parameter
    static boolean checkGreaterThanThree(int num){
        if(num>3) return true;
        else return false;
    }

    //static array method without parameters, the same you can do for other types of arrays
    static int [] printArr(){
        int [] num = {1,2,3};
        return num;
    }

    //static array method without an array as it parameter
    static int [] printInputArr(int[]num){
        return num;
    }

    //static void method with one parameter, for void method the parameter can be of any type and you cannot return anything
    static void print(String str){
        System.out.println(str);
    }

    //static int method with multiple parameters to return sum
    static int add(int a,int b,int c){
        return a + b + c;
    }


}
