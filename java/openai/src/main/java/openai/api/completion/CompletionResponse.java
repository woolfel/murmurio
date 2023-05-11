package openai.api.completion;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * for the full schema description, look at the jsonschema definition.
 * OpenAI link - https://platform.openai.com/docs/api-reference/completions
 * <pre>
 *     curl https://api.openai.com/v1/completions \
 *   -H "Content-Type: application/json" \
 *   -H "Authorization: Bearer $OPENAI_API_KEY" \
 *   -d '{
 *     "model": "text-davinci-003",
 *     "prompt": "Say this is a test",
 *     "max_tokens": 7,
 *     "temperature": 0
 *   }'
 * </pre>
 *
 * @author  peter lin
 */
public class CompletionResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("object")
    private String object;
    @JsonProperty("created")
    private Long created;
    @JsonProperty("model")
    private String model;
    @JsonProperty("choices")
    private List<CompletionChoice> choices;

    public CompletionResponse(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<CompletionChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<CompletionChoice> choices) {
        this.choices = choices;
    }
}
