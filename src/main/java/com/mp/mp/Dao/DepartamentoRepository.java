package com.mp.mp.Dao;


import com.mp.mp.Model.DepartamentoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends CrudRepository<DepartamentoModel,Integer>{

}