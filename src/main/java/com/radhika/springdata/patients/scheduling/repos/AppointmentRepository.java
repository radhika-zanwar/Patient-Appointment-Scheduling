package com.radhika.springdata.patients.scheduling.repos;

import com.radhika.springdata.patients.scheduling.entities.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {
}
