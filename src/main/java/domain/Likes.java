package domain;

public class Likes {
    private Likes like;
    private int userLikes;
    private boolean canLike;
    private boolean canPublish;

    public Likes getLike() {
        return like;
    }

    public void setLike(Likes like) {
        this.like = like;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
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