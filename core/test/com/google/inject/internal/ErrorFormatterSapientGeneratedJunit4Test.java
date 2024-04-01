package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.Formatter;
import java.util.ArrayList;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ErrorFormatterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${ea5f67db-3ac3-3acb-9d17-8cebd11c270e}, hash: F5B1E2CC4DA2F56AEED6FCFF572829BA
    @Test()
    public void formatSourcesWhenIEquals0() {
        /* Branches:
         * (i < sources.size()) : true
         * (i == 0) : true
         * (i == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type SourceFormatter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);
        objectList.add(object2);
        objectList.add(object3);
        Formatter formatter = new Formatter();
        //Act Statement(s)
        ErrorFormatter.formatSources(0, objectList, formatter);
    }

    //Sapient generated method id: ${ec9e316b-1db0-3053-857a-1985c90da5d0}, hash: D1C57F86B0F1E9A5809FA4526A5AB324
    @Ignore()
    @Test()
    public void formatSources1WhenIEquals0() {
        /* Branches:
         * (i < sources.size()) : true
         * (i == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type SourceFormatter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Formatter formatterMock = mock(Formatter.class);
        Object[] objectArray = new Object[]{};
        Formatter formatter = formatterMock.format("  ", objectArray);
        doReturn(formatter).when(formatterMock).format("  ", objectArray);
        Object[] objectArray2 = new Object[]{};
        Formatter formatter2 = formatterMock.format("  ", objectArray2);
        doReturn(formatter2).when(formatterMock).format("  ", objectArray2);
        Object[] objectArray3 = new Object[]{};
        Formatter formatter3 = formatterMock.format("  ", objectArray3);
        doReturn(formatter3).when(formatterMock).format("  ", objectArray3);
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);
        objectList.add(object2);
        objectList.add(object3);
        //Act Statement(s)
        ErrorFormatter.formatSources(objectList, formatterMock);
        //Assert statement(s)
        verify(formatterMock).format("  ", objectArray);
        verify(formatterMock).format("  ", objectArray2);
        verify(formatterMock).format("  ", objectArray3);
    }
}
