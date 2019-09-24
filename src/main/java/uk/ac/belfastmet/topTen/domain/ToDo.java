package uk.ac.belfastmet.topTen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")


public class ToDo {
	
	//instances of variables
	
	private long id;
	private String description;
	private String date;
	private String assignedPerson;
	private String priority;
	private String deadline;
	private boolean complete;
	
	//Getters and setters for all the strings
	@Column(name = "assignedPerson")
	public String getAssignedPerson() {
		return assignedPerson;
	}

	public void setAssignedPerson(String assignedPerson) {
		this.assignedPerson = assignedPerson;
	}
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	@Column(name = "deadline")
	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	//constructors
	
	public ToDo()
	{
		super();
	}
	
	
	public ToDo(int tasknumber, String description, String date, String assignedPerson,
			String priority, String deadline, boolean complete) {
		super();
		
		this.description = description;
		this.date = date;
		this.assignedPerson = assignedPerson;
		this.priority = priority;
		this.deadline = deadline;
		this.complete = complete;
	}
	// adding an id and auto incremeneting here 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId()
	{
		return id;
	}	


	//start of getters id
	public void setId(long id) {
		this.id = id;
	}
	//end of id getters
	
	//start of getters and setters for complete 
		public void setComplete(boolean complete) {
			this.complete = complete;
		}
		//end of getters and setters for complete
	
	
	@Column(name = "description")
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the date
	 */
	
	@Column(name = "d")
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the complete
	 */
	
	@Column(name = "complete")
	public boolean isComplete() {
		return complete;
	}
	/**
	 * @param complete the complete to set
	 */
	public void isComplete(boolean complete) {
		this.complete = complete;
	}
	
	
}
