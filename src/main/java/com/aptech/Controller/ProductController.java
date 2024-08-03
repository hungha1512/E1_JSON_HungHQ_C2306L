package com.aptech.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class ProductController {
    public void handleClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Product Listing");
        alert.setHeaderText("Product Listing");
        alert.setContentText("Are you sure you want to delete this item?");
        alert.showAndWait();
    }
}
