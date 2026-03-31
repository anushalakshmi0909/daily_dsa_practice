import java.util.*;

class ZeroSumTuples {

    public static int countZeroTuples(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length;

        Map<Integer, Integer> sumMap = new HashMap<>();
        int count = 0;

        // Store sums of A + B
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
            }
        }

        // Check sums of C + D
        for(int k = 0; k < n; k++) {
            for(int l = 0; l < n; l++) {
                int sum = C[k] + D[l];
                int needed = -sum;

                count += sumMap.getOrDefault(needed, 0);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];

        for(int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {
            B[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {
            C[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {
            D[i] = in.nextInt();
        }

        int result = countZeroTuples(A, B, C, D);
        System.out.println(result);
    }
}