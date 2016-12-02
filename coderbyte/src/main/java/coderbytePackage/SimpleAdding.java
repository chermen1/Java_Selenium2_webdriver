package coderbytePackage;

import java.util.*;
import java.io.*;
/**
 * Created by cdzebisov on 17/11/2016.
 */
public class SimpleAdding {
    public static int simpleAdding(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        for (int i=num-1;i>0; i--){
            num=num + i;
        }

        return num;

    }

    public static void simpleAddingMain (){
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int num1=s.nextInt();
        System.out.print(simpleAdding(num1));
    }
}
