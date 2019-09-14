package ru.rfb.hack.converter;

import ru.rfb.hack.service.organizations.enums.CategoryType;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryConverter {

    public static List<String> convert(List<String> categories) {
        return categories.stream()
            .map(CategoryType::getCategories)
            .flatMap(category -> category.stream())
            .collect(Collectors.toList());
    }
}
