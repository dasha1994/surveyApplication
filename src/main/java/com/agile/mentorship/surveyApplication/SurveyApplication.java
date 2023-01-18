package com.agile.mentorship.surveyApplication;

import com.agile.mentorship.surveyApplication.dto.SurveyCompletionDto;
import com.agile.mentorship.surveyApplication.service.SurveyCompletionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyApplication.class, args);
		System.out.println("start");
		SurveyCompletionService surveyCompletionService = new SurveyCompletionService();
		// List<SurveyCompletionDto> dtos = surveyCompletionService.getSurveysCompletion();
		surveyCompletionService.getSurveysCompletionByUnit();
		System.out.println("ff");
	}


}
