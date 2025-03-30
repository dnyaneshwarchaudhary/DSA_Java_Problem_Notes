
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayClassNotes();
    }
    public static void ArrayClassNotes(){

        // 3 ways to declare array and initialize it as shown below
        int[] arr = new int[5];
        int arr2[] = new int[5];
        int[] arr3 = {12,3,4,5};

        //accessing the elements of the array
        //for array the default value is 0 if unassigned or initialized.
        arr[1] = 3;
        arr[0] = 0;
        arr[1]= 4; //over writing the value of arr at 1st index

        System.out.println(arr[1]);

    }

}