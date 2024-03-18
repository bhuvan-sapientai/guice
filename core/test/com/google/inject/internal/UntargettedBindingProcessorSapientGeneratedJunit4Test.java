package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.Binding;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class UntargettedBindingProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: B553828088BE6A74C6D50FD852A4DE3F
    @Ignore()
    @Test()
    public void visit17Test() {
        //Arrange Statement(s)
        BindingImpl bindingMock = mock(BindingImpl.class);
        doReturn(false).when(bindingMock).acceptTargetVisitor((BindingTargetVisitor) any());
        Errors errors = new Errors();
        ProcessedBindingData processedBindingDataMock = mock(ProcessedBindingData.class);
        UntargettedBindingProcessor target = new UntargettedBindingProcessor(errors, processedBindingDataMock);
        //Act Statement(s)
        Boolean result = target.visit((Binding) bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(bindingMock).acceptTargetVisitor((BindingTargetVisitor) any());
    }
}
