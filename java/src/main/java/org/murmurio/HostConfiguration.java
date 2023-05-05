package org.murmurio;

import java.util.ArrayList;
import java.util.List;

/**
 * The host, endpoints, and connection settings should not be hardcoded. This class
 * encapsulates the important settings to load from JSON configuration file.
 *
 * author: peter lin
 */
public class HostConfiguration {
    private String apiname;
    private String version;
    // the hostname of the API service
    private String hostname;
    // timeout is in seconds given how slow LLM inference runs
    private int timeout = 30;
    // default retries is zero. set it to a reasonable number for real applications
    private int retries = 0;
    private List<EndpointConfiguration> endpoints = new ArrayList<EndpointConfiguration>();

    public HostConfiguration() {}

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public List<EndpointConfiguration> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointConfiguration> endpoints) {
        this.endpoints = endpoints;
    }
}
