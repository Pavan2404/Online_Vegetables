package com.onlineVegitable.service;

import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import com.onlineVegitable.service.FeedbackService;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlineVegitable.exception.FeedbackNotFoundException;
import com.onlineVegitable.exception.OrderNotFoundException;
import com.onlineVegitable.modal.Customersupport;
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

	

	
	


	public Optional<Feedback> getSuggDetails(Integer st) throws FeedbackNotFoundException {
		Optional<Feedback> vo=frepos.findById(st);
		if(vo==null) {
			throw new FeedbackNotFoundException (" Customer :"+st+"does not exist");
		}
		return frepos.findById(st);
	}


}
