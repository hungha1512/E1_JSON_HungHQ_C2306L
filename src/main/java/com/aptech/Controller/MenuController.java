package com.aptech.Controller;

import com.example.e1.e1_json_hunghq_2306l.FxmlLoader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML private BorderPane mainBorderPane;
    @FXML Pane viewPane;
    @FXML public void OpenCategory(ActionEvent event) {
        FxmlLoader fxmlLoader = new FxmlLoader();
        viewPane = fxmlLoader.getViewPane("Category.fxml");
        mainBorderPane.setCenter(viewPane);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void OpenProductList(ActionEvent actionEvent) {
        FxmlLoader fxmlLoader = new FxmlLoader();
        viewPane = fxmlLoader.getViewPane("Product.fxml");
        mainBorderPane.setCenter(viewPane);
    }
}
