package com.mp.mp.Dao;
import com.mp.mp.Model.FiscaliaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscaliaRepository extends CrudRepository<FiscaliaModel,Integer>{

}