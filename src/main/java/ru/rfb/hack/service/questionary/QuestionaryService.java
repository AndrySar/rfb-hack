package ru.rfb.hack.service.questionary;

import org.springframework.stereotype.Service;
import ru.rfb.hack.converter.PlacementConverter;
import ru.rfb.hack.domain.dto.PlacementDTO;
import ru.rfb.hack.domain.entity.PlacementEntity;
import ru.rfb.hack.repository.PlacementEntityRepository;

@Service
public class QuestionaryService {

    private PlacementEntityRepository placementEntityRepository;

    public QuestionaryService(PlacementEntityRepository placementEntityRepository) {
        this.placementEntityRepository = placementEntityRepository;
    }

    public PlacementEntity save(PlacementDTO placementDTO) {
        PlacementEntity placementEntity = PlacementConverter.convert(placementDTO);
        return placementEntityRepository.save(placementEntity);
    }

    public PlacementEntity getById(Long id) {
        return placementEntityRepository.getById(id);
    }
}
