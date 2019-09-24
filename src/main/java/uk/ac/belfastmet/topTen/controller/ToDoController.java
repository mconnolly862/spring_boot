package uk.ac.belfastmet.topTen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.topTen.service.ToDoService;

public class ToDoController {
	
	@Autowired 
	private ToDoService todoservice;
Logger logger=LoggerFactory.getLogger(ToDoController.class);
@RequestMapping(value="/", method= RequestMethod.GET)
public String homePage()
{
logger.info("Messsage");

    todoservice.getnumberoftask();

	return "index";
	
}


@RequestMapping(value="/", method= RequestMethod.GET)
public String ToDoServicePage(Model model) {
	logger.info("ToDoService is being called");
    
	model.addAttribute("tasks", todoservice.gettasks());
	logger.debug(todoservice.gettasks().toString());
	model.addAttribute("pageTitle", "todo woohooo");
	
	return "todo";
	
}







}
