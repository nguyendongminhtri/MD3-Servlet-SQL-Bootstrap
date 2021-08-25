package chinhanh.model;

import java.util.List;

public class Category {
    private int id;
    private String nameCategory;
    private String avatarCategory;
    private List<Song> songs;

    public Category() {
    }

    public Category(int id, String nameCategory, String avatarCategory) {
        this.id = id;
        this.nameCategory = nameCategory;
        this.avatarCategory = avatarCategory;
    }

    public Category(String nameCategory, String avatarCategory) {
        this.nameCategory = nameCategory;
        this.avatarCategory = avatarCategory;
    }

    public int getId() {
        return id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public String getAvatarCategory() {
        return avatarCategory;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public void setAvatarCategory(String avatarCategory) {
        this.avatarCategory = avatarCategory;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
