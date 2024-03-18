package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import com.google.inject.spi.InterceptorBinding;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

public class InterceptorBindingProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private InterceptorBindingProcessor target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${cf8b4b08-b41d-3aa2-a6fd-d54030994148}, hash: 51F47BEA51AB0E0DAF2A22306C1C98E1
    @Test()
    public void visit17WhenInternalFlagsIsBytecodeGenEnabled() {
        /* Branches:
         * (InternalFlags.isBytecodeGenEnabled()) : true
         */
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        target = new InterceptorBindingProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        InterceptorBinding interceptorBindingMock = mock(InterceptorBinding.class);
        doNothing().when(injectorBindingDataMock).addInterceptorBinding(interceptorBindingMock);

        //Act Statement(s)
        Boolean result = target.visit(interceptorBindingMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).addInterceptorBinding(interceptorBindingMock);
    }
}
