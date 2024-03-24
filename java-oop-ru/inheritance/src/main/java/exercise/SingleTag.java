package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
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

        return result.toString();
    }
}
// END
