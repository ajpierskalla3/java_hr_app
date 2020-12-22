//package repositories;
//
//import com.astontech.hr.Application;
//import com.astontech.hr.domain.Vehicle;
//import com.astontech.hr.repositories.VehicleRepository;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.web.WebAppConfiguration;
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//@WebAppConfiguration
//class VehicleRepositoryTest {
//
//    @Autowired
//    private VehicleRepository vehicleRepository;
//
//    @Test
//    public void testSaveYear() {
//        Vehicle veh = new Vehicle();
//        veh.setYear(1999);
//
//        assertNull( veh.getId() );
//        vehicleRepository.save( veh );
//        assertNotNull( veh.getId() );
//
//        Vehicle fetched = (Vehicle) vehicleRepository.findById( veh.getId() ).orElse( null );
//        assertNotNull( fetched );
//        assertEquals( veh.getId(), fetched.getId() );
//
//        fetched.setYear(1997);
//        vehicleRepository.save(fetched);
//
//        Vehicle updatedVehicle = vehicleRepository.findById( fetched.getId()).orElse( null );
//        assertEquals(updatedVehicle.getYear(), 1997);
//    }
//
//    @Test
//    public void testVehicleFindByYear(){
//        Vehicle vm = new Vehicle();
//        vm.setYear( 1999 );
//        vehicleRepository.save(vm);
//
//        Vehicle fetched = vehicleRepository.findByYear( 1999 );
//
//        assertEquals(vm.getYear(), fetched.getYear());
//    }
//}
