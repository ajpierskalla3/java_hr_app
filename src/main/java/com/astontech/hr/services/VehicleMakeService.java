package com.astontech.hr.services;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.VehicleMake;

import java.util.List;

public interface VehicleMakeService {

    Iterable<VehicleMake>  listAllVehicleMakes();

    VehicleMake getVehicleMakeById(Integer id);

    VehicleMake saveVehicleMake(VehicleMake vehicleMake);

    Iterable<VehicleMake> saveVehicleMakeList(Iterable<VehicleMake> vehicleMakeIterable);

    void deleteVehicleMake(Integer id);

    VehicleMake findByVehicleMakeName(String vehicleMake);

    List<VehicleMake> findAllByVehicleMakeName(String vehicleMake);

}
