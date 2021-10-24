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

  }

}
