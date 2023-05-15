package openai.api.transcription;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Create transcription of an audio file
 * <a href="https://platform.openai.com/docs/api-reference/audio/create">
 *     https://platform.openai.com/docs/api-reference/audio/create</a>
 * The enpoint URL for transaction is https://api.openai.com/v1/audio/transcriptions
 * <a href="https://github.com/openai/whisper">https://github.com/openai/whisper</a>
 * <pre>
 *   {
 *   "text": "Imagine the wildest idea that you've ever had, and you're curious about how it might scale to something that's a 100, a 1,000 times bigger.
 *   }
 * </pre>
 *
 * @author peter lin
 */
public class TranscriptResponse {
    @JsonProperty("text")
    private String text;
    @JsonProperty("task")
    private String task;
    @JsonProperty("language")
    private String language;
    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("segments")
    private List<TranscriptSegment> segments;

    public TranscriptResponse(){}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public List<TranscriptSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<TranscriptSegment> segments) {
        this.segments = segments;
    }
}
