package openai.api.moderation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The moderation categories will most likely change over time. When it changges, this class
 * will need to be updated.
 *
 * <a href="https://platform.openai.com/docs/guides/moderation/quickstart">
 *     https://platform.openai.com/docs/guides/moderation/quickstart</a>
 *
 * @author peter lin
 */
public class ModerationCategoryScore {
    @JsonProperty("hate")
    private Double hate;
    @JsonProperty("hate/threatening")
    private Double hateThreatening;
    @JsonProperty("self-harm")
    private Double selfHarm;
    @JsonProperty("sexual")
    private Double sexual;
    @JsonProperty("sexual/minors")
    private Double sexualMinors;
    @JsonProperty("violence")
    private Double violence;
    @JsonProperty("violence/graphic")
    private Double violenceGraphic;

    public ModerationCategoryScore(){}

    public Double getHate() {
        return hate;
    }

    public void setHate(Double hate) {
        this.hate = hate;
    }

    public Double getHateThreatening() {
        return hateThreatening;
    }

    public void setHateThreatening(Double hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    public Double getSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(Double selfHarm) {
        this.selfHarm = selfHarm;
    }

    public Double getSexual() {
        return sexual;
    }

    public void setSexual(Double sexual) {
        this.sexual = sexual;
    }

    public Double getSexualMinors() {
        return sexualMinors;
    }

    public void setSexualMinors(Double sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    public Double getViolence() {
        return violence;
    }

    public void setViolence(Double violence) {
        this.violence = violence;
    }

    public Double getViolenceGraphic() {
        return violenceGraphic;
    }

    public void setViolenceGraphic(Double violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }
}
