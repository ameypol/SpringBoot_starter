package springapp.topic;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "spring famework", "descrip"),
			new Topic("java", "corejava", "descrip"),
			new Topic("javascript", "javascript tout", "descrip")
			));
	
	public List<Topic> getlist() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
}