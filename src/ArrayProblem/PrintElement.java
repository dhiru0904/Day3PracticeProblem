package ArrayProblem;

public class PrintElement {
    public static void main(String []args)
    {
        int[] arr =new int[] {1,2,3,4,5};

        System.out.print("Elements of given array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
