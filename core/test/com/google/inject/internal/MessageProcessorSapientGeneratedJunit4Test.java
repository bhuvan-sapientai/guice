package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.Message;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class MessageProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Errors errorsMock = mock(Errors.class, "errors");

    //Sapient generated method id: ${7a2bb94e-a121-3c86-801b-625491822e52}, hash: 2910727E48707E09B8867C508B9A0A55
    @Test()
    public void visit17WhenMessageGetCauseIsNotNull() {
        /* Branches:
         * (message.getCause() != null) : true
         */
        //Arrange Statement(s)
        Message messageMock = mock(Message.class);
        Errors errorsMock2 = mock(Errors.class);
        try (MockedStatic<MessageProcessor> messageProcessor = mockStatic(MessageProcessor.class)) {
            Throwable throwable = new Throwable();
            Throwable throwable2 = new Throwable();
            Throwable throwable3 = new Throwable();
            doReturn(throwable, throwable2, throwable3).when(messageMock).getCause();
            messageProcessor.when(() -> MessageProcessor.getRootMessage(throwable2)).thenReturn("A");
            MessageProcessor target = new MessageProcessor(errorsMock);
            doReturn(errorsMock2).when(errorsMock).addMessage(messageMock);
            //Act Statement(s)
            Boolean result = target.visit(messageMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(messageMock, times(3)).getCause();
            messageProcessor.verify(() -> MessageProcessor.getRootMessage(throwable2), atLeast(1));
            verify(errorsMock).addMessage(messageMock);
        }
    }

    //Sapient generated method id: ${4ec8e772-6567-3601-bc3f-b442b3ce6dde}, hash: 646BE4515620892B150173C4EC45810D
    @Test()
    public void getRootMessageWhenCauseIsNull() {
        /* Branches:
         * (cause == null) : true
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        //Act Statement(s)
        String result = MessageProcessor.getRootMessage(throwable);
        //Assert statement(s)
        assertThat(result, equalTo("java.lang.Throwable"));
    }

    //Sapient generated method id: ${056f9c6e-d154-3561-8e34-7b365da86a6d}, hash: 4650FFFA7A4B539A2119AC86E596357D
    @Ignore()
    @Test()
    public void getRootMessageWhenCauseIsNotNull() {
        /* Branches:
         * (cause == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        Throwable throwable2 = new Throwable("message1", throwable);
        //Act Statement(s)
        String result = MessageProcessor.getRootMessage(throwable2);
        //Assert statement(s)
        assertThat(result, equalTo("getRootMessage_throwable1"));
    }
}
