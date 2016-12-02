package coderbytePackage;
import java.util.*;

/**
 * Created by cdzebisov on 16/11/2016.
 */
public class ReverseString {


    public String firstReverse(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
    // my ne ishem legkix putei: str = new StringBuffer(str).reverse().toString();

        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
            rev = rev  +  str.toCharArray()[i];
        }
        str=rev;
        return str;
    }


    public void firstReverrse () {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        System.out.print(firstReverse(str1));

    }

}
/* class test
{
        void passArr()
        {
        int arr1[]={1,2,3,4,5,6,7,8,9};
        printArr(arr1);
        }

        void printArr(int[] arr2)
        {
        for(int i=0;i<arr2.length;i++)
        {
        System.out.println(arr2[i]+"  ");
        }
        }

public static void main(String[] args)
        {
        test ob=new test();
        ob.passArr();
        }
        }*/