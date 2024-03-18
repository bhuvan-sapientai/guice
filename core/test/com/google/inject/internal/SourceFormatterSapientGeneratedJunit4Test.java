package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.internal.util.StackTraceElements;

import java.lang.reflect.Member;

import com.google.inject.internal.util.Classes;
import com.google.inject.spi.ElementSource;

import java.util.ArrayList;

import com.google.inject.Key;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.Method;

import com.google.inject.TypeLiteral;

import java.lang.reflect.Field;
import java.util.Formatter;

import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class SourceFormatterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Formatter formatterMock = mock(Formatter.class, "Formatter");

    private final Constructor constructorMock = mock(Constructor.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final ElementSource elementSourceMock = mock(ElementSource.class, "Object");

    private final ElementSource elementSourceMock2 = mock(ElementSource.class);

    private final ElementSource elementSourceMock3 = mock(ElementSource.class);

    private final InjectionPoint injectionPointMock = mock(InjectionPoint.class);

    private final Key keyMock = mock(Key.class);

    private final Member memberMock = mock(Member.class);

    private final Member memberMock2 = mock(Member.class);

    private final Object objectMock = mock(Object.class, "Object");

    private final Thread threadMock = mock(Thread.class, "Object");

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class, "Object");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${9d911adc-fa3c-35d4-930b-cc3b4f280052}, hash: E2CA5B82DF88C125023877ABA06ADD00
    @Test()
    public void formatWhenNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : true
         * (injectionPoint != null) : false  #  inside formatDependency method
         * (omitPreposition) : true  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "ElementSource");
        Key keyMock = mock(Key.class, "Key");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(dependencyMock).when(elementSourceMock).getDeclaringSource();
            doReturn(null).when(dependencyMock).getInjectionPoint();
            doReturn(keyMock).when(dependencyMock).getKey();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(null).when(elementSourceMock).getOriginalElementSource();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, true);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(dependencyMock).getInjectionPoint();
            verify(dependencyMock).getKey();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock).getOriginalElementSource();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${798eef0d-7ef8-3b4c-a767-a12b48c4b410}, hash: C2EA2C3D89D0129423643E9F98E1BDA4
    @Test()
    public void formatWhenNotOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : true
         * (injectionPoint != null) : false  #  inside formatDependency method
         * (omitPreposition) : false  #  inside preposition method
         * (appendModuleSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(dependencyMock).when(elementSourceMock).getDeclaringSource();
            doReturn(null).when(dependencyMock).getInjectionPoint();
            doReturn(keyMock).when(dependencyMock).getKey();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
            doReturn(null).when(elementSourceMock3).getOriginalElementSource();
            Object object = new Object();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(object);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(dependencyMock).getInjectionPoint();
            verify(dependencyMock).getKey();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock, times(2)).getOriginalElementSource();
            verify(elementSourceMock3).getModuleClassNames();
            verify(elementSourceMock3).getOriginalElementSource();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ce6687fc-cef0-3d6d-9e4e-d87d85bf1278}, hash: 2CAAC180B78776C509A65D59FD6D15BC
    @Test()
    public void formatWhenMemberTypeEqualsFieldAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : true
         * (injectionPoint != null) : true  #  inside formatDependency method
         * (omitPreposition) : true  #  inside preposition method
         * (memberType == Field.class) : true  #  inside formatInjectionPoint method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "ElementSource");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class);
             MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            doReturn(dependencyMock).when(elementSourceMock).getDeclaringSource();
            doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
            doReturn("return_of_getName1").when(memberMock).getName();
            doReturn(memberMock, memberMock2).when(injectionPointMock).getMember();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(null).when(elementSourceMock).getOriginalElementSource();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(Field.class);
            stackTraceElements.when(() -> StackTraceElements.forMember(memberMock2)).thenReturn(objectMock);
            messages.when(() -> Messages.redBold("return_of_getName1")).thenReturn("String");
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, true);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(dependencyMock).getInjectionPoint();
            verify(injectionPointMock, times(2)).getMember();
            verify(memberMock).getName();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock).getOriginalElementSource();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
            stackTraceElements.verify(() -> StackTraceElements.forMember(memberMock2), atLeast(1));
            messages.verify(() -> Messages.redBold("return_of_getName1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${80959879-1f0d-3c06-960d-0b0db3d257c5}, hash: 3ECB20A0947D931E7EA0C2937640B9C9
    @Test()
    public void formatWhenOmitPrepositionAndMemberTypeEqualsFieldAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : true
         * (omitPreposition) : true  #  inside preposition method
         * (memberType == Field.class) : true  #  inside formatInjectionPoint method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "ElementSource");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class);
             MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            doReturn(injectionPointMock).when(elementSourceMock).getDeclaringSource();
            doReturn("return_of_getName1").when(memberMock).getName();
            doReturn(memberMock, memberMock2).when(injectionPointMock).getMember();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(null).when(elementSourceMock).getOriginalElementSource();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(Field.class);
            stackTraceElements.when(() -> StackTraceElements.forMember(memberMock2)).thenReturn(objectMock);
            messages.when(() -> Messages.redBold("return_of_getName1")).thenReturn("String");
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, true);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(injectionPointMock, times(2)).getMember();
            verify(memberMock).getName();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock).getOriginalElementSource();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
            stackTraceElements.verify(() -> StackTraceElements.forMember(memberMock2), atLeast(1));
            messages.verify(() -> Messages.redBold("return_of_getName1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${8261d2b4-dfc6-3e2e-af3b-ce3029397f31}, hash: F7660255727CC3F37C911B162ADD9719
    @Test()
    public void formatWhenOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : true
         * (omitPreposition) : true  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "ElementSource");
        try (MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class)) {
            doReturn(Object.class).when(elementSourceMock).getDeclaringSource();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(null).when(elementSourceMock).getOriginalElementSource();
            stackTraceElements.when(() -> StackTraceElements.forType(Object.class)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, true);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock).getOriginalElementSource();
            stackTraceElements.verify(() -> StackTraceElements.forType(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${e44f0a7c-c845-3bcc-90a0-76fed77653e7}, hash: A6B0ECD446920D4D4095A52E5D10C9FA
    @Test()
    public void formatWhenSourceInstanceOfClassAndNotOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : true
         * (omitPreposition) : false  #  inside preposition method
         * (appendModuleSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        try (MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class)) {
            doReturn(Object.class).when(elementSourceMock).getDeclaringSource();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
            doReturn(null).when(elementSourceMock3).getOriginalElementSource();
            Object object = new Object();
            stackTraceElements.when(() -> StackTraceElements.forType(Object.class)).thenReturn(object);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock, times(2)).getOriginalElementSource();
            verify(elementSourceMock3).getModuleClassNames();
            verify(elementSourceMock3).getOriginalElementSource();
            stackTraceElements.verify(() -> StackTraceElements.forType(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${c9d16463-168a-37eb-9dea-81089dd6f5a5}, hash: DF14C3A9BD6ADD25F95C847D3055F26C
    @Ignore()
    @Test()
    public void formatWhenMemberTypeNotEqualsFieldAndDependencyIsNotNullAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : true
         * (injectionPoint != null) : true  #  inside formatDependency method
         * (omitPreposition) : false  #  inside preposition method
         * (memberType == Field.class) : false  #  inside formatInjectionPoint method
         * (dependency != null) : true  #  inside formatInjectionPoint method
         * (appendModuleSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        try (MockedStatic<SourceFormatter> sourceFormatter = mockStatic(SourceFormatter.class, CALLS_REAL_METHODS);
             MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class);
             MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            doReturn(dependencyMock).when(elementSourceMock).getDeclaringSource();
            doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
            doReturn(memberMock).when(injectionPointMock).getMember();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
            doReturn(null).when(elementSourceMock3).getOriginalElementSource();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(java.lang.reflect.Member.class);
            Object object = new Object();
            stackTraceElements.when(() -> StackTraceElements.forMember(memberMock)).thenReturn(object);
            sourceFormatter.when(() -> SourceFormatter.getParameterName(dependencyMock)).thenReturn("return_of_getParameterName1");
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock, atLeast(1)).getDeclaringSource();
            verify(dependencyMock, atLeast(1)).getInjectionPoint();
            verify(injectionPointMock, times(2)).getMember();
            verify(elementSourceMock, atLeast(1)).getModuleClassNames();
            verify(elementSourceMock, times(2)).getOriginalElementSource();
            verify(elementSourceMock3, atLeast(1)).getModuleClassNames();
            verify(elementSourceMock3, atLeast(1)).getOriginalElementSource();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
            stackTraceElements.verify(() -> StackTraceElements.forMember(memberMock), atLeast(1));
            sourceFormatter.verify(() -> SourceFormatter.getParameterName(dependencyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${fadc74d5-de00-31a1-ba69-7230f92eb97d}, hash: F0BCC7D5C4A7164C181F4052B765AEA5
    @Test()
    public void formatWhenMemberTypeNotEqualsFieldAndDependencyIsNullAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : true
         * (omitPreposition) : false  #  inside preposition method
         * (memberType == Field.class) : false  #  inside formatInjectionPoint method
         * (dependency != null) : false  #  inside formatInjectionPoint method
         * (appendModuleSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        try (MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class);
             MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            doReturn(injectionPointMock).when(elementSourceMock).getDeclaringSource();
            doReturn(memberMock).when(injectionPointMock).getMember();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
            doReturn(null).when(elementSourceMock3).getOriginalElementSource();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(java.lang.reflect.Member.class);
            Object object = new Object();
            stackTraceElements.when(() -> StackTraceElements.forMember(memberMock)).thenReturn(object);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(injectionPointMock, times(2)).getMember();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock, times(2)).getOriginalElementSource();
            verify(elementSourceMock3).getModuleClassNames();
            verify(elementSourceMock3).getOriginalElementSource();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
            stackTraceElements.verify(() -> StackTraceElements.forMember(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${547ffcd1-9332-3a47-83ca-88f8b31cf841}, hash: C584CE51EBF4C9035FE224030FFE0511
    @Test()
    public void formatWhenSourceInstanceOfMemberAndOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : true
         * (omitPreposition) : true  #  inside preposition method
         * (appendModuleSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        try (MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class)) {
            doReturn(memberMock).when(elementSourceMock).getDeclaringSource();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
            List<String> stringList2 = new ArrayList<>();
            stringList2.add("List<String>");
            doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
            doReturn(null).when(elementSourceMock3).getOriginalElementSource();
            stackTraceElements.when(() -> StackTraceElements.forMember(memberMock)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, true);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock, times(2)).getOriginalElementSource();
            verify(elementSourceMock3).getModuleClassNames();
            verify(elementSourceMock3).getOriginalElementSource();
            stackTraceElements.verify(() -> StackTraceElements.forMember(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${efd37366-f925-3c9d-a481-5b114f87549a}, hash: 47B0AC083255518F79E6745D34E3AD06
    @Test()
    public void formatWhenSourceInstanceOfMemberAndNotOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : true
         * (omitPreposition) : false  #  inside preposition method
         * (appendModuleSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        Object objectMock = mock(Object.class);
        try (MockedStatic<StackTraceElements> stackTraceElements = mockStatic(StackTraceElements.class)) {
            doReturn(memberMock).when(elementSourceMock).getDeclaringSource();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
            List<String> stringList2 = new ArrayList<>();
            stringList2.add("<List<String>>");
            doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
            doReturn(null).when(elementSourceMock3).getOriginalElementSource();
            stackTraceElements.when(() -> StackTraceElements.forMember(memberMock)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock, times(2)).getOriginalElementSource();
            verify(elementSourceMock3).getModuleClassNames();
            verify(elementSourceMock3).getOriginalElementSource();
            stackTraceElements.verify(() -> StackTraceElements.forMember(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${85ed90f2-efae-3095-a416-1ab9843f71c2}, hash: B7AB7C6EE03BB1F9F10B30C05EBCA432
    @Test()
    public void formatWhenSourceInstanceOfTypeLiteralAndOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : true
         * (omitPreposition) : true  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "TypeLiteral");
        doReturn(typeLiteralMock).when(elementSourceMock).getDeclaringSource();
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(null).when(elementSourceMock).getOriginalElementSource();
        SourceFormatter target = new SourceFormatter(elementSourceMock, formatterMock, true);
        Object[] objectArray = new Object[]{"", typeLiteralMock};
        doReturn(null).when(formatterMock).format("%s%s\n", objectArray);
        //Act Statement(s)
        target.format();
        //Assert statement(s)
        verify(elementSourceMock).getDeclaringSource();
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock).getOriginalElementSource();
        verify(formatterMock).format("%s%s\n", objectArray);
    }

    //Sapient generated method id: ${4af50f4f-c1ed-31e7-9b8a-ff85b50d0df6}, hash: 8F00BC217225AC324BB3B825CC0381E5
    @Test()
    public void formatWhenSourceInstanceOfTypeLiteralAndNotOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : true
         * (omitPreposition) : false  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        doReturn(typeLiteralMock).when(elementSourceMock).getDeclaringSource();
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(null).when(elementSourceMock).getOriginalElementSource();
        Formatter formatter = new Formatter();
        SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
        //Act Statement(s)
        target.format();
        //Assert statement(s)
        verify(elementSourceMock).getDeclaringSource();
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock).getOriginalElementSource();
    }

    //Sapient generated method id: ${9836eab2-d2a6-3bca-8ebe-e3781342f08a}, hash: 9E79EF5E7E55063775D5A0E07BFE143E
    @Test()
    public void formatWhenSourceInstanceOfKeyAndOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : false
         * (source instanceof Key) : true
         * (omitPreposition) : true  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "ElementSource");
        Key keyMock = mock(Key.class, "Object");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(keyMock).when(elementSourceMock).getDeclaringSource();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(null).when(elementSourceMock).getOriginalElementSource();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, true);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock).getOriginalElementSource();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d7967f99-1725-3a85-b93c-f383278a63d6}, hash: C2EADC8655CC2A573428D5E82B5BA413
    @Test()
    public void formatWhenSourceInstanceOfKeyAndNotOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : false
         * (source instanceof Key) : true
         * (omitPreposition) : false  #  inside preposition method
         * (appendModuleSource) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(keyMock).when(elementSourceMock).getDeclaringSource();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elementSourceMock).getModuleClassNames();
            doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
            doReturn(null).when(elementSourceMock3).getOriginalElementSource();
            Object object = new Object();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(object);
            Formatter formatter = new Formatter();
            SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
            //Act Statement(s)
            target.format();
            //Assert statement(s)
            verify(elementSourceMock).getDeclaringSource();
            verify(elementSourceMock).getModuleClassNames();
            verify(elementSourceMock, times(2)).getOriginalElementSource();
            verify(elementSourceMock3).getModuleClassNames();
            verify(elementSourceMock3).getOriginalElementSource();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${db03f9fa-07bb-327f-8afb-5ff82f7439e0}, hash: 14D2998AEEE4BB62B6714FD9BEE94BB2
    @Test()
    public void formatWhenSourceInstanceOfThreadAndOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : false
         * (source instanceof Key) : false
         * (source instanceof Thread) : true
         * (omitPreposition) : true  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "Thread");
        doReturn(threadMock).when(elementSourceMock).getDeclaringSource();
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(null).when(elementSourceMock).getOriginalElementSource();
        SourceFormatter target = new SourceFormatter(elementSourceMock, formatterMock, true);
        Object[] objectArray = new Object[]{"", threadMock};
        doReturn(null).when(formatterMock).format("%s%s\n", objectArray);
        //Act Statement(s)
        target.format();
        //Assert statement(s)
        verify(elementSourceMock).getDeclaringSource();
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock).getOriginalElementSource();
        verify(formatterMock).format("%s%s\n", objectArray);
    }

    //Sapient generated method id: ${504b8cf7-5752-3cef-afb8-989c163b84bb}, hash: 2DFF9312DF30295B2BE02C4C4AFC6980
    @Test()
    public void formatWhenSourceInstanceOfThreadAndNotOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : false
         * (source instanceof Key) : false
         * (source instanceof Thread) : true
         * (omitPreposition) : false  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        doReturn(threadMock).when(elementSourceMock).getDeclaringSource();
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(null).when(elementSourceMock).getOriginalElementSource();
        Formatter formatter = new Formatter();
        SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
        //Act Statement(s)
        target.format();
        //Assert statement(s)
        verify(elementSourceMock).getDeclaringSource();
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock).getOriginalElementSource();
    }

    //Sapient generated method id: ${6bd834f7-66b7-3b09-86a2-32327804f010}, hash: 6AFC4440F73A93E6A0CDE9CC48ACB93D
    @Test()
    public void formatWhenSourceNotInstanceOfThreadAndOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : false
         * (source instanceof Key) : false
         * (source instanceof Thread) : false
         * (omitPreposition) : true  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        doReturn(objectMock).when(elementSourceMock).getDeclaringSource();
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(null).when(elementSourceMock).getOriginalElementSource();
        SourceFormatter target = new SourceFormatter(elementSourceMock, formatterMock, true);
        Object[] objectArray = new Object[]{"", objectMock};
        doReturn(null).when(formatterMock).format("%s%s\n", objectArray);
        //Act Statement(s)
        target.format();
        //Assert statement(s)
        verify(elementSourceMock).getDeclaringSource();
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock).getOriginalElementSource();
        verify(formatterMock).format("%s%s\n", objectArray);
    }

    //Sapient generated method id: ${b0cebd21-0e46-3fcc-837d-09321f93118c}, hash: 1A97031203929B94DF3168660F6E7D32
    @Test()
    public void formatWhenSourceNotInstanceOfThreadAndNotOmitPrepositionAndNotAppendModuleSource() {
        /* Branches:
         * (!moduleStack.isEmpty()) : false
         * (source instanceof Dependency) : false
         * (source instanceof InjectionPoint) : false
         * (source instanceof Class) : false
         * (source instanceof Member) : false
         * (source instanceof TypeLiteral) : false
         * (source instanceof Key) : false
         * (source instanceof Thread) : false
         * (omitPreposition) : false  #  inside preposition method
         * (appendModuleSource) : false
         */
        //Arrange Statement(s)
        doReturn(objectMock).when(elementSourceMock).getDeclaringSource();
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(null).when(elementSourceMock).getOriginalElementSource();
        Formatter formatter = new Formatter();
        SourceFormatter target = new SourceFormatter(elementSourceMock, formatter, false);
        //Act Statement(s)
        target.format();
        //Assert statement(s)
        verify(elementSourceMock).getDeclaringSource();
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock).getOriginalElementSource();
    }

    //Sapient generated method id: ${c75a20c6-a32e-357e-89ec-3f6106577c80}, hash: 977D6A42E3636D8ED196B5D3F9CAF6EB
    @Test()
    public void getModuleStackWhenElementSourceIsNull() {
        /* Branches:
         * (elementSource == null) : true
         */
        //Arrange Statement(s)
        ElementSource elementSource = null;
        //Act Statement(s)
        String result = SourceFormatter.getModuleStack(elementSource);
        //Assert statement(s)
        assertThat(result, equalTo(""));
    }

    //Sapient generated method id: ${3135bb39-28f2-37ec-8daa-9cd9890bff87}, hash: 8EA6AFEE1D02A97FE82E94ABD2576EE8
    @Test()
    public void getModuleStackWhenModulesSizeLessThanOrEqualsTo1() {
        /* Branches:
         * (elementSource == null) : false
         * (elementSource.getOriginalElementSource() != null) : true
         * (modules.size() <= 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
        List<String> stringList2 = new ArrayList<>();
        doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
        doReturn(null).when(elementSourceMock3).getOriginalElementSource();
        //Act Statement(s)
        String result = SourceFormatter.getModuleStack(elementSourceMock);
        //Assert statement(s)
        assertThat(result, equalTo(""));
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock, times(2)).getOriginalElementSource();
        verify(elementSourceMock3).getModuleClassNames();
        verify(elementSourceMock3).getOriginalElementSource();
    }

    //Sapient generated method id: ${5f499019-6827-37ae-9bd8-9e17536134b7}, hash: 07A0A33ABF9BB3F0F89AA857C2AC8160
    @Test()
    public void getModuleStackWhenModulesSizeGreaterThan1() {
        /* Branches:
         * (elementSource == null) : false
         * (elementSource.getOriginalElementSource() != null) : true
         * (modules.size() <= 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(elementSourceMock).getModuleClassNames();
        doReturn(elementSourceMock2, elementSourceMock3).when(elementSourceMock).getOriginalElementSource();
        List<String> stringList2 = new ArrayList<>();
        doReturn(stringList2).when(elementSourceMock3).getModuleClassNames();
        doReturn(null).when(elementSourceMock3).getOriginalElementSource();
        //Act Statement(s)
        String result = SourceFormatter.getModuleStack(elementSourceMock);
        //Assert statement(s)
        assertThat(result, equalTo(""));
        verify(elementSourceMock).getModuleClassNames();
        verify(elementSourceMock, times(2)).getOriginalElementSource();
        verify(elementSourceMock3).getModuleClassNames();
        verify(elementSourceMock3).getOriginalElementSource();
    }

    //Sapient generated method id: ${8e3a3d52-6030-3221-84a9-d06cdd1ede12}, hash: C637DE165A04D26DF3FCFF3C5D5DA319
    @Ignore()
    @Test()
    public void getParameterNameWhenParameterIsNamePresentAndOrdinalLessThan0ThrowsIllegalArgumentException() {
        /* Branches:
         * (member instanceof Constructor) : false
         * (member instanceof Method) : true
         * (parameter != null) : true
         * (parameter.isNamePresent()) : true
         * (ordinal >= 0) : false  #  inside getOrdinalSuffix method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(dependencyMock).getParameterIndex();
        doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
        Method methodMock = mock(Method.class);
        doReturn(methodMock).when(injectionPointMock).getMember();
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        SourceFormatter.getParameterName(dependencyMock);
        //Assert statement(s)
        verify(dependencyMock).getParameterIndex();
        verify(dependencyMock).getInjectionPoint();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${3364b161-7922-3b39-bbb6-1d6f116b1c5b}, hash: 4335EC290AD0DA24EE7B5B079B2F1411
    @Test()
    public void getParameterNameWhenParameterNameIsEmpty() {
        /* Branches:
         * (member instanceof Constructor) : true
         * (parameter != null) : true
         * (parameter.isNamePresent()) : true
         * (ordinal >= 0) : true  #  inside getOrdinalSuffix method
         * ((ordinal / 10) % 10 == 1) : true  #  inside getOrdinalSuffix method
         * (parameterName.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(9).when(dependencyMock).getParameterIndex();
        doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
        doReturn(constructorMock).when(injectionPointMock).getMember();
        Parameter parameterMock = mock(Parameter.class);
        Parameter parameterMock2 = mock(Parameter.class);
        Parameter parameterMock3 = mock(Parameter.class);
        Parameter parameterMock4 = mock(Parameter.class);
        Parameter parameterMock5 = mock(Parameter.class);
        Parameter parameterMock6 = mock(Parameter.class);
        Parameter parameterMock7 = mock(Parameter.class);
        Parameter parameterMock8 = mock(Parameter.class);
        Parameter parameterMock9 = mock(Parameter.class);
        Parameter parameterMock10 = mock(Parameter.class);
        Parameter[] parameterArray = new Parameter[]{parameterMock, parameterMock2, parameterMock3, parameterMock4, parameterMock5, parameterMock6, parameterMock7, parameterMock8, parameterMock9, parameterMock10};
        doReturn(parameterArray).when(constructorMock).getParameters();
        //Act Statement(s)
        String result = SourceFormatter.getParameterName(dependencyMock);
        //Assert statement(s)
        assertThat(result, equalTo("10th parameter"));
        verify(dependencyMock).getParameterIndex();
        verify(dependencyMock).getInjectionPoint();
        verify(injectionPointMock).getMember();
        verify(constructorMock).getParameters();
    }

    //Sapient generated method id: ${4872460a-21e8-37d6-b026-f29d1a0b21af}, hash: AEA923D6F500DC03F0CE43BFEF24B60D
    @Ignore()
    @Test()
    public void getParameterNameWhenSwitchOrdinalModulus10Case1AndParameterNameNotIsEmpty() {
        /* Branches:
         * (member instanceof Constructor) : true
         * (parameter != null) : true
         * (parameter.isNamePresent()) : true
         * (ordinal >= 0) : true  #  inside getOrdinalSuffix method
         * ((ordinal / 10) % 10 == 1) : false  #  inside getOrdinalSuffix method
         * (switch(ordinal % 10) = 1) : true  #  inside getOrdinalSuffix method
         * (parameterName.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(dependencyMock).getParameterIndex();
        doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
        doReturn(constructorMock).when(injectionPointMock).getMember();
        //Act Statement(s)
        String result = SourceFormatter.getParameterName(dependencyMock);
        //Assert statement(s)
        assertThat(result, equalTo("1st parameter A"));
        verify(dependencyMock).getParameterIndex();
        verify(dependencyMock).getInjectionPoint();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${c107bbd5-82f0-324e-b593-080d54470ad2}, hash: D142C442F04D17A77DED54704B350B01
    @Ignore()
    @Test()
    public void getParameterNameWhenSwitchOrdinalModulus10Case2AndParameterNameNotIsEmpty() {
        /* Branches:
         * (member instanceof Constructor) : true
         * (parameter != null) : true
         * (parameter.isNamePresent()) : true
         * (ordinal >= 0) : true  #  inside getOrdinalSuffix method
         * ((ordinal / 10) % 10 == 1) : false  #  inside getOrdinalSuffix method
         * (switch(ordinal % 10) = 2) : true  #  inside getOrdinalSuffix method
         * (parameterName.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(1).when(dependencyMock).getParameterIndex();
        doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
        doReturn(constructorMock).when(injectionPointMock).getMember();
        //Act Statement(s)
        String result = SourceFormatter.getParameterName(dependencyMock);
        //Assert statement(s)
        assertThat(result, equalTo("2nd parameter A"));
        verify(dependencyMock).getParameterIndex();
        verify(dependencyMock).getInjectionPoint();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${77492411-1b9b-373e-99a9-c8ec553cf3d0}, hash: 51B07CE6E5735CA0DDA12ABDA20F7812
    @Ignore()
    @Test()
    public void getParameterNameWhenSwitchOrdinalModulus10Case3AndParameterNameNotIsEmpty() {
        /* Branches:
         * (member instanceof Constructor) : true
         * (parameter != null) : true
         * (parameter.isNamePresent()) : true
         * (ordinal >= 0) : true  #  inside getOrdinalSuffix method
         * ((ordinal / 10) % 10 == 1) : false  #  inside getOrdinalSuffix method
         * (switch(ordinal % 10) = 3) : true  #  inside getOrdinalSuffix method
         * (parameterName.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(2).when(dependencyMock).getParameterIndex();
        doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
        doReturn(constructorMock).when(injectionPointMock).getMember();
        //Act Statement(s)
        String result = SourceFormatter.getParameterName(dependencyMock);
        //Assert statement(s)
        assertThat(result, equalTo("3rd parameter A"));
        verify(dependencyMock).getParameterIndex();
        verify(dependencyMock).getInjectionPoint();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${cfc63e88-e3c3-313b-aecf-81d3e80ad4b1}, hash: 54C46243279E1B7431131798737BE897
    @Ignore()
    @Test()
    public void getParameterNameWhenSwitchOrdinalModulus10CaseDefaultAndParameterNameNotIsEmpty() {
        /* Branches:
         * (member instanceof Constructor) : true
         * (parameter != null) : true
         * (parameter.isNamePresent()) : true
         * (ordinal >= 0) : true  #  inside getOrdinalSuffix method
         * ((ordinal / 10) % 10 == 1) : false  #  inside getOrdinalSuffix method
         * (switch(ordinal % 10) = default) : true  #  inside getOrdinalSuffix method
         * (parameterName.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(0).when(dependencyMock).getParameterIndex();
        doReturn(injectionPointMock).when(dependencyMock).getInjectionPoint();
        doReturn(constructorMock).when(injectionPointMock).getMember();
        //Act Statement(s)
        String result = SourceFormatter.getParameterName(dependencyMock);
        //Assert statement(s)
        assertThat(result, equalTo("1th parameter A"));
        verify(dependencyMock).getParameterIndex();
        verify(dependencyMock).getInjectionPoint();
        verify(injectionPointMock).getMember();
    }
}
