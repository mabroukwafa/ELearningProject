package wafa.finetude.formation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import wafa.finetude.formation.entities.AttributionFormation;
import wafa.finetude.formation.entities.Employe;
import wafa.finetude.formation.service.AttributionFormationService;

@RestController
@RequestMapping("/attribution")
@CrossOrigin(origins = "*")
public class AttributionFormationRestController {
    @Autowired
    AttributionFormationService attributionFormationService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<AttributionFormation> getAllAttribution() {
        return attributionFormationService.getAllAttribution();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AttributionFormation createAttribution(@RequestBody AttributionFormation attributionFormation) {
        return attributionFormationService.saveAttribution(attributionFormation);
    }

    @RequestMapping(value = "/addDemande", method = RequestMethod.POST)
    public AttributionFormation createDemande(@RequestBody AttributionFormation attributionFormation) {
        attributionFormation.setApproved(false);
        return attributionFormationService.saveAttribution(attributionFormation);
    }


    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public AttributionFormation updateAttribution(@RequestBody AttributionFormation attributionFormation) {
        attributionFormation.setApproved(true);
        return attributionFormationService.updateAttribution(attributionFormation);
    }

    @RequestMapping(value = "/findByEmploye/{id}", method = RequestMethod.GET)
    public List<AttributionFormation> getAttributionByEmploye(@PathVariable("id") Long id) {
        return attributionFormationService.findByEmployeId(id);
    }

    @RequestMapping(value = "/demandes", method = RequestMethod.GET)
    public List<AttributionFormation> getAllDemandes() {
        return attributionFormationService.findByApproved(false);
    }

    @RequestMapping(value = "/attributions", method = RequestMethod.GET)
    public List<AttributionFormation> getAllattributions() {
        return attributionFormationService.findByApproved(true);
    }

    
    @RequestMapping(value = "/DemandesByEmploye/{id}", method = RequestMethod.GET)
    public List<AttributionFormation> getDemandesByEmploye(@PathVariable("id") Long id) {
        return attributionFormationService.findByApprovedAndEmployeId(false,id);
    }
    
    
    @RequestMapping(value = "/AttributionsByEmploye/{id}", method = RequestMethod.GET)
    public List<AttributionFormation> getAttributByEmploye(@PathVariable("id") Long id) {
        return attributionFormationService.findByApprovedAndEmployeId(true,id);
    }


}
