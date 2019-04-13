package io.smartimpulse.springboot.quickstart.topic;

import java.util.List;

import io.smartimpulse.springboot.quickstart.task.Task;

public class Topic {
	private String id, name, description;
	private List<Task> tasks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Topic(String id, String name, String description, List<Task> tasks) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.tasks = tasks;
	}

	public Topic() {
		
	}
	
	
}
