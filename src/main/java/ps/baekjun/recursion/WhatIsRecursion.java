package ps.baekjun.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Silver 5
public class WhatIsRecursion {

    static String question = "\"재귀함수가 뭔가요?\"";
    static String sentence1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String sentence2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String sentence3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static String answerSuffix ="라고 답변하였지.";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append('\n');
        printMessage(sb, N, 0);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

    private static StringBuilder printMessage(StringBuilder sb, int n, int prefixLoop) {

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < prefixLoop; i++) {
            prefix.append("----");
        }

        if (n == 0) {
            sb.append(prefix).append(question).append('\n');
            sb.append(prefix).append(answer).append('\n');
            sb.append(prefix).append(answerSuffix).append('\n');
            return null;
        }


        sb.append(prefix).append(question).append('\n');
        sb.append(prefix).append(sentence1).append('\n');
        sb.append(prefix).append(sentence2).append('\n');
        sb.append(prefix).append(sentence3).append('\n');

        printMessage(sb, n - 1, prefixLoop + 1);
        sb.append(prefix).append(answerSuffix).append('\n');

        return sb;
    }
}
