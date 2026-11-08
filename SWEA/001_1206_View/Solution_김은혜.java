import java.io.*;
import java.util.StringTokenizer;

class Solution {

    static int n;
    static int[] height;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        for(int t=0; t<10; t++) {
            n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = Integer.parseInt(st.nextToken());
            }

            int answer = 0;
            for (int i = 0; i < n; i++) {
                if (height[i] == 0) continue;

                int l1 = height[i] - height[i - 1];
                int l2 = height[i] - height[i - 2];
                int r1 = height[i] - height[i + 1];
                int r2 = height[i] - height[i + 2];

                if (l1 > 0 && l2 > 0 && r1 > 0 && r2 > 0) {
                    int m1 = Math.min(l1, l2);
                    int m2 = Math.min(r1, r2);
                    answer += Math.min(m1, m2);
                }
            }

            bw.write("#" + (t+1) + " " + answer + "\n");
        }

        br.close();
        bw.close();
    }
}