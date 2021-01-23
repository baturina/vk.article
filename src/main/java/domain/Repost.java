package domain;

public class Repost {



    private boolean isCanRepost;
    private int count;
    private boolean isIdReposted;


    public boolean isCanRepost() {
        return isCanRepost;
    }

    public void setCanRepost(boolean canRepost) {
        isCanRepost = canRepost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isIdReposted() {
        return isIdReposted;
    }

    public void setIdReposted(boolean IdReposted) {
        isIdReposted = IdReposted;
    }
}


