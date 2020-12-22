//package services;
//
//import com.astontech.hr.Application;
//import com.astontech.hr.domain.Vehicle;
//import com.astontech.hr.services.VehicleService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//@WebAppConfiguration
//class VehicleServiceTest {
//
//    @Autowired
//    private VehicleService vehicleService;
//
//    @Test
//    public void vehicleServiceSaveTest(){
//        Vehicle veh = new Vehicle();
//
//        assertNull(veh.getId());
//        vehicleService.saveVehicle(veh);
//        assertNotNull(veh.getId());
//
//        Vehicle fetched = vehicleService.getVehicleById(veh.getId());
//        assertNotNull( fetched );
//        assertEquals(veh.getId(), fetched.getId());
//
//        fetched.setYear(1999);
//        vehicleService.saveVehicle(fetched);
//
//        Vehicle updatedVehicle = vehicleService.getVehicleById( fetched.getId());
//        assertEquals(updatedVehicle.getYear(), 1999);
//    }
//}
