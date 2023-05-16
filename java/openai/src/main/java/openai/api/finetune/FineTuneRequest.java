package openai.api.finetune;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Fine tuning customizes the model for your app. For the official explanation, please visit
 * OpenAI page <a href="https://platform.openai.com/docs/guides/fine-tuning">
 *     https://platform.openai.com/docs/guides/fine-tuning</a>
 *
 * <p>
 *     From the docs, the process for fine-tuning. The steps:
 *     1. Prepare and upload training data
 *     2. Train a new fine-tuned model
 *     3. Use your fine-tuned model
 * </p>
 *
 * <pre>
 *     curl https://api.openai.com/v1/completions \
 *   -H "Authorization: Bearer $OPENAI_API_KEY" \
 *   -H "Content-Type: application/json" \
 *   -d '{"prompt": YOUR_PROMPT, "model": FINE_TUNED_MODEL}'
 * </pre>
 *
 * Example data file:
 * <pre>
 * {"prompt": "<prompt text>", "completion": "<ideal generated text>"}
 * {"prompt": "<prompt text>", "completion": "<ideal generated text>"}
 * {"prompt": "<prompt text>", "completion": "<ideal generated text>"}
 * ...
 * </pre>
 *
 * @author peter lin
 */
public class FineTuneRequest {
    @JsonProperty("training_file")
    private String trainingFile;
    @JsonProperty("validation_file")
    private String validationFile;
    @JsonProperty("model")
    private String model;
    @JsonProperty("n_epochs")
    private Integer nEpochs;
    @JsonProperty("batch_size")
    private Integer batchSize;
    @JsonProperty("learning_rate_multiplier")
    private Double learningRateMultiplier;
    @JsonProperty("prompt_loss_weight")
    private Double promptLossWeight;
    @JsonProperty("compute_classification_metrics")
    private Boolean computeClassificationMetrics;
    @JsonProperty("classification_n_classes")
    private Integer classificationNClasses;
    @JsonProperty("classification_positive_classes")
    private String classificationPositiveClass;
    @JsonProperty("classification_betas")
    private List<Double> classificationBetas;
    @JsonProperty("suffix")
    private String suffix;

    public  FineTuneRequest(){}

    public String getTrainingFile() {
        return trainingFile;
    }

    public void setTrainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
    }

    public String getValidationFile() {
        return validationFile;
    }

    public void setValidationFile(String validationFile) {
        this.validationFile = validationFile;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getnEpochs() {
        return nEpochs;
    }

    public void setnEpochs(Integer nEpochs) {
        this.nEpochs = nEpochs;
    }

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

    public Double getPromptLossWeight() {
        return promptLossWeight;
    }

    public void setPromptLossWeight(Double promptLossWeight) {
        this.promptLossWeight = promptLossWeight;
    }

    public Boolean getComputeClassificationMetrics() {
        return computeClassificationMetrics;
    }

    public void setComputeClassificationMetrics(Boolean computeClassificationMetrics) {
        this.computeClassificationMetrics = computeClassificationMetrics;
    }

    public Integer getClassificationNClasses() {
        return classificationNClasses;
    }

    public void setClassificationNClasses(Integer classificationNClasses) {
        this.classificationNClasses = classificationNClasses;
    }

    public String getClassificationPositiveClass() {
        return classificationPositiveClass;
    }

    public void setClassificationPositiveClass(String classificationPositiveClass) {
        this.classificationPositiveClass = classificationPositiveClass;
    }

    public List<Double> getClassificationBetas() {
        return classificationBetas;
    }

    public void setClassificationBetas(List<Double> classificationBetas) {
        this.classificationBetas = classificationBetas;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
