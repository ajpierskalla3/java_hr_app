package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ElementRepository extends CrudRepository<Element, Integer> {

    Element findByElementName(String eleName);

    List<Element> findAllByElementName(String eleName);
//
//    List<Element> findByAgeLessThan(int age);
//
//    List<Element> findByAgeOrElementName(int age, String eleName);
//
//    List<Element> findByElementNameNot( String eleName);
//
//    List<Element> findByElementNameStartingWith(String eleName);
//
//    List<Element> findByHeightNotNull();


}
