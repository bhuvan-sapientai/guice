package com.google.inject.matcher;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.AnnotatedElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MatchersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${97620483-69e3-33de-8f8b-1beeb08ff02a}, hash: 219AC916EC0414B42CA9ACC92F7C5EAE
    @Test()
    public void anyTest() {
        //Act Statement(s)
        Matcher<Object> result = Matchers.any();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${def796ea-942a-3a2f-96ac-e89d10aef690}, hash: D4E4117436385C0C8A20576FBC7FFA99
    @Test()
    public void notTest() {
        //Arrange Statement(s)
        Matcher<Object> matcherMock = mock(Matcher.class);
        //Act Statement(s)
        Matcher result = Matchers.not(matcherMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${fba982c0-cd9f-393d-9f7a-c290cdb8b7b3}, hash: 9A5C01E4687F591A60DD9043FAC1BC2C
    @Ignore()
    @Test()
    public void annotatedWithTest() {
        //Act Statement(s)
        Matcher<AnnotatedElement> result = Matchers.annotatedWith(Annotation.class);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${cd6f4bf5-9179-3a0f-b567-d99c9eb94b6f}, hash: 60A1A3BBA1A0AED6148A4E5B886014B8
    @Ignore()
    @Test()
    public void annotatedWith1Test() {
        //Arrange Statement(s)
        Annotation annotationMock = mock(Annotation.class);
        //Act Statement(s)
        Matcher<AnnotatedElement> result = Matchers.annotatedWith(annotationMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8fc5a916-a27e-3a35-a532-a3093104af34}, hash: 6F1AEBD4680D5113E3E98D87CA67FAAD
    @Test()
    public void subclassesOfTest() {
        //Act Statement(s)
        Matcher<Class> result = Matchers.subclassesOf(Object.class);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${03cc9724-9604-372c-b91a-de3a0e122d0f}, hash: FB2F53D3F1164F57895551118DAF3CBB
    @Test()
    public void onlyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        Matcher<Object> result = Matchers.only(object);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${b927bb65-457a-343c-ab82-9620f277bd46}, hash: 8139F631D3252DB7317A90EEBD48770D
    @Test()
    public void identicalToTest() {
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        Matcher<Object> result = Matchers.identicalTo(object);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8d3b4b09-7fd4-35f7-bf6c-381a939d3d80}, hash: 5C34DF293BC86479A7E7109F68707021
    @Ignore()
    @Test()
    public void inPackageTest() {
        //Arrange Statement(s)
        Package _package = Package.getPackage("name1");
        //Act Statement(s)
        Matcher<Class> result = Matchers.inPackage(_package);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${afa44f70-0745-336e-8274-eb9209072435}, hash: CB46F28E130ACC22D8F752C9087907C5
    @Test()
    public void inSubpackageTest() {
        //Act Statement(s)
        Matcher<Class> result = Matchers.inSubpackage("targetPackageName1");
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${49576e2d-6e53-3167-9c1f-57f98634a467}, hash: 0C3A613217E7F8ECF21972ED72208BA3
    @Test()
    public void returnsTest() {
        //Arrange Statement(s)
        Matcher<Class<?>> matcherMock = mock(Matcher.class);
        //Act Statement(s)
        Matcher<Method> result = Matchers.returns(matcherMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
