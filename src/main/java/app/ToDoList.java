package app;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  private String title;
  private List<ToDoItem> itemList = new ArrayList<>();
  private boolean save;

  public void add(ToDoItem item) {
    // add item to itemList
  }

  public void remove(ToDoItem item) {
    // remove item from itemList
  }

  public String getTitle() {
    // return title
    return "";
  }

  public void setTitle(String title) {
    // if name is at least 3 characters
    // set name to name
    // else
    // throw an error
  }

  public List<ToDoItem> showIncomplete() {
    // for each item
    // if incomplete (complete = false)
    // add item to list
    // return list
    return null;
  }

  public List<ToDoItem> showComplete() {
    // for each item
    // if complete (complete = true)
    // add item to list
    // return list
    return null;
  }

  public void saveList() {
    // set save to true
  }

}
