package com.astontech.hr.services;

import com.astontech.hr.domain.Element;
import java.util.List;

public interface ElementService {

    Iterable<Element>  listAllElements();

    Element getElementById(Integer id);

    Element saveElement(Element element);

    Iterable<Element> saveElementList(Iterable<Element> elementIterable);

    void deleteElement(Integer id);

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
