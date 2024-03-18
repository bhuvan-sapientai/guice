package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.TypeLiteral;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.lang.reflect.Constructor;

import com.google.inject.spi.InjectionPoint;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class SingleMethodInjectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${1f6be77e-d6f3-3aba-ab3e-60c81abd554c}, hash: CE262A063F1B844713CDC9CB31AB560F
    @Ignore()
    @Test()
    public void injectTest() throws InternalProvisionException, ErrorsException, IllegalAccessException, InvocationTargetException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SingleParameterInjector> singleParameterInjector = mockStatic(SingleParameterInjector.class);
             MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{};
            List<Dependency<?>> anyList = new ArrayList<>();
            Errors errors = new Errors();
            doReturn(singleParameterInjectorArray).when(injectorMock).getParametersInjectors(anyList, errors);
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            Object[] objectArray = new Object[]{};
            singleParameterInjector.when(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray)).thenReturn(objectArray);
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            SingleMethodInjector target = new SingleMethodInjector(injectorMock, injectionPoint, errors);
            Object object = new Object();
            //Act Statement(s)
            target.inject(internalContextMock, object);
            //Assert statement(s)
            verify(injectorMock).getParametersInjectors(anyList, errors);
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
            singleParameterInjector.verify(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${6614296c-d23c-3d02-95bd-52bb0ab1c942}, hash: 5EAB71AA7E37DBD318CF1B3FBBE19789
    @Ignore()
    @Test()
    public void injectWhenCaughtIllegalAccessExceptionThrowsAssertionError() throws InternalProvisionException, ErrorsException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (catch-exception (IllegalAccessException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SingleParameterInjector> singleParameterInjector = mockStatic(SingleParameterInjector.class);
             MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{};
            List<Dependency<?>> anyList = new ArrayList<>();
            Errors errors = new Errors();
            doReturn(singleParameterInjectorArray).when(injectorMock).getParametersInjectors(anyList, errors);
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            Object[] objectArray = new Object[]{};
            singleParameterInjector.when(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray)).thenReturn(objectArray);
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            SingleMethodInjector target = new SingleMethodInjector(injectorMock, injectionPoint, errors);
            thrown.expect(AssertionError.class);
            Object object = new Object();
            //Act Statement(s)
            target.inject(internalContextMock, object);
            //Assert statement(s)
            verify(injectorMock).getParametersInjectors(anyList, errors);
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
            singleParameterInjector.verify(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${8bc3f0c1-9dc4-3e77-9f98-bfd6f8f9ab3c}, hash: A04832133D533BFF778AC669B60C5649
    @Ignore()
    @Test()
    public void injectWhenUserExceptionGetCauseIsNotNullThrowsInternalProvisionException() throws InternalProvisionException, ErrorsException, IllegalAccessException, InvocationTargetException {
        /* Branches:
         * (catch-exception (InvocationTargetException)) : true
         * (userException.getCause() != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        InternalProvisionException internalProvisionExceptionMock2 = mock(InternalProvisionException.class);
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class);
             MockedStatic<SingleParameterInjector> singleParameterInjector = mockStatic(SingleParameterInjector.class);
             MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{};
            List<Dependency<?>> anyList = new ArrayList<>();
            Errors errors = new Errors();
            doReturn(singleParameterInjectorArray).when(injectorMock).getParametersInjectors(anyList, errors);
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            Object[] objectArray = new Object[]{};
            singleParameterInjector.when(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray)).thenReturn(objectArray);
            Throwable throwable = new Throwable();
            internalProvisionException.when(() -> InternalProvisionException.errorInjectingMethod(throwable)).thenReturn(internalProvisionExceptionMock);
            doThrow(internalProvisionExceptionMock2).when(internalProvisionExceptionMock).addSource((InjectionPoint) any());
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            SingleMethodInjector target = new SingleMethodInjector(injectorMock, injectionPoint, errors);
            thrown.expect(InternalProvisionException.class);
            Object object = new Object();
            //Act Statement(s)
            target.inject(internalContextMock, object);
            //Assert statement(s)
            verify(injectorMock).getParametersInjectors(anyList, errors);
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
            singleParameterInjector.verify(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray), atLeast(1));
            internalProvisionException.verify(() -> InternalProvisionException.errorInjectingMethod(throwable), atLeast(1));
            verify(internalProvisionExceptionMock).addSource((InjectionPoint) any());
        }
    }
}
