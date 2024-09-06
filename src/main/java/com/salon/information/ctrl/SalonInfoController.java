package com.salon.information.ctrl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salon.information.model.SalonInfo;
import com.salon.information.seervice.SalonInfoService;

@RestController
@RequestMapping("/api/salons")
public class SalonInfoController {

    @Autowired
    private SalonInfoService salonInfoService;

    @GetMapping
    public List<SalonInfo> getAllSalons() {
        return salonInfoService.getAllSalons();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalonInfo> getSalonById(@PathVariable Long id) {
        SalonInfo salonInfo = salonInfoService.getSalonById(id);
        return salonInfo != null ? ResponseEntity.ok(salonInfo) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public SalonInfo createSalon(@RequestBody SalonInfo salonInfo) {
        return salonInfoService.createSalon(salonInfo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalonInfo> updateSalon(@PathVariable Long id, @RequestBody SalonInfo salonInfo) {
        SalonInfo updatedSalon = salonInfoService.updateSalon(id, salonInfo);
        return updatedSalon != null ? ResponseEntity.ok(updatedSalon) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalon(@PathVariable Long id) {
        salonInfoService.deleteSalon(id);
        return ResponseEntity.noContent().build();
    }
}
