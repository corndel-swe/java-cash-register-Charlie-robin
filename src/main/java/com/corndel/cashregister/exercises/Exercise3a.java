package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

import java.util.List;

public class Exercise3a {
  /**
   * Given a recipeBook containing recipes, returns the title of the last recipe
   * in the array.
   * 
   * Return null if there are no recipes.
   */
  public static Recipe lastRecipe(RecipeBook recipeBook) {
    List<Recipe> recipes = recipeBook.getRecipes();

    return recipes.isEmpty() ? null : recipes.getLast();
  }
}
