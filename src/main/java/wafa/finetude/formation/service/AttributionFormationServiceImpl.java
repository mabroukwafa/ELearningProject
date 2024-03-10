package wafa.finetude.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafa.finetude.formation.entities.AttributionFormation;
import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.repos.AttributionFormationRepository;

@Service
public class AttributionFormationServiceImpl implements AttributionFormationService {

    @Autowired
    AttributionFormationRepository attributionFormationRepository;

    @Override
    public AttributionFormation saveAttribution(AttributionFormation attributionFormation) {
        return attributionFormationRepository.save(attributionFormation);
    }

    @Override
    public AttributionFormation updateAttribution(AttributionFormation attributionFormation) {
        return attributionFormationRepository.save(attributionFormation);
    }

    @Override
    public void deleteAttribution(AttributionFormation AttributionFormation) {
        attributionFormationRepository.delete(AttributionFormation);
    }

    @Override
    public List<AttributionFormation> getAllAttribution() {
        return attributionFormationRepository.findAll();
    }

    @Override
    public List<AttributionFormation> findByEmployeId(Long id) {
        return attributionFormationRepository.findByEmployeId(id);
    }

    @Override
    public List<AttributionFormation> findByApproved(Boolean approved) {
        return attributionFormationRepository.findByApproved(approved);
    }

    @Override
    public List<AttributionFormation> findByApprovedAndEmployeId(Boolean approved, long id) {
        return attributionFormationRepository.findByApprovedAndEmployeId(approved, id);
    }

}
