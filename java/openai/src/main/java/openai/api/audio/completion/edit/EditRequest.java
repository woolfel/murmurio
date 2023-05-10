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

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
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
}
