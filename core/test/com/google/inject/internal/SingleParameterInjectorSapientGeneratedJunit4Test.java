package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.spi.Dependency;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class SingleParameterInjectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InternalFactory<Object> factoryMock = mock(InternalFactory.class, "factory");

    private final BindingImpl<Object> bindingMock = mock(BindingImpl.class);

    private final Dependency<Object> dependencyMock = mock(Dependency.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${1f6be77e-d6f3-3aba-ab3e-60c81abd554c}, hash: BF1F44AF307FB799B7D648BF49AACB70
    @Ignore()
    @Test()
    public void injectTest() throws InternalProvisionException {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(bindingMock).getSource();
        doReturn(factoryMock).when(bindingMock).getInternalFactory();
        SingleParameterInjector<Object> target = new SingleParameterInjector(dependencyMock, bindingMock);
        Object object2 = new Object();
        doReturn(object2).when(factoryMock).get(internalContextMock, dependencyMock, false);
        //Act Statement(s)
        Object result = target.inject(internalContextMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(bindingMock).getSource();
        verify(bindingMock).getInternalFactory();
        verify(factoryMock).get(internalContextMock, dependencyMock, false);
    }

    //Sapient generated method id: ${f8f5b792-168a-3ebc-aa33-0db84c3b0e4e}, hash: 31D85177C04613663937A2E4CE9DE72E
    @Ignore()
    @Test()
    public void injectWhenCaughtInternalProvisionExceptionThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (InternalProvisionException)) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(bindingMock).getSource();
        doReturn(factoryMock).when(bindingMock).getInternalFactory();
        SingleParameterInjector<Object> target = new SingleParameterInjector(dependencyMock, bindingMock);
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        doThrow(internalProvisionExceptionMock).when(factoryMock).get(internalContextMock, dependencyMock, false);
        InternalProvisionException internalProvisionExceptionMock2 = mock(InternalProvisionException.class);
        doThrow(internalProvisionExceptionMock2).when(internalProvisionExceptionMock).addSource(dependencyMock);
        thrown.expect(InternalProvisionException.class);
        //Act Statement(s)
        target.inject(internalContextMock);
        //Assert statement(s)
        verify(bindingMock).getSource();
        verify(bindingMock).getInternalFactory();
        verify(factoryMock).get(internalContextMock, dependencyMock, false);
        verify(internalProvisionExceptionMock, atLeast(1)).addSource(dependencyMock);
    }

    //Sapient generated method id: ${aa13aca2-af48-3f7f-b707-df73b5154c55}, hash: A8BB3DAFF36C93A2B1AAD0D14A98E6EF
    @Test()
    public void getAllWhenParameterInjectorsIsNull() throws InternalProvisionException {
        /* Branches:
         * (parameterInjectors == null) : true
         */
        //Arrange Statement(s)
        SingleParameterInjector[] singleParameterInjector = null;
        //Act Statement(s)
        Object[] result = SingleParameterInjector.getAll(internalContextMock, singleParameterInjector);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${e6a3a82c-0f9f-3b1b-95eb-bbfe4131a049}, hash: 137790F1D49684728928D71A6F0F63D9
    @Test()
    public void getAllWhenILessThanSize() throws InternalProvisionException {
        /* Branches:
         * (parameterInjectors == null) : false
         * (i < size) : true
         */
        //Arrange Statement(s)
        SingleParameterInjector singleParameterInjectorMock = mock(SingleParameterInjector.class);
        Object object = new Object();
        doReturn(object).when(singleParameterInjectorMock).inject(internalContextMock);
        SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{singleParameterInjectorMock};
        //Act Statement(s)
        Object[] result = SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray);
        Object[] objectResultArray = new Object[]{object};
        SingleParameterInjector<?>[] singleParameterInjectorSingleParameterInjectorArrayArray = new SingleParameterInjector[]{singleParameterInjectorMock};
        //Assert statement(s)
        assertThat(result, equalTo(objectResultArray));
        assertThat(singleParameterInjectorArray, equalTo(singleParameterInjectorSingleParameterInjectorArrayArray));
        verify(singleParameterInjectorMock).inject(internalContextMock);
    }
}
