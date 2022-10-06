package ArrayProblem;

import java.util.*;
public class Largest2Num {

        public static void main (String [] args)
        {
            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            Arrays.sort(a);
            System.out.print("The second largest number: "+a[n-2]);
        }
    }

