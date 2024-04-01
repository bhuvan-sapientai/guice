package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import com.google.inject.spi.TypeListenerBinding;
import com.google.inject.spi.ProvisionListenerBinding;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

public class ListenerBindingProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ListenerBindingProcessor target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: 2D63A0A9413A8CB2AFF3EF3B23C933F1
    @Test()
    public void visit17Test() {
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        target = new ListenerBindingProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        TypeListenerBinding typeListenerBindingMock = mock(TypeListenerBinding.class);
        doNothing().when(injectorBindingDataMock).addTypeListener(typeListenerBindingMock);

        //Act Statement(s)
        Boolean result = target.visit(typeListenerBindingMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).addTypeListener(typeListenerBindingMock);
    }

    //Sapient generated method id: ${adb40cd6-6aac-3dd9-a66d-f45be774d602}, hash: 76FA77AD37C1D93B859250CE3D11EB74
    @Test()
    public void visit18Test() {
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        target = new ListenerBindingProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        ProvisionListenerBinding provisionListenerBindingMock = mock(ProvisionListenerBinding.class);
        doNothing().when(injectorBindingDataMock).addProvisionListener(provisionListenerBindingMock);

        //Act Statement(s)
        Boolean result = target.visit(provisionListenerBindingMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).addProvisionListener(provisionListenerBindingMock);
    }
}
