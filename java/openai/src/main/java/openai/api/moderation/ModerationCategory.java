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
public class ModerationCategory {
    @JsonProperty("hate")
    private Boolean hate;
    @JsonProperty("hate/threatening")
    private Boolean hateThreatening;
    @JsonProperty("self-harm")
    private Boolean selfHarm;
    @JsonProperty("sexual")
    private Boolean sexual;
    @JsonProperty("sexual/minors")
    private Boolean sexualMinors;
    @JsonProperty("violence")
    private Boolean violence;
    @JsonProperty("violence/graphic")
    private Boolean violenceGraphic;

    public ModerationCategory(){}

    public Boolean getHate() {
        return hate;
    }

    public void setHate(Boolean hate) {
        this.hate = hate;
    }

    public Boolean getHateThreatening() {
        return hateThreatening;
    }

    public void setHateThreatening(Boolean hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    public Boolean getSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(Boolean selfHarm) {
        this.selfHarm = selfHarm;
    }

    public Boolean getSexual() {
        return sexual;
    }

    public void setSexual(Boolean sexual) {
        this.sexual = sexual;
    }

    public Boolean getSexualMinors() {
        return sexualMinors;
    }

    public void setSexualMinors(Boolean sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    public Boolean getViolence() {
        return violence;
    }

    public void setViolence(Boolean violence) {
        this.violence = violence;
    }

    public Boolean getViolenceGraphic() {
        return violenceGraphic;
    }

    public void setViolenceGraphic(Boolean violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }
}
