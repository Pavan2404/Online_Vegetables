package com.onlineVegitable.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import com.onlineVegitable.service.FeedbackService;
import com.onlineVegitable.modal.Feedback;
import com.onlineVegitable.repository.FeedbackRepository;

public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackRepository frepos;

	@Override
	public Feedback saveSugg(Feedback fb) {
		// TODO Auto-generated method stub
		return frepos.save(fb);
	}

	@Override
	public Optional<Feedback> getSuggDetails(Integer st) {
		// TODO Auto-generated method stub
		return frepos.findById(st);
	}

	//@Override
//	public Feedback saveFeedback(Feedback fb) {
		// TODO Auto-generated method stub
		//return null;
	//}

	

	
	

}
