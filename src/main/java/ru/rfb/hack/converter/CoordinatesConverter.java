package ru.rfb.hack.converter;

import ru.rfb.hack.domain.dto.CoordinatesDTO;
import ru.rfb.hack.domain.model.Coordinate;

public class CoordinatesConverter {

    private static final Double DELTA = 0.05;

    public static Coordinate convert(CoordinatesDTO coordinatesDTO) {
        return new Coordinate(coordinatesDTO.getLat(), coordinatesDTO.getLon());
    }

    public static Coordinate convertToBelow(CoordinatesDTO coordinatesDTO) {
        return new Coordinate(coordinatesDTO.getLat() - DELTA, coordinatesDTO.getLon() - DELTA);
    }

    public static Coordinate convertToAbove(CoordinatesDTO coordinatesDTO) {
        return new Coordinate(coordinatesDTO.getLat() + DELTA, coordinatesDTO.getLon() + DELTA);
    }

}
