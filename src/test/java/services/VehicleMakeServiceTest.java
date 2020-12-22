package services;

import com.astontech.hr.Application;
import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.VehicleMake;
import com.astontech.hr.domain.VehicleModel;
import com.astontech.hr.repositories.ElementRepository;
import com.astontech.hr.services.ElementService;
import com.astontech.hr.services.VehicleMakeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
class VehicleMakeServiceTest {

    @Autowired
    private VehicleMakeService vehicleMakeService;

    @Test
    public void VehicleMakeServiceSaveTest() {
        VehicleMake vm = new VehicleMake();

        assertNull( vm.getId() );
        vehicleMakeService.saveVehicleMake( vm );
        assertNotNull( vm.getId() );

        VehicleMake fetched = vehicleMakeService.getVehicleMakeById( vm.getId() );
        assertNotNull( fetched );
        assertEquals( vm.getId(), fetched.getId() );

        fetched.setVehicleMakeName( "Dodge" );
        vehicleMakeService.saveVehicleMake( fetched );

        VehicleMake updatedElement = vehicleMakeService.findByVehicleMakeName( fetched.getVehicleMakeName() );
        assertEquals( updatedElement.getVehicleMakeName(), "Dodge" );
    }
}