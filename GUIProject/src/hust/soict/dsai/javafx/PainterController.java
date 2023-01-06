package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    private Color colorToWrite;
    private int radius;
    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void onSwitchToEraser(ActionEvent event){
        radius = 10;
        this.colorToWrite = Color.WHITE;
    }
    @FXML
    private RadioButton penBtn;

    @FXML
    private RadioButton eraserBtn;

    @FXML
    void onSwitchToPen(ActionEvent event){
        radius=4;
        this.colorToWrite = Color.BLACK;
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(),event.getY(),radius, this.colorToWrite);
        drawingAreaPane.getChildren().add(newCircle);
    }

}
