public class StatisticsHelper {
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum;
    }

    public double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int sum = calculateSum(numbers);
        return (double) sum / numbers.length;
    }

    public int calculateMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int calculateMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
