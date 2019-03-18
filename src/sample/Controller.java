package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;



public class Controller {
    public Label helloWorld;
    public void Submit(ActionEvent actionevent){
        helloWorld.setText("Hello world!");
    }



}
