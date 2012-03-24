package mspace.controller;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoControllerTest {

    TodoController testController;
    List<String> testList;

    @Before
    public void setup(){
        testController = new TodoController();
        testList = new ArrayList<String>();
    }

    @Test
    public void shouldCreateTodoItem(){
        testList.add("Go get milk");
        testController.lists.add("Go get milk");
        assertEquals(testList, testController.lists);
    }

    @Test
    public void shouldListTodoItem(){

    }

    
}
