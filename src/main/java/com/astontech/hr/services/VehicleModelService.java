package com.astontech.hr.services;

import com.astontech.hr.domain.VehicleMake;
import com.astontech.hr.domain.VehicleModel;

import java.util.List;

public interface VehicleModelService {

    Iterable<VehicleModel>  listAllVehicleModels();

    VehicleModel getVehicleModelById(Integer id);

    VehicleModel saveVehicleModel(VehicleModel vehicleModel);

    Iterable<VehicleModel> saveVehicleModelList(Iterable<VehicleModel> vehicleModelIterable);

    void deleteVehicleModel(Integer id);

    VehicleModel findByVehicleModelName(String vehicleModel);

    List<VehicleModel> findAllByVehicleModelName(String vehicleModel);
}
