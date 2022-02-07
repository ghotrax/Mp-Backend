package com.mp.mp.Services;

import java.util.ArrayList;
import java.util.List;

import com.mp.mp.Dao.DepartamentoRepository;

import com.mp.mp.Model.DepartamentoModel;
import com.mp.mp.Model.DropdownModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {
    @Autowired  DepartamentoRepository departamentoRepository;


    public List<DropdownModel> getLabel(){
        List<DepartamentoModel> deplist = (List<DepartamentoModel>) departamentoRepository.findAll();
        List<DropdownModel> dropdown = new ArrayList<DropdownModel>();
            for (DepartamentoModel departamentoModel : deplist) {
                DropdownModel drop = new DropdownModel();
                drop.setValue(departamentoModel.getIdDepartamento());
                drop.setLabel(departamentoModel.getNombreDepartamento());
                dropdown.add(drop);
            }
            return dropdown;
    }
}
