package openai.api.moderation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The moderation endpoint is a tool you can use to check whether content complies
 * with OpenAI's usage policies. Developers can thus identify content that our
 * usage policies prohibits and take action, for instance by filtering it.
 *
 * <a href="https://platform.openai.com/docs/guides/moderation/overview">
 *     https://platform.openai.com/docs/guides/moderation/overview</a>
 *
 * <pre>
 *     curl https://api.openai.com/v1/moderations \
 *   -X POST \
 *   -H "Content-Type: application/json" \
 *   -H "Authorization: Bearer $OPENAI_API_KEY" \
 *   -d '{"input": "Sample text goes here"}'
 * </pre>
 * @author peter lin
 */
public class ModerationRequest {
    @JsonProperty("model")
    private String model;
    @JsonProperty("input")
    private String input;

    public ModerationRequest(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
