package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.TypeLiteral;
import com.google.common.collect.ImmutableList;
import com.google.inject.Injector;
import com.google.inject.spi.UntargettedBinding;
import com.google.inject.spi.BindingSourceRestriction;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;
import com.google.inject.Binding;

import java.util.ArrayList;
import java.util.Optional;

import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class MissingImplementationErrorHintsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binding<Object> bindingMock = mock(Binding.class);

    private final Binding bindingMock2 = mock(Binding.class);

    private final Injector injectorMock = mock(Injector.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Key keyMock2 = mock(Key.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class, "getSuggestions_typeLiteral1");

    private final TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class);

    private final UntargettedBinding untargettedBindingMock = mock(UntargettedBinding.class);

    //Sapient generated method id: ${501fefcb-00a0-3901-b107-337ab0730877}, hash: 2E802BCA9C23BEE8C8A701DCF19FA72C
    @Ignore()
    @Test()
    public void getSuggestionsWhenBindingMapKeySetIsEmptyAndPossibleMatchesIsEmptyAndSameTypesNotIsEmpty() {
        /* Branches:
         * (!(b instanceof UntargettedBinding)) : false  #  inside lambda$getSuggestions$0 method
         * (!sameTypes.isEmpty()) : false
         * (for-each(bindingMap.keySet())) : false
         * (!possibleMatches.isEmpty()) : false
         * (sameTypes.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BindingSourceRestriction> bindingSourceRestriction = mockStatic(BindingSourceRestriction.class)) {
            doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            bindingObjectList.add(untargettedBindingMock);
            doReturn(bindingObjectList).when(injectorMock).findBindingsByType(typeLiteralMock);
            Map<Key<?>, Binding<?>> anyMap = new HashMap<>();
            doReturn(anyMap).when(injectorMock).getAllBindings();
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            bindingSourceRestriction.when(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock)).thenReturn(Optional.of("return_of_getMissingImplementationSuggestionOptional1"));
            //Act Statement(s)
            ImmutableList<String> result = MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock);
            ImmutableList stringList = ImmutableList.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(stringList));
            verify(keyMock).getTypeLiteral();
            verify(injectorMock).findBindingsByType(typeLiteralMock);
            verify(injectorMock).getAllBindings();
            bindingSourceRestriction.verify(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${34990025-d83f-313c-ad78-80f0c9de1667}, hash: 108571666C90EF2D7425F3CE5A2C3703
    @Ignore()
    @Test()
    public void getSuggestionsWhenKeyGetAnnotationTypeIsNullAndCOMMON_AMBIGUOUS_TYPESContainsKeyGetTypeLiteralGetRawType2() {
        /* Branches:
         * (!(b instanceof UntargettedBinding)) : true  #  inside lambda$getSuggestions$0 method
         * (!sameTypes.isEmpty()) : true
         * (i < howMany) : true
         * (remaining > 0) : true
         * (remaining == 1) : true
         * (sameTypes.isEmpty()) : true
         * (possibleMatches.isEmpty()) : true
         * (key.getAnnotationType() == null) : true
         * (COMMON_AMBIGUOUS_TYPES.contains(key.getTypeLiteral().getRawType())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<BindingSourceRestriction> bindingSourceRestriction = mockStatic(BindingSourceRestriction.class)) {
            doReturn(null).when(keyMock).getAnnotationType();
            doReturn(typeLiteralMock, typeLiteralMock2).when(keyMock).getTypeLiteral();
            doReturn(java.lang.Object.class).when(typeLiteralMock2).getRawType();
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            bindingObjectList.add(bindingMock);
            doReturn(bindingObjectList).when(injectorMock).findBindingsByType(typeLiteralMock);
            doReturn(bindingMock2).when(injectorMock).getExistingBinding(keyMock2);
            Object object = new Object();
            doReturn(object).when(bindingMock2).getSource();
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            bindingSourceRestriction.when(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock)).thenReturn(Optional.of("return_of_getMissingImplementationSuggestionOptional1"));
            Object object2 = new Object();
            messages.when(() -> Messages.convert(keyMock2)).thenReturn(object2);
            Object[] objectArray = new Object[]{""};
            messages.when(() -> Messages.format("\n    * %s", objectArray)).thenReturn("\n    * ");
            Object[] objectArray2 = new Object[]{1, ""};
            messages.when(() -> Messages.format("\n    * %d more binding%s with other annotations.", objectArray2)).thenReturn("return_of_format1");
            //Act Statement(s)
            ImmutableList<String> result = MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock);
            ImmutableList stringList = ImmutableList.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(stringList));
            verify(keyMock, times(2)).getTypeLiteral();
            verify(keyMock).getAnnotationType();
            verify(typeLiteralMock2).getRawType();
            verify(injectorMock).findBindingsByType(typeLiteralMock);
            verify(injectorMock).getExistingBinding(keyMock2);
            verify(bindingMock2).getSource();
            bindingSourceRestriction.verify(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock), atLeast(1));
            messages.verify(() -> Messages.convert(keyMock2), atLeast(1));
            messages.verify(() -> Messages.format("\n    * %s", objectArray), atLeast(1));
            messages.verify(() -> Messages.format("\n    * %d more binding%s with other annotations.", objectArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${d1d73270-45c9-35d5-9a49-a90379cc18f0}, hash: 28B253B49375F9D0D06B08E6E3BC9DC7
    @Ignore()
    @Test()
    public void getSuggestionsWhenKeyGetAnnotationTypeIsNullAndCOMMON_AMBIGUOUS_TYPESContainsKeyGetTypeLiteralGetRawType3() {
        /* Branches:
         * (!(b instanceof UntargettedBinding)) : true  #  inside lambda$getSuggestions$0 method
         * (!sameTypes.isEmpty()) : true
         * (i < howMany) : true
         * (remaining > 0) : true
         * (remaining == 1) : false
         * (sameTypes.isEmpty()) : true
         * (possibleMatches.isEmpty()) : true
         * (key.getAnnotationType() == null) : true
         * (COMMON_AMBIGUOUS_TYPES.contains(key.getTypeLiteral().getRawType())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<BindingSourceRestriction> bindingSourceRestriction = mockStatic(BindingSourceRestriction.class)) {
            doReturn(null).when(keyMock).getAnnotationType();
            doReturn(typeLiteralMock, typeLiteralMock2).when(keyMock).getTypeLiteral();
            doReturn(java.lang.Object.class).when(typeLiteralMock2).getRawType();
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            bindingObjectList.add(bindingMock);
            doReturn(bindingObjectList).when(injectorMock).findBindingsByType(typeLiteralMock);
            doReturn(bindingMock2).when(injectorMock).getExistingBinding(keyMock2);
            Object object = new Object();
            doReturn(object).when(bindingMock2).getSource();
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            bindingSourceRestriction.when(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock)).thenReturn(Optional.of("return_of_getMissingImplementationSuggestionOptional1"));
            Object object2 = new Object();
            messages.when(() -> Messages.convert(keyMock2)).thenReturn(object2);
            Object[] objectArray = new Object[]{""};
            messages.when(() -> Messages.format("\n    * %s", objectArray)).thenReturn("\n    * ");
            Object[] objectArray2 = new Object[]{2, "s"};
            messages.when(() -> Messages.format("\n    * %d more binding%s with other annotations.", objectArray2)).thenReturn("return_of_format1");
            //Act Statement(s)
            ImmutableList<String> result = MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock);
            ImmutableList stringList = ImmutableList.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(stringList));
            verify(keyMock, times(2)).getTypeLiteral();
            verify(keyMock).getAnnotationType();
            verify(typeLiteralMock2).getRawType();
            verify(injectorMock).findBindingsByType(typeLiteralMock);
            verify(injectorMock).getExistingBinding(keyMock2);
            verify(bindingMock2).getSource();
            bindingSourceRestriction.verify(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock), atLeast(1));
            messages.verify(() -> Messages.convert(keyMock2), atLeast(1));
            messages.verify(() -> Messages.format("\n    * %s", objectArray), atLeast(1));
            messages.verify(() -> Messages.format("\n    * %d more binding%s with other annotations.", objectArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f9932ef-ab72-37c1-9212-36ec43bb646b}, hash: 18C100BACEAAEC58829E87A0C50A3801
    @Ignore()
    @Test()
    public void getSuggestionsWhenKeyGetAnnotationTypeIsNullAndCOMMON_AMBIGUOUS_TYPESContainsKeyGetTypeLiteralGetRawType6() {
        /* Branches:
         * (!(b instanceof UntargettedBinding)) : true  #  inside lambda$getSuggestions$0 method
         * (!sameTypes.isEmpty()) : false
         * (for-each(bindingMap.keySet())) : true
         * (binding instanceof UntargettedBinding) : true
         * (!possibleMatches.isEmpty()) : false
         * (sameTypes.isEmpty()) : true
         * (possibleMatches.isEmpty()) : true
         * (key.getAnnotationType() == null) : true
         * (COMMON_AMBIGUOUS_TYPES.contains(key.getTypeLiteral().getRawType())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BindingSourceRestriction> bindingSourceRestriction = mockStatic(BindingSourceRestriction.class)) {
            doReturn(null).when(keyMock).getAnnotationType();
            doReturn(typeLiteralMock, typeLiteralMock2).when(keyMock).getTypeLiteral();
            doReturn(java.lang.Object.class).when(typeLiteralMock2).getRawType();
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            doReturn(bindingObjectList).when(injectorMock).findBindingsByType(typeLiteralMock);
            Map<Key<?>, Binding<?>> anyMap = new HashMap<>();
            anyMap.put(keyMock2, untargettedBindingMock);
            doReturn(anyMap).when(injectorMock).getAllBindings();
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            bindingSourceRestriction.when(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock)).thenReturn(Optional.of("return_of_getMissingImplementationSuggestionOptional1"));
            //Act Statement(s)
            ImmutableList<String> result = MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock);
            ImmutableList stringList = ImmutableList.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(stringList));
            verify(keyMock, times(2)).getTypeLiteral();
            verify(keyMock).getAnnotationType();
            verify(typeLiteralMock2).getRawType();
            verify(injectorMock).findBindingsByType(typeLiteralMock);
            verify(injectorMock).getAllBindings();
            bindingSourceRestriction.verify(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7a32df03-e168-3a7f-bcd8-56d7ccac11c3}, hash: 69F080F3E3A82BB14CCB5CF75C670EA1
    @Ignore()
    @Test()
    public void getSuggestionsWhenPossibleMatchesNotIsEmpty() {
        /* Branches:
         * (!(b instanceof UntargettedBinding)) : true  #  inside lambda$getSuggestions$0 method
         * (!sameTypes.isEmpty()) : false
         * (for-each(bindingMap.keySet())) : true
         * (binding instanceof UntargettedBinding) : false
         * (have.contains(want)) : false
         * (want.contains(have)) : true
         * (possibleMatches.size() > MAX_RELATED_TYPES_REPORTED) : false
         * (!possibleMatches.isEmpty()) : true
         * (possibleMatches.size() <= MAX_RELATED_TYPES_REPORTED) : true
         * (for-each(possibleMatches)) : true
         * (sameTypes.isEmpty()) : true
         * (possibleMatches.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class, "getSuggestions_typeLiteral2");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS);
             MockedStatic<BindingSourceRestriction> bindingSourceRestriction = mockStatic(BindingSourceRestriction.class)) {
            doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
            List<Binding<Object>> bindingObjectList = new ArrayList<>();
            doReturn(bindingObjectList).when(injectorMock).findBindingsByType(typeLiteralMock);
            Map<Key<?>, Binding<?>> anyMap = new HashMap<>();
            doReturn(anyMap).when(injectorMock).getAllBindings();
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            bindingSourceRestriction.when(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock)).thenReturn(Optional.of("return_of_getMissingImplementationSuggestionOptional1"));
            Object object = new Object();
            messages.when(() -> Messages.convert(keyMock2)).thenReturn(object);
            doReturn(typeLiteralMock2).when(keyMock2).getTypeLiteral();
            //Act Statement(s)
            ImmutableList<String> result = MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock);
            ImmutableList stringList = ImmutableList.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(stringList));
            verify(keyMock, atLeast(1)).getTypeLiteral();
            verify(injectorMock, atLeast(1)).findBindingsByType(typeLiteralMock);
            verify(injectorMock, atLeast(1)).getAllBindings();
            bindingSourceRestriction.verify(() -> BindingSourceRestriction.getMissingImplementationSuggestion(guiceInternal, keyMock), atLeast(1));
            messages.verify(() -> Messages.convert(keyMock2), atLeast(1));
            verify(keyMock2, atLeast(1)).getTypeLiteral();
        }
    }
}
