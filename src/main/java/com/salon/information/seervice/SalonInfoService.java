package com.salon.information.seervice;

import java.util.List;

import com.salon.information.model.SalonInfo;

public interface SalonInfoService {
    List<SalonInfo> getAllSalons();
    SalonInfo getSalonById(Long id);
    SalonInfo createSalon(SalonInfo salonInfo);
    SalonInfo updateSalon(Long id, SalonInfo salonInfo);
    void deleteSalon(Long id);
}
