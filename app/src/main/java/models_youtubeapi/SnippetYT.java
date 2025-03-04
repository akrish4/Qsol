package models_youtubeapi;

import models_youtubeapi.ThumbnailYT;

public class SnippetYT {
    private String title;
    private String description;
    private ThumbnailYT thumbnails;
    private ResourceID resourceId;

    public SnippetYT(){}

    public SnippetYT(String title, String description, ThumbnailYT thumbnails,ResourceID resourceId) {
        this.title = title;
        this.description = description;
        this.thumbnails = thumbnails;
        this.resourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ThumbnailYT getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(ThumbnailYT thumbnails) {
        this.thumbnails = thumbnails;
    }

    public ResourceID getResourceId() {
        return resourceId;
    }

    public void setResourceId(ResourceID resourceId) {
        this.resourceId = resourceId;
    }
}
