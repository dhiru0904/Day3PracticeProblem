package ArrayProblem;

public class SmallArray {
    public static void main(String[]agrs){
        int [] arr=new int[]{25,40,30,90,5,77};
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min)
                min=arr[i];
        }
        System.out.println("smallest num Array"+min);
    }
}

