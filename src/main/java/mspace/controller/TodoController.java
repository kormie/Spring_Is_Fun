package mspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TodoController {


    @RequestMapping("/list.html")
    public ModelAndView List(Object item) {
        ModelAndView model = new ModelAndView("list");
        model.addObject("todoItem", item);
        return model;
    }

    @RequestMapping("/success.html")
    public ModelAndView add(@RequestParam("todoItem") String todoItem) {
        ModelAndView model = new ModelAndView("success");
        model.addObject("todoItem", todoItem);
        return model;
    }

}
