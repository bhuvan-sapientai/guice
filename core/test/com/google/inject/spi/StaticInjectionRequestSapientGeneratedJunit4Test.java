package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.ConfigurationException;

import java.util.HashSet;

import org.mockito.MockedStatic;
import com.google.inject.Binder;

import java.util.Set;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class StaticInjectionRequestSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${4cafec08-f58b-3940-87bc-b59f7116f3c3}, hash: E3CB5169D36AF81967AB7E198694EFCA
    @Test()
    public void getInjectionPointsTest() throws ConfigurationException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class)) {
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPoint.when(() -> InjectionPoint.forStaticMethodsAndFields(Object.class)).thenReturn(injectionPointSet);
            Object object = new Object();
            StaticInjectionRequest target = new StaticInjectionRequest(object, Object.class);
            //Act Statement(s)
            Set<InjectionPoint> result = target.getInjectionPoints();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            injectionPoint.verify(() -> InjectionPoint.forStaticMethodsAndFields(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 9D7E7364FCC4A0CA1ECB5CE8209F5BD1
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
        Class[] classArray = new Class[]{Object.class};
        doNothing().when(binderMock2).requestStaticInjection(classArray);
        Object object2 = new Object();
        StaticInjectionRequest target = new StaticInjectionRequest(object2, Object.class);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).requestStaticInjection(classArray);
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 816371368AABB9F423659EC3767D067B
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        StaticInjectionRequest target = new StaticInjectionRequest(object, Object.class);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }
}
