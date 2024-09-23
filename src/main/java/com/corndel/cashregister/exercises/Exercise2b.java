package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2b {
  /**
   * Given a list of recipes, return a new list of strings containing just the
   * name of each recipe
   */
  public static List<String> listNames(List<Recipe> recipes) {
    // TODO
    return recipes.stream().map(Recipe::getName).collect(Collectors.toList());
  }
}
