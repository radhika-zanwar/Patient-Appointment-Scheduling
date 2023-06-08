package com.radhika.springdata.patients.scheduling.repos;

import com.radhika.springdata.patients.scheduling.entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Integer> {
}
