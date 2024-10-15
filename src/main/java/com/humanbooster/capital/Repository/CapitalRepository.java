package com.humanbooster.capital.Repository;

import com.humanbooster.capital.Model.Capitale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapitalRepository extends CrudRepository<Capitale, Long> {

    public List<Capitale> findAll();
}
