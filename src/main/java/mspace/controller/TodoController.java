package mspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class TodoController {

    List<String> lists = new ArrayList<String>();

    @RequestMapping("/list.html")
    public ModelAndView List(Object item) {
        ModelAndView model = new ModelAndView("list");
        model.addObject("todoItem", item);
        model.addObject("todoList", lists);

        return model;
    }
    @RequestMapping("/success.html")
    public ModelAndView add(@RequestParam("todoItem") String todoItem) {
        ModelAndView model = new ModelAndView("success");
        model.addObject("todoItem", todoItem);
        lists.add(todoItem);
        return List(model);
    }

}
