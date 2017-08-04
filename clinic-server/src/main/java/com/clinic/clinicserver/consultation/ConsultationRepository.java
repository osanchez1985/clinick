package com.clinic.clinicserver.consultation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository <Consultations, Long> {

}
