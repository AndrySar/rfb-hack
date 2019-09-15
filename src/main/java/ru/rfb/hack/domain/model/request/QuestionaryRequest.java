package ru.rfb.hack.domain.model.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.rfb.hack.domain.dto.PlacementDTO;

public class QuestionaryRequest {

    private PlacementDTO placement;

    @JsonCreator
    public QuestionaryRequest(@JsonProperty("placement") PlacementDTO placement) {
        this.placement = placement;
    }

    public PlacementDTO getPlacement() {
        return placement;
    }

    public void setPlacement(PlacementDTO placement) {
        this.placement = placement;
    }
}
