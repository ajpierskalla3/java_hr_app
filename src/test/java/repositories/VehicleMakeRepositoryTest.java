//package repositories;
//
//import com.astontech.hr.Application;
//import com.astontech.hr.domain.Vehicle;
//import com.astontech.hr.domain.VehicleMake;
//import com.astontech.hr.domain.VehicleModel;
//import com.astontech.hr.repositories.VehicleMakeRepository;
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
//class VehicleMakeRepositoryTest {
//
//    @Autowired
//    private VehicleMakeRepository vehicleMakeRepository;
//
//    @Test
//    public void testSaveVehicleMakeName() {
//        VehicleMake veh = new VehicleMake();
//        veh.setVehicleMakeName( "Mercury Mountaineer" );
//
//
//        assertNull( veh.getId() );
//        vehicleMakeRepository.save( veh );
//        assertNotNull( veh.getId() );
//
//        VehicleMake fetched = vehicleMakeRepository.findById( veh.getId() ).orElse( null );
//        assertNotNull( fetched );
//        assertEquals( veh.getId(), fetched.getId() );
//
//
//        fetched.setVehicleMakeName( "Dodge Ram" );
//        vehicleMakeRepository.save( fetched );
//
//        VehicleMake updatedVehicle = vehicleMakeRepository.findById( fetched.getId() ).orElse( null );
//        assertEquals( updatedVehicle.getVehicleMakeName(), "Dodge Ram" );
//    }
//
//    @Test
//    public void testVehicleMakeFindByName(){
//        VehicleMake vm = new VehicleMake();
//        vm.setVehicleMakeName( "Tesla" );
//        vehicleMakeRepository.save(vm);
//
//        VehicleMake fetched = vehicleMakeRepository.findByVehicleMakeName( "Tesla" );
//
//        assertEquals(vm.getVehicleMakeName(), fetched.getVehicleMakeName());
//    }
//}
