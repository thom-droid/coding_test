package ps.baekjun.greedy.bronze;
/*
*
* 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

출력
상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeliveringSugarCane {

    public static void main(String[] args) throws IOException {

        System.out.println(solution( ));

    }

    // 동전문제와 흡사한 것 같다.
    // 12와 같이 5와 3의 조합으로 나뉠 수 없을 때는, 3으로만 나누어야 한다.
    // 5와 3이 들어간 수를 찾아보자. 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30... 5n + 3k ...
    // 5의 배수. 5, 10, 15, 20, 25, 30 ...
    // 3의 배수, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 ...
    // 8의 배수, 8, 16, 24, 32, ...
    // 위 세 규칙에 우선순위를 매겨서 해결해야 할까?


    // 5가 많이 들어가야 최소값을 구할 수 있으므로 5의 배수 기준으로 표를 그려서 해결하면 된다.
    // 5n, 5n+1, 5n+2, 5n+3, 5n+4의 경우에 해당하는 몫과 나머지, 그리고 봉투의 개수를 찾아보면
    // 5n 일 경우 5의 배수이므로 n을 리턴
    // 5n+1, 5n+3의 경우 봉투의 개수가 5n + 1 가 된다.
    // 5n+2, 5n+4의 경우 봉투의 개수가 5n + 2 가 된다.

    public static int solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N == 4 || N == 7) {
            System.out.println(-1);

        } else if(N % 5 == 0){
                System.out.println(N / 5);

        } else if(N % 5 == 1 || N % 5 == 3){
            System.out.println((N /5) + 1);

        } else if(N % 5 == 2 || N % 5 == 4){
            System.out.println((N / 5) + 2);

        }

        return 0;
    }
}

