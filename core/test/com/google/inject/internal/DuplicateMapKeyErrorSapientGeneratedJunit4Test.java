package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import org.mockito.stubbing.Answer;
import com.google.common.collect.ImmutableList;
import com.google.inject.spi.ErrorDetail;

import java.util.Formatter;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import org.mockito.MockedStatic;
import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;
import com.google.common.collect.Multimap;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class DuplicateMapKeyErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Multimap duplicatesMock = mock(Multimap.class, "duplicates");

    private final Key<Map<Object, Object>> keyMock = mock(Key.class);

    private final Object objectMock = mock(Object.class, "getDuplicateKeysMessage_object1");

    private final Object objectMock2 = mock(Object.class, "getDuplicateKeysMessage_object3");

    //Sapient generated method id: ${eb514b75-dfb6-3907-a1b3-057b9d0933c8}, hash: 2CA210C91BFC9822231BF09F865ADB44
    @Test()
    public void formatDetailWhenEntryGetValueIsNotEmpty() {
        /* Branches:
         * (for-each(duplicates.asMap().entrySet())) : true
         * (for-each(entry.getValue())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type SourceFormatter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Object objectMock2 = mock(Object.class, "formatDetail_object2");
        //Binding bindingMock = mock(Binding.class);
        /*try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
    MockedStatic<Messages> messages = mockStatic(Messages.class)) {
    messages.when(() -> Messages.convert((Key) any())).thenReturn(objectMock);
    messages.when(() -> Messages.bold("Duplicates:")).thenReturn("Duplicates:");
    messages.when(() -> Messages.redBold("formatDetail_object2")).thenReturn("String");
    messages.when(() -> Messages.bold("MapBinder declared at:")).thenReturn("String");
    Formatter formatter = new Formatter();
    errorFormatter.when(() -> ErrorFormatter.formatSources((ImmutableList) null, formatter)).thenAnswer((Answer<Void>) invocation -> null);
    Key<Map<Object, Object>> key = Key.get(Object.class);
    ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
    List<Object> objectList = new ArrayList<>();
    DuplicateMapKeyError target = new DuplicateMapKeyError(key, arrayListMultimap, objectList);
    Collection<Object> collection = new ArrayList<>();
    collection.add(bindingMock);
    Map<Object, Collection<Object>> objectCollectionObjectMap = new HashMap<>();
    objectCollectionObjectMap.put(objectMock2, collection);
    doReturn(objectCollectionObjectMap).when(duplicatesMock).asMap();
    Object object = new Object();
    doReturn(object).when(bindingMock).getSource();
    List<ErrorDetail<?>> anyList = new ArrayList<>();
    //Act Statement(s)
    target.formatDetail(anyList, formatter);
    //Assert statement(s)
    messages.verify(() -> Messages.convert((Key) any()));
    messages.verify(() -> Messages.bold("Duplicates:"), atLeast(1));
    messages.verify(() -> Messages.redBold("formatDetail_object2"), atLeast(1));
    messages.verify(() -> Messages.bold("MapBinder declared at:"), atLeast(1));
    errorFormatter.verify(() -> ErrorFormatter.formatSources((ImmutableList) null, formatter), atLeast(1));
    verify(duplicatesMock).asMap();
    verify(bindingMock).getSource();
}*/
    }

    //Sapient generated method id: ${e52880ea-010a-3acd-8461-51e614f86d37}, hash: 528208FB6DF3FD809BBF2250E8CB1922
    @Ignore()
    @Test()
    public void withSources1WhenDuplicateKeysSizeEquals1() {
        /* Branches:
         * (duplicateKeys.size() == 1) : true  #  inside getDuplicateKeysMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock).thenReturn(objectMock2);
            ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
            List<Object> objectList = new ArrayList<>();
            DuplicateMapKeyError target = new DuplicateMapKeyError(keyMock, arrayListMultimap, objectList);
            List<Object> objectList2 = new ArrayList<>();
            //Act Statement(s)
            DuplicateMapKeyError<Object, Object> result = target.withSources(objectList2);
            DuplicateMapKeyError<Object, Object> duplicateMapKeyError = new DuplicateMapKeyError<>(keyMock, arrayListMultimap, objectList2);
            //Assert statement(s)
            assertThat(result, equalTo(duplicateMapKeyError));
            messages.verify(() -> Messages.convert(keyMock), atLeast(2));
        }
    }

    //Sapient generated method id: ${aea03937-7363-3c66-82d2-71f28ec63dc3}, hash: AE9799143F0724F8029ACA510EC868F5
    @Ignore()
    @Test()
    public void withSources1WhenDuplicateKeysSizeNotEquals1() {
        /* Branches:
         * (duplicateKeys.size() == 1) : false  #  inside getDuplicateKeysMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock).thenReturn(objectMock2);
            ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
            List<Object> objectList = new ArrayList<>();
            DuplicateMapKeyError target = new DuplicateMapKeyError(keyMock, arrayListMultimap, objectList);
            List<Object> objectList2 = new ArrayList<>();
            //Act Statement(s)
            DuplicateMapKeyError<Object, Object> result = target.withSources(objectList2);
            DuplicateMapKeyError<Object, Object> duplicateMapKeyError = new DuplicateMapKeyError<>(keyMock, arrayListMultimap, objectList2);
            //Assert statement(s)
            assertThat(result, equalTo(duplicateMapKeyError));
            messages.verify(() -> Messages.convert(keyMock), atLeast(2));
        }
    }
}
