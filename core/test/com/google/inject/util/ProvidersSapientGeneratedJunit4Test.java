package com.google.inject.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.HashSet;

import com.google.inject.TypeLiteral;
import org.mockito.MockedStatic;

import java.util.Set;

import jakarta.inject.Provider;

import java.lang.reflect.Constructor;

import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProvidersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Provider<Object> providerMock = mock(Provider.class);

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 7CEDD36259D1ECCDE583C047E72A027D
    @Test()
    public void ofTest() {
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        com.google.inject.Provider result = Providers.of(object);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ae0b424d-b7cb-39c5-8148-c9ddd048fafb}, hash: 3F924B4E3A4683D63F691AD83111838F
    @Test()
    public void guicifyTest() {
        //Arrange Statement(s)
        com.google.inject.Provider<Object> providerMock = mock(com.google.inject.Provider.class);
        //Act Statement(s)
        com.google.inject.Provider result = Providers.guicify(providerMock);
        //Assert statement(s)
        assertThat(result, equalTo(providerMock));
    }

    //Sapient generated method id: ${9ff0d5d4-82e3-3f6c-af10-c93cd7fac7c6}, hash: 6CCF2F48E7D3D7C7A7A3EAFAF7DDFB5F
    @Test()
    public void guicify1WhenProviderInstanceOfProvider() {
        /* Branches:
         * (provider instanceof Provider) : true
         */
        //Arrange Statement(s)
        com.google.inject.Provider providerMock = mock(com.google.inject.Provider.class);
        //Act Statement(s)
        com.google.inject.Provider result = Providers.guicify((Provider) providerMock);
        //Assert statement(s)
        assertThat(result, equalTo(providerMock));
    }

    //Sapient generated method id: ${430cf085-f301-3ee9-af48-95620aaab12d}, hash: 971A18E33326B8384390E8D4026184BB
    @Ignore()
    @Test()
    public void guicify1WhenInjectionPointsIsEmpty() {
        /* Branches:
         * (provider instanceof Provider) : false
         * (injectionPoints.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class)) {
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPoint.when(() -> InjectionPoint.forInstanceMethodsAndFields(Provider.class)).thenReturn(injectionPointSet);
            //Act Statement(s)
            com.google.inject.Provider result = Providers.guicify(providerMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            injectionPoint.verify(() -> InjectionPoint.forInstanceMethodsAndFields(Provider.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${c9737c16-6b70-33b4-967f-201acfb9356b}, hash: 9AC89383B33E48B835EA9769C1C951B6
    @Ignore()
    @Test()
    public void guicify1WhenInjectionPointsNotIsEmpty() {
        /* Branches:
         * (provider instanceof Provider) : false
         * (injectionPoints.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Constructor constructorMock = mock(Constructor.class);
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class)) {
            InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint2);
            injectionPoint.when(() -> InjectionPoint.forInstanceMethodsAndFields(Provider.class)).thenReturn(injectionPointSet);
            //Act Statement(s)
            com.google.inject.Provider result = Providers.guicify(providerMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            injectionPoint.verify(() -> InjectionPoint.forInstanceMethodsAndFields(Provider.class), atLeast(1));
        }
    }
}
