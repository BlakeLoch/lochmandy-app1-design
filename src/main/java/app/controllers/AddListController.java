/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Blake Lochmandy
 */

package app.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddListController {


  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button addListButton;

  @FXML
  private TextField addListTitle;

  @FXML
  void initialize() {
    // when text is entered in addListTitle
    // if addListTitle.length is not less than 3
    // save value as string

    // when addListButton is clicked
    // if title is blank
    // throw an error
    //else
    // create ToDoList with title
    // add ToDoList to (To Do)
    // disable AddList
  }


}
