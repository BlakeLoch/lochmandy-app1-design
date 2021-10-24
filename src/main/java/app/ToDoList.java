/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Blake Lochmandy
 */

package app;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

  private String title;
  private List<ToDoItem> itemList = new ArrayList<>();
  private boolean save;

  public ToDoList(String title) {
    // set title to title
    // set save to false
  }

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

  public List<ToDoItem> showAll() {
    // return itemList
    return null;
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

  public boolean getSaveStatus() {
    //return save
    return false;
  }

  public void saveList() {
    // set save to true
  }

  public void unSaveList() {
    // set save to false
  }

}
