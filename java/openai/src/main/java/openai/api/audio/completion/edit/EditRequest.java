package openai.api.audio.completion.edit;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * for the full schema description, look at the jsonschema definition
 *
 * @author  peter lin
 */
public class EditRequest {
    @JsonProperty("model")
    private String model;
    @JsonProperty("input")
    private String input;
    @JsonProperty("instruction")
    private String instruction;
    @JsonProperty("n")
    private Integer n;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("top_p")
    private Double topP;

    public EditRequest() {}
    
}
