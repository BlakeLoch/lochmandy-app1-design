/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Blake Lochmandy
 */

package app.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class RemoveListsController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button removeListsButton;

  @FXML
  private ListView<String> removeSelectLists;

  @FXML
  void initialize() {

    // populate removeSelectItems with titles of ToDoLists and selectors

    // for each ToDoList
    // ToDoList.save

    // when ToDoList is selected
    // ToDoList.UnSave

    // when ToDoList is deselected
    // ToDoList.save

    // when removeSelectLists is clicked
    // for each ToDoList
    // if save is false
    // (To Do).remove(ToDoList)
    // disable RemoveLists

  }

}
