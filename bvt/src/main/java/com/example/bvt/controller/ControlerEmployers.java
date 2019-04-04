package com.example.bvt.controller;

import com.example.bvt.component.Employer;
import com.example.bvt.repository.RepositoryEmployers;
import com.example.bvt.service.ServiceEmployer;
import com.example.bvt.service.impl.ServiceEmployers;
import com.example.bvt.service.impl.ServiceToningAndBookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControlerEmployers {

    @Autowired
    private ServiceEmployer serviceEmployer;
@Autowired
private ServiceToningAndBookings serviceToningAndBookings;
    @PostMapping("/saveEmployer")
    public ResponseEntity saveEmployer(@RequestBody Employer employer) {
        Boolean bool=serviceToningAndBookings.getOne(employer.getIdToningAndBooking()) != null ;
        if (bool==false){
        serviceEmployer.save(employer);
            return ResponseEntity.ok("Saved " + employer);
        }else
        return ResponseEntity.ok("Wrong IdToningAndBoking");
    }

    @GetMapping("/deleteEmployer/{id}")
    public ResponseEntity deleteEmployer(@PathVariable Long id) {
        serviceEmployer.deleteForId(id);
        return ResponseEntity.ok("Delete");
    }

    @PostMapping("/findEmployerById/{id}")
    public ResponseEntity findEmployerById(@PathVariable Long id) {
        return ResponseEntity.ok(serviceEmployer.getOne(id));
    }

    @GetMapping("/findAllEmployers")
    public ResponseEntity findAllEmployers() {
        return ResponseEntity.ok(serviceEmployer.getAll());
    }

    @GetMapping("findAllEmployersByIdToning/{idToning}")
    public ResponseEntity findAllEmployersByIdToning(@PathVariable Long idToning) {
        return ResponseEntity.ok(serviceEmployer.findAllEmployersByIdToning(idToning));
    }

    @PostMapping("/cangeEmployerIdBokingAndToning/{id}/{idToningAndBooking}")
    public ResponseEntity changeEmployerIdBokingAndToning(@PathVariable Long id, @PathVariable Long idToningAndBooking) {
        serviceEmployer.changeEmployerIdBokingAndToning(id, idToningAndBooking);
        return ResponseEntity.ok("chenged");
    }

    @GetMapping("/findEmployerBYFirsname/{firstName}/lastName/{lastName}")
    public ResponseEntity<List<Employer>> findByLastNameAndFirsName(@PathVariable String firstName, @PathVariable String lastName) throws Exception {
        List<Employer> employers = serviceEmployer.findByLastNameAndFirsName(firstName, lastName);
        return ResponseEntity.ok(employers);
    }
    @DeleteMapping("/deleteAllEmployers")
    public ResponseEntity deleteAllEmployers(){
        serviceEmployer.deleteAllEmployer();
        return ResponseEntity.ok("deleted");
    }
}
