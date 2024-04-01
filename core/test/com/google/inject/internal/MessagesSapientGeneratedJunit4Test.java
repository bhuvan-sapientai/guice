package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.spi.Message;
import com.google.inject.spi.ErrorDetail;

import java.util.Formatter;
import java.util.Collection;

import com.google.inject.spi.ElementSource;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class MessagesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ErrorDetail currentErrorMock = mock(ErrorDetail.class);

    private final ElementSource elementSourceMock = mock(ElementSource.class);

    private final ErrorDetail errorDetailMock = mock(ErrorDetail.class);

    private final GuiceInternal guiceInternalMock = mock(GuiceInternal.class);

    private final Message messageMock = mock(Message.class);

    //Sapient generated method id: ${16c06d5e-d1bb-3be0-91b1-25b2ee6f55bc}, hash: A785C5FDCDD3159AF5CF8E9C764EEFCE
    @Test()
    public void mergeSourcesWhenObjectsEqualMessageSourcesGet0SourcesGetSourcesSizeMinus1() {
        /* Branches:
         * (!sources.isEmpty()) : true
         * (!messageSources.isEmpty()) : true
         * (Objects.equal(messageSources.get(0), sources.get(sources.size() - 1))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);
        doReturn(objectList).when(messageMock).getSources();
        Message messageMock2 = mock(Message.class);
        doReturn(messageMock2).when(messageMock).withSource((List) any());
        Object object2 = new Object();
        List<Object> objectList2 = new ArrayList<>();
        objectList2.add(object2);
        //Act Statement(s)
        Message result = Messages.mergeSources(objectList2, messageMock);
        //Assert statement(s)
        assertThat(result, equalTo(messageMock2));
        verify(messageMock).getSources();
        verify(messageMock).withSource((List) any());
    }

    //Sapient generated method id: ${b6418280-9fa0-3445-8a11-07407bc38ff1}, hash: 176C34E220801C2CAB1BA718B4C3F9FC
    @Test()
    public void formatWhenILessThanArgumentsLength() {
        /* Branches:
         * (i < arguments.length) : true
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "format_object3");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            messages.when(() -> Messages.convert(object)).thenReturn(objectMock);
            Object[] objectArray = new Object[]{object};
            //Act Statement(s)
            String result = Messages.format("A", objectArray);
            Object[] objectObjectArrayArray = new Object[]{objectMock};
            //Assert statement(s)
            assertThat(result, equalTo("A"));
            assertThat(objectArray, equalTo(objectObjectArrayArray));
            messages.verify(() -> Messages.convert(object), atLeast(1));
        }
    }

    //Sapient generated method id: ${340298ed-c395-325d-bb6a-224acc75c753}, hash: F7CCCCD12CD1FB961430A7F2A2A53CD1
    @Ignore()
    @Test()
    public void formatMessagesWhenIndexEquals2() {
        /* Branches:
         * (getOnlyCause(errorMessages) == null) : false
         * (!remainingErrors.isEmpty()) : true
         * (displayCauses) : false
         * (index == 2) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Formatter, fmt
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PackageNameCompressor> packageNameCompressor = mockStatic(PackageNameCompressor.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(currentErrorMock).isMergeable(errorDetailMock);
            List list = new ArrayList<>();
            doNothing().when(currentErrorMock).format(eq(1), eq(list), (Formatter) any());
            Throwable throwable = new Throwable();
            doReturn(throwable).when(currentErrorMock).getCause();
            Throwable throwable2 = new Throwable();
            messages.when(() -> Messages.getOnlyCause(anyCollection())).thenReturn(throwable2);
            packageNameCompressor.when(() -> PackageNameCompressor.compressPackagesInMessage("")).thenReturn("return_of_compressPackagesInMessage1");
            Message message = new Message(guiceInternalMock, ErrorId.AMBIGUOUS_TYPE_CONVERSION, currentErrorMock);
            Collection<Message> collection = new ArrayList<>();
            collection.add(message);
            //Act Statement(s)
            String result = Messages.formatMessages("heading1", collection);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_compressPackagesInMessage1"));
            verify(currentErrorMock, atLeast(1)).isMergeable(errorDetailMock);
            verify(currentErrorMock, atLeast(1)).format(eq(1), eq(list), (Formatter) any());
            verify(currentErrorMock, atLeast(1)).getCause();
            messages.verify(() -> Messages.getOnlyCause(anyCollection()), atLeast(1));
            packageNameCompressor.verify(() -> PackageNameCompressor.compressPackagesInMessage(""), atLeast(1));
        }
    }

    //Sapient generated method id: ${145a0c56-82c7-37f8-a2c8-fcbb91db0e4d}, hash: 87DC6C826E1153D516B375E192AD31FF
    @Ignore()
    @Test()
    public void formatMessagesWhenCausesNotContainsKeyCauseEquivalenceAndIndexEquals2() {
        /* Branches:
         * (getOnlyCause(errorMessages) == null) : true
         * (!remainingErrors.isEmpty()) : true
         * (displayCauses) : true
         * (cause != null) : true
         * (!causes.containsKey(causeEquivalence)) : true
         * (index == 2) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: INSTANCE, object of type Formatter, fmt
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PackageNameCompressor> packageNameCompressor = mockStatic(PackageNameCompressor.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            doReturn(false).when(currentErrorMock).isMergeable(errorDetailMock);
            List list = new ArrayList<>();
            doNothing().when(currentErrorMock).format(eq(1), eq(list), (Formatter) any());
            Throwable throwable = new Throwable();
            doReturn(throwable).when(currentErrorMock).getCause();
            messages.when(() -> Messages.getOnlyCause(anyCollection())).thenReturn(null);
            packageNameCompressor.when(() -> PackageNameCompressor.compressPackagesInMessage("")).thenReturn("return_of_compressPackagesInMessage1");
            Message message = new Message(guiceInternalMock, ErrorId.AMBIGUOUS_TYPE_CONVERSION, currentErrorMock);
            Collection<Message> collection = new ArrayList<>();
            collection.add(message);
            //Act Statement(s)
            String result = Messages.formatMessages("heading1", collection);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_compressPackagesInMessage1"));
            verify(currentErrorMock, atLeast(1)).isMergeable(errorDetailMock);
            verify(currentErrorMock, atLeast(1)).format(eq(1), eq(list), (Formatter) any());
            verify(currentErrorMock, atLeast(1)).getCause();
            messages.verify(() -> Messages.getOnlyCause(anyCollection()), atLeast(1));
            packageNameCompressor.verify(() -> PackageNameCompressor.compressPackagesInMessage(""), atLeast(1));
        }
    }

    //Sapient generated method id: ${2284fc3d-473b-3992-886d-8fe431bd702d}, hash: 4BEFEDFFCCF2A50C5058F0670BD87571
    @Test()
    public void createTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            messages.when(() -> Messages.create(ErrorId.AMBIGUOUS_TYPE_CONVERSION, (Throwable) null, "messageFormat1", objectArray)).thenReturn(messageMock);
            //Act Statement(s)
            Message result = Messages.create(ErrorId.AMBIGUOUS_TYPE_CONVERSION, "messageFormat1", objectArray);
            //Assert statement(s)
            assertThat(result, equalTo(messageMock));
            messages.verify(() -> Messages.create(ErrorId.AMBIGUOUS_TYPE_CONVERSION, (Throwable) null, "messageFormat1", objectArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${b0d142e8-0743-37b5-ba4a-5c4957c16e12}, hash: D854E1B95B37FE71B896F680AE22CC8F
    @Test()
    public void create1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            Throwable throwable = new Throwable();
            Object[] objectArray = new Object[]{};
            messages.when(() -> Messages.create(eq(ErrorId.AMBIGUOUS_TYPE_CONVERSION), eq(throwable), (List) any(), eq("messageFormat1"), eq(objectArray))).thenReturn(messageMock);
            //Act Statement(s)
            Message result = Messages.create(ErrorId.AMBIGUOUS_TYPE_CONVERSION, throwable, "messageFormat1", objectArray);
            //Assert statement(s)
            assertThat(result, equalTo(messageMock));
            messages.verify(() -> Messages.create(eq(ErrorId.AMBIGUOUS_TYPE_CONVERSION), eq(throwable), (List) any(), eq("messageFormat1"), eq(objectArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${a82a2dfb-40b5-3d2a-a2e2-c72726240f48}, hash: 6D7FBE10CE36CE658AE721AFDDF3CE2C
    @Test()
    public void create2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            Object[] objectArray = new Object[]{};
            messages.when(() -> Messages.format("messageFormat1", objectArray)).thenReturn("return_of_format1");
            Throwable throwable = new Throwable();
            List<Object> objectList = new ArrayList<>();
            //Act Statement(s)
            Message result = Messages.create(ErrorId.AMBIGUOUS_TYPE_CONVERSION, throwable, objectList, "messageFormat1", objectArray);
            Message message = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "return_of_format1", throwable);
            //Assert statement(s)
            assertThat(result, equalTo(message));
            messages.verify(() -> Messages.format("messageFormat1", objectArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${575405f3-4bea-3bcc-9860-1ec3f6dade49}, hash: 56846DD3940AEE7F425FF0CFF595C18A
    @Test()
    public void convertWhenOInstanceOfElementSource() {
        /* Branches:
         * (o instanceof ElementSource) : true
         */
        //Arrange Statement(s)
        ElementSource sourceMock = mock(ElementSource.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            Object object = new Object();
            doReturn(object).when(sourceMock).getDeclaringSource();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object, sourceMock)).thenReturn(object2);
            //Act Statement(s)
            Object result = Messages.convert((Object) sourceMock);
            //Assert statement(s)
            assertThat(result, equalTo(object2));
            verify(sourceMock, atLeast(1)).getDeclaringSource();
            messages.verify(() -> Messages.convert(object, sourceMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${342b75f0-90d2-35be-bcf0-716dd893d452}, hash: BC8A72EA24874F32C8BF5ED48E22E4B5
    @Ignore()
    @Test()
    public void convert1WhenModulesLengthEquals0() {
        /* Branches:
         * (for-each(converters)) : true
         * (converter.appliesTo(o)) : true
         * (modules.length() == 0) : true  #  inside appendModules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SourceFormatter> sourceFormatter = mockStatic(SourceFormatter.class)) {
            sourceFormatter.when(() -> SourceFormatter.getModuleStack(elementSourceMock)).thenReturn("");
            Object object = new Object();
            //Act Statement(s)
            Object result = Messages.convert(object, elementSourceMock);
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            sourceFormatter.verify(() -> SourceFormatter.getModuleStack(elementSourceMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${0821dc53-cc86-3924-b4be-9f53efb5a59e}, hash: A7D799AF792A6AA16AFE4520F486437B
    @Ignore()
    @Test()
    public void convert1WhenModulesLengthNotEquals0() {
        /* Branches:
         * (for-each(converters)) : true
         * (converter.appliesTo(o)) : true
         * (modules.length() == 0) : false  #  inside appendModules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SourceFormatter> sourceFormatter = mockStatic(SourceFormatter.class)) {
            sourceFormatter.when(() -> SourceFormatter.getModuleStack(elementSourceMock)).thenReturn("some module stack");
            Object object = new Object();
            //Act Statement(s)
            Object result = Messages.convert(object, elementSourceMock);
            //Assert statement(s)
            assertThat(result, equalTo("A (installed by: some module stack)"));
            sourceFormatter.verify(() -> SourceFormatter.getModuleStack(elementSourceMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c9b7809c-51f1-37f5-94e5-be6b89698090}, hash: 9BC50AB906129295A1DBABE2383FDE33
    @Test()
    public void convert1WhenConverterNotAppliesToOAndModulesLengthEquals0() {
        /* Branches:
         * (for-each(converters)) : true
         * (converter.appliesTo(o)) : false
         * (modules.length() == 0) : true  #  inside appendModules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SourceFormatter> sourceFormatter = mockStatic(SourceFormatter.class)) {
            sourceFormatter.when(() -> SourceFormatter.getModuleStack(elementSourceMock)).thenReturn("");
            Object object = new Object();
            //Act Statement(s)
            Object result = Messages.convert(object, elementSourceMock);
            //Assert statement(s)
            assertThat(result, equalTo(object));
            sourceFormatter.verify(() -> SourceFormatter.getModuleStack(elementSourceMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d1fb4633-72f3-3ac5-8e8d-7d4ddcec1711}, hash: 69282262B5D32E2ABAE8F7F82E4F71E1
    @Ignore()
    @Test()
    public void convert1WhenConverterNotAppliesToOAndModulesLengthNotEquals0() {
        /* Branches:
         * (for-each(converters)) : true
         * (converter.appliesTo(o)) : false
         * (modules.length() == 0) : false  #  inside appendModules method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<SourceFormatter> sourceFormatter = mockStatic(SourceFormatter.class)) {
            sourceFormatter.when(() -> SourceFormatter.getModuleStack(elementSourceMock)).thenReturn("some module stack");
            Object object = new Object();
            //Act Statement(s)
            Object result = Messages.convert(object, elementSourceMock);
            //Assert statement(s)
            assertThat(result, equalTo("java.lang.Object@4f093395 (installed by: some module stack)"));
            sourceFormatter.verify(() -> SourceFormatter.getModuleStack(elementSourceMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${29ea3efb-bf69-33e4-9b36-5ca1dff8fecc}, hash: 3C394794884AEEB9016FD16CBAB7A892
    @Test()
    public void getOnlyCauseWhenMessageCauseIsNull() {
        /* Branches:
         * (for-each(messages)) : true
         * (messageCause == null) : true
         */
        //Arrange Statement(s)
        doReturn(null).when(messageMock).getCause();
        Collection<Message> collection = new ArrayList<>();
        collection.add(messageMock);
        //Act Statement(s)
        Throwable result = Messages.getOnlyCause(collection);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        assertThat(collection.size(), equalTo(1));
        assertThat(collection.iterator().next(), is(instanceOf(Message.class)));
        verify(messageMock).getCause();
    }

    //Sapient generated method id: ${abd775dc-7396-3e82-888e-c65ca5f23185}, hash: 06841FF85DF79901CA4583C92D91FDAB
    @Test()
    public void getOnlyCauseWhenOnlyCauseIsNull() {
        /* Branches:
         * (for-each(messages)) : true
         * (messageCause == null) : false
         * (onlyCause != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        doReturn(throwable).when(messageMock).getCause();
        Collection<Message> collection = new ArrayList<>();
        collection.add(messageMock);
        //Act Statement(s)
        Throwable result = Messages.getOnlyCause(collection);
        //Assert statement(s)
        assertThat(result, equalTo(throwable));
        verify(messageMock).getCause();
    }

    //Sapient generated method id: ${49d2cfef-ade2-3de7-8134-7811f3b466fb}, hash: A5911B43EF94048BFF4583FD7CF3C43A
    @Test()
    public void boldWhenInternalFlagsNotEnableColorizeErrorMessages() {
        /* Branches:
         * (!InternalFlags.enableColorizeErrorMessages()) : true  #  inside formatText method
         */
        //Act Statement(s)
        String result = Messages.bold("text1");
        //Assert statement(s)
        assertThat(result, equalTo("text1"));
    }

    //Sapient generated method id: ${66a2d314-cdab-36de-ab0e-37e9b305ff65}, hash: 98984A44071485556CD25A2596AB11F6
    @Test()
    public void redBoldWhenInternalFlagsNotEnableColorizeErrorMessages() {
        /* Branches:
         * (!InternalFlags.enableColorizeErrorMessages()) : true  #  inside formatText method
         */
        //Act Statement(s)
        String result = Messages.redBold("text1");
        //Assert statement(s)
        assertThat(result, equalTo("text1"));
    }

    //Sapient generated method id: ${854bc9d2-fc78-3539-8728-0b8cbfba4520}, hash: 5A78C152AF69EE4CA71E5C8A357AEC7B
    @Test()
    public void underlineWhenInternalFlagsNotEnableColorizeErrorMessages() {
        /* Branches:
         * (!InternalFlags.enableColorizeErrorMessages()) : true  #  inside formatText method
         */
        //Act Statement(s)
        String result = Messages.underline("text1");
        //Assert statement(s)
        assertThat(result, equalTo("text1"));
    }

    //Sapient generated method id: ${718fe57b-661a-3c57-8031-cd76158520f6}, hash: 136A1D5B487E0A6E01A67CBBA74B9EC7
    @Test()
    public void faintWhenInternalFlagsNotEnableColorizeErrorMessages() {
        /* Branches:
         * (!InternalFlags.enableColorizeErrorMessages()) : true  #  inside formatText method
         */
        //Act Statement(s)
        String result = Messages.faint("text1");
        //Assert statement(s)
        assertThat(result, equalTo("text1"));
    }
}
