package ArrayProblem;

public class LargestArray {
    public static void main(String[]agrs){
        int [] arr=new int[]{25,40,30,90,5,77};
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest num Array"+max);
    }
}
