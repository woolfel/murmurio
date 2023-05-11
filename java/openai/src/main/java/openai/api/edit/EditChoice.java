package openai.api.edit;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * for the full schema description, look at the jsonschema definition
 *
 * @author  peter lin
 */
public class EditChoice {
    @JsonProperty("text")
    private String text;
    @JsonProperty("index")
    private Integer index;

    public EditChoice() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
