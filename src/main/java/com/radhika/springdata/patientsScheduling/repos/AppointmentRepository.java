package com.radhika.springdata.patientsScheduling.repos;

import com.radhika.springdata.patientsScheduling.entities.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {
}
