public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4};

        if (data == null || data.length == 0) {
            System.err.println("Brak danych");
            return;
        }

        StatisticsHelper helper = new StatisticsHelper();
        int totalSum = helper.calculateSum(data);
        double average = helper.calculateAverage(data);

        System.out.println("Total sum is: " + totalSum);
        System.out.println("Average is: " + average);
    }
}
