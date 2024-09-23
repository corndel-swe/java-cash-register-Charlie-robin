package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise3b {
  /**
   * Given a recipeBook containing recipes, returns the total number of servings
   * in the book
   */
  public static int countServings(RecipeBook recipeBook) {
    // TODO
    return recipeBook.getRecipes()
            .stream()
            .reduce(0, (acc, recipe) -> acc + recipe.getServings(), Integer::sum);
  }
}
