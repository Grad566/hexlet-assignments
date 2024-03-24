package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name,
                     Map<String, String> attributes,
                     String body,
                     List<Tag> children
                    ) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("<" + super.getName());
        for (Map.Entry<String, String> entry : super.getAttributes().entrySet()) {
            result.append(" ");
            result.append(entry.getKey());
            result.append("=");
            result.append("\"").append(entry.getValue()).append("\"");
        }
        result.append(">");

        for (var tag : children) {
            result.append(tag.toString());
        }

        result.append(body);
        result.append("</").append(super.getName()).append(">");

        return result.toString();
    }
}
// END
