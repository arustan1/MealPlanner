package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dmacc.beans.Ingredients;
import dmacc.beans.Recipes;
import dmacc.repository.MealPlanRepository;

@Controller
public class WebController {
	@Autowired
	MealPlanRepository repo;
	
	@GetMapping("viewAllMeals")
	public String viewAllMealPlan(Model model) {
		model.addAttribute("ingrediants", repo.findAll());
		return "mealPlanView";
	}
	@GetMapping("viewAllRecipes")
	public String viewAllRecipes(Model model) {
		model.addAttribute("recipes", repo.findAll());
		return "recipeView";
	}
	
	// Ingredients input
	@GetMapping("/inputIngrediants")
	public String addNewIngredients(Model model) {
		Ingredients i = new Ingredients();
		model.addAttribute("newIngrediants", i);
		return "inputNewIngredients";
	}
	
	// Recipes input
	@GetMapping("/inputRecipes")
	public String addNewRecipes(Model model) {
		Recipes r = new Recipes();
		model.addAttribute("newRecipes", r);
		return "inputNewRecipes";
	}
}
