package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class AnimalController {

    @FXML
    private Button Animal;

    @FXML
    private Pane animal;

    @FXML
    private Label label;

    @FXML
    void gerarAnimal(ActionEvent event) {
        Animal animal = new Animal("Preto", 1.80,"Floresta","Gorila");
        System.out.println(animal.getEspecie());
        label.setText(animal.getEspecie());
    }

}
