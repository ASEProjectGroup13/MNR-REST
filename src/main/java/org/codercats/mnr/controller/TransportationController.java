package org.codercats.mnr.controller;

import org.codercats.mnr.db.entities.Transportation;
import org.codercats.mnr.db.repository.TransportationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Venu Babu Kolla.
 */
@RestController
@RequestMapping("/api")
public class TransportationController {

    @Autowired
    TransportationRepository transportationRepository;

    @GetMapping("/transportations")
    public List<Transportation> getAllNotes() {
        return transportationRepository.findAll();
    }

    @PostMapping("/transportation")
    public Transportation createNote(@RequestBody Transportation transportation) {
        return transportationRepository.save(transportation);
    }
}
