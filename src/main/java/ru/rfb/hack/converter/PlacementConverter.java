package ru.rfb.hack.converter;

import ru.rfb.hack.domain.dto.PlacementDTO;
import ru.rfb.hack.domain.entity.PlacementEntity;

public class PlacementConverter {

    public static PlacementEntity convert(PlacementDTO placementDTO) {
        return new PlacementEntity(
            placementDTO.getLat(),
            placementDTO.getLon(),
            placementDTO.getOpenDate(),
            placementDTO.getOpenTime().toString(),
            placementDTO.getCloseTime().toString(),
            placementDTO.getSquare().toString(),
            placementDTO.getVisibility(),
            placementDTO.getEntryConvenience(),
            "{}");
    }
}
