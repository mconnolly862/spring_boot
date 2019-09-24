package uk.ac.belfastmet.topTen.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topTen.controller.ToDoController;
import uk.ac.belfastmet.topTen.domain.ToDo;
import uk.ac.belfastmet.topTen.repository.ToDoRepo;


@SuppressWarnings("unused")
@Service
public class ToDoService {
	
	
	// added the autowired import to begin reading the data from the database
	@Autowired
	private ToDoRepo todorepo;
	
	//end of autowired import 
	
	
	Logger logger=LoggerFactory.getLogger(ToDoService.class);

	private ArrayList<ToDo> tasks;
	public ArrayList<ToDo> gettasks(){
		
		
//		this.tasks = new ArrayList<ToDo>();
//		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", false));
//		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", true));
//		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", false));
//		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", true));
//		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", false));
//		this.tasks.add(new ToDo( 1 ,"Brush teeth", "9th","Michael", "high", "10th", true));
//		
		logger.info("the array of tasks is returned" + gettasks());
		
		return this.tasks;
	
	
		
	}
	
	//get number of tasks method called here
	public void getnumberoftask()
	{
		logger.info("# of tasks : {}",todorepo.count());
		//iterator added here
		Iterable <ToDo> todo = todorepo.findAll();
		Iterator <ToDo> iterator = todo.iterator();
		while(iterator.hasNext()) {
		logger.debug("{}", iterator.next().toString());
		
		}
	}
	public ArrayList<ToDo> gettasksCompleted()
	
	{
		
		ArrayList<ToDo> todoNew = new ArrayList<ToDo>();
		for(ToDo todo : tasks)
		{
			if(todo.isComplete())
			{
				todoNew.add(todo);
			}
		}
		
		return todoNew;
		
	}
		
public ArrayList<ToDo> gettasksInCompleted()
	
	{
		
		ArrayList<ToDo> todoNew = new ArrayList<ToDo>();
		for(ToDo todo : tasks)
		{
			if(!todo.isComplete())
			{
				todoNew.add(todo);
			}
			
		}
	
		return todoNew;
		
	}
	

	
	
	

	
}

