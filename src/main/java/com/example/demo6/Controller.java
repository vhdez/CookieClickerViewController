package com.example.demo6;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;

public class Controller {
    public  Label cookiesCountLabel;
    public Button clickMeButton;
    public ImageView cookieImageView;

    int numOfCookies;

    public void initialize() throws Exception {
        FileInputStream input = new FileInputStream("src/main/resources/cookie.png");
        Image image = new Image(input);
        cookieImageView.setImage(image);
    }

    public void cookieButtonClicked() {
        System.out.println("BUTTON CLICKED");
        numOfCookies += 1;
        cookiesCountLabel.setText("Cookies: " + numOfCookies);
    }
}