/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Blake Lochmandy
 */

package app;

import java.util.ArrayList;
import java.util.List;

public class ToDo {

  private List<ToDoList> toDoLists = new ArrayList<>();

  public void add(ToDoList list) {
    // add list to toDoLists
  }

  public void remove(ToDoList list) {
    // remove list from toDoLists
  }

  public void saveLists(String outputFile) {
    // create outputFile in try with resources
    // for each list
    // write "List: " + title
    // for each item
    // write "\t Item: " + name + ", " + description + ", " + dueDate + ", " + complete

    // catch error
  }


  public void readLists(String inputFile) {

    // open inputFile in try with resources
    // scan the line
    // if line starts with "List: "
      // trim line to after the first space
      // create a toDoList with title
      // add toDoList to toDoLists
    // if line starts with "Item: "
      // trim line to after the first space
      // tokenize the input line
      // create an item with token1 = name, token2 = description, token3 = dueDate, token4 (parsed as boolean) = complete
      // add item to most recent to do list

    // catch error
  }

  public List<ToDoList> getToDoLists() {
    //return toDoLists
    return null;
  }
}
