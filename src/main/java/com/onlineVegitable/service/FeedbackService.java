package com.onlineVegitable.service;

import java.util.Optional;


import com.onlineVegitable.exception.FeedbackNotFoundException;

import com.onlineVegitable.modal.Feedback;



public interface FeedbackService {
	public Feedback saveSugg(Feedback fb);

	public Optional<Feedback> getSuggDetails(Integer st );
	//public Feedback saveFeedback(Feedback fb);

	public Optional<Feedback> getSuggDetails(Integer st ) throws FeedbackNotFoundException;


	

}
