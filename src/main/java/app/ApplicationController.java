package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ApplicationController implements Initializable {


  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button AddList;

  @FXML
  private Button AddTask;

  @FXML
  private Button ExportLists;

  @FXML
  private Button ImportLists;

  @FXML
  private Button RemoveList;

  @FXML
  private Button RemoveTask;

  @Override
  public void initialize(URL url, ResourceBundle rb) {

  }

}