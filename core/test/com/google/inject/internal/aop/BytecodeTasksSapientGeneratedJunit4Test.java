package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.objectweb.asm.Type;
import org.mockito.stubbing.Answer;
import org.objectweb.asm.MethodVisitor;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class BytecodeTasksSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final MethodVisitor methodVisitorMock = mock(MethodVisitor.class);

    private final MethodVisitor mvMock = mock(MethodVisitor.class);

    private final Type primitiveTypeMock = mock(Type.class);

    private final Type typeMock = mock(Type.class, "Type");

    //Sapient generated method id: ${fb0940b7-8263-30da-9cb3-855e542abd88}, hash: F14603B6169C281FEE0B38CEA961BCBB
    @Test()
    public void pushIntegerWhenValueLessThanMinus1() {
        /* Branches:
         * (value < -1) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitLdcInsn(-2);
        //Act Statement(s)
        BytecodeTasks.pushInteger(mvMock, -2);
        //Assert statement(s)
        verify(mvMock).visitLdcInsn(-2);
    }

    //Sapient generated method id: ${68904160-82e9-3058-9dfd-4b8d1a6f5d96}, hash: 0D3D01AB7D306C1935665A9D4F8B3097
    @Test()
    public void pushIntegerWhenValueLessThanOrEqualsTo5() {
        /* Branches:
         * (value < -1) : false
         * (value <= 5) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitInsn(3);
        //Act Statement(s)
        BytecodeTasks.pushInteger(mvMock, 0);
        //Assert statement(s)
        verify(mvMock).visitInsn(3);
    }

    //Sapient generated method id: ${5b31ddc8-4b47-388c-b809-f62dc4e2d4f4}, hash: 7A03F57669E52733D44813427E3393F8
    @Test()
    public void pushIntegerWhenValueLessThanOrEqualsToByteMAX_VALUE() {
        /* Branches:
         * (value < -1) : false
         * (value <= 5) : false
         * (value <= Byte.MAX_VALUE) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitIntInsn(16, 6);
        //Act Statement(s)
        BytecodeTasks.pushInteger(mvMock, 6);
        //Assert statement(s)
        verify(mvMock).visitIntInsn(16, 6);
    }

    //Sapient generated method id: ${e08b73a1-0f6e-3d02-b5b5-e0f8c9b7d59b}, hash: 68BEA584864237F69448B6AD2AF7B941
    @Test()
    public void pushIntegerWhenValueLessThanOrEqualsToShortMAX_VALUE() {
        /* Branches:
         * (value < -1) : false
         * (value <= 5) : false
         * (value <= Byte.MAX_VALUE) : false
         * (value <= Short.MAX_VALUE) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitIntInsn(17, 128);
        //Act Statement(s)
        BytecodeTasks.pushInteger(mvMock, 128);
        //Assert statement(s)
        verify(mvMock).visitIntInsn(17, 128);
    }

    //Sapient generated method id: ${5c908b2c-39bc-3aea-bcc7-e32ef605a707}, hash: DFDA01A16815E9967712C8D8C289A58D
    @Test()
    public void pushIntegerWhenValueGreaterThanShortMAX_VALUE() {
        /* Branches:
         * (value < -1) : false
         * (value <= 5) : false
         * (value <= Byte.MAX_VALUE) : false
         * (value <= Short.MAX_VALUE) : false
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitLdcInsn(32768);
        //Act Statement(s)
        BytecodeTasks.pushInteger(mvMock, 32768);
        //Assert statement(s)
        verify(mvMock).visitLdcInsn(32768);
    }

    //Sapient generated method id: ${962edee3-2bed-3672-902a-888c7a11ad83}, hash: 69B096EF7D337C8406817A191583A544
    @Ignore()
    @Test()
    public void packArgumentsWhenParameterTypeIsPrimitive() {
        /* Branches:
         * (for-each(parameterTypes)) : true
         * (parameterType.isPrimitive()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class, CALLS_REAL_METHODS);
             MockedStatic<Type> type = mockStatic(Type.class)) {
            doNothing().when(mvMock).visitTypeInsn(189, "java/lang/Object");
            doNothing().when(mvMock).visitInsn(89);
            doNothing().when(mvMock).visitInsn(83);
            bytecodeTasks.when(() -> BytecodeTasks.pushInteger(mvMock, 1)).thenAnswer((Answer<Void>) invocation -> null);
            bytecodeTasks.when(() -> BytecodeTasks.pushInteger(mvMock, 0)).thenAnswer((Answer<Void>) invocation -> null);
            bytecodeTasks.when(() -> BytecodeTasks.loadArgument(mvMock, Object.class, 1)).thenReturn(1);
            type.when(() -> Type.getType(Object.class)).thenReturn(typeMock);
            bytecodeTasks.when(() -> BytecodeTasks.box(mvMock, typeMock)).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[]{Object.class};
            //Act Statement(s)
            BytecodeTasks.packArguments(mvMock, classArray);
            //Assert statement(s)
            verify(mvMock, atLeast(1)).visitTypeInsn(189, "java/lang/Object");
            verify(mvMock, atLeast(1)).visitInsn(89);
            verify(mvMock, atLeast(1)).visitInsn(83);
            bytecodeTasks.verify(() -> BytecodeTasks.pushInteger(mvMock, 1), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.pushInteger(mvMock, 0), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.loadArgument(mvMock, Object.class, 1), atLeast(1));
            type.verify(() -> Type.getType(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.box(mvMock, typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e41123b1-acf3-3589-9c44-ced24f630652}, hash: C5360ED687FA1D8F0B3E9B5F8D0526D7
    @Ignore()
    @Test()
    public void unpackArgumentsWhenParameterTypeIsPrimitive() {
        /* Branches:
         * (for-each(parameterTypes)) : true
         * (parameterType.isPrimitive()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class, CALLS_REAL_METHODS);
             MockedStatic<Type> type = mockStatic(Type.class)) {
            doNothing().when(mvMock).visitVarInsn(25, 2);
            doNothing().when(mvMock).visitInsn(50);
            bytecodeTasks.when(() -> BytecodeTasks.pushInteger(mvMock, 0)).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getType(Object.class)).thenReturn(typeMock);
            bytecodeTasks.when(() -> BytecodeTasks.unbox(mvMock, typeMock)).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[]{Object.class};
            //Act Statement(s)
            BytecodeTasks.unpackArguments(mvMock, classArray);
            //Assert statement(s)
            verify(mvMock, atLeast(1)).visitVarInsn(25, 2);
            verify(mvMock, atLeast(1)).visitInsn(50);
            bytecodeTasks.verify(() -> BytecodeTasks.pushInteger(mvMock, 0), atLeast(1));
            type.verify(() -> Type.getType(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unbox(mvMock, typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${94be32db-a0d5-3df0-8ed5-1313d88de173}, hash: 2D9BAC3B88C82475A217DBB41C0962E4
    @Test()
    public void unpackArgumentsWhenParameterTypeNotIsPrimitive() {
        /* Branches:
         * (for-each(parameterTypes)) : true
         * (parameterType.isPrimitive()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class, CALLS_REAL_METHODS)) {
            doNothing().when(mvMock).visitVarInsn(25, 2);
            doNothing().when(mvMock).visitInsn(50);
            doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Object");
            bytecodeTasks.when(() -> BytecodeTasks.pushInteger(mvMock, 0)).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[]{Object.class};
            //Act Statement(s)
            BytecodeTasks.unpackArguments(mvMock, classArray);
            //Assert statement(s)
            verify(mvMock, atLeast(1)).visitVarInsn(25, 2);
            verify(mvMock, atLeast(1)).visitInsn(50);
            verify(mvMock, atLeast(1)).visitTypeInsn(192, "java/lang/Object");
            bytecodeTasks.verify(() -> BytecodeTasks.pushInteger(mvMock, 0), atLeast(1));
        }
    }

    //Sapient generated method id: ${4df1334a-6ebe-3de9-8660-72878a889b03}, hash: 33716896AB9A77D56A56CF91E83B8FE9
    @Test()
    public void loadArgumentWhenParameterTypeNotIsPrimitive() {
        /* Branches:
         * (!parameterType.isPrimitive()) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitVarInsn(25, 0);
        //Act Statement(s)
        int result = BytecodeTasks.loadArgument(mvMock, Object.class, 0);
        //Assert statement(s)
        assertThat(result, equalTo(1));
        verify(mvMock).visitVarInsn(25, 0);
    }

    //Sapient generated method id: ${9ed29df1-aaef-374b-9b4d-189335087284}, hash: DAE73165CDFB4210CF850F82D9751243
    @Ignore()
    @Test()
    public void loadArgumentWhenParameterTypeIsPrimitive() {
        /* Branches:
         * (!parameterType.isPrimitive()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Type typeMock = mock(Type.class);
        try (MockedStatic<Type> type = mockStatic(Type.class)) {
            doNothing().when(mvMock).visitVarInsn(0, 0);
            type.when(() -> Type.getType(Object.class)).thenReturn(typeMock);
            doReturn(0).when(typeMock).getOpcode(21);
            doReturn(0).when(typeMock).getSize();
            //Act Statement(s)
            int result = BytecodeTasks.loadArgument(mvMock, Object.class, 0);
            //Assert statement(s)
            assertThat(result, equalTo(0));
            verify(mvMock).visitVarInsn(0, 0);
            type.verify(() -> Type.getType(Object.class), atLeast(1));
            verify(typeMock).getOpcode(21);
            verify(typeMock).getSize();
        }
    }

    //Sapient generated method id: ${dc6b9f74-ec25-3502-9f2e-6c10504f2f13}, hash: 84C4F99504C5E28C7AC44385FE1C25B9
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeBOOLEAN() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.BOOLEAN) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
        doReturn(1).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${c15206a3-3cbd-3e8a-8aad-758c191ebd36}, hash: A721BB4285E5CF006C25FDAF15DC9629
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeBYTE() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.BYTE) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
        doReturn(3).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${3bbe0e5f-b121-3d45-ab9b-19730034cc57}, hash: 8570136BF3E68F9629C5BF38D6C135ED
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeCHAR() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.CHAR) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
        doReturn(2).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${0749efe1-3768-386d-a5cd-9fd3d956bc7a}, hash: E788198A10513CD63761A105C02230EA
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeDOUBLE() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.DOUBLE) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
        doReturn(8).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${498a4610-2c5e-3bce-88ba-96899944c4d1}, hash: A5F998A57E0917A225AAE03FA6F48A99
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeFLOAT() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.FLOAT) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
        doReturn(6).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${5fd59d34-7268-39a7-894e-53de8360d9b1}, hash: 904981F0152BDD81C837FC32E50FF90E
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeINT() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.INT) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
        doReturn(5).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${da97808c-a654-3faa-a5bd-c7fdcf598700}, hash: 4B77E7B5B69B23B1588A7D4BE3D89889
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeLONG() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.LONG) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
        doReturn(7).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${d7d9aa01-063e-3b0f-8647-30533e072a41}, hash: 9599F6B0145CFEE9EE6BA03C21016A9A
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseTypeSHORT() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.SHORT) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
        doReturn(4).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.box(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${c37ada5e-f64f-35e8-a56e-1beceb20bc91}, hash: 28578A9CE0C56513427F57F5A5FAEC5C
    @Test()
    public void boxWhenSwitchPrimitiveTypeGetSortCaseDefault() {
        /* Branches:
         * (switch(primitiveType.getSort()) = default) : true
         */
        //Arrange Statement(s)
        Type type = Type.getType(Object.class);
        //Act Statement(s)
        BytecodeTasks.box(methodVisitorMock, type);
    }

    //Sapient generated method id: ${4ce90bb2-a16a-360f-87ba-b55b4af55079}, hash: E4D63AF86697390191241445A47DDA0E
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeBOOLEAN() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.BOOLEAN) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Boolean");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z", false);
        doReturn(1).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Boolean");
        verify(mvMock).visitMethodInsn(182, "java/lang/Boolean", "booleanValue", "()Z", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${bb4828da-4987-32e0-b5e4-289a8daa1fb9}, hash: 20A48389EADEB0BEEA1214891B978872
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeBYTE() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.BYTE) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Byte");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Byte", "byteValue", "()B", false);
        doReturn(3).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Byte");
        verify(mvMock).visitMethodInsn(182, "java/lang/Byte", "byteValue", "()B", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${aaa72a6c-1f5e-372e-aa76-9b8b8925948f}, hash: AF0D1778A0559F1CD15813D801FC73D9
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeCHAR() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.CHAR) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Character");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Character", "charValue", "()C", false);
        doReturn(2).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Character");
        verify(mvMock).visitMethodInsn(182, "java/lang/Character", "charValue", "()C", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${0f94dc8e-8384-3305-8531-7903b9ff7c20}, hash: EFE35EBA7F67D470ABF0454B23B550FF
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeDOUBLE() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.DOUBLE) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Double");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Double", "doubleValue", "()D", false);
        doReturn(8).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Double");
        verify(mvMock).visitMethodInsn(182, "java/lang/Double", "doubleValue", "()D", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${faf5da33-b451-3bd9-859a-a78aba908e5b}, hash: CFE351739D8AB4CA0900B4D28F03C6E5
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeFLOAT() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.FLOAT) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Float");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Float", "floatValue", "()F", false);
        doReturn(6).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Float");
        verify(mvMock).visitMethodInsn(182, "java/lang/Float", "floatValue", "()F", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${1e0e27d1-6652-3836-8b43-844a68b0fb6d}, hash: 5A23FA84F6749D69685D9DF6583F5AF2
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeINT() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.INT) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Integer");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Integer", "intValue", "()I", false);
        doReturn(5).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Integer");
        verify(mvMock).visitMethodInsn(182, "java/lang/Integer", "intValue", "()I", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${4b4e5ce9-e2ca-357f-9ae5-cacfc4cf6fac}, hash: 5B561C8712C97E1358FF1050C8A1F320
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeLONG() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.LONG) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Long");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Long", "longValue", "()J", false);
        doReturn(7).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Long");
        verify(mvMock).visitMethodInsn(182, "java/lang/Long", "longValue", "()J", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${a2c7d2db-16f0-37b0-9e42-151f7e3dd6db}, hash: 626280B1EFE3B4E55A3C20162E871187
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseTypeSHORT() {
        /* Branches:
         * (switch(primitiveType.getSort()) = Type.SHORT) : true
         */
        //Arrange Statement(s)
        doNothing().when(mvMock).visitTypeInsn(192, "java/lang/Short");
        doNothing().when(mvMock).visitMethodInsn(182, "java/lang/Short", "shortValue", "()S", false);
        doReturn(4).when(primitiveTypeMock).getSort();
        //Act Statement(s)
        BytecodeTasks.unbox(mvMock, primitiveTypeMock);
        //Assert statement(s)
        verify(mvMock).visitTypeInsn(192, "java/lang/Short");
        verify(mvMock).visitMethodInsn(182, "java/lang/Short", "shortValue", "()S", false);
        verify(primitiveTypeMock).getSort();
    }

    //Sapient generated method id: ${c69ab964-bba4-31e9-b7ff-c2f9724320f7}, hash: F3E842377EF372F4CAF2776F1CA68BA8
    @Test()
    public void unboxWhenSwitchPrimitiveTypeGetSortCaseDefault() {
        /* Branches:
         * (switch(primitiveType.getSort()) = default) : true
         */
        //Arrange Statement(s)
        Type type = Type.getType(Object.class);
        //Act Statement(s)
        BytecodeTasks.unbox(methodVisitorMock, type);
    }
}
