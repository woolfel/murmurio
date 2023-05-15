package openai.api.embedding;

import com.fasterxml.jackson.annotation.JsonProperty;
import openai.api.Embedding;
import openai.api.Usage;

import java.util.List;

/**
 * <a href="https://platform.openai.com/docs/guides/embeddings">https://platform.openai.com/docs/guides/embeddings</a>
 *
 * <pre>
 *     {
 *   "data": [
 *     {
 *       "embedding": [
 *         -0.006929283495992422,
 *         -0.005336422007530928,
 *         ...
 *         -4.547132266452536e-05,
 *         -0.024047505110502243
 *       ],
 *       "index": 0,
 *       "object": "embedding"
 *     }
 *   ],
 *   "model": "text-embedding-ada-002",
 *   "object": "list",
 *   "usage": {
 *     "prompt_tokens": 5,
 *     "total_tokens": 5
 *   }
 * }
 * </pre>
 *
 * @author peter lin
 */
public class EmbeddingResponse {
    @JsonProperty("data")
    private List<Embedding> data;
    @JsonProperty("model")
    private String model;
    @JsonProperty("object")
    private String object;
    @JsonProperty("usage")
    private Usage usage;
}
