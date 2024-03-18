package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Collection;

import com.google.inject.internal.Messages;
import com.google.inject.spi.Message;
import org.mockito.MockedStatic;
import com.google.common.collect.ImmutableSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ConfigurationExceptionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Iterable iterableMock = mock(Iterable.class);

    //Sapient generated method id: ${f6a777f4-2f81-3ed9-84eb-5cc8953a92d9}, hash: 8BE1F8E0ED4403456301DC8E4A7EE34D
    @Ignore()
    @Test()
    public void withPartialValueWhenThisPartialValueIsNull() {
        /* Branches:
         * (this.partialValue == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Throwable throwable = new Throwable();
            Throwable throwable2 = new Throwable();
            messages.when(() -> Messages.getOnlyCause((Collection) any())).thenReturn(throwable).thenReturn(throwable2);
            ConfigurationException target = new ConfigurationException(iterableMock);
            Object object = new Object();
            //Act Statement(s)
            ConfigurationException result = target.withPartialValue(object);
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigurationException for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${a2f9e3d2-57eb-3629-ac39-5d095de7811e}, hash: 462FCEB1F7AC74DF42E1618164D00E4E
    @Ignore()
    @Test()
    public void getErrorMessagesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwableMock = mock(Throwable.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.getOnlyCause((Collection) any())).thenReturn(throwableMock);
            ConfigurationException target = new ConfigurationException(iterableMock);
            //Act Statement(s)
            Collection<Message> result = target.getErrorMessages();
            ImmutableSet immutableSet = ImmutableSet.of();
            //Assert statement(s)
            assertThat(result, equalTo(immutableSet));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()));
        }
    }

    //Sapient generated method id: ${c4cb6157-c4f2-3e6e-a237-84b77391c86e}, hash: 6FB9F60F4DD3B4FDBA2DC58D30BB57F5
    @Ignore()
    @Test()
    public void getPartialValueTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Throwable throwable = new Throwable();
            messages.when(() -> Messages.getOnlyCause((Collection) any())).thenReturn(throwable);
            ConfigurationException target = new ConfigurationException(iterableMock);
            //Act Statement(s)
            Object result = target.getPartialValue();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()));
        }
    }

    //Sapient generated method id: ${a52bed3f-53de-303b-8128-55ffe95a8205}, hash: 9696FB801B9F974DCFCD5883D0B4D273
    @Ignore()
    @Test()
    public void getMessageTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwableMock = mock(Throwable.class, "Throwable");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.getOnlyCause((Collection) any())).thenReturn(throwableMock);
            messages.when(() -> Messages.formatMessages(eq("Guice configuration errors"), (Collection) any())).thenReturn("return_of_formatMessages1");
            ConfigurationException target = new ConfigurationException(iterableMock);
            //Act Statement(s)
            String result = target.getMessage();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_formatMessages1"));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()));
            messages.verify(() -> Messages.formatMessages(eq("Guice configuration errors"), (Collection) any()));
        }
    }
}
