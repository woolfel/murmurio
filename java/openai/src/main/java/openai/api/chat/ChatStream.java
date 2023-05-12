package openai.api.chat;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ChatStream enables more interactive user experience
 *
 * @author peter lin
 */
public class ChatStream {
    @JsonProperty("id")
    private String id;
    @JsonProperty("object")
    private String object;
    @JsonProperty("created")
    private Long created;
    @JsonProperty("model")
    private String model;
    @JsonProperty("choices")
    private List<ChatCompletionChoice> choices;

    public ChatStream(){}

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

    public List<ChatCompletionChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<ChatCompletionChoice> choices) {
        this.choices = choices;
    }
}
