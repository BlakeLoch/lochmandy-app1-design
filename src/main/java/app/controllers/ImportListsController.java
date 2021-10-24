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
import javafx.scene.control.TextField;

public class ImportListsController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button importButton;

  @FXML
  private TextField importFile;

  @FXML
  private ListView<String> importSelectLists;

  @FXML
  void initialize() {

    // when text is entered in importFile
    // save value as string

    // (To Do).readFile(importFile)

    // populate importSelectLists with titles of ToDoLists and selectors

    // when ToDoList is selected
    // ToDoList.save

    // when ToDoList is deselected
    // ToDoList.UnSave

    // when importButton is clicked
    // for each ToDoList in inputFile
    // if save is true
    // (To Do).add ToDoList
    // disable ImportLists

  }

}
