package exercise.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// BEGIN
@Getter
@Setter
@NoArgsConstructor
public class ProductUpdateDTO {
    private String title;
    private int price;
}
// END
