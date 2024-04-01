package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class InternalProviderInstanceBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final InternalProviderInstanceBindingImpl.Factory<Object> internalProviderInstanceBindingImplFactoryMock = mock(InternalProviderInstanceBindingImpl.Factory.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Scoping scopingMock = mock(Scoping.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${d6d0c415-6ef3-3f5a-ae8c-568e8091795b}, hash: 88168268907994A99F6343C30DD913E0
    @Test()
    public void getInitializationTimingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        InternalProviderInstanceBindingImpl target = new InternalProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalProviderInstanceBindingImplFactoryMock, internalFactoryMock, scopingMock);
        //Act Statement(s)
        InternalProviderInstanceBindingImpl.InitializationTiming result = target.getInitializationTiming();
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${64ad769f-e9e5-3c08-812f-d421f34c10cd}, hash: A82349A6B1731732495E36DEDB34AA41
    @Test()
    public void initializeThrowsNullPointerException() throws ErrorsException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        InternalProviderInstanceBindingImpl target = new InternalProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalProviderInstanceBindingImplFactoryMock, internalFactoryMock, scopingMock);
        thrown.expect(NullPointerException.class);
        InjectorImpl injectorImplMock2 = mock(InjectorImpl.class);
        Errors errorsMock = mock(Errors.class);
        //Act Statement(s)
        target.initialize(injectorImplMock2, errorsMock);
    }
}
