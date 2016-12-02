package coderbytePackage;



import java.util.*;

/**
 * Created by cdzebisov on 16/11/2016.
 */
public class LetterChanges {
    public String letterChanges(String str) {

        /* code goes here */
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        String vvod = "";
        String alph = "abcdefghijklmnopqrstuvwxyz,. ?";
        for (int i=str.length()-1; i>=0; i--) {
            for (int j = 0; j < alph.length(); j++) {
                if (str.toCharArray()[i]==alph.toCharArray()[j]){
                   vvod= vvod + alph.toCharArray()[j+1];
                }
            }
        }
        str=vvod;
        return str;
    }
    /*
    public static String vvodtReverse(String str) {
        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
            rev = rev  +  letterChanges(str).toCharArray()[i];
        }
        str=rev;
        return str;
    }

    */

    public String methidCall(String str1) {
        ReverseString obFirstReverse = new ReverseString();

        return obFirstReverse.firstReverse(letterChanges(str1));
    }


   public void letterChangesMain () {
       ReverseString obFirstReverse = new ReverseString();
       System.out.println(letterChanges("ABCDEF"));
       //System.out.println(obFirstReverse.firstReverse("hello"));
       //System.out.println(methidCall("hello"));

       // keep this function call here
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
        //letterChanges(str);
//        System.out.print("this is reverted and letters shifted to +1 string. For example input:hello, output: ifmmp \n"+methidCall(str));
    }


}

//    public static void main(String[] args) {
//        String word = "word";
//
//        for (Character c : word.toCharArray()) {
//            System.out.println((char)(c+1));
//        }
//    }


