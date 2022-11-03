package ps.programmers.warmups;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class MaxValueFromArray {

    public static void main(String[] args) {
    }
    private static int calculateMax(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];

    }
}
