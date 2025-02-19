import java.util.Arrays;

//  Write a program that generates five 4 digit random values and 
//  then finds their average value, and their minimum and maximum value. 
//  Use Math.random(), Math.min(), and Math.max().

public class RandomValues {
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(4);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        
        double[] results = findAverageMinMax(randomNumbers);
        
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum Value: " + results[1]);
        System.out.println("Maximum Value: " + results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000); 
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = sum / numbers.length;
        return new double[] {average, min, max};
    }
}
