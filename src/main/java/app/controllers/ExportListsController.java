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

public class ExportListsController {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button exportButton;

  @FXML
  private TextField exportFile;

  @FXML
  private ListView<String> exportSelectLists;

  @FXML
  void initialize() {

    // populate exportSelectLists with titles of ToDoLists and selectors

    // when text is entered in exportFile
    // save value as string

    // when ToDoList is selected
    // ToDoList.save

    // when ToDoList is deselected
    // ToDoList.UnSave

    // when exportButton is clicked
    // (To Do).saveLists(exportFile)
    // disable ExportLists

  }

}
