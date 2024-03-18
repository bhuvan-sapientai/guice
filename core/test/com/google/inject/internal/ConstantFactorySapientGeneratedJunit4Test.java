package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.Dependency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ConstantFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Initializable<Object> initializableMock = mock(Initializable.class, "initializable");

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 55A698E4A073531089DB1D558B82FB2E
    @Ignore()
    @Test()
    public void getTest() throws InternalProvisionException {
        //Arrange Statement(s)
        ConstantFactory target = new ConstantFactory(initializableMock);
        Object object = new Object();
        doReturn(object).when(initializableMock).get();
        InternalContext internalContextMock = mock(InternalContext.class);
        Dependency dependencyMock = mock(Dependency.class);
        //Act Statement(s)
        Object result = target.get(internalContextMock, dependencyMock, false);
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(initializableMock).get();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: B201E4DEA70BBEB447A2A5E9C614D744
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MoreObjects.ToStringHelper
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConstantFactory target = new ConstantFactory(initializableMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}
