package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String value;
    private TagInterface type;
    public  LabelTag (String value, TagInterface type) {
        this.value = value;
        this.type = type;
    }
    @Override
    public String render() {
        return "<label>" + value + type.render() + "</label>";
    }
}
// END
