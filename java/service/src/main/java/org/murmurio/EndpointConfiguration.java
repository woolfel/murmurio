package org.murmurio;

import java.time.LocalDateTime;

/**
 * the configuration for a given endpoint and the deprecation date. right now openai doesn't
 * state when endpoints will be deprecated, but it's gauranteed to happen when better
 * versions are released.
 *
 * author: peter lin
 */
public class EndpointConfiguration {
    private String name;
    private String version;
    private String endpoint;
    private LocalDateTime deprecationDate;

    public EndpointConfiguration(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public LocalDateTime getDeprecationDate() {
        return deprecationDate;
    }

    public void setDeprecationDate(LocalDateTime deprecationDate) {
        this.deprecationDate = deprecationDate;
    }
}
