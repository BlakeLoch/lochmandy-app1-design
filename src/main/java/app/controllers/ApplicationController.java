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
import javafx.scene.control.ListView;
import javafx.scene.control.TreeView;

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
  private TreeView<String> toDoItems;

  @FXML
  private ListView<String> toDoLists;

  @FXML
  public void initialize(URL url, ResourceBundle rb) {

    //make a new To Do object called lists

    // populate toDoLists with lists
    // populate toDoItems with items stored in list

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
    // populate toDoItems with (current to do list).showAll()

    // when showStatusBox = Incomplete
    // show all incomplete items on current to do list
    // populate toDoItems with (current to do list).showIncomplete()

    // when showStatusBox = Complete
    // show all complete items on current to do list
    // populate toDoItems with (current to do list).showComplete()

    // When list titles are clicked
    // populate toDoItems with items in corresponding list

    // When list titles are double-clicked
    // make title editable
    // if title is at least 3 characters
    // save new title

    // When item names are double-clicked
    // make name editable
    // if name is at least 3 characters
    // save new name

    // When item descriptions are double-clicked
    // make description editable
    // save new description

    // When item due dates are double-clicked
    // make dueDate editable
    //if name is in YYYY-MM-DD format
    // save new dueDate

    // When items are clicked
    // if incomplete
    // markAsComplete
    // else markAsIncomplete
  }

}