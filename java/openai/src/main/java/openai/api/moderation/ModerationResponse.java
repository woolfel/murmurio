package openai.api.moderation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 *
 * The moderation endpoint is a tool you can use to check whether content complies
 * with OpenAI's usage policies. Developers can thus identify content that our
 * usage policies prohibits and take action, for instance by filtering it.
 *
 * <a href="https://platform.openai.com/docs/guides/moderation/overview">
 *     https://platform.openai.com/docs/guides/moderation/overview</a>
 *
 * <pre>
 *     {
 *   "id": "modr-XXXXX",
 *   "model": "text-moderation-001",
 *   "results": [
 *     {
 *       "categories": {
 *         "hate": false,
 *         "hate/threatening": false,
 *         "self-harm": false,
 *         "sexual": false,
 *         "sexual/minors": false,
 *         "violence": false,
 *         "violence/graphic": false
 *       },
 *       "category_scores": {
 *         "hate": 0.18805529177188873,
 *         "hate/threatening": 0.0001250059431185946,
 *         "self-harm": 0.0003706029092427343,
 *         "sexual": 0.0008735615410842001,
 *         "sexual/minors": 0.0007470346172340214,
 *         "violence": 0.0041268812492489815,
 *         "violence/graphic": 0.00023186142789199948
 *       },
 *       "flagged": false
 *     }
 *   ]
 * }
 * </pre>
 * @author peter lin
 */
public class ModerationResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("model")
    private String model;
    @JsonProperty("results")
    private List<ModerationResult> results;

    public ModerationResponse(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<ModerationResult> getResults() {
        return results;
    }

    public void setResults(List<ModerationResult> results) {
        this.results = results;
    }
}
