package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

public class AnotherRecipe implements RecipeService{
    @Override
    public Set<Recipe> getRecipes() {
        return null;
    }

    @Override
    public Recipe findById(Long l) {
        return null;
    }
}
