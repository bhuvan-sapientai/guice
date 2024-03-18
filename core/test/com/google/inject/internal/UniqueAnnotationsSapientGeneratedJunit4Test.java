package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class UniqueAnnotationsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${2284fc3d-473b-3992-886d-8fe431bd702d}, hash: 08534480095EAD89327C042EDA8F1E71
    @Test()
    public void createTest() {
        //Arrange Statement(s)
        Annotation annotationMock = mock(Annotation.class);
        try (MockedStatic<UniqueAnnotations> uniqueAnnotations = mockStatic(UniqueAnnotations.class, CALLS_REAL_METHODS)) {
            uniqueAnnotations.when(() -> UniqueAnnotations.create(1)).thenReturn(annotationMock);
            //Act Statement(s)
            Annotation result = UniqueAnnotations.create();
            //Assert statement(s)
            assertThat(result, equalTo(annotationMock));
            uniqueAnnotations.verify(() -> UniqueAnnotations.create(1), atLeast(1));
        }
    }

    //Sapient generated method id: ${b0d142e8-0743-37b5-ba4a-5c4957c16e12}, hash: F30395AA6241195F63491247E01A7B8E
    @Test()
    public void create1Test() {

        //Act Statement(s)
        Annotation result = UniqueAnnotations.create(0);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
