package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.Binder;
import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ExposureBuilderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Key<Object> keyMock = mock(Key.class, "key");

    private final Binder binderMock = mock(Binder.class, "binder");

    //Sapient generated method id: ${86cd8d93-6615-35b2-bd41-16017a32fe17}, hash: E1930625FD8C3805AB42BA056641D406
    @Ignore()
    @Test()
    public void checkNotAnnotatedWhenKeyGetAnnotationTypeIsNotNull() {
        /* Branches:
         * (key.getAnnotationType() != null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        ExposureBuilder<Object> target = new ExposureBuilder(binderMock, object, keyMock);
        doReturn(Annotation.class).when(keyMock).getAnnotationType();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("More than one annotation is specified for this binding.", objectArray);
        //Act Statement(s)
        target.checkNotAnnotated();
        //Assert statement(s)
        verify(keyMock).getAnnotationType();
        verify(binderMock).addError("More than one annotation is specified for this binding.", objectArray);
    }

    //Sapient generated method id: ${fba982c0-cd9f-393d-9f7a-c290cdb8b7b3}, hash: 04131E8D447B9512FC2713AB8C114CB3
    @Ignore()
    @Test()
    public void annotatedWithTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Key key = Key.get(Object.class);
        ExposureBuilder<Object> target = spy(new ExposureBuilder(binderMock, object, key));
        doNothing().when(target).checkNotAnnotated();
        //Act Statement(s)
        target.annotatedWith(java.lang.annotation.Annotation.class);
        Key<Object> key2 = key.withAnnotation(java.lang.annotation.Annotation.class);
        //Assert statement(s)
        assertThat(target.getKey(), equalTo(key2));
        verify(target).checkNotAnnotated();
    }

    //Sapient generated method id: ${cd6f4bf5-9179-3a0f-b567-d99c9eb94b6f}, hash: 4F2F617BA8E266555E2D7A2972F8EDB4
    @Test()
    public void annotatedWith1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ExposureBuilder<Object> target = spy(new ExposureBuilder(binderMock, object, keyMock));
        doNothing().when(target).checkNotAnnotated();
        Key<Object> keyMock2 = mock(Key.class);
        java.lang.annotation.Annotation annotationMock = mock(java.lang.annotation.Annotation.class);
        doReturn(keyMock2).when(keyMock).withAnnotation(annotationMock);
        //Act Statement(s)
        target.annotatedWith(annotationMock);
        //Assert statement(s)
        assertThat(target.getKey(), is(notNullValue()));
        verify(target).checkNotAnnotated();
        verify(keyMock).withAnnotation(annotationMock);
    }

    //Sapient generated method id: ${a377c75a-5e17-3222-adbe-6e7d38993c02}, hash: BF88F3B901FA28919F60C2E92AEA8CBB
    @Test()
    public void getKeyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        ExposureBuilder<Object> target = new ExposureBuilder(binderMock, object, keyMock);
        //Act Statement(s)
        Key result = target.getKey();
        //Assert statement(s)
        assertThat(result, equalTo(keyMock));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: E5BC8B0E1FF87C84DCA85BB03AEE57D0
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        Object object = new Object();
        ExposureBuilder<Object> target = new ExposureBuilder(binderMock, object, keyMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("AnnotatedElementBuilder"));
    }
}
