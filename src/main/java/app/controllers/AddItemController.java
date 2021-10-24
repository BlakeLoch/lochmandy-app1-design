/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Blake Lochmandy
 */

package app.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddItemController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button addItemButton;

  @FXML
  private DatePicker addItemDate;

  @FXML
  private TextArea addItemDescription;

  @FXML
  private ChoiceBox<String> addItemList;

  @FXML
  private TextField addItemName;

  @FXML
  void initialize() {

    // when addItemDate is used
    // save value as YYYY-MM-DD string

    // when text is entered in addItemDescription
    // save value as string

    // when text is entered in addItemName
    // if addItemName.length is not less than 3
    // save value as string

    // initialize addItemList to contain list of titles of ToDoLists in (To Do) object
    // when a ToDoList is selected
    // save title of ToDoList as string

    // when addItemButton is clicked
    // if name is blank or a ToDoList is not selected
    // throw an error
    //else
    // create ToDoItem with name, description and date
    // add ToDoItem to (To Do).getToDoLists().selectedToDoList
    // disable AddItems


  }

}
