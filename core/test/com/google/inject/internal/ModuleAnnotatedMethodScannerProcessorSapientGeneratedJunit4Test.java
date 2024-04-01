package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import com.google.inject.spi.ModuleAnnotatedMethodScannerBinding;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

public class ModuleAnnotatedMethodScannerProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ModuleAnnotatedMethodScannerProcessor target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: D6663745049B70DE2DB3EEEC9918F89E
    @Test()
    public void visit17Test() {
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        target = new ModuleAnnotatedMethodScannerProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        ModuleAnnotatedMethodScannerBinding moduleAnnotatedMethodScannerBindingMock = mock(ModuleAnnotatedMethodScannerBinding.class);
        doNothing().when(injectorBindingDataMock).addScanner(moduleAnnotatedMethodScannerBindingMock);

        //Act Statement(s)
        Boolean result = target.visit(moduleAnnotatedMethodScannerBindingMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).addScanner(moduleAnnotatedMethodScannerBindingMock);
    }
}
