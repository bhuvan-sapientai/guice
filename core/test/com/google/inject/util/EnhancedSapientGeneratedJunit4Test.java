package com.google.inject.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class EnhancedSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${376e81fd-3d39-3687-9d70-2f77c82644e2}, hash: DF511CEE580BBB3BC84B81BA24DD5C80
    @Ignore()
    @Test()
    public void isEnhancedWhenClazzGetSimpleNameContainsBytecodeGenENHANCER_BY_GUICE_MARKER() {
        /* Branches:
         * (clazz.getSimpleName().contains(BytecodeGen.ENHANCER_BY_GUICE_MARKER)) : true
         */
        //Act Statement(s)
        boolean result = Enhanced.isEnhanced(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${b2b6ba56-5edd-330f-91bb-06f917f75b09}, hash: 043A3D42A08597984A6ADC916A68890C
    @Test()
    public void isEnhancedWhenClazzGetSimpleNameNotContainsBytecodeGenENHANCER_BY_GUICE_MARKER() {
        /* Branches:
         * (clazz.getSimpleName().contains(BytecodeGen.ENHANCER_BY_GUICE_MARKER)) : false
         */
        //Act Statement(s)
        boolean result = Enhanced.isEnhanced(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${3d246fed-454a-31fe-9d30-c9a3b8b39dd4}, hash: FAEF3DC77683CCC9DB6D23A09B851000
    @Ignore()
    @Test()
    public void unenhancedClassWhenIsEnhancedClazz() {
        /* Branches:
         * (isEnhanced(clazz)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Enhanced> enhanced = mockStatic(Enhanced.class, CALLS_REAL_METHODS)) {
            enhanced.when(() -> Enhanced.isEnhanced(Object.class)).thenReturn(true);
            //Act Statement(s)
            Optional<Class<? super Object>> result = Enhanced.unenhancedClass(Object.class);
            Optional<Class<? super Object>> anyOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(anyOptional));
            enhanced.verify(() -> Enhanced.isEnhanced(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0293dc4c-504a-3425-8f09-09ade35f8588}, hash: 511088B117BBCA421B341914DEC63739
    @Test()
    public void unenhancedClassWhenIsEnhancedNotClazz() {
        /* Branches:
         * (isEnhanced(clazz)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Enhanced> enhanced = mockStatic(Enhanced.class, CALLS_REAL_METHODS)) {
            enhanced.when(() -> Enhanced.isEnhanced(Object.class)).thenReturn(false);
            //Act Statement(s)
            Optional<Class<? super Object>> result = Enhanced.unenhancedClass(Object.class);
            Optional<Class<? super Object>> anyOptional = Optional.empty();
            //Assert statement(s)
            assertThat(result, equalTo(anyOptional));
            enhanced.verify(() -> Enhanced.isEnhanced(Object.class), atLeast(1));
        }
    }
}
