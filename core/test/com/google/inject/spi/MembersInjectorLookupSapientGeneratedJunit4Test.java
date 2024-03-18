package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.ConfigurationException;
import com.google.inject.TypeLiteral;

import java.util.Set;
import java.util.HashSet;

import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.MembersInjector;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MembersInjectorLookupSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: D57BD5EF56A59D92FCF2709273BCF14B
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        MembersInjectorLookup<Object> target = new MembersInjectorLookup(object, typeLiteral);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${a95841c5-3cf7-323e-a315-a7d63e44019c}, hash: 984AA6ABEEA71176E8085AD78B38AEE6
    @Test()
    public void initializeDelegateWhenThisDelegateIsNull() {
        /* Branches:
         * (this.delegate == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        MembersInjectorLookup<Object> target = new MembersInjectorLookup(object, typeLiteral);
        MembersInjector<Object> membersInjectorMock = mock(MembersInjector.class);
        //Act Statement(s)
        target.initializeDelegate(membersInjectorMock);
        //Assert statement(s)
        assertThat(target.getDelegate(), is(notNullValue()));
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 9979CCF28529C8302DE6B02AFF409EFC
    @Ignore()
    @Test()
    public void applyToTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        Object object = new Object();
        doReturn(binderMock2).when(binderMock).withSource(object);
        MembersInjector membersInjectorMock = mock(MembersInjector.class);
        doReturn(membersInjectorMock).when(binderMock2).getMembersInjector(typeLiteralMock);
        Object object2 = new Object();
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        MembersInjectorLookup<Object> target = spy(new MembersInjectorLookup(object2, typeLiteral));
        doNothing().when(target).initializeDelegate(membersInjectorMock);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).getMembersInjector(typeLiteralMock);
        verify(target).initializeDelegate(membersInjectorMock);
    }

    //Sapient generated method id: ${4cafec08-f58b-3940-87bc-b59f7116f3c3}, hash: 909EAE33F23F21CD604B5F8B4F51397A
    @Ignore()
    @Test()
    public void getInjectionPointsTest() throws ConfigurationException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class)) {
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPoint.when(() -> InjectionPoint.forInstanceMethodsAndFields(typeLiteralMock)).thenReturn(injectionPointSet);
            Object object = new Object();
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            MembersInjectorLookup<Object> target = new MembersInjectorLookup(object, typeLiteral);
            //Act Statement(s)
            Set<InjectionPoint> result = target.getInjectionPoints();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            injectionPoint.verify(() -> InjectionPoint.forInstanceMethodsAndFields(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3219d138-fa9b-3e28-9ed3-ede6bfdd8d4c}, hash: 2C68EA4C79D4315AA21E5203A1009DD2
    @Test()
    public void getMembersInjectorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        MembersInjectorLookup<Object> target = new MembersInjectorLookup(object, typeLiteral);
        //Act Statement(s)
        MembersInjector result = target.getMembersInjector();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
