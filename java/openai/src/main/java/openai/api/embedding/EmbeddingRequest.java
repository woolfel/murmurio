package openai.api.embedding;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * <p>
 * <b>What are embeddings?</b>
 *
 * OpenAI’s text embeddings measure the relatedness of text strings. Embeddings are commonly used for:
 *
 *     Search (where results are ranked by relevance to a query string)
 *     Clustering (where text strings are grouped by similarity)
 *     Recommendations (where items with related text strings are recommended)
 *     Anomaly detection (where outliers with little relatedness are identified)
 *     Diversity measurement (where similarity distributions are analyzed)
 *     Classification (where text strings are classified by their most similar label)
 *
 * An embedding is a vector (list) of floating point numbers. The distance between two vectors measures
 * their relatedness. Small distances suggest high relatedness and large distances suggest low relatedness.
 * </p>
 *
 * <pre>
 *     curl https://api.openai.com/v1/embeddings \
 *   -H "Content-Type: application/json" \
 *   -H "Authorization: Bearer $OPENAI_API_KEY" \
 *   -d '{
 *     "input": "Your text string goes here",
 *     "model": "text-embedding-ada-002"
 *   }'
 * </pre>
 *
 * @author peter lin
 */
public class EmbeddingRequest {
    @JsonProperty("model")
    private String model;
    @JsonProperty("input")
    private List<String> input;
    @JsonProperty("user")
    private String user;

    public EmbeddingRequest(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
