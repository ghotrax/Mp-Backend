package com.mp.mp.Services;

import java.util.ArrayList;
import java.util.List;

import com.mp.mp.Dao.MunicipioRepository;
import com.mp.mp.Model.DropdownModel;
import com.mp.mp.Model.MunicipioModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService {
    @Autowired  MunicipioRepository municipioRepository;

    public List<DropdownModel> GetlabelMuni(int id){
        List<MunicipioModel> deplist = (List<MunicipioModel>) municipioRepository.GetLabel(id);
        List<DropdownModel> dropdown = new ArrayList<DropdownModel>();
        for (MunicipioModel municipioModel : deplist) {
            DropdownModel drop = new DropdownModel();
            drop.setValue(municipioModel.getIdMunicipio());
            drop.setLabel(municipioModel.getNombreMunicipio());
            dropdown.add(drop);
        }
        return dropdown;
    }
}
