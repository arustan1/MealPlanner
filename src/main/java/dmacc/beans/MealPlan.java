package dmacc.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MealPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToMany(targetEntity = Recipes.class, mappedBy = "mealPlan", 
		    cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Recipes> recipesList;
	
	
	public MealPlan() {
		super();
	}
	
	public MealPlan(long id) {
		super();
		this.id = id;
	}

	public MealPlan(long id, List<Recipes> recipesList) {
		super();
		this.id = id;
		this.recipesList = recipesList;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the recipesList
	 */
	public List<Recipes> getRecipesList() {
		return recipesList;
	}
	/**
	 * @param recipesList the recipesList to set
	 */
	public void setRecipesList(List<Recipes> recipesList) {
		this.recipesList = recipesList;
	}
	@Override
	public String toString() {
		return "MealPlan [id=" + id + ", recipesList=" + recipesList + "]";
	}
	

	
	
}
