public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4};

        StatisticsHelper helper = new StatisticsHelper();
        int totalSum = helper.calculateSum(data);

        System.out.println("Sum is: " + totalSum);
    }
}
