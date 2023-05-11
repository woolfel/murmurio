package openai.api.edit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * for the full schema description, look at the jsonschema definition
 *
 * <pre>
 *     {
 *   "object": "edit",
 *   "created": 1589478378,
 *   "choices": [
 *     {
 *       "text": "What day of the week is it?",
 *       "index": 0,
 *     }
 *   ],
 *   "usage": {
 *     "prompt_tokens": 25,
 *     "completion_tokens": 32,
 *     "total_tokens": 57
 *   }
 * }
 * </pre>
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
