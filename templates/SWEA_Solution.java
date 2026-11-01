/*
 * [SWEA 문제번호] 문제이름
 * 링크:
 * 작성자:
 *
 * 접근 방법:
 *
 * 시간복잡도:
 *
 * 회고:
 */

import java.io.*;
import java.util.*;

// 파일 이름은 Solution_이름.java, 클래스는 public 없이 Solution 그대로 둡니다.
class Solution {
    public static void main(String[] args) throws IOException {
        // 로컬 테스트할 때만 주석 해제 (같은 폴더에 input.txt 필요, 제출 전 다시 주석 처리)
        // System.setIn(new FileInputStream("input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int answer = 0;

            sb.append('#').append(tc).append(' ').append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
