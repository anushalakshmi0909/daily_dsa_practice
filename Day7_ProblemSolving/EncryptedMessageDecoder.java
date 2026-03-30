// EncryptedMessageDecoder.java
import java.util.*;

class EncryptedMessageDecoder {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> prevStack = new Stack<>();
        int num = 0;
        StringBuilder curr = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                num = num*10 + (c-'0');
            } else if(c == '[') {
                numStack.push(num);
                prevStack.push(curr);
                num = 0;
                curr = new StringBuilder();
            } else if(Character.isLetter(c)) {
                curr.append(c);
            } else if(c == ']') {
                int repeat = numStack.pop();
                StringBuilder prev = prevStack.pop();
                StringBuilder temp = new StringBuilder();
                for(int i = 0; i < repeat; i++) temp.append(curr);
                curr = prev.append(temp);
            }
        }
        return curr.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(decodeString(s));
    }
}