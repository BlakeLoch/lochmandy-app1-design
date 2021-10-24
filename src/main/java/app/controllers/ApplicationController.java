/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Blake Lochmandy
 */

package app.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class ApplicationController implements Initializable {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button addList;

  @FXML
  private Button addItem;

  @FXML
  private Button exportLists;

  @FXML
  private Button importLists;

  @FXML
  private Button removeList;

  @FXML
  private Button removeItem;

  @FXML
  private ChoiceBox<String> showStatusBox;

  @FXML
  public void initialize(URL url, ResourceBundle rb) {

    //make a new To Do object called lists

    // when addList is clicked
    // open AddList.fxml

    // when addItem is clicked
    // open AddItem.fxml

    // when exportLists is clicked
    // open ExportLists.fxml


    // when importLists is clicked
    // open ImportLists.fxml

    // when removeList is clicked
    // open RemoveList.fxml

    // when removeItem is clicked
    // open RemoveItem.fxml

    // when showStatusBox = All
    // show all items on current to do list

    // when showStatusBox = Incomplete
    // show all incomplete items on current to do list

    // when showStatusBox = Complete
    // show all complete items on current to do list

  }

}