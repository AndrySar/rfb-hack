package ru.rfb.hack.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.rfb.hack.domain.entity.PlacementEntity;
import ru.rfb.hack.domain.model.request.QuestionaryRequest;
import ru.rfb.hack.domain.model.response.QuestionaryResponse;
import ru.rfb.hack.service.questionary.QuestionaryService;

@RestController
public class QuestionaryController {

    private QuestionaryService questionaryService;

    public QuestionaryController(QuestionaryService questionaryService) {
        this.questionaryService = questionaryService;
    }

    @RequestMapping(path = "/questionary", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public QuestionaryResponse getOrganizations(@RequestBody QuestionaryRequest request) {
        PlacementEntity entity = questionaryService.save(request.getPlacement());
        return new QuestionaryResponse(entity.getId().toString());
    }
}
