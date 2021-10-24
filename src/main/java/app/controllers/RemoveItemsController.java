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

public class RemoveItemsController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button removeItemsButton;

  @FXML
  private ListView<String> removeSelectItems;

  @FXML
  void initialize() {

    // populate removeSelectItems with names of ToDoItems and selectors

    // when Item is selected
    // item.Delete

    // when Item is deselected
    // item.RemoveDelete

    // when removeItemsButton is clicked
    // for each item
    // if delete is true
    // (To Do).<CurrentToDoList>.remove(item)
    // disable RemoveItems

  }

}
