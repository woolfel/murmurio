package openai.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Embedding is at the top given it could be useful for other endpoints in the future
 *
 * @author peter lin
 */
public class Embedding {
    @JsonProperty("object")
    private String object;
    @JsonProperty("embedding")
    private List<Double> embedding;
    @JsonProperty("index")
    private Integer index;

    public Embedding(){}

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Double> getEmbedding() {
        return embedding;
    }

    public void setEmbedding(List<Double> embedding) {
        this.embedding = embedding;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
