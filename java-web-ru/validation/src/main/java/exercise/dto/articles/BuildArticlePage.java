package exercise.dto.articles;

import io.javalin.validation.ValidationError;
import java.util.Map;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
// BEGIN
public class BuildArticlePage {
    private String title;
    private String content;
    private Map<String, List<ValidationError<Object>>> errors;

    public BuildArticlePage(Map<String, List<ValidationError<Object>>> errors) {
        this.errors = errors;
    }
}
// END
