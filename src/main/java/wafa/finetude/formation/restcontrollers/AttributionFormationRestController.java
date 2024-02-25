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

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public AttributionFormation updateAttribution(@RequestBody AttributionFormation attributionFormation) {
        return attributionFormationService.updateAttribution(attributionFormation);
    }

    @RequestMapping(value = "/findByEmploye/{id}", method = RequestMethod.GET)
    public List<AttributionFormation> getAttributionByEmploye(@PathVariable("id") Long id) {
        return attributionFormationService.findByEmployeId(id);
    }
}
