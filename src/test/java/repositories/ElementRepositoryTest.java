//package repositories;
//
//import com.astontech.hr.Application;
//import com.astontech.hr.domain.Element;
//import com.astontech.hr.repositories.ElementRepository;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//@WebAppConfiguration
//class ElementRepositoryTest {
//
//    @Autowired
//    private ElementRepository elementRepository;
//
//    @Test
//    public void testSaveElement(){
//        Element element = new Element();
//        element.setElementName( "Phone" );
//
//        assertNull(element.getId());
//        elementRepository.save(element);
//        assertNotNull(element.getId());
//
//        Element fetched = elementRepository.findById(element.getId()).orElse(null);
//        assertNotNull( fetched );
//        assertEquals(element.getId(), fetched.getId());
//
//        fetched.setElementName("Email");
//        elementRepository.save(fetched);
//
//        Element updatedElement = elementRepository.findById( fetched.getId()).orElse( null );
//        assertEquals(updatedElement.getElementName(), "Email");
//    }
//
//    @Test
//    public void testSaveElementList(){
//        List<Element> elementList = new ArrayList<>();
//
//        elementList.add(new Element("Phone"));
//        elementList.add(new Element("Email"));
//        elementList.add(new Element("Home"));
//
//        elementRepository.saveAll(elementList);
//
//        Iterable<Element> fetched = elementRepository.findAll();
//
//        int count = 0;
//        for(Element e : fetched){
//            count++;
//        }
////
////        assertEquals(4, count);
//
//    }
//
//    @Test
//    public void testFindByName(){
//        Element element = new Element("FindTest");
//        elementRepository.save(element);
//
//        Element foundByName = elementRepository.findByElementName( "FindTest" );
//
//        assertEquals(element.getId(), foundByName.getId());
//    }
//
//    @Test
//    public void testAllFindByName(){
//       Element element1 = (new Element("Henry"));
//       Element element2 = (new Element("Henry"));
//       Element element3 = (new Element("Becky"));
//
//        elementRepository.save(element1);
//        elementRepository.save(element2);
//        elementRepository.save(element3);
//
//        List<Element> foundByName = elementRepository.findAllByElementName( "Henry");
//
//        assertEquals(2, foundByName.size());
//    }
//
//    @Test
//    public void testFindByAgeLessThan(){
//        Element ele = (new Element(5));
//        Element ele1 = (new Element(7));
//        Element ele2 = (new Element(3));
//        Element ele3 = (new Element(9));
//
//        elementRepository.save(ele);
//        elementRepository.save(ele2);
//        elementRepository.save(ele1);
//        elementRepository.save(ele3);
//
//        List<Element> fetched = elementRepository.findByAgeLessThan( 6 );
//
//        assertEquals(2, fetched.size());
//    }
//
//    @Test
//    public void testFindByAgeOrByName(){
//
//         Element e1 = (new Element("Betsy", 99));
//         Element e2 = (new Element("Judy", 51));
//
//         elementRepository.save(e1);
//         elementRepository.save(e2);
//
//         List<Element> fetched = elementRepository.findByAgeOrElementName(51, "Betsy" );
//
//        assertEquals(2, fetched.size());
//    }
//
//    @Test
//    public void testFindByElementNameNot(){
//
//        Element ele = (new Element("Jerry",5));
//        Element ele1= (new Element("Michael", 7));
//        Element ele2 = (new Element("Kerry", 3));
//        Element ele3 = (new Element("Fudd", 9));
//
//        elementRepository.save(ele);
//        elementRepository.save(ele1);
//        elementRepository.save(ele2);
//        elementRepository.save(ele3);
//
//        Iterable<Element> fetched = elementRepository.findByElementNameNot( "Fudd" );
//
//        int count = 0;
//        for(Element e : fetched){
//            count++;
//        }
//
//        assertEquals( 3, count );
//    }
//
//    @Test
//    public void testFindByElementNameStartingWith(){
//        Element e = new Element("Kujo");
//        Element e1 = new Element("Jojo");
//        Element e2 = new Element("Karen");
//
//        elementRepository.save(e);
//        elementRepository.save(e1);
//        elementRepository.save(e2);
//
//        List<Element> fetched = elementRepository.findByElementNameStartingWith( "K" );
//
//        int count = 0;
//        for(Element element : fetched){
//            count++;
//            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//            System.out.println(count);
//        }
//
//        assertEquals(count, fetched.size());
//
//    }
//
//    @Test
//    public void testFindByHeightNotNull() {
//
//        Element ele = (new Element(  0, "Mike"));
//        Element ele1 = (new Element( 2,"Michael"));
//        Element ele2 = (new Element(  null,37));
//        Element ele3 = (new Element(  8, "Mike"));
//
//        elementRepository.save( ele );
//        elementRepository.save( ele1 );
//        elementRepository.save( ele2 );
//        elementRepository.save( ele3 );
//
//        List<Element> fetched = elementRepository.findByHeightNotNull();
//
//        int count = 0;
//        for(Element e : fetched){
//            count++;
//        }
//
//        assertEquals( 3, fetched.size() );
//    }
//}
