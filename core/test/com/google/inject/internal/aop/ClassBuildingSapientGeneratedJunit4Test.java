package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;

import com.google.inject.TypeLiteral;

import java.lang.reflect.Executable;
import java.util.function.Function;

import com.google.inject.internal.BytecodeGen;
import org.mockito.MockedStatic;

import java.util.function.Consumer;
import java.lang.reflect.Constructor;
import java.util.function.BiFunction;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ClassBuildingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Executable memberMock = mock(Executable.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${f2d89d37-5c71-377f-b65f-25f5d1f6fbdb}, hash: 3B5451642A3191FE17FAF1C9B952C18E
    @Ignore()
    @Test()
    public void signatureWhenParameterTypesIsNotEmpty() {
        /* Branches:
         * (for-each(parameterTypes)) : true  #  inside signature method
         */
        //Arrange Statement(s)
        Constructor constructorMock = mock(Constructor.class);
        Class<?>[] classArray = new Class[]{Object.class};
        doReturn(classArray).when(constructorMock).getParameterTypes();
        //Act Statement(s)
        String result = ClassBuilding.signature(constructorMock);
        //Assert statement(s)
        assertThat(result, equalTo("<init>;java.lang.Object"));
        verify(constructorMock).getParameterTypes();
    }

    //Sapient generated method id: ${6d7cef34-7215-3f80-b29f-939fa0f00df0}, hash: 8214ED18FFECB387FD484643FFC996EE
    @Ignore()
    @Test()
    public void signature1WhenParameterTypesIsNotEmpty() {
        /* Branches:
         * (for-each(parameterTypes)) : true  #  inside signature method
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class);
        doReturn("A").when(methodMock).getName();
        Class<?>[] classArray = new Class[]{Object.class};
        doReturn(classArray).when(methodMock).getParameterTypes();
        //Act Statement(s)
        String result = ClassBuilding.signature(methodMock);
        //Assert statement(s)
        assertThat(result, equalTo("A;java.lang.Object"));
        verify(methodMock).getName();
        verify(methodMock).getParameterTypes();
    }

    //Sapient generated method id: ${012874db-0989-3abf-909d-cec5c4e173cf}, hash: 1F40E2D53CC0AB4C57191522EA9A440D
    @Ignore()
    @Test()
    public void canEnhanceWhenModifiersAndPRIVATEEquals0() {
        /* Branches:
         * ((modifiers & (PUBLIC | PROTECTED)) != 0) : false  #  inside canAccess method
         * (samePackage) : true  #  inside canAccess method
         * ((modifiers & PRIVATE) == 0) : true  #  inside canAccess method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class)) {
            doReturn(0).when(memberMock).getModifiers();
            classDefining.when(() -> ClassDefining.hasPackageAccess()).thenReturn(true);
            //Act Statement(s)
            boolean result = ClassBuilding.canEnhance(memberMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(memberMock).getModifiers();
            classDefining.verify(() -> ClassDefining.hasPackageAccess(), atLeast(1));
        }
    }

    //Sapient generated method id: ${5430f8b2-68a1-32a9-837a-bdc57bcff9d8}, hash: F488024750C428B7A69636FA73A027A0
    @Ignore()
    @Test()
    public void canEnhanceWhenModifiersAndPRIVATENotEquals0() {
        /* Branches:
         * ((modifiers & (PUBLIC | PROTECTED)) != 0) : false  #  inside canAccess method
         * (samePackage) : true  #  inside canAccess method
         * ((modifiers & PRIVATE) == 0) : false  #  inside canAccess method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class)) {
            doReturn(0).when(memberMock).getModifiers();
            classDefining.when(() -> ClassDefining.hasPackageAccess()).thenReturn(true);
            //Act Statement(s)
            boolean result = ClassBuilding.canEnhance(memberMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(memberMock).getModifiers();
            classDefining.verify(() -> ClassDefining.hasPackageAccess(), atLeast(1));
        }
    }

    //Sapient generated method id: ${b9282831-0b14-35b2-b254-d24b3ba0465a}, hash: 11FC8D83C6FB69C7381BDF79EA057A27
    @Ignore()
    @Test()
    public void buildEnhancerBuilderWhenOVERRIDABLE_OBJECT_METHODSIsEmptyAndInterfaceStackIsEmptyAndInterfacesIsEmptyAndMethodPartition() {
        /* Branches:
         * (hasPackageAccess()) : true  #  inside visitMethodHierarchy method
         * (clazz != Object.class) : true  #  inside visitMethodHierarchy method
         * (clazz != null) : true  #  inside visitMethodHierarchy method
         * (hostPackage != null) : true  #  inside visitMethodHierarchy method
         * (hostPackage.equals(packageName(clazz.getName()))) : true  #  inside visitMethodHierarchy method
         * (interfaces.length > 0) : true  #  inside pushInterfaces method
         * (for-each(OVERRIDABLE_OBJECT_METHODS)) : false  #  inside visitMethodHierarchy method
         * (!interfaceStack.isEmpty()) : false  #  inside visitMethodHierarchy method
         * (for-each(interfaces)) : false  #  inside visitMethodHierarchy method
         * (for-each(methodPartitions.values())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class, CALLS_REAL_METHODS)) {
            Method[] methodArray = new Method[]{};
            classBuilding.when(() -> ClassBuilding.visitMembers(eq(methodArray), eq(true), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            BytecodeGen.EnhancerBuilder result = ClassBuilding.buildEnhancerBuilder(Object.class);
            //Assert statement(s)
            //TODO: Please implement equals method in EnhancerBuilderImpl for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            classBuilding.verify(() -> ClassBuilding.visitMembers(eq(methodArray), eq(true), (Consumer) any()), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${9a79696b-c008-303c-b2c0-43167fe82bd6}, hash: CD60E1D0EBCEC18F8F24E70A79C91166
    @Ignore()
    @Test()
    public void buildEnhancerBuilderWhenInterfaceStackIsEmptyAndInterfacesIsEmptyAndMethodPartitionsValuesIsEmpty3() {
        /* Branches:
         * (hasPackageAccess()) : true  #  inside visitMethodHierarchy method
         * (clazz != Object.class) : true  #  inside visitMethodHierarchy method
         * (clazz != null) : true  #  inside visitMethodHierarchy method
         * (hostPackage != null) : true  #  inside visitMethodHierarchy method
         * (hostPackage.equals(packageName(clazz.getName()))) : false  #  inside visitMethodHierarchy method
         * (interfaces.length > 0) : false  #  inside pushInterfaces method
         * (for-each(OVERRIDABLE_OBJECT_METHODS)) : false  #  inside visitMethodHierarchy method
         * (!interfaceStack.isEmpty()) : false  #  inside visitMethodHierarchy method
         * (for-each(interfaces)) : false  #  inside visitMethodHierarchy method
         * (for-each(methodPartitions.values())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class, CALLS_REAL_METHODS)) {
            Method[] methodArray = new Method[]{};
            classBuilding.when(() -> ClassBuilding.visitMembers(eq(methodArray), eq(false), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            BytecodeGen.EnhancerBuilder result = ClassBuilding.buildEnhancerBuilder(Object.class);
            //Assert statement(s)
            //TODO: Please implement equals method in EnhancerBuilderImpl for verification of the entire object or you need to adjust respective assertion statements
            assertThat(result, is(notNullValue()));
            classBuilding.verify(() -> ClassBuilding.visitMembers(eq(methodArray), eq(false), (Consumer) any()), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${cbfe6476-2778-3510-becc-6195a77ebf9b}, hash: B0EF0096FA86AFA8279B510528A54848
    @Ignore()
    @Test()
    public void canFastInvokeWhenModifiersNotEqualsPRIVATE() {
        /* Branches:
         * (hasPackageAccess()) : true
         * (modifiers != PRIVATE) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class)) {
            doReturn(0).when(memberMock).getModifiers();
            classDefining.when(() -> ClassDefining.hasPackageAccess()).thenReturn(true);
            //Act Statement(s)
            boolean result = ClassBuilding.canFastInvoke(memberMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(memberMock).getModifiers();
            classDefining.verify(() -> ClassDefining.hasPackageAccess(), atLeast(1));
        }
    }

    //Sapient generated method id: ${d357d8db-78bd-363b-b630-6211dfc2fb51}, hash: F34670AF3BB049A619AB454E025CD133
    @Ignore()
    @Test()
    public void canFastInvokeWhenModifiersEqualsPRIVATE() {
        /* Branches:
         * (hasPackageAccess()) : true
         * (modifiers != PRIVATE) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Executable memberMock = mock(Executable.class, "value");
        try (MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class)) {
            doReturn(0).when(memberMock).getModifiers();
            classDefining.when(() -> ClassDefining.hasPackageAccess()).thenReturn(true);
            //Act Statement(s)
            boolean result = ClassBuilding.canFastInvoke(memberMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(memberMock).getModifiers();
            classDefining.verify(() -> ClassDefining.hasPackageAccess(), atLeast(1));
        }
    }

    //Sapient generated method id: ${1eabd1bb-0413-3005-8eff-70e661f34cc5}, hash: FCBB272E327F3F7F8C145DBE48100F93
    @Ignore()
    @Test()
    public void buildFastClassWhenHasPackageAccess() {
        /* Branches:
         * (hasPackageAccess()) : true  #  inside visitFastConstructors method
         * (hasPackageAccess()) : true  #  inside visitFastMethods method
         */
        //Arrange Statement(s)
        /*try (MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class, CALLS_REAL_METHODS)) {
    Constructor constructor = constructorArray[0];
    Constructor<?>[] constructorArray = new Constructor[] { constructor };
    classBuilding.when(() -> ClassBuilding.visitMembers(eq(constructorArray), eq(true), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
    Method method = methodArray[0];
    Method method2 = methodArray[1];
    Method method3 = methodArray[2];
    Method method4 = methodArray[3];
    Method method5 = methodArray[4];
    Method method6 = methodArray[5];
    Method method7 = methodArray[6];
    Method method8 = methodArray[7];
    Method method9 = methodArray[8];
    Method method10 = methodArray[9];
    Method method11 = methodArray[10];
    Method[] methodArray = new Method[] { method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11 };
    classBuilding.when(() -> ClassBuilding.visitMembers(eq(methodArray), eq(true), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    Function<String, BiFunction<Object, Object[], Object>> result = ClassBuilding.buildFastClass(Object.class);
    //Assert statement(s)
    //TODO: Please implement equals method in Function for verification of the entire object or you need to adjust respective assertion statements
    assertThat(result, is(notNullValue()));
    classBuilding.verify(() -> ClassBuilding.visitMembers(eq(constructorArray), eq(true), (Consumer) any()), atLeast(1));
    classBuilding.verify(() -> ClassBuilding.visitMembers(eq(methodArray), eq(true), (Consumer) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${50d3cdab-c947-35dd-9cd9-a10739234367}, hash: 1C7920C786D5C0914FD69FB872F4DD0A
    @Ignore()
    @Test()
    public void visitMembersWhenCanAccessMemberSamePackage() {
        /* Branches:
         * (for-each(members)) : true
         * ((modifiers & (PUBLIC | PROTECTED)) != 0) : true  #  inside canAccess method
         * (canAccess(member, samePackage)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: visitor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Method method = methodArray[0];
        //Method method2 = methodArray[1];
        //Method method3 = methodArray[2];
        //Method method4 = methodArray[3];
        //Method method5 = methodArray[4];
        //Method method6 = methodArray[5];
        //Method method7 = methodArray[6];
        //Method method8 = methodArray[7];
        //Method method9 = methodArray[8];
        //Method method10 = methodArray[9];
        //Method method11 = methodArray[10];
        //Method[] methodArray = new Method[] { method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11 };
        //Act Statement(s)
        //ClassBuilding.visitMembers(methodArray, false, null);
    }
}
