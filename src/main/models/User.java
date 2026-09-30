
package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String subscriptionType;
    private List<MediaContent> watchlist = new ArrayList<>();
    private List<MediaContent> history = new ArrayList<>();

    public User(String username, String password, String subscriptionType) {
        this.username = username;
        this.password = password;
        this.subscriptionType = subscriptionType;
        System.out.println("hi");
    }

    // Getters and setters
}
