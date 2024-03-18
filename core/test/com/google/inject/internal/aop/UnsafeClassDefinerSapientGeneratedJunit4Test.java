package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.AccessController;

import org.mockito.MockedStatic;

import java.security.PrivilegedExceptionAction;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class UnsafeClassDefinerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ClassDefiner UNSAFE_DEFINERMock = mock(ClassDefiner.class, "UNSAFE_DEFINER");

    private final ClassDefiner classDefinerMock = mock(ClassDefiner.class);

    //Sapient generated method id: ${f14a2bb2-1ee1-3909-a2fa-4e4a1e311d86}, hash: A53A3138CD30B401262ED3F0F42A0515
    @Test()
    public void isAccessibleWhenUNSAFE_DEFINERIsNotNull() {
        /* Branches:
         * (UNSAFE_DEFINER != null) : true
         */
        //Act Statement(s)
        boolean result = UnsafeClassDefiner.isAccessible();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${774ff10f-b826-3948-9c48-8a56a65f2b66}, hash: FEFE55862F32644E2B444F9E68D974B1
    @Ignore()
    @Test()
    public void isAccessibleWhenUNSAFE_DEFINERIsNull() {
        /* Branches:
         * (UNSAFE_DEFINER != null) : false
         */
        //Act Statement(s)
        boolean result = UnsafeClassDefiner.isAccessible();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${19335e20-d7d7-352b-b49a-b8c8a2487861}, hash: 1075B8181477A702157588D25539D2B9
    @Test()
    public void canLoadProxyByNameWhenFindClassDefinerHostClassGetClassLoaderEqualsUNSAFE_DEFINER() {
        /* Branches:
         * (hostLoader == null) : true  #  inside findClassDefiner method
         * (findClassDefiner(hostClass.getClassLoader()) != UNSAFE_DEFINER) : false
         */
        //Act Statement(s)
        boolean result = UnsafeClassDefiner.canLoadProxyByName(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${62c72fc7-5a4f-3e68-9df4-decfe0aea39b}, hash: 510C79570BC06628294F4BBC553CD28B
    @Ignore()
    @Test()
    public void canLoadProxyByNameWhenFindClassDefinerHostClassGetClassLoaderNotEqualsUNSAFE_DEFINER() {
        /* Branches:
         * (hostLoader == null) : false  #  inside findClassDefiner method
         * (ALWAYS_DEFINE_ANONYMOUSLY) : false  #  inside findClassDefiner method
         * (ClassLoaderDefineClassHolder.CLASS_LOADER_DEFINE_CLASS != null) : true  #  inside findClassDefiner method
         * (findClassDefiner(hostClass.getClassLoader()) != UNSAFE_DEFINER) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = UnsafeClassDefiner.canLoadProxyByName(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${d6126b03-49f6-3f3d-94ea-40ed1df362d5}, hash: 36F0C9D1C931E8D5BDD0FD1AC3729FA0
    @Ignore()
    @Test()
    public void canDowncastToProxyWhenFindClassDefinerHostClassGetClassLoaderInstanceOfAnonymousClassDefiner() {
        /* Branches:
         * (hostLoader == null) : true  #  inside findClassDefiner method
         * (!(findClassDefiner(hostClass.getClassLoader()) instanceof AnonymousClassDefiner)) : false
         */
        //Act Statement(s)
        boolean result = UnsafeClassDefiner.canDowncastToProxy(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${85155909-87f9-3d4d-8a17-aacdc0db2b7e}, hash: 532BA86CE8C1D82F9B14428EB186431E
    @Test()
    public void canDowncastToProxyWhenClassLoaderDefineClassHolderCLASS_LOADER_DEFINE_CLASSIsNotNullAndFindClassDefinerHostClassGetClas() {
        /* Branches:
         * (hostLoader == null) : false  #  inside findClassDefiner method
         * (ALWAYS_DEFINE_ANONYMOUSLY) : false  #  inside findClassDefiner method
         * (ClassLoaderDefineClassHolder.CLASS_LOADER_DEFINE_CLASS != null) : true  #  inside findClassDefiner method
         * (!(findClassDefiner(hostClass.getClassLoader()) instanceof AnonymousClassDefiner)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = UnsafeClassDefiner.canDowncastToProxy(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${494c6959-2e3f-37b7-8267-6aca48af9543}, hash: B566D0F7AC36BFD17FA0F9E8CD4E8144
    @Ignore()
    @Test()
    public void defineWhenHostLoaderIsNull() throws Exception {
        /* Branches:
         * (hostLoader == null) : true  #  inside findClassDefiner method
         */
        //Arrange Statement(s)
        UnsafeClassDefiner target = new UnsafeClassDefiner();
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Class<?> result = target.define(Object.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${d90df351-921f-3d34-b733-d4f45e5ef147}, hash: 8D313E4DAA21CFFF67FCEC2AB586C79C
    @Ignore()
    @Test()
    public void defineWhenClassLoaderDefineClassHolderCLASS_LOADER_DEFINE_CLASSIsNotNull() throws Exception {
        /* Branches:
         * (hostLoader == null) : false  #  inside findClassDefiner method
         * (ALWAYS_DEFINE_ANONYMOUSLY) : false  #  inside findClassDefiner method
         * (ClassLoaderDefineClassHolder.CLASS_LOADER_DEFINE_CLASS != null) : true  #  inside findClassDefiner method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ClassDefiner
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UnsafeClassDefiner target = new UnsafeClassDefiner();
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Class<?> result = target.define(Object.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${b0beeda9-7485-34ce-a8de-a2a01e7fd12b}, hash: 86FC80DBFAF412A981D2F4457859EA15
    @Ignore()
    @Test()
    public void tryPrivilegedTest() throws Throwable {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Object result = UnsafeClassDefiner.tryPrivileged(null, "Cannot bind MethodHandles.Lookup.defineHiddenClass");
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${c5eb5f54-a48c-35ee-be5b-89092ecaf98f}, hash: 6CC6C02DFCE99795F67D7007D87D0C7A
    @Ignore()
    @Test()
    public void tryPrivilegedWhenCaughtThrowable() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class);
        try (MockedStatic<AccessController> accessController = mockStatic(AccessController.class)) {
            accessController.when(() -> AccessController.doPrivileged((PrivilegedExceptionAction) any())).thenReturn(objectMock);
            //Act Statement(s)
            Object result = UnsafeClassDefiner.tryPrivileged(null, "Cannot bind MethodHandles.Lookup.defineHiddenClass");
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            accessController.verify(() -> AccessController.doPrivileged((PrivilegedExceptionAction) any()));
        }
    }

    //Sapient generated method id: ${8df0271a-75cd-37d7-9a39-5036d3610ce0}, hash: D85A64D3C5E1FBFBD3B9869CAB6E743C
    @Test()
    public void tryAccessDefineClassTest() throws Throwable {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<UnsafeClassDefiner> unsafeClassDefiner = mockStatic(UnsafeClassDefiner.class, CALLS_REAL_METHODS)) {
            unsafeClassDefiner.when(() -> UnsafeClassDefiner.accessDefineClass(Class.class)).thenReturn(classDefinerMock);
            //Act Statement(s)
            ClassDefiner result = UnsafeClassDefiner.tryAccessDefineClass(Class.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            unsafeClassDefiner.verify(() -> UnsafeClassDefiner.accessDefineClass(Class.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${9a052eda-62bf-3d86-aaf6-5e48bf073c2c}, hash: C58FE9B044AA0E68AE0579A87BC624BF
    @Ignore()
    @Test()
    public void tryAccessDefineClassWhenCaughtThrowable() throws Throwable {
        /* Branches:
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AccessController> accessController = mockStatic(AccessController.class)) {
            accessController.when(() -> AccessController.doPrivileged((PrivilegedExceptionAction) any())).thenReturn(classDefinerMock);
            //Act Statement(s)
            ClassDefiner result = UnsafeClassDefiner.tryAccessDefineClass(Class.class);
            //Assert statement(s)
            assertThat(result, equalTo(UNSAFE_DEFINERMock));
            accessController.verify(() -> AccessController.doPrivileged((PrivilegedExceptionAction) any()));
        }
    }

    //Sapient generated method id: ${6b31c262-2f4d-36a5-ab78-2f12aa9debf3}, hash: 6B09FA2F713949B6A52115AA4E57792E
    @Ignore()
    @Test()
    public void accessDefineClassTest() throws Exception {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: cw - Method: visit
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{(byte) -54, (byte) -2, (byte) -70, (byte) -66, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        doReturn(Object.class).when(UNSAFE_DEFINERMock).define(Object.class, byteArray);
        //Act Statement(s)
        ClassDefiner result = UnsafeClassDefiner.accessDefineClass(Object.class);
        //Assert statement(s)
        //TODO: Please implement equals method in GeneratedClassDefiner for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(UNSAFE_DEFINERMock).define(Object.class, byteArray);
    }
}
