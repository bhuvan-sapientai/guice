package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.BindingScopingVisitor;

import java.lang.annotation.Annotation;

import com.google.inject.internal.BytecodeGen;
import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class ScopesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binding bindingMock = mock(Binding.class);

    private final Scope scopeMock = mock(Scope.class);

    //Sapient generated method id: ${4c4c82a7-2a32-3cba-b6ea-1462dcf43b99}, hash: 76BF472D77DCE40536D000F3547E13F7
    @Test()
    public void isSingletonWhenSingleton() {
        /* Branches:
         * (singleton) : true
         */
        //Arrange Statement(s)
        doReturn(true).when(bindingMock).acceptScopingVisitor(any());
        //Act Statement(s)
        boolean result = Scopes.isSingleton(bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(bindingMock).acceptScopingVisitor(any());
    }

    //Sapient generated method id: ${6cbe7765-fb5e-3f04-8db7-cc8b0fc8fb12}, hash: 599A944C2BB478488CC92AE4AE707298
    @Test()
    public void isSingletonWhenBindingNotInstanceOfExposedBinding() {
        /* Branches:
         * (singleton) : false
         * (binding instanceof LinkedKeyBinding) : false
         * (binding instanceof ExposedBinding) : false
         */
        //Arrange Statement(s)
        doReturn(false).when(bindingMock).acceptScopingVisitor(any());
        //Act Statement(s)
        boolean result = Scopes.isSingleton(bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(bindingMock).acceptScopingVisitor(any());
    }

    //Sapient generated method id: ${8f34c9b8-8f0d-3c2e-ba17-fe6ce1b7f86d}, hash: 50541A4AB8B89735B3FC485D87838DE5
    @Test()
    public void isScopedWhenMatches() {
        /* Branches:
         * (matches) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(true).when(bindingMock).acceptScopingVisitor((BindingScopingVisitor) any());
        //Act Statement(s)
        boolean result = Scopes.isScoped(bindingMock, scopeMock, Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(bindingMock).acceptScopingVisitor((BindingScopingVisitor) any());
    }

    //Sapient generated method id: ${79f452c8-2922-3571-bec0-b4baf1f7717f}, hash: 8C1BEEF6DB0CBCD4C5E7B3333ABD1920
    @Test()
    public void isScopedWhenBindingNotInstanceOfExposedBinding() {
        /* Branches:
         * (matches) : false
         * (binding instanceof LinkedKeyBinding) : false
         * (binding instanceof ExposedBinding) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(bindingMock).acceptScopingVisitor((BindingScopingVisitor) any());
        //Act Statement(s)
        boolean result = Scopes.isScoped(bindingMock, scopeMock, Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(bindingMock).acceptScopingVisitor((BindingScopingVisitor) any());
    }

    //Sapient generated method id: ${3442d336-6dcc-3dc0-887e-5c82383c5269}, hash: 4CF3E1F77D2BB82FADEFB5ED95C47DF7
    @Test()
    public void isCircularProxyWhenBytecodeGenIsCircularProxyObject() {
        /* Branches:
         * (BytecodeGen.isCircularProxy(object)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeGen> bytecodeGen = mockStatic(BytecodeGen.class)) {
            Object object = new Object();
            bytecodeGen.when(() -> BytecodeGen.isCircularProxy(object)).thenReturn(true);
            //Act Statement(s)
            boolean result = Scopes.isCircularProxy(object);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            bytecodeGen.verify(() -> BytecodeGen.isCircularProxy(object), atLeast(1));
        }
    }

    //Sapient generated method id: ${c6396986-1424-312f-adb8-a64d08eec91e}, hash: 380A0F59E864CAD933FE668AD2486EA9
    @Test()
    public void isCircularProxyWhenBytecodeGenNotIsCircularProxyObject() {
        /* Branches:
         * (BytecodeGen.isCircularProxy(object)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeGen> bytecodeGen = mockStatic(BytecodeGen.class)) {
            Object object = new Object();
            bytecodeGen.when(() -> BytecodeGen.isCircularProxy(object)).thenReturn(false);
            //Act Statement(s)
            boolean result = Scopes.isCircularProxy(object);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            bytecodeGen.verify(() -> BytecodeGen.isCircularProxy(object), atLeast(1));
        }
    }
}
