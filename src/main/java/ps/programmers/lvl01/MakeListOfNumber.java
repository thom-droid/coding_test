package ps.programmers.lvl01;

import java.util.stream.LongStream;

public class MakeListOfNumber {

    public long[] solution(int x, int n) {

        return LongStream.range(1, n+1).map(operand -> operand * x).toArray();
    }

}
