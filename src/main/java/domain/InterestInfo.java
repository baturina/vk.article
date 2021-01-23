package domain;


public class InterestInfo {

    private boolean IsNotInterested;
    private boolean IsSaveToBookmarks;
    private boolean IsComplain;
    private boolean IsNotifyAboutEntries;

    public boolean isNotInterested() {
        return IsNotInterested;
    }

    public void setNotInterested(boolean notInterested) {
        IsNotInterested = notInterested;
    }

    public boolean isSaveToBookmarks() {
        return IsSaveToBookmarks;
    }

    public void setSaveToBookmarks(boolean saveToBookmarks) {
        IsSaveToBookmarks = saveToBookmarks;
    }

    public boolean isComplain() {
        return IsComplain;
    }

    public void setComplain(boolean complain) {
        IsComplain = complain;
    }

    public boolean isNotifyAboutEntries() {
        return IsNotifyAboutEntries;
    }

    public void setNotifyAboutEntries(boolean notifyAboutEntries) {
        IsNotifyAboutEntries = notifyAboutEntries;
    }
}

