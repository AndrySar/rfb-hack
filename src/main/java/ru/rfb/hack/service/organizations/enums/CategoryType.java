package ru.rfb.hack.service.organizations.enums;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public enum CategoryType {

    APTEKI(Arrays.asList("Аптека")),

    KAFE(Arrays.asList("Кафе")),

    TC(Arrays.asList("Торговый центр")),

    PRODUKTY(Arrays.asList("Продукты")),

    FLOWERS(Arrays.asList("Магазин цветов")),

    BANKS(Arrays.asList("Банки")),

    BAR(Arrays.asList("Бары")),

    MARKETS(Arrays.asList("Рынки")),

    UNKNOWN(Arrays.asList(""));

    private List<String> categories;

    CategoryType(List<String> categories) {
        this.categories = categories;
    }

    public static CategoryType getBasedOn(String categoryType) {
        return EnumSet.allOf(CategoryType.class)
            .stream()
            .filter(enumInstance -> enumInstance.equals(categoryType))
            .findAny()
            .orElse(null);
    }

    public static List<String> getCategories(String categoryType) {
        return EnumSet.allOf(CategoryType.class)
            .stream()
            .filter(enumInstance -> enumInstance.name().equals(categoryType))
            .findAny()
            .orElse(UNKNOWN)
            .categories;
    }
}
