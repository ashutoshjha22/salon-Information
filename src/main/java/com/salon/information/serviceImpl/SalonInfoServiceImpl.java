package com.salon.information.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salon.information.model.SalonInfo;
import com.salon.information.repo.SalonInfoRepository;
import com.salon.information.seervice.SalonInfoService;

@Service
public class SalonInfoServiceImpl implements SalonInfoService {

    @Autowired
    private SalonInfoRepository salonInfoRepository;

    @Override
    public List<SalonInfo> getAllSalons() {
        return salonInfoRepository.findAll();
    }

    @Override
    public SalonInfo getSalonById(Long id) {
        Optional<SalonInfo> salon = salonInfoRepository.findById(id);
        return salon.orElse(null);
    }

    @Override
    public SalonInfo createSalon(SalonInfo salonInfo) {
        return salonInfoRepository.save(salonInfo);
    }

    @Override
    public SalonInfo updateSalon(Long id, SalonInfo salonInfo) {
        Optional<SalonInfo> existingSalon = salonInfoRepository.findById(id);
        if (existingSalon.isPresent()) {
            SalonInfo updatedSalon = existingSalon.get();
            updatedSalon.setDescription(salonInfo.getDescription());
            updatedSalon.setWebsite(salonInfo.getWebsite());
            updatedSalon.setWhatsAppNumber(salonInfo.getWhatsAppNumber());
            return salonInfoRepository.save(updatedSalon);
        }
        return null;
    }

    @Override
    public void deleteSalon(Long id) {
        salonInfoRepository.deleteById(id);
    }
}
