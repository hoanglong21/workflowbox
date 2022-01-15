package model;

public class Achievement {
    private int ID;
    private String name;
    private String description;
    private String icon;

    public Achievement() {
    }

    public Achievement(int ID, String name, String description, String icon) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    
}
