package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Collection;

import com.google.inject.spi.Message;
import com.google.common.collect.ImmutableSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProvisionExceptionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${a2f9e3d2-57eb-3629-ac39-5d095de7811e}, hash: B35063C69B9F052AA8F4E3A67D959B2F
    @Test()
    public void getErrorMessagesTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ProvisionException target = new ProvisionException("message1", throwable);

        //Act Statement(s)
        Collection<Message> result = target.getErrorMessages();
        Message message = new Message("message1", throwable);
        ImmutableSet<Message> messageSet = ImmutableSet.of(message);

        //Assert statement(s)
        assertThat(result, equalTo(messageSet));
    }

    //Sapient generated method id: ${a52bed3f-53de-303b-8128-55ffe95a8205}, hash: 996E524CF480461F7C19343D5A857DAC
    @Test()
    public void getMessageTest() {
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        ProvisionException target = new ProvisionException("message1", throwable);

        //Act Statement(s)
        String result = target.getMessage();

        //Assert statement(s)
        assertThat(result, equalTo("Unable to provision, see the following errors:\n\n1) message1\n\n1 error"));
    }
}
