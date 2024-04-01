package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.internal.ErrorId;
import com.google.inject.internal.Messages;
import com.google.inject.spi.Message;
import com.google.inject.spi.ErrorDetail;
import com.google.inject.internal.GuiceInternal;

import java.util.Collection;

import org.mockito.MockedStatic;
import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class CreationExceptionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ImmutableSet messagesMock = mock(ImmutableSet.class, "messages");

    private final ErrorDetail errorDetailMock = mock(ErrorDetail.class);

    private final ErrorDetail errorDetailMock2 = mock(ErrorDetail.class);

    private final GuiceInternal guiceInternalMock = mock(GuiceInternal.class);

    private final GuiceInternal guiceInternalMock2 = mock(GuiceInternal.class);

    //Sapient generated method id: ${a2f9e3d2-57eb-3629-ac39-5d095de7811e}, hash: 2456FFEA4E39C6FBE85CCFA0241DD0A1
    @Ignore()
    @Test()
    public void getErrorMessagesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Throwable throwable = new Throwable();
            messages.when(() -> Messages.getOnlyCause(messagesMock)).thenReturn(throwable);
            Message message = new Message(guiceInternalMock, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock);
            Message message2 = new Message(guiceInternalMock2, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock2);
            Collection<Message> collection = new ArrayList<>();
            collection.add(message);
            collection.add(message2);
            CreationException target = new CreationException(collection);
            doReturn(false).when(messagesMock).isEmpty();
            //Act Statement(s)
            Collection<Message> result = target.getErrorMessages();
            //Assert statement(s)
            assertThat(result, equalTo(messagesMock));
            messages.verify(() -> Messages.getOnlyCause(messagesMock), atLeast(1));
            verify(messagesMock, atLeast(1)).isEmpty();
        }
    }

    //Sapient generated method id: ${a52bed3f-53de-303b-8128-55ffe95a8205}, hash: 51561983DDC7B44E93F520A3760BC437
    @Ignore()
    @Test()
    public void getMessageTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Throwable throwable = new Throwable();
            messages.when(() -> Messages.getOnlyCause(messagesMock)).thenReturn(throwable);
            messages.when(() -> Messages.formatMessages("Unable to create injector, see the following errors", messagesMock)).thenReturn("return_of_formatMessages1");
            Message message = new Message(guiceInternalMock, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock);
            Message message2 = new Message(guiceInternalMock2, ErrorId.AMBIGUOUS_TYPE_CONVERSION, errorDetailMock2);
            Collection<Message> collection = new ArrayList<>();
            collection.add(message);
            collection.add(message2);
            CreationException target = new CreationException(collection);
            doReturn(false).when(messagesMock).isEmpty();
            //Act Statement(s)
            String result = target.getMessage();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_formatMessages1"));
            messages.verify(() -> Messages.getOnlyCause(messagesMock), atLeast(1));
            messages.verify(() -> Messages.formatMessages("Unable to create injector, see the following errors", messagesMock), atLeast(1));
            verify(messagesMock).isEmpty();
        }
    }
}
