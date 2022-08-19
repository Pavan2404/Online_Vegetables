package com.onlineVegitable.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlineVegitable.exception.CustomerAccountException;
import com.onlineVegitable.exception.FeedbackNotFoundException;
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
	public Optional<Feedback> getSuggDetails(Integer st) throws FeedbackNotFoundException {
		Optional<Feedback> Atc=frepos.findById(st);
		if(Atc==null) {
			throw new FeedbackNotFoundException("Feedback :"+st+"does not exist");
		
		}		return frepos.findById(st);
	}

}

