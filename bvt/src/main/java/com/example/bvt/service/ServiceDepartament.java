package com.example.bvt.service;

import com.example.bvt.component.Departament;

import java.util.List;

public interface ServiceDepartament {

        public void save(Departament departament);

        public List<Departament> getAll();

        public Departament getOne(Long id);

        public void deleteForId(Long id);


}
