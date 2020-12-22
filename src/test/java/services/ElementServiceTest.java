package services;

import com.astontech.hr.Application;
import com.astontech.hr.domain.Element;
import com.astontech.hr.repositories.ElementRepository;
import com.astontech.hr.services.ElementService;
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
class ElementServiceTest {

    @Autowired
    private ElementService elementService;

    @Test
    public void elementServiceSaveTest(){
        Element element = new Element("Service Test");

        assertNull(element.getId());
        elementService.saveElement(element);
        assertNotNull(element.getId());

        Element fetched = elementService.getElementById(element.getId());
        assertNotNull( fetched );
        assertEquals(element.getId(), fetched.getId());

        fetched.setElementName("Email");
        elementService.saveElement(fetched);

        Element updatedElement = elementService.getElementById( fetched.getId());
        assertEquals(updatedElement.getElementName(), "Email");
    }
}
