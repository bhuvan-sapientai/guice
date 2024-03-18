package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.TypeLiteral;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class DeferredLookupsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    //Sapient generated method id: ${6900b201-d101-33a9-a69b-7a761e98aa93}, hash: 3BB67BDB07A7C0F11C566841FB876046
    @Test()
    public void initializeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type LookupProcessor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeferredLookups target = new DeferredLookups(injectorImplMock);
        Errors errorsMock = mock(Errors.class);
        //Act Statement(s)
        target.initialize(errorsMock);
    }

    //Sapient generated method id: ${00dff819-cb70-3ea6-9be9-223a26306dab}, hash: 811C9C6CFD79109B5703E3F0E3313B6F
    @Test()
    public void getProviderTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: lookup
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeferredLookups target = new DeferredLookups(injectorImplMock);
        Key<Object> keyMock = mock(Key.class);
        //Act Statement(s)
        Provider result = target.getProvider(keyMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Provider for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${3219d138-fa9b-3e28-9ed3-ede6bfdd8d4c}, hash: FDD20B2A32559BA743E93B3CB6395FF4
    @Test()
    public void getMembersInjectorTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: lookup
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DeferredLookups target = new DeferredLookups(injectorImplMock);
        TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);
        //Act Statement(s)
        MembersInjector result = target.getMembersInjector(typeLiteralMock);
        //Assert statement(s)
        //TODO: Please implement equals method in MembersInjector for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
