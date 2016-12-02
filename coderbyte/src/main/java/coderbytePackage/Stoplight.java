package coderbytePackage;

import com.sun.tools.internal.xjc.reader.xmlschema.BindGreen;

import java.util.Scanner;

/**
 * Created by cdzebisov on 29/11/2016.
 */
public class Stoplight {

    public void stoplightMain (){
        System.out.print("Please enter the number t in a range 0<t=<60: ");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        //System.out.println(calculateColor(t));
        calculateColor(t);
    }
    private void calculateColor(int t1){

        if (t1<5) {
           painter(t1);
        } else if (t1>=5) {
            int reminder=t1%5;
           painter(reminder);
        }
    }




    public void painter (int t2){
       String color="---";
        System.out.println(color);
        switch (t2) {
            case 1:
                color = "GREEN";
                break;
            case 2:
                color = "GREEN";
                break;
            case 3:
                color = "Yello";
                break;
            case 4:
                color = "RED";
                break;
            case 0:
                color = "Green";
                break;
        }
        System.out.println(color + " - because you have entered " +t2);


    }
    }


//-------------------THE END-------------------------

/*

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
     Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type.
        if (num==0)
        {num=1;} else {for (int i=num-1; i>0; i--){
            num=num*i;
        }
        }

        return num;


    }

}
*/