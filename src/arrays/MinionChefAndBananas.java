package arrays;

import java.util.Scanner;

public class MinionChefAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            if(N==H){
                System.out.println(MaxElement.maxElement(arr));
            }
        }
        sc.close();
    }
}
