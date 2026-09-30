
package models;

public abstract class MediaContent {
    private String title;
    private String genre;
    private String type;
    private double rating;

    public MediaContent(String title, String genre, String type, double rating) {
        this.title = title;
        this.genre = genre;
        this.type = type;
        this.rating = rating;
    }

    // Getters and setters
}
