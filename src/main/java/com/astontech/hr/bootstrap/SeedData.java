package com.astontech.hr.bootstrap;


import com.astontech.hr.domain.*;
import com.astontech.hr.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ElementService elementService;
    @Autowired
    private ElementTypeService elementTypeService;
    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private VehicleMakeService vehicleMakeService;
    @Autowired
    private VehicleModelService vehicleModelService;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        generateElementAndElementType();
        generateAllVehicleInformation();
    }

    private void generateElementAndElementType(){
        ElementType laptopType = new ElementType("Laptop");
        ElementType phoneType = new ElementType("Phone");
        ElementType tvType = new ElementType("TV");
        ElementType radioType = new ElementType("Radio");


        List<Element> laptopList = new ArrayList<>();
        laptopList.add(new Element("Acer"));
        laptopList.add(new Element("Dell"));
        laptopList.add(new Element("Mac"));
        laptopList.add(new Element("Windows"));
        laptopList.add(new Element("HP"));
        laptopList.add(new Element("Samsung"));

        List<Element> tvList = new ArrayList<>();
        tvList.add(new Element("Roku"));
        tvList.add(new Element("Netflix"));
        tvList.add(new Element("Hulu"));
        tvList.add(new Element("Apple"));

        List<Element> phoneList = new ArrayList<>();
        phoneList.add(new Element("iPhone"));
        phoneList.add(new Element("Android"));
        phoneList.add(new Element("Razor"));
        phoneList.add(new Element("Hitachi"));

        List<Element> radioList = new ArrayList<>();
        radioList.add(new Element("Beats"));
        radioList.add(new Element("Sony"));
        radioList.add(new Element("Stereo"));
        radioList.add(new Element("AM"));
        radioList.add(new Element("FM"));
        radioList.add(new Element("BoomBox"));

        laptopType.setElementList( laptopList );
        tvType.setElementList( phoneList );
        phoneType.setElementList( tvList );
        radioType.setElementList( radioList );

        elementTypeService.saveElementType(laptopType);
        elementTypeService.saveElementType(phoneType);
        elementTypeService.saveElementType(tvType);
        elementTypeService.saveElementType(radioType);
    }

    private void generateAllVehicleInformation(){
        VehicleMake ford = new VehicleMake();
        ford.setVehicleMakeName("Ford");

        VehicleMake chevy = new VehicleMake();
        chevy.setVehicleMakeName( "Chevy" );

        List<VehicleModel> fordVehicleModelList = new ArrayList<>();
        fordVehicleModelList.add(new VehicleModel("Taurus"));
        fordVehicleModelList.add(new VehicleModel("F-150"));

        List<VehicleModel> chevyVehicleModelList = new ArrayList<>();
        chevyVehicleModelList.add(new VehicleModel("Malibu"));
        chevyVehicleModelList.add(new VehicleModel("Silverado"));

        chevy.setVehicleModelList( chevyVehicleModelList );
        ford.setVehicleModelList( fordVehicleModelList );

        vehicleMakeService.saveVehicleMake(ford);
        vehicleMakeService.saveVehicleMake(chevy);


        VehicleModel newModel = new VehicleModel();

        List<Vehicle> fordVehicleList = new ArrayList<>();
        fordVehicleList.add(new Vehicle(1999));
        fordVehicleList.add(new Vehicle( 2001 ));

        newModel.setVehicleList( fordVehicleList );

        vehicleModelService.saveVehicleModel( newModel );


    }
}
