package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.MealPlan;
import dmacc.beans.Recipes;



@Configuration
public class BeanConfiguration {
	
	@Bean
	public MealPlan mealPlan() {
		MealPlan bean = new MealPlan();
		return bean;
	}
	
	@Bean
	public Recipes recipe() {
		Recipes bean = new Recipes();
		return bean;
	}

}