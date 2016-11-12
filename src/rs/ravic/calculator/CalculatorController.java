package rs.ravic.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    @FXML
    private TextField value;

    private String operator;

    private boolean flag = true;

    private String number1;


    @FXML
    public void onNumberClick(ActionEvent event) {
        if (!flag) {
            value.clear();
        }
        flag = true;
        Button b = (Button) event.getSource();
        if (value.getText() == "0") {
            value.setText(b.getText());
        } else if (value.getText() == ".") {
            if (value.getText() == "0") {
                value.setText(value.getText().concat(b.getText()));
            }
        }

        else {
                value.setText(value.getText().concat(b.getText()));
        }

    }

    @FXML
    public void onOperatorClick(ActionEvent event) {
        Button b = (Button) event.getSource();

        if (!b.getText().equals("=")) {
           operator = b.getText();
            number1 = value.getText();
            value.clear();
        }
        else {
            value.setText(Operation.operate(number1,value.getText(),operator));
        }
        flag = false;

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        value.setText("0");
    }
}
