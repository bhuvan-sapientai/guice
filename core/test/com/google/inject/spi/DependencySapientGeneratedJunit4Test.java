package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.TypeLiteral;
import com.google.inject.internal.MoreTypes;

import java.util.Set;
import java.util.HashSet;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;

import java.lang.reflect.Constructor;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class DependencySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: BA1AACD485C44471B81D47C800F632FF
    @Ignore()
    @Test()
    public void getTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            Key key = Key.get(Object.class);
            moreTypes.when(() -> MoreTypes.canonicalizeKey((Key) any())).thenReturn(key);
            Key key2 = Key.get(Object.class);
            //Act Statement(s)
            Dependency result = Dependency.get(key2);
            Dependency dependency = new Dependency((InjectionPoint) null, key, true, -1);
            //Assert statement(s)
            assertThat(result, equalTo(dependency));
            moreTypes.verify(() -> MoreTypes.canonicalizeKey((Key) any()));
        }
    }

    //Sapient generated method id: ${c9077c13-6a2b-3493-b93b-43ce44ed03c1}, hash: 5EFC2CDC98CF565A45EDB7A21293360E
    @Ignore()
    @Test()
    public void forInjectionPointsWhenInjectionPointsIsNotEmpty() {
        /* Branches:
         * (for-each(injectionPoints)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectionPoint injectionPointMock = mock(InjectionPoint.class);
        Key keyMock = mock(Key.class);
        Dependency dependency = Dependency.get(keyMock);
        List<Dependency<?>> anyList = new ArrayList<>();
        anyList.add(dependency);
        doReturn(anyList).when(injectionPointMock).getDependencies();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPointMock);
        //Act Statement(s)
        Set<Dependency<?>> result = Dependency.forInjectionPoints(injectionPointSet);
        ImmutableSet immutableSet = ImmutableSet.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableSet));
        verify(injectionPointMock).getDependencies();
    }

    //Sapient generated method id: ${75c7a0e8-aa12-3ff5-b167-525a38da9d7e}, hash: 3A82AD8F7D554BE4EB1C84BA459B0D91
    @Ignore()
    @Test()
    public void toStringWhenParameterIndexNotEqualsMinus1() {
        /* Branches:
         * (injectionPoint != null) : true
         * (parameterIndex != -1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Constructor constructorMock = mock(Constructor.class);
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Key key = Key.get(Object.class);
        Dependency<Object> target = new Dependency(injectionPoint, key, true, 0);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("<init>_key2@A[0]"));
    }
}
