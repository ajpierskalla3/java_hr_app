package com.astontech.hr.repositories;


import com.astontech.hr.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

    Vehicle findByYear(int year);

    List<Vehicle> findAllByYear(int year);
}