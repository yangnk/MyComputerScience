package algorithms.leetcode.archive2022.archive07.lc0724;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//注意，字符串 x 的字典序比字符串 y 更小的前提是：x 在字典中出现的位置在 y 之前，也就是说，要么 x 是 y 的前缀，或者在满足 x[i] != y[i] 的第一个位置 i 处，x[i] 在字母表中出现的位置在 y[i] 之前。

class FoodRatings {
    List<Food> foodList = new ArrayList<>();

    class Food {
        String food;
        String cuisine;
        int rating;

        public Food(String foods, String cuisines, int ratings) {
            this.food = foods;
            this.cuisine = cuisines;
            this.rating = ratings;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            foodList.add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        foodList.stream().filter(a -> a.food.equals(food)).forEach(a -> a.setRating(newRating));
    }

    public String highestRated(String cuisine) {
        List<Food> newFoodList = foodList.stream().filter(a -> a.cuisine.equals(cuisine)).collect(Collectors.toList());
        Collections.sort(newFoodList, new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                if (o1.rating != o2.rating) {
                    return o2.rating - o1.rating;
                } else {
                    return o1.food.compareTo(o2.food);
                }
            }
        });
        return newFoodList.get(0).food;
    }
}
