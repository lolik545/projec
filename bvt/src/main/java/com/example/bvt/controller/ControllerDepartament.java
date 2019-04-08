package com.example.bvt.controller;

import com.example.bvt.component.Departament;
import com.example.bvt.repository.RepositoryDepartament;
import com.example.bvt.service.impl.ServiceDepartaments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ControllerDepartament {
    @Autowired
 private    RepositoryDepartament repositoryDepartament;
    @Autowired
   private ServiceDepartaments serviceDepartaments;
    Departament departament = new Departament();

    @PostMapping("/saveDepartament")
    public ResponseEntity saaveDepartament(@RequestBody Departament departament) {
        serviceDepartaments.save(departament);
        return ResponseEntity.ok(departament + "Saved");
    }

    @PostMapping("/deleteDepartament/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (repositoryDepartament.findById(id).isPresent()) {
            serviceDepartaments.deleteForId(id);
            return ResponseEntity.ok("delete");
        }
        return ResponseEntity.ok("Wrong id" + id);
    }


    @GetMapping("/getAllDepartament")
    public ResponseEntity getAllDepartaments() {
        return ResponseEntity.ok(serviceDepartaments.getAll());
    }

    @GetMapping("/getOneDepartamentByID/{id}")
    public ResponseEntity getOneDepartamentById(@PathVariable Long id) {
        return ResponseEntity.ok(serviceDepartaments.getOne(id));
    }

    //    @GetMapping("changeDepartamentDescription/{description}")
//    public ResponseEntity changeDescriptoinDepartament(@PathVariable String description) {
//
//        if(serviceDepartaments.findByDescription(description)!=null){
//            departament=serviceDepartaments.findByDescription(description);
//            departament.setDescription(description);
//        }
//        return ResponseEntity.ok(departament+"Change");
//
//    }
    @GetMapping("/changeTelefonDepartamentById/{id}/telefon/{telefon}")
    public ResponseEntity changeTelefon(@PathVariable Long id, @PathVariable String telefon) {

        if ((departament = serviceDepartaments.getOne(id)) != null) {
            departament.setTelefon(telefon);
            serviceDepartaments.save(departament);
            return ResponseEntity.ok("Telefon chaneg");
        }
        return ResponseEntity.ok("Wrong id" + id);
    }


}
