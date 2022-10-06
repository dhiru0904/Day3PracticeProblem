package ArrayProblem;
import java.util.Arrays;
public class FrquencyArray {
    public static void countFreq(int arr[], int n)
        {
            boolean visited[] = new boolean[n];

            Arrays.fill(visited, false);


            for (int i = 0; i < n; i++) {
                if (visited[i] == true)
                    continue;
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " " + count);
            }
        }

        public static void main(String[] args) {
            int arr[] = new int[]{ 10, 10, 7, 40, 40, 20, 5, 5};
            int n = arr.length;
            countFreq(arr, n);

        }

    }

