package com.salon.information.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salon.information.model.SalonInfo;

@Repository
public interface SalonInfoRepository extends JpaRepository<SalonInfo, Long> {
	Optional<SalonInfo> findById(Integer vendor_id);
}
