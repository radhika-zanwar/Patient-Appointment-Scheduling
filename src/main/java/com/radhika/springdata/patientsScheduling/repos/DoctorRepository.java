package com.radhika.springdata.patientsScheduling.repos;

import com.radhika.springdata.patientsScheduling.entities.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,Integer> {
}
