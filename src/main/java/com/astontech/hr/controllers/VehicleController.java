package com.astontech.hr.controllers;

import com.astontech.hr.domain.*;
import com.astontech.hr.domain.VO.ElementVO;
import com.astontech.hr.domain.VO.VehicleVO;
import com.astontech.hr.services.ElementTypeService;
import com.astontech.hr.services.VehicleMakeService;
import com.astontech.hr.services.VehicleModelService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehicleController {

    @Autowired
    private VehicleMakeService vehicleMakeService;
    private Logger log = Logger.getLogger(VehicleController.class);

    @RequestMapping(value="/admin/vehicle/add", method = RequestMethod.GET)
    public String adminVehicleGet(Model model) {
        model.addAttribute("vehicleVO", new VehicleVO());
        model.addAttribute("warningAlert", "visible");
        return "admin/vehicle/vehicle_add";
    }

    @RequestMapping(value="/admin/vehicle/add/", method= RequestMethod.POST)
    public String adminVehiclePost(VehicleVO vehicleVO, Model model){
        vehicleVO.splitNewElementsIntoArray();
        logElementVO(vehicleVO);
        saveVehicleAndMakeModelVO( vehicleVO );

        boolean success = true;
        if(success){
            model.addAttribute("successAlert", "visible");
        } else {
            model.addAttribute("errorAlert", "visible");
        }

        model.addAttribute( "vehicleVO", new VehicleVO() );
        return "admin/vehicle/vehicle_add";
    }

    @RequestMapping(value = "/admin/vehicle/list", method = RequestMethod.GET)
    public String adminVehicleLists(Model model){
        model.addAttribute("vehicleMakeList", vehicleMakeService.listAllVehicleMakes());
        return "admin/vehicle/vehicle_list";
    }

    @RequestMapping(value= "/admin/vehicle/edit/{id}", method=RequestMethod.GET)
    public String vehicleModelEdit(@PathVariable int id, Model model){
        VehicleMake vehicleMake = vehicleMakeService.getVehicleMakeById( id );

        model.addAttribute("vehicleMake", vehicleMake);
        return "admin/vehicle/vehicle_edits";
    }

    @RequestMapping( value="/admin/vehicle/update", method = RequestMethod.POST)
    public String VehicleMakeUpdate(VehicleMake vehicleMake,
                                    Model model,
                                    @RequestParam("inputNewVehicleModel") String newVehicleModel){
        if(!newVehicleModel.equals("")){
            if(vehicleMake.getVehicleModelList() == null){
                List<VehicleModel> vehicleModelList = new ArrayList<>();
                vehicleModelList.add(new VehicleModel(newVehicleModel));
                vehicleMake.setVehicleModelList( vehicleModelList );
            } else {
                vehicleMake.getVehicleModelList().add(new VehicleModel(newVehicleModel));
            }
        }

        for(int i = 0; i < vehicleMake.getVehicleModelList().size(); i++){
            if(vehicleMake.getVehicleModelList().get(i).getVehicleModelName().equals("")){
                vehicleMake.getVehicleModelList().remove(i);
            }
        }

        vehicleMakeService.saveVehicleMake( vehicleMake );

        return "redirect:/admin/vehicle/edit/" + vehicleMake.getId();
    }

    @RequestMapping(value="/admin/vehicle/delete/{id}", method=RequestMethod.GET)
    public String vehicleMakeDelete(@PathVariable int id){
        vehicleMakeService.deleteVehicleMake(id);
        return "redirect:/admin/vehicle/list";
    }



    private void saveVehicleAndMakeModelVO(VehicleVO vehicleVO){
        List<VehicleModel> newVehicleModelList = new ArrayList<>();
        for(String str : vehicleVO.getNewVehicleModelArray()){
            newVehicleModelList.add(new VehicleModel(str));
        }

        VehicleMake newVehicleMake = new VehicleMake(vehicleVO.getNewVehicleMake());
        newVehicleMake.setVehicleModelList(newVehicleModelList);

        vehicleMakeService.saveVehicleMake(newVehicleMake);
    }

    private void logElementVO(VehicleVO vehicleVO){
        log.info("New Element Type: " + vehicleVO.getNewVehicleMake());

        for(String s : vehicleVO.getNewVehicleModelArray())
            log.info("New Element: " + s);
    }


}
