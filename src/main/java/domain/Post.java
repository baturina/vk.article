package domain;


public class Post {

    private int id;
    private int idOwnerPost;
    private String text;
    private int date;
    private int close;
    private int CommentInfo;
    private int likeInfo;
    private int RepostInfo;
    private int MeterView;
    private String LocationInfo;
    private boolean interestInfo;
    private boolean isPinned;
    private int markedAsAds;
    private String copyright;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private boolean isFavorite;
    private int postSourceInfo;
    private String postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOwnerPost() {
        return idOwnerPost;
    }

    public void setIdOwnerPost(int idOwnerPost) {
        this.idOwnerPost = idOwnerPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getClose() {
        return close;
    }

    public void setClose(int close) {
        this.close = close;
    }

    public int getCommentInfo() {
        return CommentInfo;
    }

    public void setCommentInfo(int commentInfo) {
        CommentInfo = commentInfo;
    }

    public int getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(int likeInfo) {
        this.likeInfo = likeInfo;
    }

    public int getRepostInfo() {
        return RepostInfo;
    }

    public void setRepostInfo(int repostInfo) {
        RepostInfo = repostInfo;
    }

    public int getMeterView() {
        return MeterView;
    }

    public void setMeterView(int meterView) {
        MeterView = meterView;
    }

    public String getLocationInfo() {
        return LocationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        LocationInfo = locationInfo;
    }

    public boolean isInterestInfo() {
        return interestInfo;
    }

    public void setInterestInfo(boolean interestInfo) {
        this.interestInfo = interestInfo;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostSourceInfo() {
        return postSourceInfo;
    }

    public void setPostSourceInfo(int postSourceInfo) {
        this.postSourceInfo = postSourceInfo;
    }

    public String getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(String postponedId) {
        this.postponedId = postponedId;
    }
}

