
package com.mp.mp.Services;

import java.util.ArrayList;
import java.util.List;

import com.mp.mp.Dao.DepartamentoRepository;
import com.mp.mp.Dao.FiscaliaRepository;
import com.mp.mp.Dao.MunicipioRepository;
import com.mp.mp.Model.DepartamentoModel;
import com.mp.mp.Model.ExtraValues;
import com.mp.mp.Model.FiscaliaModel;
import com.mp.mp.Model.MunicipioModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FiscaliaService {
    @Autowired
    FiscaliaRepository fiscaliaRepository;
    @Autowired
    MunicipioRepository municipioRepository;
    @Autowired
    DepartamentoRepository departamentoRepository;

    public List<ExtraValues> getAll() {
        List<FiscaliaModel> FisacliaAll = (List<FiscaliaModel>) fiscaliaRepository.findAll();
        List<ExtraValues> extraValues = new ArrayList<ExtraValues>();
        
        for (FiscaliaModel fiscaliaModel : FisacliaAll) {
            MunicipioModel muni = municipioRepository.findById(fiscaliaModel.getIdmunicipio()).get();
            DepartamentoModel dep = departamentoRepository.findById(muni.getIddepartamento()).get();


            ExtraValues extraValuesModel = new ExtraValues();
            extraValuesModel.setNombreDepartamento(dep.getNombreDepartamento());
            extraValuesModel.setIdDep(dep.getIdDepartamento());
            extraValuesModel.setNombreMunicipio(muni.getNombreMunicipio());
            extraValuesModel.setCalle(fiscaliaModel.getCalle());
            extraValuesModel.setTelefono(fiscaliaModel.getTelefono());
            extraValuesModel.setIdFiscalia(fiscaliaModel.getIdFiscalia());
            extraValuesModel.setNombreFiscalia(fiscaliaModel.getNombreFiscalia());
            extraValuesModel.setZona(fiscaliaModel.getZona());
            extraValuesModel.setIdmunicipio(fiscaliaModel.getIdmunicipio());
            extraValues.add(extraValuesModel);

        }
        return extraValues;
    }

    public int create(FiscaliaModel fiscaliaModel) throws Exception {
        try {
            fiscaliaRepository.save(fiscaliaModel);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int update(FiscaliaModel fiscaliaModel) {
        try {
            fiscaliaRepository.save(fiscaliaModel);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int delete(FiscaliaModel fiscaliaModel) {
        try {
            fiscaliaRepository.deleteById(fiscaliaModel.getIdFiscalia());
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public ExtraValues One(FiscaliaModel fiscaliaModel) {

     FiscaliaModel fisca =   (FiscaliaModel) fiscaliaRepository.findById(fiscaliaModel.getIdFiscalia()).get();
     
            MunicipioModel muni = municipioRepository.findById(fisca.getIdmunicipio()).get();
            DepartamentoModel dep = departamentoRepository.findById(muni.getIddepartamento()).get();


            ExtraValues extraValuesModel = new ExtraValues();
            extraValuesModel.setNombreDepartamento(dep.getNombreDepartamento());
            extraValuesModel.setIdDep(dep.getIdDepartamento());
            extraValuesModel.setNombreMunicipio(muni.getNombreMunicipio());
            extraValuesModel.setCalle(fisca.getCalle());
            extraValuesModel.setTelefono(fisca.getTelefono());
            extraValuesModel.setIdFiscalia(fisca.getIdFiscalia());
            extraValuesModel.setNombreFiscalia(fisca.getNombreFiscalia());
            extraValuesModel.setZona(fisca.getZona());
            extraValuesModel.setIdmunicipio(fisca.getIdmunicipio());

        return  extraValuesModel;
    }

}
