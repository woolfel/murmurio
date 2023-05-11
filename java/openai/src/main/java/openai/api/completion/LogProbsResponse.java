package openai.api.completion;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class LogProbsResponse {
    @JsonProperty("tokens")
    private List<String> tokens;
    @JsonProperty("token_logprobs")
    private List<Double> tokenLogProbs;
    @JsonProperty("top_logprobs")
    private List<Map<String,Double>> topLogprobs;
    @JsonProperty("text_offset")
    private List<Integer> textOffset;

    public LogProbsResponse() {}

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public List<Double> getTokenLogProbs() {
        return tokenLogProbs;
    }

    public void setTokenLogProbs(List<Double> tokenLogProbs) {
        this.tokenLogProbs = tokenLogProbs;
    }

    public List<Map<String, Double>> getTopLogprobs() {
        return topLogprobs;
    }

    public void setTopLogprobs(List<Map<String, Double>> topLogprobs) {
        this.topLogprobs = topLogprobs;
    }

    public List<Integer> getTextOffset() {
        return textOffset;
    }

    public void setTextOffset(List<Integer> textOffset) {
        this.textOffset = textOffset;
    }
}
