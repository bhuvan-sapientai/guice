package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;
import com.google.common.collect.ImmutableList;
import com.google.inject.spi.ErrorDetail;

import java.util.Formatter;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import com.google.inject.Key;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ChildBindingAlreadySetErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ErrorDetail errorMock = mock(ErrorDetail.class);

    private final Key keyMock = mock(Key.class);

    private final Object objectMock = mock(Object.class, "<init>_object1");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${fa1e1515-ae7a-3905-bb90-8985f1efc8e6}, hash: 9E7FD91F5EC225A192A56F9D3DC601A1
    @Test()
    public void isMergeableWhenOtherErrorInstanceOfChildBindingAlreadySetErrorThrowsNullPointerException() {
        /* Branches:
         * (otherError instanceof ChildBindingAlreadySetError) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ChildBindingAlreadySetError childBindingAlreadySetErrorMock = mock(ChildBindingAlreadySetError.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            Iterable<Object> iterable = new ArrayList<>();
            List<Object> objectList = new ArrayList<>();
            ChildBindingAlreadySetError target = new ChildBindingAlreadySetError(keyMock, iterable, objectList);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.isMergeable(childBindingAlreadySetErrorMock);
            //Assert statement(s)
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a8a11457-1903-3236-8982-e3b07ff27909}, hash: 509CB9D3B8A25EC447299CC27063DD7C
    @Test()
    public void isMergeableWhenOtherErrorNotInstanceOfChildBindingAlreadySetError() {
        /* Branches:
         * (otherError instanceof ChildBindingAlreadySetError) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ErrorDetail errorDetailMock = mock(ErrorDetail.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            Iterable<Object> iterable = new ArrayList<>();
            List<Object> objectList = new ArrayList<>();
            ChildBindingAlreadySetError target = new ChildBindingAlreadySetError(keyMock, iterable, objectList);
            //Act Statement(s)
            boolean result = target.isMergeable(errorDetailMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b35c4a31-739c-3029-acfb-d0830375107e}, hash: 0DEBAFF60A52B1CD7DA8679C32E860E2
    @Ignore()
    @Test()
    public void formatDetailWhenFilteredSourcesNotIsEmptyAndILessThanSourcesListSize() {
        /* Branches:
         * (for-each(existingSources)) : true
         * (source.equals("")) : true
         * (!list.isEmpty()) : true  #  inside lambda$formatDetail$2 method
         * (!filteredSources.isEmpty()) : true
         * (i < sourcesList.size()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            ImmutableList<Object> objectList = ImmutableList.of();
            doReturn(objectList).when(errorMock).getSources();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), (List) any(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<Object> iterable = new ArrayList<>();
            List<Object> objectList2 = new ArrayList<>();
            ChildBindingAlreadySetError target = new ChildBindingAlreadySetError(keyMock, iterable, objectList2);
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            anyList.add(errorMock);
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            verify(errorMock, atLeast(1)).getSources();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), (List) any(), eq(formatter)), atLeast(1));
        }
    }

    //Sapient generated method id: ${9c923d92-c484-3923-9e4c-4d557b2e7a3e}, hash: 493BDFBBE5A6C6F532F57ABD41E296DF
    @Ignore()
    @Test()
    public void formatDetailWhenListIsEmptyAndFilteredSourcesNotIsEmptyAndILessThanSourcesListSize() {
        /* Branches:
         * (for-each(existingSources)) : true
         * (source.equals("")) : false
         * (!list.isEmpty()) : false  #  inside lambda$formatDetail$2 method
         * (!filteredSources.isEmpty()) : true
         * (i < sourcesList.size()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type SourceFormatter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            ImmutableList<Object> objectList = ImmutableList.of();
            doReturn(objectList).when(errorMock).getSources();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), (List) any(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            Iterable<Object> iterable = new ArrayList<>();
            List<Object> objectList2 = new ArrayList<>();
            ChildBindingAlreadySetError target = new ChildBindingAlreadySetError(keyMock, iterable, objectList2);
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            anyList.add(errorMock);
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            verify(errorMock, atLeast(1)).getSources();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), (List) any(), eq(formatter)), atLeast(1));
        }
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: FFC0304619B3FFB48F2F95D7D4455381
    @Test()
    public void withSources1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock2 = mock(Object.class, "<init>_object3");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock).thenReturn(objectMock2);
            Iterable<Object> iterable = new ArrayList<>();
            List<Object> objectList = new ArrayList<>();
            ChildBindingAlreadySetError target = new ChildBindingAlreadySetError(keyMock, iterable, objectList);
            List<Object> objectList2 = new ArrayList<>();
            //Act Statement(s)
            ChildBindingAlreadySetError result = target.withSources(objectList2);
            ImmutableList<Object> objectList3 = ImmutableList.of();
            ChildBindingAlreadySetError childBindingAlreadySetError = new ChildBindingAlreadySetError(keyMock, objectList3, objectList2);
            //Assert statement(s)
            assertThat(result, equalTo(childBindingAlreadySetError));
            messages.verify(() -> Messages.convert(keyMock), atLeast(2));
        }
    }
}
