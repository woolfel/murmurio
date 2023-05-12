package openai.api.completion;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * for the full schema description, look at the jsonschema definition.
 * OpenAI link - https://platform.openai.com/docs/api-reference/completions
 * <a href="https://platform.openai.com/docs/api-reference/completions/create">
 *     https://platform.openai.com/docs/api-reference/completions/create</a>
 * <a href="https://platform.openai.com/docs/guides/completion/introduction">
 *     https://platform.openai.com/docs/guides/completion/introduction</a>
 *
 * The endpoint /v1/completion supports the following model names:
 * text-davinci-003, text-davinci-002, text-curie-001, text-babbage-001, text-ada-001
 * 
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
 * According to the OpenAI documentation, prompt can be string, array of string, token
 * or array of token. That feels like a kitchen sink approach and feels it adds
 * unnecessary complexity. Making prompt list of String to keep it simple.
 *
 * There's a high probability OpenAI will change the API in the future. Once they figure
 * out exactly how it should work and what people want, they'll have to make changes.
 *
 * @author  peter lin
 */
public class CompletionRequest {
    @JsonProperty("model")
    private String model;
    @JsonProperty("prompt")
    private List<String> prompt;
    @JsonProperty("suffix")
    private String suffix;
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("top_p")
    private Double topP;
    @JsonProperty("stream")
    private Boolean stream;
    @JsonProperty("logprobs")
    private Integer logprobs;
    @JsonProperty("echo")
    private Boolean echo;
    @JsonProperty("stop")
    private List<String> stop;
    @JsonProperty("presence_penalty")
    private Double presencePenalty;
    @JsonProperty("frequency_penalty")
    private Double frequencyPenalty;
    @JsonProperty("best_of")
    private Integer bestOf;
    @JsonProperty("logit_bias")
    private Map<String,Integer> logitBias;
    @JsonProperty("user")
    private String user;

    public CompletionRequest() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getPrompt() {
        return prompt;
    }

    public void setPrompt(List<String> prompt) {
        this.prompt = prompt;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTopP() {
        return topP;
    }

    public void setTopP(Double topP) {
        this.topP = topP;
    }

    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public Integer getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(Integer logprobs) {
        this.logprobs = logprobs;
    }

    public Boolean getEcho() {
        return echo;
    }

    public void setEcho(Boolean echo) {
        this.echo = echo;
    }

    public List<String> getStop() {
        return stop;
    }

    public void setStop(List<String> stop) {
        this.stop = stop;
    }

    public Double getPresencePenalty() {
        return presencePenalty;
    }

    public void setPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public Double getFrequencyPenalty() {
        return frequencyPenalty;
    }

    public void setFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Integer getBestOf() {
        return bestOf;
    }

    public void setBestOf(Integer bestOf) {
        this.bestOf = bestOf;
    }

    public Map<String, Integer> getLogitBias() {
        return logitBias;
    }

    public void setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
