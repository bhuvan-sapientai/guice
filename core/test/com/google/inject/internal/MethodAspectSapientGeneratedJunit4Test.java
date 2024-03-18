package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import com.google.inject.spi.InterceptorBinding;
import com.google.inject.matcher.Matcher;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MethodAspectSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Matcher<Class<?>> classMatcherMock = mock(Matcher.class, "classMatcher");

    private final Matcher<Method> methodMatcherMock = mock(Matcher.class, "methodMatcher");

    private final Matcher<Class<?>> matcherMock = mock(Matcher.class);

    private final Matcher<Method> matcherMock2 = mock(Matcher.class);

    private final MethodInterceptor methodInterceptorMock = mock(MethodInterceptor.class);

    //Sapient generated method id: ${3238e195-6847-32d6-9cec-0373d5d532f7}, hash: 6FFF8B4357FF0B7BD83856868BF573AB
    @Test()
    public void fromBindingTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InterceptorBinding bindingMock = mock(InterceptorBinding.class);
        doReturn(matcherMock).when(bindingMock).getClassMatcher();
        doReturn(matcherMock2).when(bindingMock).getMethodMatcher();
        List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
        doReturn(methodInterceptorList).when(bindingMock).getInterceptors();
        //Act Statement(s)
        MethodAspect result = MethodAspect.fromBinding(bindingMock);
        //Assert statement(s)
        //TODO: Please implement equals method in MethodAspect for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(bindingMock).getClassMatcher();
        verify(bindingMock).getMethodMatcher();
        verify(bindingMock).getInterceptors();
    }

    //Sapient generated method id: ${3c84ef95-107d-3afa-bc3b-457f5660da54}, hash: 6E05171C765ECC695F1A46053430B704
    @Ignore()
    @Test()
    public void matchesWhenClassMatcherMatchesClazz() {
        /* Branches:
         * (classMatcher.matches(clazz)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Matcher<Method> matcherMock2 = mock(Matcher.class, "toUpperCase");
        MethodInterceptor methodInterceptorMock = mock(MethodInterceptor.class, "DEBUG");
        MethodInterceptor methodInterceptorMock2 = mock(MethodInterceptor.class, "myCache");
        List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
        methodInterceptorList.add(methodInterceptorMock);
        methodInterceptorList.add(methodInterceptorMock2);
        MethodAspect target = new MethodAspect(matcherMock, matcherMock2, methodInterceptorList);
        doReturn(true).when(classMatcherMock).matches(String.class);
        //Act Statement(s)
        boolean result = target.matches(String.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(classMatcherMock).matches(String.class);
    }

    //Sapient generated method id: ${76575752-c2d9-3c20-b2d5-a5f77056ae94}, hash: 937D2DA178913AFE0385D5C002DE0441
    @Ignore()
    @Test()
    public void matchesWhenClassMatcherNotMatchesClazz() {
        /* Branches:
         * (classMatcher.matches(clazz)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
        methodInterceptorList.add(methodInterceptorMock);
        MethodAspect target = new MethodAspect(matcherMock, matcherMock2, methodInterceptorList);
        doReturn(false).when(classMatcherMock).matches(Object.class);
        //Act Statement(s)
        boolean result = target.matches(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(classMatcherMock).matches(Object.class);
    }

    //Sapient generated method id: ${3b5b03f8-5a44-3ea7-af28-d92c38752223}, hash: C9775D8B18A11B277455B73B6B58A274
    @Ignore()
    @Test()
    public void matches1WhenMethodMatcherMatchesMethod() {
        /* Branches:
         * (methodMatcher.matches(method)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
        methodInterceptorList.add(methodInterceptorMock);
        MethodAspect target = new MethodAspect(matcherMock, matcherMock2, methodInterceptorList);
        Method methodMock = mock(Method.class);
        doReturn(true).when(methodMatcherMock).matches(methodMock);
        //Act Statement(s)
        boolean result = target.matches(methodMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(methodMatcherMock).matches(methodMock);
    }

    //Sapient generated method id: ${c89b7c70-b21e-38be-8ec2-752de7ac6b8f}, hash: D734B9848AE9363943806CB60BF9437B
    @Ignore()
    @Test()
    public void matches1WhenMethodMatcherNotMatchesMethod() {
        /* Branches:
         * (methodMatcher.matches(method)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Matcher<Class<?>> matcherMock = mock(Matcher.class, "true");
        Matcher<Method> matcherMock2 = mock(Matcher.class, "false");
        MethodInterceptor methodInterceptorMock = mock(MethodInterceptor.class, "interceptor1");
        MethodInterceptor methodInterceptorMock2 = mock(MethodInterceptor.class, "interceptor2");
        List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
        methodInterceptorList.add(methodInterceptorMock);
        methodInterceptorList.add(methodInterceptorMock2);
        MethodAspect target = new MethodAspect(matcherMock, matcherMock2, methodInterceptorList);
        Method methodMock = mock(Method.class, "someMethod");
        doReturn(false).when(methodMatcherMock).matches(methodMock);
        //Act Statement(s)
        boolean result = target.matches(methodMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(methodMatcherMock).matches(methodMock);
    }

    //Sapient generated method id: ${6ffb8980-063d-3f75-9704-8dba1eced1b8}, hash: E58050C9186DAD38D4159EAB4DBB6924
    @Ignore()
    @Test()
    public void interceptorsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
        methodInterceptorList.add(methodInterceptorMock);
        MethodAspect target = new MethodAspect(matcherMock, matcherMock2, methodInterceptorList);
        //Act Statement(s)
        List<MethodInterceptor> result = target.interceptors();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }
}
