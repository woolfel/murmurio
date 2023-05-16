package openai.api.finetune;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Fine tuning customizes the model for your app. For the official explanation, please visit
 * OpenAI page <a href="https://platform.openai.com/docs/guides/fine-tuning">
 *     https://platform.openai.com/docs/guides/fine-tuning</a>
 *
 * Events from OpenAI when Fine-tuning runs. The documentation states:
 * <i>Streams events until the job is done (this often takes minutes,
 * but can take hours if there are many jobs in the queue or your
 * dataset is large)</i>
 *
 * @author peter lin
 */
public class FineTuneEvent {
    @JsonProperty("object")
    private String object;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("message")
    private String message;

    public FineTuneEvent(){}

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
