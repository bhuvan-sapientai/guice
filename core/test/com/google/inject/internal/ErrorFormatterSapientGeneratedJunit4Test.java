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

public class ErrorFormatterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${ea5f67db-3ac3-3acb-9d17-8cebd11c270e}, hash: C9DE7E1C2A18D5120723585434B9BC00
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
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);
        objectList.add(object2);
        Formatter formatter = new Formatter();
        //Act Statement(s)
        ErrorFormatter.formatSources(1, objectList, formatter);
    }

    //Sapient generated method id: ${ec9e316b-1db0-3053-857a-1985c90da5d0}, hash: 4A0A7DBA3428627DDFBFC5DB2A958399
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
        Formatter formatter = new Formatter();
        Object[] objectArray = new Object[]{};
        doReturn(formatter).when(formatterMock).format("  ", objectArray);
        Object object = new Object();
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);
        //Act Statement(s)
        ErrorFormatter.formatSources(objectList, formatterMock);
        //Assert statement(s)
        verify(formatterMock).format("  ", objectArray);
    }
}
