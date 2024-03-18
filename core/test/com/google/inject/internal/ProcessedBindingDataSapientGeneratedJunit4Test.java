package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ProcessedBindingDataSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Runnable runnableMock = mock(Runnable.class);

    //Sapient generated method id: ${a5e96818-e4b9-3a95-8f3c-f2b254640497}, hash: C1861BED59CBFE0203EE915617FC161A
    @Test()
    public void addCreationListenerTest() {
        //Arrange Statement(s)
        ProcessedBindingData target = new ProcessedBindingData();
        CreationListener creationListenerMock = mock(CreationListener.class);

        //Act Statement(s)
        target.addCreationListener(creationListenerMock);
    }

    //Sapient generated method id: ${6393dc4e-1411-3386-a5f3-e59fdec0d358}, hash: 4724ABA3FBFF427EF814FEB1779CDE22
    @Test()
    public void addUninitializedBindingTest() {
        //Arrange Statement(s)
        ProcessedBindingData target = new ProcessedBindingData();

        //Act Statement(s)
        target.addUninitializedBinding(runnableMock);
    }

    //Sapient generated method id: ${49cec457-8b0f-3acc-a874-48a54b7f29b3}, hash: 2DBE8F7F9DB21A2AF8242A50722BE79F
    @Test()
    public void addDelayedUninitializedBindingTest() {
        //Arrange Statement(s)
        ProcessedBindingData target = new ProcessedBindingData();

        //Act Statement(s)
        target.addDelayedUninitializedBinding(runnableMock);
    }

    //Sapient generated method id: ${ec2b1d9b-26c3-333f-823b-92098f945844}, hash: CF60081E1B77019EE580BEB8EB1BEABE
    @Test()
    public void initializeBindingsWhenUninitializedBindingsIsEmpty() {
        /* Branches:
         * (for-each(uninitializedBindings)) : false
         */
        //Arrange Statement(s)
        ProcessedBindingData target = new ProcessedBindingData();

        //Act Statement(s)
        target.initializeBindings();
    }

    //Sapient generated method id: ${65813c4f-9bba-304f-916c-1a89c8d58816}, hash: 8CC7405339074124140C6BAC47F110D6
    @Test()
    public void runCreationListenersWhenCreationListenersIsEmpty() {
        /* Branches:
         * (for-each(creationListeners)) : false
         */
        //Arrange Statement(s)
        ProcessedBindingData target = new ProcessedBindingData();
        Errors errorsMock = mock(Errors.class);

        //Act Statement(s)
        target.runCreationListeners(errorsMock);
    }

    //Sapient generated method id: ${8ceffd86-587a-30fe-8c77-62a3bb804576}, hash: C2751867145D38464EB73A4449BB8DCF
    @Test()
    public void initializeDelayedBindingsWhenDelayedUninitializedBindingsIsEmpty() {
        /* Branches:
         * (for-each(delayedUninitializedBindings)) : false
         */
        //Arrange Statement(s)
        ProcessedBindingData target = new ProcessedBindingData();

        //Act Statement(s)
        target.initializeDelayedBindings();
    }
}
