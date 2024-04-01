package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.PrivateElements;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;

public class PrivateElementProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: 14D43E2B5E0132D41596D294FAC1F12D
    @Ignore()
    @Test()
    public void visit17Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type InjectorShell.Builder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        PrivateElementProcessor target = new PrivateElementProcessor(errorsMock);
        PrivateElements privateElementsMock = mock(PrivateElements.class);
        //Act Statement(s)
        Boolean result = target.visit(privateElementsMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }
}
