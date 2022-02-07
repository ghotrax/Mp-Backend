package com.mp.mp.Dao;

import java.util.Collection;

import com.mp.mp.Model.MunicipioModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends CrudRepository<MunicipioModel,Integer>{
    @Query(value="SELECT * FROM mp.mun WHERE idDepartamento = ?1 ", nativeQuery = true )
    Collection<MunicipioModel> GetLabel(int id);
}