package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ConstructorInjectorStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectionPoint injectionPointMock = mock(InjectionPoint.class);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    //Sapient generated method id: ${9ca94860-cb5d-35f1-b8f7-ec071eda7b97}, hash: 3346A94A75933609670ADCCD4AF47E4B
    @Ignore()
    @Test()
    public void isLoadingWhenCacheIsLoadingIp() {
        /* Branches:
         * (cache.isLoading(ip)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConstructorInjectorStore target = new ConstructorInjectorStore(injectorImplMock);
        //Act Statement(s)
        boolean result = target.isLoading(injectionPointMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${07406e90-65c4-3a1d-917b-6a6b045d4d2e}, hash: 55AF547D3E4DFC7A1595AABB6C965F2C
    @Test()
    public void isLoadingWhenCacheNotIsLoadingIp() {
        /* Branches:
         * (cache.isLoading(ip)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConstructorInjectorStore target = new ConstructorInjectorStore(injectorImplMock);
        //Act Statement(s)
        boolean result = target.isLoading(injectionPointMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: E14745DBA2C0880D48183FECA7EF1BBC
    @Ignore()
    @Test()
    public void getTest() throws ErrorsException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConstructorInjectorStore target = new ConstructorInjectorStore(injectorImplMock);
        Errors errorsMock = mock(Errors.class);
        //Act Statement(s)
        ConstructorInjector<?> result = target.get(injectionPointMock, errorsMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5a679105-c4bb-350a-b405-4b8028aac823}, hash: 453DCBBC2672F2DC8595A0942C9BFCC1
    @Ignore()
    @Test()
    public void removeWhenCacheRemoveIp() {
        /* Branches:
         * (cache.remove(ip)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConstructorInjectorStore target = new ConstructorInjectorStore(injectorImplMock);
        //Act Statement(s)
        boolean result = target.remove(injectionPointMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${61a69fac-848e-37bc-bb7e-cf249a8b5033}, hash: DDBE99A723AD7010FDB3828C888E2AA5
    @Test()
    public void removeWhenCacheNotRemoveIp() {
        /* Branches:
         * (cache.remove(ip)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConstructorInjectorStore target = new ConstructorInjectorStore(injectorImplMock);
        //Act Statement(s)
        boolean result = target.remove(injectionPointMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}
