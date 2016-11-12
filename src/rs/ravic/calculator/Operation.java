package rs.ravic.calculator;

/**
 * Created by Nikola on 11/12/2016.
 */
public class Operation {

    public static String operate(String number1, String number2, String operator) {
        Float number11 = Float.valueOf(number1);
        Float number22 = Float.valueOf(number2);

        switch (operator) {
            case "+":
                return String.valueOf(number11 + number22);
            case "-":
                return String.valueOf(number11 - number22);
            case "*":
                return String.valueOf(number11 * number22);
            case "÷":
                if (number2.equals("0")) {
                    return "0";
                }
                return String.valueOf(number11 / number22);
        }
        return "0";
    }
}
