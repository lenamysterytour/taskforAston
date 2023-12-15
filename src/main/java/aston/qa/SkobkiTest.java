package aston.qa;

import java.util.*;

public class SkobkiTest {

    public static boolean balanced(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                continue;
            }

            if (st.isEmpty()) {
                return false;
            }
            char check;

            switch (ch) {
                case '}':
                    check = st.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ')':
                    check = st.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;

                case ']':
                    check = st.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        return (st.isEmpty());
    }

    public static void main(String[] args) {

        System.out.println("Введите свою скобочную последовательность для затеста");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if (balanced(str))
            System.out.println("is balanced");
        else
            System.out.println("is not balanced");
    }
}
