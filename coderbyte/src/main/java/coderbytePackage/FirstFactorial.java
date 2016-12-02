package coderbytePackage;

import java.util.*;
import java.io.*;
/**
 * Created by cdzebisov on 16/11/2016.
 */
public class FirstFactorial {

        //public static void main (String[] args)
          public void firstFactorial()
            {
            // keep this function call here
            System.out.print("Please enter the number you whant to calculate factorial for: ");
            Scanner s = new Scanner(System.in);
            int num0 = s.nextInt();
            // here i pass the num0 value to the clculateFactorial method and call the method.
            calculateFactorial(num0);
            int x=calculateFactorial(num0);
            System.out.println("This is the Factorial for the selected number: "+ x);
        }
        public int calculateFactorial (int num){
        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
            if (num==0)
            {num=1;} else {for (int i=num-1; i>0; i--){
                num=num*i;
            }
            }

        return num;


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