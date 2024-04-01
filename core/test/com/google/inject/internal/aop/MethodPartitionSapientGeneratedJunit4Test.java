package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.lang.reflect.Method;

import com.google.inject.TypeLiteral;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class MethodPartitionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Method candidateMock = mock(Method.class);

    private final Consumer consumerMock = mock(Consumer.class);

    private final TypeLiteral hostMock = mock(TypeLiteral.class);

    private final Method methodMock = mock(Method.class);

    private final Method methodMock2 = mock(Method.class);

    private final Method methodMock3 = mock(Method.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${a91b9dc7-a3b4-328f-ae1d-f52f1b04c338}, hash: AA39B7BA5B1E1B6CB8E973DA98BA7BA2
    @Test()
    public void addCandidateTest() {
        //Arrange Statement(s)
        MethodPartition target = new MethodPartition(methodMock, methodMock2);
        //Act Statement(s)
        MethodPartition result = target.addCandidate(methodMock3);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${23e3db08-859d-3e91-9e72-cf8f7be63c8b}, hash: F8168C8996C36F63CD26DB604F963E52
    @Ignore()
    @Test()
    public void collectEnhanceableMethodsWhenBridgeTargetsEntrySetIsEmpty() {
        /* Branches:
         * (for-each(candidates)) : true
         * (i < len) : true  #  inside parametersKey method
         * (i > 0) : false  #  inside parametersKey method
         * (existingLeafMethod == null) : true
         * (candidate.isBridge()) : true
         * (for-each(leafMethods.entrySet())) : true
         * ((method.getModifiers() & FINAL) != 0) : true
         * (for-each(bridgeTargets.entrySet())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Class<?>[] classArray = new Class[]{Object.class};
        doReturn(classArray).when(candidateMock).getParameterTypes();
        doReturn(true).when(candidateMock).isBridge();
        doReturn(0).when(candidateMock).getModifiers();
        MethodPartition target = new MethodPartition(candidateMock, methodMock);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        Method methodMock2 = mock(Method.class, "value");
        Map<Method, Method> methodMethodMap = new HashMap<>();
        methodMethodMap.put(methodMock2, methodMock3);
        //Act Statement(s)
        target.collectEnhanceableMethods(typeLiteral, consumerMock, methodMethodMap);
        //Assert statement(s)
        verify(candidateMock).getParameterTypes();
        verify(candidateMock).isBridge();
        verify(candidateMock).getModifiers();
    }

    //Sapient generated method id: ${fea1f20c-dda8-35de-94bb-bcf654c56ea7}, hash: 026DF52F2C132E2ECF83F90B79B255BF
    @Ignore()
    @Test()
    public void collectEnhanceableMethodsWhenMethodGetModifiersAndFINALEquals0AndMethodIsBridgeAndBridgeTargetsEntrySetIsEmpty() {
        /* Branches:
         * (for-each(candidates)) : true
         * (i < len) : true  #  inside parametersKey method
         * (i > 0) : false  #  inside parametersKey method
         * (existingLeafMethod == null) : true
         * (candidate.isBridge()) : false
         * (for-each(leafMethods.entrySet())) : true
         * ((method.getModifiers() & FINAL) != 0) : false
         * (!method.isBridge()) : false
         * (for-each(bridgeTargets.entrySet())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Class<?>[] classArray = new Class[]{Object.class, Object.class};
        doReturn(classArray).when(candidateMock).getParameterTypes();
        doReturn(0).when(candidateMock).getModifiers();
        doReturn(false, true).when(candidateMock).isBridge();
        MethodPartition target = new MethodPartition(candidateMock, methodMock);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        Method methodMock2 = mock(Method.class, "value");
        Map<Method, Method> methodMethodMap = new HashMap<>();
        methodMethodMap.put(methodMock2, methodMock3);
        //Act Statement(s)
        target.collectEnhanceableMethods(typeLiteral, consumerMock, methodMethodMap);
        //Assert statement(s)
        verify(candidateMock).getParameterTypes();
        verify(candidateMock, times(2)).isBridge();
        verify(candidateMock).getModifiers();
    }

    //Sapient generated method id: ${70e7ee08-449c-33ef-92e7-7666235ea22c}, hash: 2393767EF9F8D2C133EBDDE2FD001AA9
    @Test()
    public void collectEnhanceableMethodsWhenSameMethodThrowsNullPointerException() {
        /* Branches:
         * (for-each(candidates)) : true
         * (i < len) : true  #  inside parametersKey method
         * (i > 0) : false  #  inside parametersKey method
         * (existingLeafMethod == null) : true
         * (candidate.isBridge()) : true
         * (for-each(leafMethods.entrySet())) : true
         * ((method.getModifiers() & FINAL) != 0) : false
         * (!method.isBridge()) : true
         * (for-each(bridgeTargets.entrySet())) : true
         * (for-each(candidates)) : true
         * (!candidate.isBridge()) : true
         * (candidate == superTarget) : true
         * (sameMethod) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MethodPartition target = new MethodPartition((Method) null, methodMock);
        thrown.expect(NullPointerException.class);
        Map<Method, Method> methodMethodMap = new HashMap<>();
        //Act Statement(s)
        target.collectEnhanceableMethods(typeLiteralMock, consumerMock, methodMethodMap);
    }

    //Sapient generated method id: ${98fc2b63-afa3-343f-8d00-9712759b9c1e}, hash: 3874D82A000EA492000A02C2FB3A88E4
    @Ignore()
    @Test()
    public void collectEnhanceableMethodsWhenResolvedParametersMatchOriginalBridgeHostTypeCandidateAndEnhanceableMethodGetModifiersAndF() {
        /* Branches:
         * (for-each(candidates)) : true
         * (i < len) : true  #  inside parametersKey method
         * (i > 0) : false  #  inside parametersKey method
         * (existingLeafMethod == null) : true
         * (candidate.isBridge()) : true
         * (for-each(leafMethods.entrySet())) : true
         * ((method.getModifiers() & FINAL) != 0) : false
         * (!method.isBridge()) : true
         * (for-each(bridgeTargets.entrySet())) : true
         * (for-each(candidates)) : true
         * (!candidate.isBridge()) : true
         * (candidate == superTarget) : false
         * (sameMethod) : false
         * (i < len) : true  #  inside resolvedParametersMatch method
         * (parameterTypes[i] != resolvedTypes.get(i).getRawType()) : false  #  inside resolvedParametersMatch method
         * (resolvedParametersMatch(originalBridge, hostType, candidate)) : true
         * ((enhanceableMethod.getModifiers() & FINAL) == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TypeLiteral<?>> anyList = new ArrayList<>();
        anyList.add(typeLiteralMock);
        doReturn(anyList).when(hostMock).getParameterTypes(methodMock);
        doReturn(Object.class).when(typeLiteralMock).getRawType();
        MethodPartition target = new MethodPartition(methodMock, methodMock2);
        Map<Method, Method> methodMethodMap = new HashMap<>();
        //Act Statement(s)
        target.collectEnhanceableMethods(hostMock, consumerMock, methodMethodMap);
        Map<Method, Method> methodMethodMethodMethodMapMap = new HashMap<>();
        methodMethodMethodMethodMapMap.put(methodMock, methodMock);
        //Assert statement(s)
        assertThat(methodMethodMap, equalTo(methodMethodMethodMethodMapMap));
        verify(hostMock).getParameterTypes(methodMock);
        verify(typeLiteralMock).getRawType();
    }

    //Sapient generated method id: ${cb71369c-2cf9-389d-aa67-9b6a7e64edd8}, hash: 955F40447C3A6A1985A92C21A7BD5ACC
    @Ignore()
    @Test()
    public void collectEnhanceableMethodsWhenEnhanceableMethodGetModifiersAndFINALEquals0() {
        /* Branches:
         * (for-each(candidates)) : true
         * (i < len) : true  #  inside parametersKey method
         * (i > 0) : false  #  inside parametersKey method
         * (existingLeafMethod == null) : true
         * (candidate.isBridge()) : true
         * (for-each(leafMethods.entrySet())) : true
         * ((method.getModifiers() & FINAL) != 0) : false
         * (!method.isBridge()) : true
         * (for-each(bridgeTargets.entrySet())) : true
         * (for-each(candidates)) : true
         * (!candidate.isBridge()) : true
         * (candidate == superTarget) : false
         * (sameMethod) : false
         * (i < len) : true  #  inside resolvedParametersMatch method
         * (parameterTypes[i] != resolvedTypes.get(i).getRawType()) : true  #  inside resolvedParametersMatch method
         * (resolvedParametersMatch(originalBridge, hostType, candidate)) : false
         * (superTarget != null) : false
         * ((enhanceableMethod.getModifiers() & FINAL) == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TypeLiteral<?>> anyList = new ArrayList<>();
        anyList.add(typeLiteralMock);
        doReturn(anyList).when(hostMock).getParameterTypes(methodMock);
        doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
        MethodPartition target = new MethodPartition(methodMock, methodMock2);
        Map<Method, Method> methodMethodMap = new HashMap<>();
        //Act Statement(s)
        target.collectEnhanceableMethods(hostMock, consumerMock, methodMethodMap);
        //Assert statement(s)
        verify(hostMock).getParameterTypes(methodMock);
        verify(typeLiteralMock).getRawType();
    }
}
