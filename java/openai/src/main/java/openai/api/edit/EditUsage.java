package openai.api.edit;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * for the full schema description, look at the jsonschema definition
 *
 * @author  peter lin
 */
public class EditUsage {
    @JsonProperty("prompt_tokens")
    private String promptTokens;
    @JsonProperty("completion_tokens")
    private String completionTokens;
    @JsonProperty("total_tokens")
    private String totalTokens;

    public EditUsage() {}

    public String getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(String promptTokens) {
        this.promptTokens = promptTokens;
    }

    public String getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(String completionTokens) {
        this.completionTokens = completionTokens;
    }

    public String getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(String totalTokens) {
        this.totalTokens = totalTokens;
    }
}
