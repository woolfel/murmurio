package openai.api.completion;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompletionChoice {
    @JsonProperty("text")
    private String text;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("finish_reason")
    private String finishReason;
    @JsonProperty("logprobs")
    private LogProbsResponse logprobs;

    public CompletionChoice(){}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public LogProbsResponse getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(LogProbsResponse logprobs) {
        this.logprobs = logprobs;
    }
}
