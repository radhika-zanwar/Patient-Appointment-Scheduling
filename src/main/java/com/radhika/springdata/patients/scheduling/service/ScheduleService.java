package com.radhika.springdata.patients.scheduling.service;

import com.radhika.springdata.patients.scheduling.entities.Appointment;
import com.radhika.springdata.patients.scheduling.repos.AppointmentRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ScheduleService {

    private Logger logger = LogManager.getLogger(ScheduleService.class);

    /**
     * Appointment Repository
     */
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments(){
        final List<Appointment> appointmentList = new ArrayList<>();
        Iterable<Appointment> allAppointments = appointmentRepository.findAll();
        Iterator<Appointment> iterator = allAppointments.iterator();
        while(iterator.hasNext()){//iterating all rows one by one returned by from findAll()
            Appointment appointment= iterator.next();
            appointmentList.add(appointment);
            logger.debug("current appointment ",appointment);

        }
        return appointmentList;

    /*
    return StreamSupport
                .stream(appointmentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
                */
    }
}
