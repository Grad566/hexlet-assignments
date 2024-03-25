package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> incorrectFields = new ArrayList<String>();

        for(Field field : address.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    var value = field.get(address);
                    if(value == null) {
                        incorrectFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return incorrectFields;
    }
}
// END
