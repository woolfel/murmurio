package openai.api.transcription;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TranscriptSegment {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("seek")
    private Integer seek;
    @JsonProperty("start")
    private Double start;
    @JsonProperty("end")
    private Double end;
    @JsonProperty("text")
    private String text;
    @JsonProperty("tokens")
    private List<Integer> tokens;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("avg_logprob")
    private Double avgLogprob;
    @JsonProperty("no_speech_prob")
    private Double noSpeechProb;
    @JsonProperty("compression_ratio")
    private Double compressionRatio;
    @JsonProperty("transient")
    private Boolean transientIndicator; // transient is a reserved word in Java

    public TranscriptSegment(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeek() {
        return seek;
    }

    public void setSeek(Integer seek) {
        this.seek = seek;
    }

    public Double getStart() {
        return start;
    }

    public void setStart(Double start) {
        this.start = start;
    }

    public Double getEnd() {
        return end;
    }

    public void setEnd(Double end) {
        this.end = end;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Integer> getTokens() {
        return tokens;
    }

    public void setTokens(List<Integer> tokens) {
        this.tokens = tokens;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getAvgLogprob() {
        return avgLogprob;
    }

    public void setAvgLogprob(Double avgLogprob) {
        this.avgLogprob = avgLogprob;
    }

    public Double getNoSpeechProb() {
        return noSpeechProb;
    }

    public void setNoSpeechProb(Double noSpeechProb) {
        this.noSpeechProb = noSpeechProb;
    }

    public Double getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(Double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public Boolean getTransientIndicator() {
        return transientIndicator;
    }

    public void setTransientIndicator(Boolean transientIndicator) {
        this.transientIndicator = transientIndicator;
    }
}
