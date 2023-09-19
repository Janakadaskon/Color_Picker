package lk.ijse.dep11;

import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class MainFormController {


    public Slider slrRed;
    public TextField txtRed;
    public Slider slrGreen;
    public TextField txtGreen;
    public Slider slrBlue;
    public TextField txtBlue;
    public Slider slrAlpha;
    public TextField txtAlpha;
    public Rectangle shpColor;
    public TextField txtColor;

    public void initialize(){
        txtRed.setTooltip(new Tooltip("RED Value"));
        txtGreen.setTooltip(new Tooltip("GREEN Value"));
        txtBlue.setTooltip(new Tooltip("BLUE Value"));
        txtAlpha.setTooltip(new Tooltip("ALPHA value"));
        txtColor.setTooltip(new Tooltip("COLOR Value"));

        slrRed.valueProperty().addListener(e -> {
            txtRed.setText(String.format("%.0f",slrRed.getValue()));
        });
    }
}
