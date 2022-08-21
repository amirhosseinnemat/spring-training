package ir.shaparak.amulator.services.validator;

import java.util.function.Predicate;

public class CustomValidator {
    public static Boolean check(Predicate<String> p, String input) {
        return p.test(input);
    }

    public static Boolean isNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
