package com.mp.mp.Controller;

import java.util.List;


import com.mp.mp.Model.DropdownModel;
import com.mp.mp.Services.DepartamentoService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Departamento")
public class DepartamentoController {
   
    @Autowired private DepartamentoService departamentoService;
	@GetMapping("label")
	public List<DropdownModel> get() {
		return departamentoService.getLabel();
	}


}