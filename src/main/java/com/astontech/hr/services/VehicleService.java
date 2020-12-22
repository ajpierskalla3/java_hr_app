package com.astontech.hr.services;
import com.astontech.hr.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    Iterable<Vehicle> listAllVehicles();

    Vehicle getVehicleById(Integer id);

    Vehicle saveVehicle(Vehicle vehicle);

    Iterable<Vehicle> saveVehicleList(Iterable<Vehicle> vehicleIterable);

    void deleteVehicle(Integer id);

    // region CUSTOM MADE
    Vehicle findByYear(int year);

    List<Vehicle> findAllByYear(int year);
    //endregion
}
