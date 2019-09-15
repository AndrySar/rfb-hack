package ru.rfb.hack.service.organizations.enums;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public enum CategoryType {

    APTEKI(Arrays.asList("Аптека")),

    KAFE(Arrays.asList("Кафе", "Кофейня | кафе", "Кофейня")),

    TC(Arrays.asList("Торговый центр", "Супермаркет")),

    PRODUKTY(Arrays.asList("Продукты", "Магазин продуктов", "Магазин мяса, колбас", "Магазин рыбы и морепродуктов", "Магазин продуктов | супермаркет", "Супермаркет")),

    FLOWERS(Arrays.asList("Магазин цветов")),

    BANKS(Arrays.asList("Банки")),

    BAR(Arrays.asList("Бары")),

    MARKETS(Arrays.asList("Рынки", "Магазин продуктов | кейтеринг | яйцо и мясо птицы")),

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
