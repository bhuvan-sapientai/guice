package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.util.Optional;
import java.util.Set;

import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class WeakKeySetSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Key keyMock = mock(Key.class);

    //Sapient generated method id: ${6b2619b1-92af-3175-82ed-4a4872f16284}, hash: 588E8CAAD85DF6789DE61E39EC28F936
    @Test()
    public void addWhenStateParentIsPresentAndKeyAndSourcesIsNull() {
        /* Branches:
         * (backingMap == null) : true
         * (source instanceof Class) : false
         * (source == SourceProvider.UNKNOWN_SOURCE) : true
         * (state.parent().isPresent()) : true
         * (keyAndSources == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type CacheBuilder, evictionCache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData stateMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            doReturn(Optional.of(injectorBindingDataMock)).when(stateMock).parent();
            Object object = new Object();
            errors.when(() -> Errors.convert((Object) null)).thenReturn(object);
            Object object2 = new Object();
            WeakKeySet target = new WeakKeySet(object2);
            //Act Statement(s)
            target.add(keyMock, stateMock, "[unknown source]");
            //Assert statement(s)
            verify(stateMock).parent();
            errors.verify(() -> Errors.convert((Object) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${ce2dcc4f-089e-3c3e-afae-741aa455c00e}, hash: C3DB605D55C7F96C8D403DD1F32FB783
    @Test()
    public void containsWhenBackingMapIsNull() {
        /* Branches:
         * (backingMap != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type CacheBuilder, evictionCache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        WeakKeySet target = new WeakKeySet(object);
        //Act Statement(s)
        boolean result = target.contains(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${037e5631-0cac-3403-94a5-8e83cd6fa3d9}, hash: 2E2D171CA5623831C3D5B79144D4E388
    @Test()
    public void getSourcesWhenSourcesIsNull() {
        /* Branches:
         * (backingMap == null) : true
         * (sources == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type CacheBuilder, evictionCache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        WeakKeySet target = new WeakKeySet(object);
        //Act Statement(s)
        Set<Object> result = target.getSources(keyMock);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }
}
