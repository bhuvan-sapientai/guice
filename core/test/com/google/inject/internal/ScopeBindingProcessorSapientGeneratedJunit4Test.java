package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import com.google.inject.spi.ScopeBinding;

import java.lang.annotation.Annotation;

import org.mockito.MockedStatic;
import com.google.inject.Scope;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class ScopeBindingProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Errors errorsMock = mock(Errors.class, "errors");

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ScopeBindingProcessor target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${027b9664-04f6-31f3-9f2e-859803e1be9f}, hash: B09E6426E4B19C9FE51734ADC7C09BBE
    @Test()
    public void visit17WhenExistingIsNull() {
        /* Branches:
         * (!Annotations.isScopeAnnotation(annotationType)) : true
         * (!Annotations.isRetainedAtRuntime(annotationType)) : true
         * (existing != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScopeBinding commandMock = mock(ScopeBinding.class);
        Scope scopeMock = mock(Scope.class);
        Errors errorsMock2 = mock(Errors.class);
        Errors errorsMock3 = mock(Errors.class);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            doReturn(scopeMock).when(commandMock).getScope();
            doReturn(Annotation.class).when(commandMock).getAnnotationType();
            annotations.when(() -> Annotations.isScopeAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            target = new ScopeBindingProcessor(errorsMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(errorsMock2).when(errorsMock).missingScopeAnnotation(java.lang.annotation.Annotation.class);
            doReturn(errorsMock3).when(errorsMock).missingRuntimeRetention(java.lang.annotation.Annotation.class);
            doReturn(null).when(injectorBindingDataMock).getScopeBinding(java.lang.annotation.Annotation.class);
            doReturn(injectorBindingDataMock, injectorBindingDataMock2).when(injectorMock).getBindingData();
            doNothing().when(injectorBindingDataMock2).putScopeBinding(java.lang.annotation.Annotation.class, commandMock);
            //Act Statement(s)
            Boolean result = target.visit(commandMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(commandMock).getScope();
            verify(commandMock).getAnnotationType();
            annotations.verify(() -> Annotations.isScopeAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            verify(errorsMock).missingScopeAnnotation(java.lang.annotation.Annotation.class);
            verify(errorsMock).missingRuntimeRetention(java.lang.annotation.Annotation.class);
            verify(injectorMock, times(2)).getBindingData();
            verify(injectorBindingDataMock).getScopeBinding(java.lang.annotation.Annotation.class);
            verify(injectorBindingDataMock2).putScopeBinding(java.lang.annotation.Annotation.class, commandMock);
        }
    }

    //Sapient generated method id: ${0a41c593-54d8-3d89-89da-fa435a400216}, hash: ADD7844D4AFC535CD947DCA802079392
    @Ignore()
    @Test()
    public void visit17WhenScopeNotEqualsExistingGetScope() {
        /* Branches:
         * (!Annotations.isScopeAnnotation(annotationType)) : true
         * (!Annotations.isRetainedAtRuntime(annotationType)) : true
         * (existing != null) : true
         * (!scope.equals(existing.getScope())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScopeBinding commandMock = mock(ScopeBinding.class);
        Scope scopeMock = mock(Scope.class);
        Errors errorsMock2 = mock(Errors.class);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        ScopeBinding scopeBindingMock = mock(ScopeBinding.class);
        Scope scopeMock2 = mock(Scope.class);
        Errors errorsMock3 = mock(Errors.class);
        Scope scopeMock3 = mock(Scope.class);
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            doReturn(scopeMock).when(commandMock).getScope();
            doReturn(Annotation.class).when(commandMock).getAnnotationType();
            annotations.when(() -> Annotations.isScopeAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            target = new ScopeBindingProcessor(errorsMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Errors errors = errorsMock.missingScopeAnnotation(java.lang.annotation.Annotation.class);
            doReturn(errors).when(errorsMock).missingScopeAnnotation(java.lang.annotation.Annotation.class);
            doReturn(errorsMock2).when(errorsMock).missingRuntimeRetention(java.lang.annotation.Annotation.class);
            doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
            doReturn(scopeBindingMock).when(injectorBindingDataMock).getScopeBinding(java.lang.annotation.Annotation.class);
            doReturn(scopeMock2).when(scopeBindingMock).getScope();
            doReturn(errorsMock3).when(errorsMock).duplicateScopes(scopeBindingMock, java.lang.annotation.Annotation.class, scopeMock3);
            //Act Statement(s)
            Boolean result = target.visit(commandMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(commandMock).getScope();
            verify(commandMock).getAnnotationType();
            annotations.verify(() -> Annotations.isScopeAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            verify(errorsMock).missingScopeAnnotation(java.lang.annotation.Annotation.class);
            verify(errorsMock).missingRuntimeRetention(java.lang.annotation.Annotation.class);
            verify(injectorMock).getBindingData();
            verify(injectorBindingDataMock).getScopeBinding(java.lang.annotation.Annotation.class);
            verify(scopeBindingMock).getScope();
            verify(errorsMock).duplicateScopes(scopeBindingMock, java.lang.annotation.Annotation.class, scopeMock3);
        }
    }
}
