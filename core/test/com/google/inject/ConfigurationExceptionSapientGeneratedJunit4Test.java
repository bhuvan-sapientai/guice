package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.internal.ErrorId;
import com.google.inject.spi.Message;
import com.google.inject.internal.Messages;
import com.google.inject.spi.ErrorDetail;
import com.google.inject.internal.GuiceInternal;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

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

    private final ErrorDetail errorDetailMock = mock(ErrorDetail.class);

    private final ErrorDetail errorDetailMock2 = mock(ErrorDetail.class);

    private final GuiceInternal guiceInternalMock = mock(GuiceInternal.class);

    private final GuiceInternal guiceInternalMock2 = mock(GuiceInternal.class);

    //Sapient generated method id: ${f6a777f4-2f81-3ed9-84eb-5cc8953a92d9}, hash: D888A2ADF72225B11B740BC03F01D1F8
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
            Iterable<Message> iterable = new ArrayList<>();
            ConfigurationException target = new ConfigurationException(iterable);
            Object object = new Object();
            //Act Statement(s)
            ConfigurationException result = target.withPartialValue(object);
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigurationException for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()), atLeast(2));
        }
    }

    //Sapient generated method id: ${a2f9e3d2-57eb-3629-ac39-5d095de7811e}, hash: 014D032DC61C1E4421111ADE8880449D
    @Ignore()
    @Test()
    public void getErrorMessagesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GuiceInternal guiceInternalMock3 = mock(GuiceInternal.class);
        ErrorDetail errorDetailMock3 = mock(ErrorDetail.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Throwable throwable = new Throwable();
            messages.when(() -> Messages.getOnlyCause((Collection) any())).thenReturn(throwable);
            Message message = new Message(guiceInternalMock, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock);
            Message message2 = new Message(guiceInternalMock2, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock2);
            Message message3 = new Message(guiceInternalMock3, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock3);
            Iterable<Message> iterable = new ArrayList<>(List.of(message, message2, message3));
            ConfigurationException target = new ConfigurationException(iterable);
            //Act Statement(s)
            Collection<Message> result = target.getErrorMessages();
            ImmutableSet immutableSet = ImmutableSet.of();
            //Assert statement(s)
            assertThat(result, equalTo(immutableSet));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()));
        }
    }

    //Sapient generated method id: ${c4cb6157-c4f2-3e6e-a237-84b77391c86e}, hash: E48ACD9E51B9A13B108570CAAA4716CF
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
            Message message = new Message(guiceInternalMock, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock);
            Message message2 = new Message(guiceInternalMock2, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock2);
            Iterable<Message> iterable = new ArrayList<>(List.of(message, message2));
            ConfigurationException target = new ConfigurationException(iterable);
            //Act Statement(s)
            Object result = target.getPartialValue();
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()));
        }
    }

    //Sapient generated method id: ${a52bed3f-53de-303b-8128-55ffe95a8205}, hash: 2BA70C246C215A0596B11DA140EEF363
    @Test()
    public void getMessageTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Throwable throwable = new Throwable();
            messages.when(() -> Messages.getOnlyCause((Collection) any())).thenReturn(throwable);
            messages.when(() -> Messages.formatMessages(eq("Guice configuration errors"), (Collection) any())).thenReturn("return_of_formatMessages1");
            Message message = new Message(guiceInternalMock, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock);
            Iterable<Message> iterable = new ArrayList<>(List.of(message));
            ConfigurationException target = new ConfigurationException(iterable);
            //Act Statement(s)
            String result = target.getMessage();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_formatMessages1"));
            messages.verify(() -> Messages.getOnlyCause((Collection) any()));
            messages.verify(() -> Messages.formatMessages(eq("Guice configuration errors"), (Collection) any()));
        }
    }
}
