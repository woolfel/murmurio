package openai.api.finetune;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * If you need to cancel the fine tuning request.
 *
 * @author peter lin
 */
public class FineTuneCancelRequest {
    @JsonProperty("fine_tune_id")
    private String fineTuneId;

    public FineTuneCancelRequest(){}

    public String getFineTuneId() {
        return fineTuneId;
    }

    public void setFineTuneId(String fineTuneId) {
        this.fineTuneId = fineTuneId;
    }
}
