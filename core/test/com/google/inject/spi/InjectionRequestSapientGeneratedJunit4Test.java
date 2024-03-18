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

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class InjectionRequestSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${4cafec08-f58b-3940-87bc-b59f7116f3c3}, hash: 62909DC3EC1D901FFF5D18E4DCCE11F2
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
            Object object2 = new Object();
            InjectionRequest<Object> target = new InjectionRequest(object, typeLiteral, object2);
            //Act Statement(s)
            Set<InjectionPoint> result = target.getInjectionPoints();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            injectionPoint.verify(() -> InjectionPoint.forInstanceMethodsAndFields(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 32AB13DFD397FF287831ACD2C413AC13
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
        Object object2 = new Object();
        InjectionRequest<Object> target = new InjectionRequest(object, typeLiteral, object2);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        Object object3 = new Object();
        doReturn(object3).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object3));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 7EEC5C911BEE97AE17FF56FF5373F666
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
        Object object2 = new Object();
        doNothing().when(binderMock2).requestInjection(typeLiteralMock, object2);
        Object object3 = new Object();
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        InjectionRequest<Object> target = new InjectionRequest(object3, typeLiteral, object2);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).requestInjection(typeLiteralMock, object2);
    }
}
