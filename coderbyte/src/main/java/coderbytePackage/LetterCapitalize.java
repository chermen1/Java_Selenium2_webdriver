package coderbytePackage;

import java.util.Scanner;

/**
 * Created by cdzebisov on 17/11/2016.
 */
public class LetterCapitalize {
    public String letterCapitalize(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        String x=" ";
        String z="";
        for (int i=0; i<str.length(); i++){
            String y= String.valueOf(str.toCharArray()[i]);
            if (i==0){
                y=y.toUpperCase();
            }else {
                if (String.valueOf(str.toCharArray()[i - 1]).equals(x)) {
                    y=y.toUpperCase();
                }
            }
            z=z+y;
        }
        str=z;
        return str;

    }

    public void letterCapitalizeMain () {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String str1=s.nextLine();
        System.out.print(letterCapitalize(str1));
    }

}


