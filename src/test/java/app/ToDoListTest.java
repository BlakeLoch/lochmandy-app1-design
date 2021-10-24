package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToDoListTest {

  @Test
  void add() {
    // create ToDoList object

    // expected = create list of ToDoItems
    // add ToDoItem to list

    // ToDoList.add ToDoItems
    // actual = ToDoList.showAll

    // check if actual = expected
  }

  @Test
  void remove() {
    // create ToDoList object

    // expected = create list of ToDoItems
    // add ToDoItem to list
    // remove ToDoItem from list

    // ToDoList.add ToDoItem
    // ToDoList.remove ToDoItem
    // actual = ToDoList.showAll

    // check if actual = expected
  }

  @Test
  void getTitle() {
    // create ToDoList with a constructor
    // expected = name
    // actual = ToDoList.getTitle
    // check if actual = expected
  }

  @Test
  void setTitle() {
    // create ToDoList with a constructor
    // expected = new title
    // ToDoList.setTitle
    // actual = ToDoList.getTitle
    // check if actual = expected
  }

  @Test
  void showAll() {
    // create ToDoList object

    // expected = create list of toDoItems
    // actual = ToDoList.getToDoLists

    // check if actual = expected
  }

  @Test
  void showIncomplete() {
    // create ToDoList object

    // expected = create list of toDoItems
    // add toDoItems

    // ToDoList.add toDoItems
    // set some toDoItems to complete
    // actual = ToDoList.showIncomplete

    // check if actual = expected
  }

  @Test
  void showComplete() {
    // create ToDoList object

    // expected = create list of toDoItems
    // add toDoItems
    // set toDoItems to complete

    // ToDoList.add toDoItems
    // set some toDoItems to complete
    // actual = ToDoList.showComplete

    // check if actual = expected
  }

  @Test
  void getSaveStatus() {
    // create ToDoList object
    // check if actual is false
  }

  @Test
  void saveList() {
    // create ToDoItem with a constructor
    // ToDoItem.saveList
    // actual = ToDoItem.getSaveStatus
    // check if actual is true
  }

  @Test
  void unSaveList() {
    // create ToDoItem with a constructor
    // ToDoItem.saveList
    // ToDoItem.unSaveList
    // actual = ToDoItem.getSaveStatus
    // check if actual is false
  }
}