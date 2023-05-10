package openai.api.audio.completion.edit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * for the full schema description, look at the jsonschema definition
 *
 * @author  peter lin
 */
public class EditResponse {
    @JsonProperty("object")
    private String object;
    @JsonProperty("created")
    private Long created;
    @JsonProperty("choices")
    private List<EditChoice> choices;
    @JsonProperty("usage")
    private EditUsage usage;

    public EditResponse(){}

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public List<EditChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<EditChoice> choices) {
        this.choices = choices;
    }

    public EditUsage getUsage() {
        return usage;
    }

    public void setUsage(EditUsage usage) {
        this.usage = usage;
    }
}
