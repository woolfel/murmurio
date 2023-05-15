package openai.api.moderation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModerationResult {
    @JsonProperty("categories")
    private ModerationCategory categories;
    @JsonProperty("category_scores")
    private ModerationCategoryScore categoryScores;
    @JsonProperty("flagged")
    private Boolean flagged;

    public ModerationResult(){}

    public ModerationCategory getCategories() {
        return categories;
    }

    public void setCategories(ModerationCategory categories) {
        this.categories = categories;
    }

    public ModerationCategoryScore getCategoryScores() {
        return categoryScores;
    }

    public void setCategoryScores(ModerationCategoryScore categoryScores) {
        this.categoryScores = categoryScores;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }
}
