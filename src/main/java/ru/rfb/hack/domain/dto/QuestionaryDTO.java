package ru.rfb.hack.domain.dto;

public class QuestionaryDTO {

    private PlacementDTO placement;

    public QuestionaryDTO(PlacementDTO placement) {
        this.placement = placement;
    }

    public PlacementDTO getPlacement() {
        return placement;
    }

    public void setPlacement(PlacementDTO placement) {
        this.placement = placement;
    }
}
