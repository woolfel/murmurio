package openai.api.finetune;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The hyper parameter value at the specific epoch of the fine tune training
 *
 * @author peter lin
 */
public class HyperParameter {
    @JsonProperty("batch_size")
    private Integer batchSize;
    @JsonProperty("learningRateMultiplier")
    private Double learningRateMultiplier;
    @JsonProperty("n_epochs")
    private Integer nEpochs;
    @JsonProperty("prompt_loss_weight")
    private Double prompt_loss_weight;

    public HyperParameter(){}

    public Integer getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public Double getLearningRateMultiplier() {
        return learningRateMultiplier;
    }

    public void setLearningRateMultiplier(Double learningRateMultiplier) {
        this.learningRateMultiplier = learningRateMultiplier;
    }

    public Integer getnEpochs() {
        return nEpochs;
    }

    public void setnEpochs(Integer nEpochs) {
        this.nEpochs = nEpochs;
    }

    public Double getPrompt_loss_weight() {
        return prompt_loss_weight;
    }

    public void setPrompt_loss_weight(Double prompt_loss_weight) {
        this.prompt_loss_weight = prompt_loss_weight;
    }
}
