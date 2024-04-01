package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RealElementSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${309d9fc8-73b0-3e88-9e8f-b06d2dcd2b99}, hash: 8797EB75DD85FDA075625497BA658D3A
    @Test()
    public void setNameTest() {
        //Arrange Statement(s)
        RealElement target = new RealElement("setName1", Element.Type.MAPBINDER, "keyType1", 0);

        //Act Statement(s)
        String result = target.setName();

        //Assert statement(s)
        assertThat(result, equalTo("setName1"));
    }

    //Sapient generated method id: ${fdb4024b-c8cf-388d-8494-db7796cf6b2e}, hash: C9EC574EAAF068F9EF545B6971B7CE46
    @Test()
    public void uniqueIdTest() {
        //Arrange Statement(s)
        RealElement target = new RealElement("setName1", Element.Type.MAPBINDER, "keyType1", 0);

        //Act Statement(s)
        int result = target.uniqueId();

        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${335ebe31-75d6-3bfc-bc95-7f09d55b4633}, hash: D7BEBAA0FEEE789BE555B1D88FD0E031
    @Test()
    public void typeTest() {
        //Arrange Statement(s)
        RealElement target = new RealElement("setName1", Element.Type.MAPBINDER, "keyType1", 0);

        //Act Statement(s)
        Element.Type result = target.type();

        //Assert statement(s)
        assertThat(result, equalTo(Element.Type.MAPBINDER));
    }

    //Sapient generated method id: ${0a7aebe5-d7d7-36f6-8055-64429aca6a75}, hash: 1CDC7944AFC2B4BE7BB272EFA7091C2C
    @Test()
    public void keyTypeTest() {
        //Arrange Statement(s)
        RealElement target = new RealElement("setName1", Element.Type.MAPBINDER, "keyType1", 0);

        //Act Statement(s)
        String result = target.keyType();

        //Assert statement(s)
        assertThat(result, equalTo("keyType1"));
    }

    //Sapient generated method id: ${b18e5504-3106-34bd-b29a-326bddd61945}, hash: 596564606E3F54584BC53644E6B20801
    @Test()
    public void annotationTypeTest() {
        //Arrange Statement(s)
        RealElement target = new RealElement("setName1", Element.Type.MAPBINDER, "keyType1", 0);

        //Act Statement(s)
        Class<? extends Annotation> result = target.annotationType();

        //Assert statement(s)
        assertThat(result, equalTo(Element.class));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 11D8516E875B7E85BEBB258EB6BA4071
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        RealElement target = new RealElement("C", Element.Type.MAPBINDER, "F", 2);

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("@com.google.inject.internal.Element(setName=C,uniqueId=2, type=MAPBINDER, keyType=F)"));
    }
}
