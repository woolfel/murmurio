package openai.api.transcription;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Create transcription of an audio file
 * <a href="https://platform.openai.com/docs/api-reference/audio/create">
 *     https://platform.openai.com/docs/api-reference/audio/create</a>
 * The enpoint URL for transaction is https://api.openai.com/v1/audio/transcriptions
 *
 * <pre>
 *     curl https://api.openai.com/v1/audio/transcriptions \
 *   -H "Authorization: Bearer $OPENAI_API_KEY" \
 *   -H "Content-Type: multipart/form-data" \
 *   -F file="@/path/to/file/audio.mp3" \
 *   -F model="whisper-1"
 * </pre>
 *
 * OpenAI Whisper github <a href="https://github.com/openai/whisper">https://github.com/openai/whisper</a>
 *
 * <p>
 *
 * </p>
 * @author peter lin
 */
public class TranscriptRequest {
    @JsonProperty("prompt")
    private String prompt;
    @JsonProperty("response_format")
    private String responseFormat;
    @JsonProperty("language")
    private String language;
    @JsonProperty("file")
    private String filename; // required
    @JsonProperty("model")
    private String model; // required
    @JsonProperty("temperature")
    private Double temperature;

    public TranscriptRequest(){}

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
