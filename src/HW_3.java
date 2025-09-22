import java.util.Arrays;

public class HW_3 {
    public static void main(String[] args) {
       boolean flack = false;
       int amountOfNumbers = 0;
       int sum = 0;
        double[] numbers = {2.2, 3.5, -3.8, -4.4, 6.2, 8.1, -6.4, -5.5, -1.4, -2.7, -7.2, -9.1, -10.1, 11.2, 15.3};
        System.out.println(Arrays.toString(numbers));

        for (double num: numbers){
            if (num < 0){
                flack = true;
            } if (num > 0 && flack){
                amountOfNumbers++;
                sum += num;
            }
        }
        System.out.println(sum + "/" + amountOfNumbers);
    }
}
