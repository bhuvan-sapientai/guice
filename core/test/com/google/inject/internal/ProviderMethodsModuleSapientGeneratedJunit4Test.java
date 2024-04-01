package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.TypeLiteral;
import com.google.inject.Module;
import org.mockito.MockedStatic;
import com.google.inject.spi.ModuleAnnotatedMethodScanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProviderMethodsModuleSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ModuleAnnotatedMethodScanner moduleAnnotatedMethodScannerMock = mock(ModuleAnnotatedMethodScanner.class, "ModuleAnnotatedMethodScanner");

    private final Module moduleMock = mock(Module.class, "null");

    private final ProviderMethodsModule providerMethodsModuleMock = mock(ProviderMethodsModule.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${e784a0f6-8bb5-3548-8075-fb3176ce8a43}, hash: F423099443E31890420D4E5665372CF9
    @Test()
    public void forModuleWhenObjectInstanceOfProviderMethodsModule() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : true  #  inside forObject method
         */
        //Act Statement(s)
        Module result = ProviderMethodsModule.forModule((Module) providerMethodsModuleMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Module for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${410c8a66-9f3c-3fe4-9c46-ec3751ea3bc2}, hash: 0E79F71B2526CB6387C3DABD7C7D30B2
    @Ignore()
    @Test()
    public void forModuleWhenIsStaticModule() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : false  #  inside forObject method
         * (delegate instanceof Class) : true  #  inside isStaticModule method
         * (isStaticModule()) : true  #  inside getDelegateModuleClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            Module result = ProviderMethodsModule.forModule(moduleMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${603c5d03-38dc-30df-9602-cac9fcb0a6ff}, hash: B9DC624D79882456BBC913EEA11AC989
    @Ignore()
    @Test()
    public void forModuleWhenIsStaticModuleNot() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : false  #  inside forObject method
         * (delegate instanceof Class) : false  #  inside isStaticModule method
         * (isStaticModule()) : false  #  inside getDelegateModuleClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            Module result = ProviderMethodsModule.forModule(moduleMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${300b5605-6bd6-36f6-b820-03fbc985d765}, hash: 6F57A7946DB0B560BC4267DD3376E603
    @Test()
    public void forModule1WhenObjectInstanceOfProviderMethodsModule() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : true  #  inside forObject method
         */
        //Arrange Statement(s)
        ModuleAnnotatedMethodScanner moduleAnnotatedMethodScannerMock = mock(ModuleAnnotatedMethodScanner.class);
        //Act Statement(s)
        Module result = ProviderMethodsModule.forModule((Object) providerMethodsModuleMock, moduleAnnotatedMethodScannerMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Module for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${65e55b67-4fb5-339e-a98f-7d2e34663834}, hash: D829CE677C930E3D7DB4FAFC0A0055C0
    @Test()
    public void forModule1WhenIsStaticModule() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : false  #  inside forObject method
         * (delegate instanceof Class) : true  #  inside isStaticModule method
         * (isStaticModule()) : true  #  inside getDelegateModuleClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Object object = new Object();
            //Act Statement(s)
            Module result = ProviderMethodsModule.forModule(object, moduleAnnotatedMethodScannerMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${eb7376f7-9632-37f8-aa26-b3d07e919dbc}, hash: 6E757F7621AE772C2DF38B78C7CE3037
    @Test()
    public void forModule1WhenIsStaticModuleNot() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : false  #  inside forObject method
         * (delegate instanceof Class) : false  #  inside isStaticModule method
         * (isStaticModule()) : false  #  inside getDelegateModuleClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Object object = new Object();
            //Act Statement(s)
            Module result = ProviderMethodsModule.forModule(object, moduleAnnotatedMethodScannerMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${ba4f7fab-ebcf-38dd-abe9-56bc7ed33b10}, hash: 0DB229C5E6FD122F1C89DE32177D8EA5
    @Test()
    public void forObjectWhenObjectInstanceOfProviderMethodsModule() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : true  #  inside forObject method
         */
        //Act Statement(s)
        Module result = ProviderMethodsModule.forObject((Object) providerMethodsModuleMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Module for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${d224a644-5292-3755-8d25-f1ce3ceef140}, hash: CB698AEA6799C11D97FBEF1919566E2D
    @Test()
    public void forObjectWhenIsStaticModule() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : false  #  inside forObject method
         * (delegate instanceof Class) : true  #  inside isStaticModule method
         * (isStaticModule()) : true  #  inside getDelegateModuleClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Object object = new Object();
            //Act Statement(s)
            Module result = ProviderMethodsModule.forObject(object);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${38d54811-f31e-3906-aa82-55433a9a3467}, hash: 0A52FD72F1C4F1354C9D80FDC9558228
    @Test()
    public void forObjectWhenIsStaticModuleNot() {
        /* Branches:
         * (object instanceof ProviderMethodsModule) : false  #  inside forObject method
         * (delegate instanceof Class) : false  #  inside isStaticModule method
         * (isStaticModule()) : false  #  inside getDelegateModuleClass method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Object object = new Object();
            //Act Statement(s)
            Module result = ProviderMethodsModule.forObject(object);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }
}
