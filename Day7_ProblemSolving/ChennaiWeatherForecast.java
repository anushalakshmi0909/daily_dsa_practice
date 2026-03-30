// ChennaiWeatherForecast.java
import java.util.*;

class ChennaiWeatherForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temps = new int[n];
        for(int i=0;i<n;i++) temps[i]=sc.nextInt();

        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temps[i] > temps[stack.peek()]){
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(answer[i]+" ");
        }
    }
}