package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.TypeLiteral;
import com.google.common.collect.ImmutableList;
import com.google.inject.internal.GuiceInternal;

import java.lang.annotation.Annotation;
import java.util.Optional;
import java.util.ArrayList;

import com.google.inject.Key;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class BindingSourceRestrictionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final GuiceInternal guiceInternalMock = mock(GuiceInternal.class);

    private final Key keyMock = mock(Key.class);

    //Sapient generated method id: ${e9b74ac2-a55d-37ae-9008-2cefe5604d54}, hash: 5AABCFD2479DB3E0588575202EC30B4B
    @Test()
    public void getMissingImplementationSuggestionWhenRestrictionIsNull() {
        /* Branches:
         * (key.getAnnotationType() == null) : true  #  inside getRestriction method
         * (restriction == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(null).when(keyMock).getAnnotationType();
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
        doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
        //Act Statement(s)
        Optional<String> result = BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternalMock, keyMock);
        Optional<String> stringOptional = Optional.empty();
        //Assert statement(s)
        assertThat(result, equalTo(stringOptional));
        verify(keyMock).getAnnotationType();
        verify(keyMock).getTypeLiteral();
        verify(typeLiteralMock).getRawType();
    }

    //Sapient generated method id: ${1b573449-2425-366e-9529-8ac05da65e53}, hash: 365C046BDE454B4EBC838059C808357B
    @Ignore()
    @Test()
    public void getMissingImplementationSuggestionWhenRestrictionIsNotNull() {
        /* Branches:
         * (key.getAnnotationType() == null) : true  #  inside getRestriction method
         * (restriction == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GuiceInternal guiceInternalMock = mock(GuiceInternal.class, "some_value");
        Key key = Key.get(Object.class);
        //Act Statement(s)
        Optional<String> result = BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternalMock, key);
        Optional<String> stringOptional = Optional.of("\nHint: This key is restricted and cannot be bound directly. Restriction explanation: String");
        //Assert statement(s)
        assertThat(result, equalTo(stringOptional));
    }

    //Sapient generated method id: ${6b70b6ca-00bf-38db-81a0-1a29112e7318}, hash: DA217052FF13C99CEDE37B743037A65B
    @Ignore()
    @Test()
    public void getMissingImplementationSuggestionWhenKeyGetAnnotationTypeIsNotNullAndRestrictionIsNotNull() {
        /* Branches:
         * (key.getAnnotationType() == null) : false  #  inside getRestriction method
         * (restriction == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(Annotation.class).when(keyMock).getAnnotationType();
        //Act Statement(s)
        Optional<String> result = BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternalMock, keyMock);
        Optional<String> stringOptional = Optional.of("\nHint: This key is restricted and cannot be bound directly. Restriction explanation: A");
        //Assert statement(s)
        assertThat(result, equalTo(stringOptional));
        verify(keyMock, times(2)).getAnnotationType();
    }

    //Sapient generated method id: ${ccd2586f-c8a3-3b87-a90a-87590e14fe98}, hash: 5965D692815B629D32837C68F4A49C29
    @Ignore()
    @Test()
    public void checkWhenElementsIsNotEmpty() {
        /* Branches:
         * (for-each(elements)) : true  #  inside check method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Element elementMock = mock(Element.class);
        ImmutableList immutableList = (ImmutableList) ImmutableList.of();
        Object objectMock = mock(Object.class);
        doReturn(immutableList, objectMock).when(elementMock).acceptVisitor((ElementVisitor) any());
        List<Element> elementList = new ArrayList<>();
        elementList.add(elementMock);
        //Act Statement(s)
        ImmutableList<Message> result = BindingSourceRestriction.check(guiceInternalMock, elementList);
        ImmutableList messageList = ImmutableList.builder().build();
        //Assert statement(s)
        assertThat(result, equalTo(messageList));
        verify(elementMock, atLeast(2)).acceptVisitor((ElementVisitor) any());
    }
}
