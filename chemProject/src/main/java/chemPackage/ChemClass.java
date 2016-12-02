package chemPackage;


import com.sun.glass.events.mac.NpapiEvent;

/**
 * Created by cdzebisov on 11/11/2016.
 * <p>
 * <p>
 * PASCAL TRIANGLE OUT PUT
 */


public class ChemClass {
    public int n=10;
    public int k=10;
    //public int passedArray[n][k];
    public static void main(String args[]) {
        ChemClass object = new ChemClass();
        object.createArray();
            }

    //This method creates a default array and fills it with '1'
    void createArray() {
        int[][] Nn = new int[n+2][k+2];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<n; j++) {
                Nn [i][j]=0;
                System.out.print(Nn[i][j] + "   ");
            }
            System.out.println();
        }
        Nn[1][0]=1;Nn[1][1]=1;Nn[0][0]=1;
        System.out.println("The array created and filled with '1' values ");
        calculateArrayValues(Nn);
    }

    //This method replace the default values for the array to the values
    // according to this formula
    //Nn[i][j] = (Nn[i-1][j - 1] + Nn[i-1][j-1]);
     void calculateArrayValues(int [][] passedArray) {
         for (int i = 2; i < n+2; i++) {
            for (int j = 2; j <= i; j++) {
               passedArray[i][j]= (passedArray[i-1][j-1] + passedArray[i-1][j]);
                System.out.print(passedArray[i][j] + "   ");
        }
            System.out.println();
    }
        System.out.println("created array is passed to calculate method ");
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