package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.MockitoAnnotations;
import com.google.inject.spi.Dependency;
import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class FactoryProxySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private final InternalFactory<Object> targetFactoryMock = mock(InternalFactory.class, "targetFactory");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private FactoryProxy target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${24131180-1b52-321d-8d94-bbb2fdf08388}, hash: 722DFF8432580F6065AF301AB668FC57
    @Test()
    public void notifyTest() throws ErrorsException {
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        Errors errorsMock2 = mock(Errors.class);
        Object object = new Object();
        doReturn(errorsMock2).when(errorsMock).withSource(object);
        Key<Object> keyMock = mock(Key.class);
        Key<Object> keyMock2 = mock(Key.class);
        target = new FactoryProxy(injectorMock, keyMock, keyMock2, object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);
        doReturn(internalFactoryMock).when(injectorMock).getInternalFactory(keyMock2, errorsMock2, InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT);
        //Act Statement(s)
        target.notify(errorsMock);
        //Assert statement(s)
        verify(errorsMock).withSource(object);
        verify(injectorMock).getInternalFactory(keyMock2, errorsMock2, InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT);
    }

    //Sapient generated method id: ${1fbd76da-f6c0-36a0-80b0-fd764cfa79dc}, hash: AD1D218ABB1BBD77314EF9AB143FA354
    @Test()
    public void notifyWhenCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (catch-exception (ErrorsException)) : true
         */
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        Errors errorsMock2 = mock(Errors.class);
        Object object = new Object();
        doReturn(errorsMock2).when(errorsMock).withSource(object);
        Errors errorsMock3 = mock(Errors.class);
        Errors errorsMock4 = mock(Errors.class);
        doReturn(errorsMock3).when(errorsMock).merge(errorsMock4);
        Key<Object> keyMock = mock(Key.class);
        Key<Object> keyMock2 = mock(Key.class);
        target = new FactoryProxy(injectorMock, keyMock, keyMock2, object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ErrorsException errorsException = new ErrorsException(errorsMock4);
        doThrow(errorsException).when(injectorMock).getInternalFactory(keyMock2, errorsMock2, InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT);
        //Act Statement(s)
        target.notify(errorsMock);
        //Assert statement(s)
        verify(errorsMock).withSource(object);
        verify(errorsMock).merge(errorsMock4);
        verify(injectorMock).getInternalFactory(keyMock2, errorsMock2, InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT);
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: F4641C205B3F7F1D49669F00D2BD1C5F
    @Ignore()
    @Test()
    public void getTest() throws InternalProvisionException {
        //Arrange Statement(s)
        Key<Object> keyMock = mock(Key.class);
        Key<Object> keyMock2 = mock(Key.class);
        Object object = new Object();
        target = new FactoryProxy(injectorMock, keyMock, keyMock2, object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object2 = new Object();
        InternalContext internalContextMock = mock(InternalContext.class);
        Dependency dependencyMock = mock(Dependency.class);
        doReturn(object2).when(targetFactoryMock).get(internalContextMock, dependencyMock, true);
        //Act Statement(s)
        Object result = target.get(internalContextMock, dependencyMock, false);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(targetFactoryMock).get(internalContextMock, dependencyMock, true);
    }

    //Sapient generated method id: ${06fe1158-3151-3d47-aefa-3b130b69f394}, hash: 9478A6C950EBA41ACB93999EBEAB6ECF
    @Ignore()
    @Test()
    public void getWhenCaughtInternalProvisionExceptionThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (InternalProvisionException)) : true
         */
        //Arrange Statement(s)
        Key<Object> keyMock = mock(Key.class);
        Key<Object> keyMock2 = mock(Key.class);
        Object object = new Object();
        target = new FactoryProxy(injectorMock, keyMock, keyMock2, object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        InternalContext internalContextMock = mock(InternalContext.class);
        Dependency dependencyMock = mock(Dependency.class);
        doThrow(internalProvisionExceptionMock).when(targetFactoryMock).get(internalContextMock, dependencyMock, true);
        InternalProvisionException internalProvisionExceptionMock2 = mock(InternalProvisionException.class);
        doThrow(internalProvisionExceptionMock2).when(internalProvisionExceptionMock).addSource(keyMock2);
        thrown.expect(InternalProvisionException.class);
        //Act Statement(s)
        target.get(internalContextMock, dependencyMock, false);
        //Assert statement(s)
        verify(targetFactoryMock).get(internalContextMock, dependencyMock, true);
        verify(internalProvisionExceptionMock, atLeast(1)).addSource(keyMock2);
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 282AAAF91132708A54F56A4BE939C275
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
        Key<Object> keyMock = mock(Key.class);
        Key<Object> keyMock2 = mock(Key.class);
        Object object = new Object();
        target = new FactoryProxy(injectorMock, keyMock, keyMock2, object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}
