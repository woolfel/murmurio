package openai.api.chat;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * completion choice for newer version is a little different than the older version.
 * Expect this to change in the future
 *
 * @author  peter lin
 */
public class ChatCompletionChoice {
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("delta")
    private ChatMessage message;
    @JsonProperty("finish_reason")
    private String finishReason;

    public ChatCompletionChoice(){}

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }
}
