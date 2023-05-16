package openai.api.finetune;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.File;
import java.util.List;

/**
 * <a href="https://platform.openai.com/docs/guides/fine-tuning/advanced-usage">
 *     https://platform.openai.com/docs/guides/fine-tuning/advanced-usage</a>
 *
 * <p>Note: OpenAI supports Weights & Biases for fine-tuning.
 * You can sync your fine-tunes with Weights & Biases to track experiments, models, and datasets.
 *
 * To get started, you will need a Weights & Biases account and a paid OpenAI plan.
 * To make sure you are using the lastest version of openai and wandb, run:
 * </p>
 * @author peter lin
 */
public class FineTuneResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("fine_tuned_model")
    private String fineTunedModel;
    @JsonProperty("model")
    private String model;
    @JsonProperty("object")
    private String object;
    @JsonProperty("organization_id")
    private String organizationId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("events")
    private List<FineTuneEvent> events;
    @JsonProperty("hyperparams")
    private HyperParameter hyperparams;
    @JsonProperty("result_files")
    private List<File> resultFiles;
    @JsonProperty("training_files")
    private List<File> trainingFiles;
    @JsonProperty("validation_files")
    private List<File> validationFiles;

    public FineTuneResponse(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFineTunedModel() {
        return fineTunedModel;
    }

    public void setFineTunedModel(String fineTunedModel) {
        this.fineTunedModel = fineTunedModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public List<FineTuneEvent> getEvents() {
        return events;
    }

    public void setEvents(List<FineTuneEvent> events) {
        this.events = events;
    }

    public HyperParameter getHyperparams() {
        return hyperparams;
    }

    public void setHyperparams(HyperParameter hyperparams) {
        this.hyperparams = hyperparams;
    }

    public List<File> getResultFiles() {
        return resultFiles;
    }

    public void setResultFiles(List<File> resultFiles) {
        this.resultFiles = resultFiles;
    }

    public List<File> getTrainingFiles() {
        return trainingFiles;
    }

    public void setTrainingFiles(List<File> trainingFiles) {
        this.trainingFiles = trainingFiles;
    }

    public List<File> getValidationFiles() {
        return validationFiles;
    }

    public void setValidationFiles(List<File> validationFiles) {
        this.validationFiles = validationFiles;
    }
}
