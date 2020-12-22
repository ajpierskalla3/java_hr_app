package com.astontech.hr.repositories;

import com.astontech.hr.domain.VehicleMake;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleMakeRepository extends CrudRepository<VehicleMake, Integer> {

    VehicleMake findByVehicleMakeName(String vehicleMakeName);

    List<VehicleMake> findAllByVehicleMakeName(String vehicleMakeName);
}

//    Element findByElementName(String eleName);

//    List<Element> findAllByElementName(String eleName);