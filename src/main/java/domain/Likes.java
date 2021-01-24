package domain;

public class Likes {
    private String like;
    private String userLikes;
    private boolean canLike;
    private boolean canPublish;

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(String userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}