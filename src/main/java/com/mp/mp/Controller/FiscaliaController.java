package com.mp.mp.Controller;

import java.util.List;

import com.mp.mp.Model.ExtraValues;
import com.mp.mp.Model.FiscaliaModel;
import com.mp.mp.Services.FiscaliaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Fiscalia")
public class FiscaliaController {
    @Autowired
    private FiscaliaService fiscaliaService;

    @GetMapping("All")
    public List<ExtraValues> get() {
        return fiscaliaService.getAll();
    }

    @PostMapping("store")
    public int post(@RequestBody(required = true) FiscaliaModel fiscaliaModel) throws Exception {
        return fiscaliaService.create(fiscaliaModel);
    }

    @PostMapping("update")
    public int put(@RequestBody(required = true) FiscaliaModel fiscaliaModel) throws Exception {
        return fiscaliaService.update(fiscaliaModel);
    }

    @PostMapping("destroy")
    public int delete(@RequestBody(required = true) FiscaliaModel fiscaliaModel) throws Exception {
        return fiscaliaService.delete(fiscaliaModel);
    }
    @PostMapping("one")
    public ExtraValues one(@RequestBody(required = true) FiscaliaModel fiscaliaModel) throws Exception {
        return fiscaliaService.One(fiscaliaModel);
    }
}
