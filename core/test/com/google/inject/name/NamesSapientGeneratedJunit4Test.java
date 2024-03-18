package com.google.inject.name;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.binder.LinkedBindingBuilder;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.Key;

import java.util.Properties;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class NamesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binder binderMock2 = mock(Binder.class);

    private final LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);

    //Sapient generated method id: ${84f1ead8-3f77-3eb1-8861-fb5eeb323541}, hash: D612DE82D28CFA792CED23595813788B
    @Test()
    public void namedTest() {
        //Act Statement(s)
        Named result = Names.named("name1");
        NamedImpl namedImpl = new NamedImpl("name1");
        //Assert statement(s)
        assertThat(result, equalTo(namedImpl));
    }

    //Sapient generated method id: ${1373e4fb-39e9-3c10-a015-d49fe6a1153a}, hash: 481A1EA599DFE2214C29A59A4C56C227
    @Ignore()
    @Test()
    public void bindPropertiesWhenPropertiesEntrySetIsNotEmpty() {
        /* Branches:
         * (for-each(properties.entrySet())) : true
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Class<Names>[] classArray = new Class[]{Names.class};
        doReturn(binderMock2).when(binderMock).skipSources(classArray);
        doReturn(linkedBindingBuilderMock).when(binderMock2).bind((Key) any());
        doNothing().when(linkedBindingBuilderMock).toInstance("propertiesItem1Value1");
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("propertiesItem1Key1", "propertiesItem1Value1");
        //Act Statement(s)
        Names.bindProperties(binderMock, stringStringMap);
        //Assert statement(s)
        verify(binderMock).skipSources(classArray);
        verify(binderMock2).bind((Key) any());
        verify(linkedBindingBuilderMock).toInstance("propertiesItem1Value1");
    }

    //Sapient generated method id: ${8f85fea1-e843-3be1-80cd-39beb8adeed3}, hash: 88551B5B4F1EC359B9AA27CCCB8ECEC7
    @Ignore()
    @Test()
    public void bindProperties1WhenEHasMoreElements() {
        /* Branches:
         * (e.hasMoreElements()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class, "Binder");
        Key keyMock = mock(Key.class, "Key");
        try (MockedStatic<Key> key = mockStatic(Key.class)) {
            Class<Names>[] classArray = new Class[]{Names.class};
            doReturn(binderMock2).when(binderMock).skipSources(classArray);
            doReturn(linkedBindingBuilderMock).when(binderMock2).bind(keyMock);
            doNothing().when(linkedBindingBuilderMock).toInstance("arg0");
            key.when(() -> Key.get(eq(String.class), (NamedImpl) any())).thenReturn(keyMock);
            Properties properties = new Properties();
            //Act Statement(s)
            Names.bindProperties(binderMock, properties);
            //Assert statement(s)
            verify(binderMock).skipSources(classArray);
            verify(binderMock2).bind(keyMock);
            verify(linkedBindingBuilderMock).toInstance("arg0");
            key.verify(() -> Key.get(eq(String.class), (NamedImpl) any()));
        }
    }
}
