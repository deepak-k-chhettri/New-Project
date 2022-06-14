package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class SpanOfStock {
    static void calculateSpan(int price[], int n, int S[])
    {
        Stack<Integer> st = new Stack<>();
        st.push(0);
 
        S[0] = 1;
 
        for (int i = 1; i < n; i++) {
            while (!st.empty() && price[st.peek()] <= price[i])
                st.pop();

            
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());
 
            st.push(i);
        }
    }
    static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int n = arr.length;
        int S[] = new int[n];
        calculateSpan(arr, n, S);
        printArray(S);
    }
}
