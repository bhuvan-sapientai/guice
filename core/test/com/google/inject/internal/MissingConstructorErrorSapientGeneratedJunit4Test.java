package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import com.google.inject.TypeLiteral;
import com.google.inject.spi.ErrorDetail;

import java.util.Formatter;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class MissingConstructorErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TypeLiteral typeMock = mock(TypeLiteral.class, "<init>_typeLiteral1");

    //Sapient generated method id: ${96f3053a-4323-3b05-80ff-9a8a0abad60f}, hash: 4E98CA42EB171B8D47B64415E5E4BB08
    @Test()
    public void isMergeableWhenOtherNotInstanceOfMissingConstructorError() {
        /* Branches:
         * (other instanceof MissingConstructorError) : false
         */
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        MissingConstructorError target = new MissingConstructorError(typeMock, false, objectList);
        ErrorDetail errorDetailMock = mock(ErrorDetail.class);
        //Act Statement(s)
        boolean result = target.isMergeable(errorDetailMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${320f0a16-36e4-322e-86fd-0d426253cf0c}, hash: BD3515BF815F6E7D3161D6182374F52E
    @Ignore()
    @Test()
    public void isMergeableWhenObjectsEqualAtInjectRequiredOtherMissingAtInjectRequired() {
        /* Branches:
         * (other instanceof MissingConstructorError) : true
         * (Objects.equal(type, otherMissing.type)) : true
         * (Objects.equal(atInjectRequired, otherMissing.atInjectRequired)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        List<Object> objectList = new ArrayList<>();
        MissingConstructorError target = new MissingConstructorError(typeLiteral, false, objectList);
        MissingConstructorError missingConstructorErrorMock = mock(MissingConstructorError.class, "null");
        //Act Statement(s)
        boolean result = target.isMergeable(missingConstructorErrorMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${82e554cc-256f-33ba-86d5-ef0b70aa8030}, hash: C0D249D4F43C04F9EA3F777A7FB067C0
    @Test()
    public void isMergeableWhenObjectsNotEqualAtInjectRequiredOtherMissingAtInjectRequired() {
        /* Branches:
         * (other instanceof MissingConstructorError) : true
         * (Objects.equal(type, otherMissing.type)) : true
         * (Objects.equal(atInjectRequired, otherMissing.atInjectRequired)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        List<Object> objectList = new ArrayList<>();
        MissingConstructorError target = new MissingConstructorError(typeLiteral, false, objectList);
        MissingConstructorError missingConstructorErrorMock = mock(MissingConstructorError.class);
        //Act Statement(s)
        boolean result = target.isMergeable(missingConstructorErrorMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${f9cf5d02-0fb8-3666-9293-4ef04ec8dde2}, hash: E915CDF84A62EF8D85993AB2F14B7E22
    @Ignore()
    @Test()
    public void formatDetailWhenSourcesListIsNotEmpty() throws NoSuchMethodException {
        /* Branches:
         * (atInjectRequired) : true
         * (for-each(sourcesList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Formatter formatterMock = mock(Formatter.class, "null");
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object[] objectArray = new Object[]{};
            doReturn(null).when(formatterMock).format("\n", objectArray);
            Object[] objectArray2 = new Object[]{(Class) null};
            doReturn(null).when(formatterMock).format("Injector is configured to require @Inject constructors but %s does not have a @Inject annotated constructor.\n", objectArray2);
            Object[] objectArray3 = new Object[]{};
            doReturn(null).when(formatterMock).format("\n", objectArray3);
            Object[] objectArray4 = new Object[]{"String"};
            doReturn(null).when(formatterMock).format("%s\n", objectArray4);
            messages.when(() -> Messages.bold("Requested by:")).thenReturn("String");
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatterMock))).thenAnswer((Answer<Void>) invocation -> null);
            List<Object> objectList = new ArrayList<>();
            MissingConstructorError target = spy(new MissingConstructorError(typeMock, true, objectList));
            doReturn(null).when(typeMock).getRawType();
            List<Object> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(target).getSources();
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            //Act Statement(s)
            target.formatDetail(anyList, formatterMock);
            //Assert statement(s)
            verify(formatterMock).format("\n", objectArray);
            verify(formatterMock).format("Injector is configured to require @Inject constructors but %s does not have a @Inject annotated constructor.\n", objectArray2);
            verify(formatterMock).format("\n", objectArray3);
            verify(formatterMock).format("%s\n", objectArray4);
            messages.verify(() -> Messages.bold("Requested by:"), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatterMock)));
            verify(typeMock).getRawType();
            verify(target).getSources();
        }
    }

    //Sapient generated method id: ${3f16176b-0f68-3b27-be12-779f0d5ba27d}, hash: 06F946E39042C19079749A440A3281FD
    @Test()
    public void formatDetailWhenNoArgConstructorIsNullAndSourcesListIsNotEmpty() throws NoSuchMethodException {
        /* Branches:
         * (atInjectRequired) : false
         * (noArgConstructor == null) : true
         * (for-each(sourcesList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.bold("Requested by:")).thenReturn("String");
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            List<Object> objectList = new ArrayList<>();
            MissingConstructorError target = spy(new MissingConstructorError(typeLiteral, false, objectList));
            List<Object> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(target).getSources();
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            messages.verify(() -> Messages.bold("Requested by:"), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter)));
            verify(target).getSources();
        }
    }

    //Sapient generated method id: ${5b317cb8-189c-3a57-a375-463d49ce834f}, hash: 43BDBAD06FD8F6234E464B4D5D214337
    @Test()
    public void formatDetailWhenCaughtNoSuchMethodExceptionAndNoArgConstructorIsNullAndSourcesListIsNotEmpty() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (atInjectRequired) : false
         * (catch-exception (NoSuchMethodException)) : true
         * (noArgConstructor == null) : true
         * (for-each(sourcesList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.bold("Requested by:")).thenReturn("bold");
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            List<Object> objectList = new ArrayList<>();
            MissingConstructorError target = spy(new MissingConstructorError(typeLiteral, false, objectList));
            List<Object> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(target).getSources();
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            messages.verify(() -> Messages.bold("Requested by:"), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter)));
            verify(target).getSources();
        }
    }

    //Sapient generated method id: ${cbe8644d-eaf5-3b38-951a-5e1c1f0c2b7a}, hash: 63B8CDC0FFC40C9309F50F3DBD89CFCF
    @Ignore()
    @Test()
    public void formatDetailWhenModifierNotIsPrivateRawTypeGetModifiersAndSourcesListIsNotEmpty() throws NoSuchMethodException {
        /* Branches:
         * (atInjectRequired) : false
         * (noArgConstructor == null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : true
         * (!Modifier.isPrivate(rawType.getModifiers())) : true
         * (for-each(sourcesList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class)) {
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(2), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            List<Object> objectList = new ArrayList<>();
            MissingConstructorError target = new MissingConstructorError(typeMock, false, objectList);
            doReturn(java.lang.Object.class).when(typeMock).getRawType();
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter)));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(2), anyList(), eq(formatter)));
            verify(typeMock, times(2)).getRawType();
        }
    }

    //Sapient generated method id: ${31e04f45-7f20-3296-82f8-474239992337}, hash: 171056A555233EADB522F0EEED3B670F
    @Test()
    public void formatDetailWhenModifierIsPrivateNoArgConstructorGetModifiersAndModifierNotIsPrivateRawTypeGetModifiersAndSourcesListIs() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (atInjectRequired) : false
         * (catch-exception (NoSuchMethodException)) : true
         * (noArgConstructor == null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : true
         * (!Modifier.isPrivate(rawType.getModifiers())) : true
         * (for-each(sourcesList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.bold("Requested by:")).thenReturn("String");
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            List<Object> objectList = new ArrayList<>();
            MissingConstructorError target = spy(new MissingConstructorError(typeLiteral, false, objectList));
            List<Object> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(target).getSources();
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            messages.verify(() -> Messages.bold("Requested by:"), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter)));
            verify(target).getSources();
        }
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: 763F3A87832B3987AA426BE1C02B5E4D
    @Test()
    public void withSources1Test() {
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        MissingConstructorError target = new MissingConstructorError(typeMock, false, objectList);
        List<Object> objectList2 = new ArrayList<>();
        //Act Statement(s)
        MissingConstructorError result = target.withSources(objectList2);
        MissingConstructorError missingConstructorError = new MissingConstructorError(typeMock, false, objectList2);
        //Assert statement(s)
        assertThat(result, equalTo(missingConstructorError));
    }
}
