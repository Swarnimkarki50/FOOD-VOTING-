package com.example.foodvoting.service;

import com.example.foodvoting.entity.FoodItem;
import com.example.foodvoting.repository.FoodItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodItemService {

    private final FoodItemRepository foodItemRepository;

    public List<FoodItem> findAll() {
        return foodItemRepository.findAll();
    }

    public FoodItem findById(Long id) {
        return foodItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Food item not found: " + id));
    }

    public FoodItem save(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    public void deleteById(Long id) {
        foodItemRepository.deleteById(id);
    }
}
