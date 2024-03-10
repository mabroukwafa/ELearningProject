package wafa.finetude.formation.service;

import java.util.List;

import wafa.finetude.formation.entities.AttributionFormation;
import wafa.finetude.formation.entities.Employe;

public interface AttributionFormationService {

    AttributionFormation saveAttribution(AttributionFormation attributionFormation);

    AttributionFormation updateAttribution(AttributionFormation attributionFormation);

    void deleteAttribution(AttributionFormation attributionFormation);

    List<AttributionFormation> getAllAttribution();

    List<AttributionFormation> findByEmployeId(Long id);

    List<AttributionFormation> findByApproved(Boolean approved);

     List<AttributionFormation> findByApprovedAndEmployeId(Boolean approved, long id);
}
