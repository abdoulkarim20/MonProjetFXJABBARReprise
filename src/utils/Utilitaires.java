package utils;

import javafx.scene.control.Alert;

public class Utilitaires {
    public static void showMessage(String title , String header, String content , Alert.AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
