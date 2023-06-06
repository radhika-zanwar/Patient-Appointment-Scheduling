package com.radhika.springdata.patientsScheduling.repos;

import com.radhika.springdata.patientsScheduling.entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Integer> {
}
