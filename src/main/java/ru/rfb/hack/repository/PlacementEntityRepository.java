package ru.rfb.hack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rfb.hack.domain.entity.PlacementEntity;

@Repository
public interface PlacementEntityRepository extends JpaRepository<PlacementEntity, Long> {

    PlacementEntity getById(Long id);
}
