package ir.shaparak.amulator.services.validator;

import org.springframework.stereotype.Component;

@Component
public class PostalValidator implements IValidator {
    @Override
    public Boolean validate(String input) {
        return CustomValidator.check(s-> !s.isEmpty(), input) &&
                CustomValidator.check(CustomValidator::isNumber, input) &&
                CustomValidator.check(i -> i.length() == 10, input);
    }
}
