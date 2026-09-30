# StreamSync

StreamSync is a Java desktop application developed as an academic project.  
The application provides a simple media-streaming interface with user login and registration functionality.

## Features

- User registration
- User login
- JavaFX-based graphical user interface
- Home interface for media content
- User and media content models
- Separate controllers for authentication functionality
- FXML-based interface design

## Technologies Used

- Java
- JavaFX
- FXML
- Object-Oriented Programming (OOP)

## Project Structure

```text
StreamSync/
├── resources/
│   ├── home.fxml
│   ├── login.fxml
│   └── register.fxml
│
└── src/
    └── main/
        ├── app/
        │   └── MainApp.java
        ├── controllers/
        │   ├── LoginController.java
        │   └── RegisterController.java
        └── models/
            ├── MediaContent.java
            └── User.java
