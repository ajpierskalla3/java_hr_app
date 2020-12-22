package services;

import com.astontech.hr.Application;
import com.astontech.hr.domain.VehicleMake;
import com.astontech.hr.domain.VehicleModel;
import com.astontech.hr.services.VehicleModelService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
class VehicleModelServiceTest {

    @Autowired
    private VehicleModelService vehicleModelService;

    @Test
    public void VehicleModelServiceSaveTest() {
        VehicleModel vm = new VehicleModel("Tesla");

        assertNull( vm.getId() );
        vehicleModelService.saveVehicleModel( vm );
        assertNotNull( vm.getId() );

        VehicleModel fetched = vehicleModelService.getVehicleModelById( vm.getId() );
        assertNotNull( fetched );
        assertEquals( vm.getId(), fetched.getId() );

        fetched.setVehicleModelName( "Dodge" );
        vehicleModelService.saveVehicleModel( fetched );

        VehicleModel updatedElement = vehicleModelService.findByVehicleModelName( fetched.getVehicleModelName() );
        assertEquals( updatedElement.getVehicleModelName(), "Dodge" );
    }
}
