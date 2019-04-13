package io.smartimpulse.springboot.quickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.smartimpulse.springboot.quickstart.task.Task;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("001","AI", "Artificial Intelligence", Arrays.asList(
						new Task(1,"Python","Learn Python","2019-05-21"),
						new Task(2,"Maths","Learn Metrics Maths","2019-08-01"),
						new Task(3,"ML","Learn Machine Learing","2019-12-31")
						)),
				new Topic("002","Maven", "Dependency Management", Arrays.asList(
						new Task(1,"Java","Learn Java","2019-05-21"),
						new Task(2,"Java EE","Learn Java Servelet","2019-08-01"),
						new Task(3,"Maven","Learn Maven","2019-12-31")
						)),
				new Topic("003","Spring", "Helper Framework", Arrays.asList(
						new Task(1,"Java","Learn Java","2019-05-21"),
						new Task(2,"Maven","Learn Maven","2019-08-01"),
						new Task(3,"Spring","Learn Spring","2019-12-31")
						))
				);
	}
}
