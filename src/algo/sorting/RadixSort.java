package algo.sorting;

public class RadixSort {

    private static int[] resultArray;

    // method to get the largest value from data to get the digit
    private static int getMaxValue(int[] data) {

        int maxValue = 0;

        for (int datum : data) {
            if (maxValue < datum) {
                maxValue = datum;
            }
        }
        return maxValue;
    }

    // modulo operating datum followed by division will achieve the number in digit.
    // if the value of exponent equals to 1, for example,
    // and the number to be operated is 123, then 3 will be returned
    // from equation (123 / 1) % 10 which means we are looping in the smallest digit.
    private static void countingSort(int[] data, int k, int exponent) {

        int[] countingArray = new int[k + 1];


        // initialize count array
        for (int datum : data) {
            countingArray[(datum / exponent) % 10]++;
        }

        // rearrange by accumulating
        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] += countingArray[i-1];
        }

        // put data according to index that is the accumulated value
        for (int i = data.length - 1; i >= 0; i--) {
            int index = countingArray[(data[i] / exponent) % 10]--;
            resultArray[index - 1] = data[i];
        }

        // copy result to the original one
        System.arraycopy(resultArray, 0, data, 0, resultArray.length);
    }

    public static int[] radixSort(int[] data, int k) {
        int maxValue = getMaxValue(data);
        resultArray = new int[data.length];

        for (int exponent = 1; maxValue / exponent > 0; exponent *= 10) {
            countingSort(data, k, exponent);
        }

        return data;
    }

}
