package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import com.google.common.collect.ImmutableList;
import com.google.inject.matcher.Matcher;
import com.google.inject.Binder;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class InterceptorBindingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ImmutableList interceptorsMock = mock(ImmutableList.class, "interceptors");

    private final Matcher<Class<?>> matcherMock = mock(Matcher.class);

    private final Matcher<Method> matcherMock2 = mock(Matcher.class);

    private final MethodInterceptor methodInterceptorMock = mock(MethodInterceptor.class);

    //Sapient generated method id: ${1dfa0835-cb3d-34c9-9078-ae3bbc518bce}, hash: 1A9002E98E1893E8BD7AB3DE7F5FAB6E
    @Ignore()
    @Test()
    public void getInterceptorsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        MethodInterceptor[] methodInterceptorArray = new MethodInterceptor[]{methodInterceptorMock};
        InterceptorBinding target = new InterceptorBinding(object, matcherMock, matcherMock2, methodInterceptorArray);
        //Act Statement(s)
        List<MethodInterceptor> result = target.getInterceptors();
        //Assert statement(s)
        assertThat(result, equalTo(interceptorsMock));
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 53623B527A830315CC903764BA81E433
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        MethodInterceptor[] methodInterceptorArray = new MethodInterceptor[]{methodInterceptorMock};
        InterceptorBinding target = new InterceptorBinding(object, matcherMock, matcherMock2, methodInterceptorArray);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: B432CB2F4806D7353DDD0AC06893F450
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
        MethodInterceptor[] methodInterceptorArray = new MethodInterceptor[]{};
        doNothing().when(binderMock2).bindInterceptor(matcherMock, matcherMock2, methodInterceptorArray);
        Object object2 = new Object();
        Matcher<Class<?>> matcherMock3 = mock(Matcher.class);
        Matcher<Method> matcherMock4 = mock(Matcher.class);
        MethodInterceptor[] methodInterceptorArray2 = new MethodInterceptor[]{methodInterceptorMock};
        InterceptorBinding target = new InterceptorBinding(object2, matcherMock3, matcherMock4, methodInterceptorArray2);
        doReturn(0).when(interceptorsMock).size();
        MethodInterceptor[] methodInterceptorArray3 = new MethodInterceptor[]{};
        doReturn(methodInterceptorArray).when(interceptorsMock).toArray(methodInterceptorArray3);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).bindInterceptor(matcherMock, matcherMock2, methodInterceptorArray);
        verify(interceptorsMock).size();
        verify(interceptorsMock).toArray(methodInterceptorArray3);
    }
}
