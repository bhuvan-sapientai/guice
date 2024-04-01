package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Method;
import java.util.BitSet;
import java.util.function.Function;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.function.BiFunction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class EnhancerBuilderImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${ea2d6f84-ad88-3b1f-97ed-d47344eb9a2b}, hash: 9D9369302106F8795808AF72F86DC205
    @Ignore()
    @Test()
    public void buildEnhancerWhenHostClassGetModifiersAndFINALNotEquals0ThrowsIllegalArgumentException() {
        /* Branches:
         * ((hostClass.getModifiers() & FINAL) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<Method> collection = new ArrayList<>();
        Map<Method, Method> methodMethodMap = new HashMap<>();
        EnhancerBuilderImpl target = new EnhancerBuilderImpl(Object.class, collection, methodMethodMap);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot subclass final ");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        BitSet bitSet = new BitSet();
        //Act Statement(s)
        target.buildEnhancer(bitSet);
    }

    //Sapient generated method id: ${3e2fe79d-36f7-3c1c-8245-c66059689d65}, hash: F44E0D9C855FED8D8F62EC4168031D0B
    @Ignore()
    @Test()
    public void buildEnhancerWhenHostClassGetModifiersAndFINALEquals0() {
        /* Branches:
         * ((hostClass.getModifiers() & FINAL) != 0) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: ENHANCERS
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<Method> collection = new ArrayList<>();
        Map<Method, Method> methodMethodMap = new HashMap<>();
        EnhancerBuilderImpl target = new EnhancerBuilderImpl(Object.class, collection, methodMethodMap);
        BitSet bitSet = new BitSet();
        //Act Statement(s)
        Function<String, BiFunction<Object, Object[], Object>> result = target.buildEnhancer(bitSet);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
