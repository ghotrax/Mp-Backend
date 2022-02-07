package com.mp.mp.Controller;

import java.util.List;

import com.mp.mp.Model.DepartamentoModel;
import com.mp.mp.Model.DropdownModel;
import com.mp.mp.Services.MunicipioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Municipio")
public class MunicipioController {
    @Autowired private MunicipioService municipioService;

    @PostMapping("labelMuni")
	public List<DropdownModel> get(@RequestBody(required = true) DepartamentoModel departamentoModel) {
        
		return municipioService.GetlabelMuni(departamentoModel.getIdDepartamento());
	}
}
