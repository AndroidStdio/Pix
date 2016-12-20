package com.fayaz.pix.model;

/**
 * Created by Fayaz on 18/12/2016.
 */
public class Post {
    private String  imageUrl;
    private long numLikes;
    private String UID;

    public Post() {
        this.UID = UID;
        this.numLikes = numLikes;
        this.imageUrl = imageUrl;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public long getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(long numLikes) {
        this.numLikes = numLikes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
