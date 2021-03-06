
package org.bsdata.viewmodel;

import java.util.ArrayList;
import java.util.List;


public class RepositoryVm extends ResponseVm {
    
    private String name;
    private String description;
    private String repoUrl;
    private String gitHubUrl;
    private String bugTrackerUrl;
    private String feedUrl;
    private String lastUpdated;
    private String lastUpdateDescription;
    private List<RepositoryFileVm> repositoryFiles;
    
    public RepositoryVm() {
        repositoryFiles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String url) {
        this.repoUrl = url;
    }

    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl) {
        this.gitHubUrl = gitHubUrl;
    }

    public String getBugTrackerUrl() {
        return bugTrackerUrl;
    }

    public void setBugTrackerUrl(String bugTrackerUrl) {
        this.bugTrackerUrl = bugTrackerUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RepositoryFileVm> getRepositoryFiles() {
        return repositoryFiles;
    }

    public void setRepositoryFiles(List<RepositoryFileVm> repositoryFiles) {
        this.repositoryFiles = repositoryFiles;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    public String getLastUpdateDescription() {
        return lastUpdateDescription;
    }

    public void setLastUpdateDescription(String lastUpdateDescription) {
        this.lastUpdateDescription = lastUpdateDescription;
    }
}
