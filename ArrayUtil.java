import java.sql.SQLOutput;

public class ArrayUtil {
    public void PrintArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
    public static int[] RemoveEvenIntegers(int[] arr){

        int n = arr.length;
        int[] arrwithNoEvenInt = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++){
           if (arr[i]%2 != 0){
               arrwithNoEvenInt[j] = arr[i];
               j++;
           }
        }
        return arrwithNoEvenInt;
    }

    public static int[] ReverseArray(int[] arr){
        try {

            int start = 0;
            int end = arr.length-1;

            while(start<end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
           return arr;
        }
        catch (Exception exception)
        {
            System.out.println(exception.getStackTrace().toString());
           return null;
        }
    }

    public static int MinimumValueInArray(int[] arr){
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){

            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }


    public static int SecondMinimumValueInArray(int[] arr){

        // we have to find second min value in an array
        // first approach can be to get the min value and compare it with all the elements to get the second min.

        int min = arr[0];
        int secondMinimum = arr[1];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min && arr[i]!=min)
                min = arr[i];

            if (arr[i] < secondMinimum && arr[i] > min){
                secondMinimum = arr[i];
                min = secondMinimum;
            }

        }
        return secondMinimum;
    }

    public static int SecondMaximumValueInArray(int[] arr){
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i]>secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int[] MoveZerosOfArrayToEnd(int[] arr){
        // find the zeros swap it with the last element
        int zero = 0;
        int j = arr.length-1;
        for (int i = arr.length -1 ; i >=0; i--) {
                if (arr[i] == zero && arr[j] != zero)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[j] == zero)
                    j--;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8,0,0,0,5,0,1,2,3,0,3,5,0,7};
        //arr = ReverseArray(arr);
        //int result = MinimumValueInArray(arr);
        //int result = SecondMinimumValueInArray(arr);
        /*int result = SecondMaximumValueInArray(arr);*/
        int[] result = MoveZerosOfArrayToEnd(arr);
        //System.out.println(result);
        if (arr != null)
            for (int j : arr) System.out.println(j);
        else
            System.out.println("Null");
    }
}
