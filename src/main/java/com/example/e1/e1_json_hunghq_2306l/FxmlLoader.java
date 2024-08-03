package com.example.e1.e1_json_hunghq_2306l;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class FxmlLoader {
    private Pane view;

    public Pane getViewPane(String fileNamePane) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fileNamePane));
            view = (Pane)loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }

}
