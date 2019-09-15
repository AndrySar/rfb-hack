package ru.rfb.hack.converter;

import ru.rfb.hack.domain.dto.PlacementDTO;
import ru.rfb.hack.domain.entity.PlacementEntity;

public class PlacementConverter {

    public static PlacementEntity convert(PlacementDTO placementDTO) {
        PlacementEntity placementEntity = new PlacementEntity();

        placementEntity.setLat(placementDTO.getLat());
        placementEntity.setLon(placementDTO.getLon());
        placementEntity.setOpenDate(placementDTO.getOpenDate());
        placementEntity.setOpenTime(placementDTO.getOpenTime().toString());
        placementEntity.setCloseTime(placementDTO.getCloseTime().toString());
        placementEntity.setSquare(placementDTO.getSquare().toString());
        placementEntity.setVisibility(placementDTO.getVisibility());
        placementEntity.setEntryConvenience(placementDTO.getEntryConvenience());
        placementEntity.setData("{}");

        return placementEntity;
    }
}
