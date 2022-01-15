package model;

public class Post {
    private int ID;
    private String title;
    private String date;
    private String content;
    private String brief;
    private String thumbnail;
    private int hrID;
    private String hrName;
    private int statusID;
    
    private String fullName;
    private String status;

    public Post() {
    }

    public Post(int ID, String title, String date, String content, String brief, String thumbnail, int hrID, String hrName, int statusID) {
        this.ID = ID;
        this.title = title;
        this.date = date;
        this.content = content;
        this.brief = brief;
        this.thumbnail = thumbnail;
        this.hrID = hrID;
        this.hrName = hrName;
        this.statusID = statusID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getHrID() {
        return hrID;
    }

    public void setHrID(int hrID) {
        this.hrID = hrID;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
