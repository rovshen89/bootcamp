package ArrayList;

import java.util.concurrent.atomic.DoubleAccumulator;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(convertString(123));

        String test = convertString(12312);
        System.out.println(test);

        System.out.println(numberToString(21312));

    }

    public static String convertString(int value){
        String newStr = String.valueOf(value);
        return "\"" + newStr + "\"";

    }

    public static String numberToString(int number) {
        StringBuilder sb = new StringBuilder();
        int zero= '0';
        while(number != 0){
            sb.insert(0, (char) (zero + (number%10)));
            number = number/10;
        }
        return sb.toString();
    }
}
