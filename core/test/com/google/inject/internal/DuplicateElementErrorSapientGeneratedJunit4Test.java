package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.util.Set;

import com.google.inject.spi.ErrorDetail;

import java.util.Formatter;

import com.google.common.collect.ImmutableMultimap;
import org.mockito.MockedStatic;
import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class DuplicateElementErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binding<Object> bindingMock = mock(Binding.class);

    private final Key<Set<Object>> keyMock = mock(Key.class);

    private final Object objectMock = mock(Object.class, "<init>_object1");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${b7f927c1-0dcd-3e42-a51e-9af357879a47}, hash: 38A7EBFFE8C1E3300A289010F2889BF5
    @Ignore()
    @Test()
    public void formatDetailWhenEntryGetValueIsNotEmptyThrowsNullPointerException() {
        /* Branches:
         * (for-each(elements.asMap().entrySet())) : true
         * (entry.getValue().size() > 1) : true
         * (valuesAsString.size() == 1) : true
         * (for-each(entry.getValue())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            messages.when(() -> Messages.redBold("text1")).thenReturn("return_of_redBold1");
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            Object[] objectArray = new Object[]{};
            List<Object> objectList = new ArrayList<>();
            DuplicateElementError target = new DuplicateElementError(keyMock, bindingObjectList, objectArray, objectList);
            thrown.expect(NullPointerException.class);
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            Formatter formatter = new Formatter();
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            messages.verify(() -> Messages.redBold("text1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${2baaa2f9-bb9d-3fbf-acf4-22cba52f493a}, hash: A06A41228BE2F30EA824493C1B89A066
    @Test()
    public void formatDetailWhenEntryGetValueIsEmpty() {
        /* Branches:
         * (for-each(elements.asMap().entrySet())) : true
         * (entry.getValue().size() > 1) : true
         * (valuesAsString.size() == 1) : true
         * (for-each(entry.getValue())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            messages.when(() -> Messages.redBold("text1")).thenReturn("return_of_redBold1");
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            Object[] objectArray = new Object[]{};
            List<Object> objectList = new ArrayList<>();
            DuplicateElementError target = new DuplicateElementError(keyMock, bindingObjectList, objectArray, objectList);
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            messages.verify(() -> Messages.redBold("text1"), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(anyList(), eq(formatter)), atLeast(1));
        }
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: 482FD1D34857ACAAEEA0533C7BAFC312
    @Test()
    public void withSources1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock2 = mock(Object.class, "<init>_object2");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock).thenReturn(objectMock2);
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            bindingObjectList.add(bindingMock);
            Object object = new Object();
            Object[] objectArray = new Object[]{object};
            List<Object> objectList = new ArrayList<>();
            DuplicateElementError target = new DuplicateElementError(keyMock, bindingObjectList, objectArray, objectList);
            List<Object> objectList2 = new ArrayList<>();
            //Act Statement(s)
            DuplicateElementError result = target.withSources(objectList2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            messages.verify(() -> Messages.convert(keyMock), atLeast(2));
        }
    }

    //Sapient generated method id: ${db0639ff-f31c-327b-bad4-27786016fe1d}, hash: 18287F0270FCB4CEB50949EB34F99DFA
    @Ignore()
    @Test()
    public void indexElementsWhenILessThanValuesLength() {
        /* Branches:
         * (i < values.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Binding<Object>> bindingObjectList = new ArrayList<>();
        bindingObjectList.add(bindingMock);
        Object object = new Object();
        Object[] objectArray = new Object[]{object};
        //Act Statement(s)
        ImmutableMultimap<Object, DuplicateElementError.Element<Object>> result = DuplicateElementError.indexElements(bindingObjectList, objectArray);
        ImmutableMultimap immutableMultimap = ImmutableMultimap.builder().build();
        //Assert statement(s)
        assertThat(result, equalTo(immutableMultimap));
    }
}
