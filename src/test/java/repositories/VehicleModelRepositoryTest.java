//package repositories;
//import com.astontech.hr.Application;
//import com.astontech.hr.domain.Vehicle;
//import com.astontech.hr.domain.VehicleModel;
//import com.astontech.hr.repositories.VehicleModelRepository;
//import com.astontech.hr.repositories.VehicleRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//@WebAppConfiguration
//class VehicleModelRepositoryTest {
//
//    @Autowired
//    private VehicleModelRepository vehicleModelRepository;
//
//    @Test
//    public void testSaveModelName() {
//        VehicleModel veh = new VehicleModel("Malibu");
//
//
//        assertNull( veh.getId() );
//        vehicleModelRepository.save( veh );
//        assertNotNull( veh.getId() );
//
//        VehicleModel fetched = vehicleModelRepository.findById( veh.getId() ).orElse( null );
//        assertNotNull( fetched );
//        assertEquals( veh.getId(), fetched.getId() );
//
//        fetched.setVehicleModelName( "Range Rover" );
//        vehicleModelRepository.save( fetched );
//
//        VehicleModel updatedVehicle = vehicleModelRepository.findById( fetched.getId() ).orElse( null );
//        assertEquals( updatedVehicle.getVehicleModelName(), "Range Rover" );
//    }
//
//    @Test
//    public void testVehicleModelFindByName(){
//        VehicleModel vm = new VehicleModel("Tesla");
//
//        vehicleModelRepository.save(vm);
//
//        VehicleModel fetched = vehicleModelRepository.findByVehicleModelName( "Tesla" );
//
//        assertEquals(vm.getVehicleModelName(), fetched.getVehicleModelName());
//    }
//}