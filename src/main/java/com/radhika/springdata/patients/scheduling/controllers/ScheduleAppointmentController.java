package com.radhika.springdata.patients.scheduling.controllers;

import com.radhika.springdata.patients.scheduling.entities.Appointment;
import com.radhika.springdata.patients.scheduling.service.ScheduleService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.radhika.springdata.patients.scheduling.constants.HttpStatuses;

import java.util.List;


@RestController
@ApiResponses(value = {
        @ApiResponse(
                responseCode = HttpStatuses.OK,
                description =  "Application is running"
        )
}
)
public class ScheduleAppointmentController {

    private Logger logger = LogManager.getLogger(ScheduleAppointmentController.class);
    @Autowired
    private ScheduleService service;

    /**
     * This api is to check if application is up.
     * @return response entity with pong message.
     */
    @GetMapping("/ping")
    public ResponseEntity<String> ping ()
    {
        logger.debug("entered in ping api");
        ResponseEntity<String> response = new ResponseEntity<>("PONG", HttpStatus.OK);
        return response;
    }

    @GetMapping("/get/all/appointments")
    public ResponseEntity<List<Appointment>> getAllAppointments ()
    {
        return new ResponseEntity<>(service.getAllAppointments(),HttpStatus.OK);
    }


}
