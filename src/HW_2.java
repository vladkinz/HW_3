import java.util.Random;

public class HW_2 {
    public static void main(String[] args) {
        int age = generateRandomAge();
        int temperature = 20;
        String result = permission(age, temperature);
        System.out.println(result);
        System.out.println(permission(generateRandomAge(),15));
        System.out.println(permission(generateRandomAge(),20));
        System.out.println(permission(generateRandomAge(),-20));
        System.out.println(permission(generateRandomAge(),30));
        System.out.println(permission(generateRandomAge(),40));
    }

    public static String permission(int age, int temperature) {
        if ((age > 20 && age < 45 && temperature > -20 &&  temperature < 30) ||
                (age < 20 && temperature > 0 && temperature < 28) ||
                (age > 45 && temperature > -10 && temperature < 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(1, 100 + 1);
    }
}
