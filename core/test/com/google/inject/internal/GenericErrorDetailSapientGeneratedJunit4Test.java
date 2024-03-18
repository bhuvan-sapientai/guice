package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.Formatter;
import java.util.ArrayList;

import com.google.inject.spi.ErrorDetail;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class GenericErrorDetailSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${c423bf5c-736d-3b3e-8414-4fa00b9d2aff}, hash: 0D748B2A3DC2FE6CCEA5545A913DF5F2
    @Test()
    public void formatDetailWhenListsReverseDependenciesIsNotEmpty() {
        /* Branches:
         * (for-each(Lists.reverse(dependencies))) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type SourceFormatter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        GenericErrorDetail target = spy(new GenericErrorDetail(ErrorId.AMBIGUOUS_TYPE_CONVERSION, "<insert value>", objectList, throwable));
        List<Object> objectList2 = new ArrayList<>();
        doReturn(objectList2).when(target).getSources();
        List<ErrorDetail<?>> anyList = new ArrayList<>();
        Formatter formatter = new Formatter();
        //Act Statement(s)
        target.formatDetail(anyList, formatter);
        //Assert statement(s)
        verify(target).getSources();
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: 2CF8DE75FC985538BB19AE225CE6902B
    @Ignore()
    @Test()
    public void withSources1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);
        Throwable throwable = new Throwable();
        GenericErrorDetail target = spy(new GenericErrorDetail(ErrorId.AMBIGUOUS_TYPE_CONVERSION, "message1", objectList, throwable));
        Throwable throwable2 = new Throwable();
        doReturn(throwable2).when(target).getCause();
        Object object2 = new Object();
        Object object3 = new Object();
        List<Object> objectList2 = new ArrayList<>();
        objectList2.add(object2);
        objectList2.add(object3);
        //Act Statement(s)
        GenericErrorDetail result = target.withSources(objectList2);
        GenericErrorDetail genericErrorDetail = new GenericErrorDetail(ErrorId.AMBIGUOUS_TYPE_CONVERSION, "A", objectList2, throwable2);
        //Assert statement(s)
        assertThat(result, equalTo(genericErrorDetail));
        verify(target).getCause();
    }
}
