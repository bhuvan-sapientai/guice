package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.TypeLiteral;

import java.lang.reflect.ParameterizedType;

import com.google.inject.binder.LinkedBindingBuilder;

import java.lang.reflect.Type;

import com.google.inject.Provider;
import com.google.common.base.Optional;
import com.google.inject.Module;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.util.Types;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class RealOptionalBinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binder binderMock = mock(Binder.class, "binder");

    private final Binder binderMock2 = mock(Binder.class);

    private final Key keyMock = mock(Key.class);

    private final LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock2 = mock(ParameterizedType.class);

    private final ScopedBindingBuilder scopedBindingBuilderMock = mock(ScopedBindingBuilder.class);

    private final TypeLiteral<Optional<Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral<Object> typeMock = mock(TypeLiteral.class);

    private final Type typeMock2 = mock(Type.class);

    //Sapient generated method id: ${f63a1edf-a6ff-33e6-8976-659cd3af5e93}, hash: 0C5A61628796B5C09B4A4119CA19356A
    @Ignore()
    @Test()
    public void newRealOptionalBinderTest() {
        //Arrange Statement(s)
        Class<RealOptionalBinder>[] classArray = new Class[]{RealOptionalBinder.class};
        doReturn(binderMock).when(binderMock2).skipSources(classArray);
        doNothing().when(binderMock).install((Module) any());
        Key key = Key.get(Object.class);
        //Act Statement(s)
        RealOptionalBinder result = RealOptionalBinder.newRealOptionalBinder(binderMock2, key);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(binderMock2).skipSources(classArray);
        verify(binderMock).install((Module) any());
    }

    //Sapient generated method id: ${2974d990-e3db-3e76-b2a7-89d34aaffc8d}, hash: 5A98284EED2A1B3AF7D812C74851DF51
    @Test()
    public void optionalOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Optional<Object>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            Type[] typeArray = new Type[]{typeMock2};
            types.when(() -> Types.newParameterizedType(Optional.class, typeArray)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Optional<Object>> result = RealOptionalBinder.optionalOf(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(typeMock).getType();
            types.verify(() -> Types.newParameterizedType(Optional.class, typeArray), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${df641f99-8876-31b1-bce9-2cbe88623abd}, hash: B8A2AFEF242CCFA60CC4940F5901089C
    @Test()
    public void javaOptionalOfTest() {
        //Arrange Statement(s)
        TypeLiteral<java.util.Optional<Object>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            Type[] typeArray = new Type[]{typeMock2};
            types.when(() -> Types.newParameterizedType(java.util.Optional.class, typeArray)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<java.util.Optional<Object>> result = RealOptionalBinder.javaOptionalOf(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(typeMock).getType();
            types.verify(() -> Types.newParameterizedType(java.util.Optional.class, typeArray), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${fc7f787f-7635-3174-ae37-2db5ed8b3959}, hash: ECD64F1748B8EAC53428CB691CFF4780
    @Test()
    public void optionalOfJakartaProviderTest() {
        //Arrange Statement(s)
        TypeLiteral<Optional<jakarta.inject.Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            Type[] typeArray = new Type[]{typeMock2};
            types.when(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            Type[] typeArray2 = new Type[]{parameterizedTypeMock};
            types.when(() -> Types.newParameterizedType(Optional.class, typeArray2)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Optional<jakarta.inject.Provider<Object>>> result = RealOptionalBinder.optionalOfJakartaProvider(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(typeMock).getType();
            types.verify(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray), atLeast(1));
            types.verify(() -> Types.newParameterizedType(Optional.class, typeArray2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${825b428f-eea3-349a-8ca8-9781b4fff26a}, hash: 2D6F67C4AA62B219482E339CF7B2F333
    @Test()
    public void javaOptionalOfJakartaProviderTest() {
        //Arrange Statement(s)
        TypeLiteral<java.util.Optional<jakarta.inject.Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            Type[] typeArray = new Type[]{typeMock2};
            types.when(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            Type[] typeArray2 = new Type[]{parameterizedTypeMock};
            types.when(() -> Types.newParameterizedType(java.util.Optional.class, typeArray2)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<java.util.Optional<jakarta.inject.Provider<Object>>> result = RealOptionalBinder.javaOptionalOfJakartaProvider(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(typeMock).getType();
            types.verify(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray), atLeast(1));
            types.verify(() -> Types.newParameterizedType(java.util.Optional.class, typeArray2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${fced2641-6e67-3ce5-9711-f0c1de55c301}, hash: DCB26B5E42475AE25F84EEB6B2F6FA1D
    @Test()
    public void optionalOfProviderTest() {
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            Type[] typeArray = new Type[]{typeMock2};
            types.when(() -> Types.newParameterizedType(Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            Type[] typeArray2 = new Type[]{parameterizedTypeMock};
            types.when(() -> Types.newParameterizedType(Optional.class, typeArray2)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Optional<Provider<Object>>> result = RealOptionalBinder.optionalOfProvider(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(typeMock).getType();
            types.verify(() -> Types.newParameterizedType(Provider.class, typeArray), atLeast(1));
            types.verify(() -> Types.newParameterizedType(Optional.class, typeArray2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${106cd334-d630-3237-a9e1-57abb869335b}, hash: 39D4CC8E6374F7A33D91593DD3B9280D
    @Test()
    public void javaOptionalOfProviderTest() {
        //Arrange Statement(s)
        TypeLiteral<java.util.Optional<Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            Type[] typeArray = new Type[]{typeMock2};
            types.when(() -> Types.newParameterizedType(Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            Type[] typeArray2 = new Type[]{parameterizedTypeMock};
            types.when(() -> Types.newParameterizedType(java.util.Optional.class, typeArray2)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<java.util.Optional<Provider<Object>>> result = RealOptionalBinder.javaOptionalOfProvider(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(typeMock).getType();
            types.verify(() -> Types.newParameterizedType(Provider.class, typeArray), atLeast(1));
            types.verify(() -> Types.newParameterizedType(java.util.Optional.class, typeArray2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${24448291-5152-346d-90ec-82fe216db063}, hash: 58FF48347A33BE53F1402F51A8784A29
    @Test()
    public void providerOfTest() {
        //Arrange Statement(s)
        Key<Object> keyMock = mock(Key.class);
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        Type typeMock = mock(Type.class);
        Key<Provider<Object>> keyMock2 = mock(Key.class);
        try (MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
            doReturn(typeMock).when(typeLiteralMock).getType();
            doReturn(keyMock2).when(keyMock).ofType(parameterizedTypeMock);
            types.when(() -> Types.providerOf(typeMock)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            Key<Provider<Object>> result = RealOptionalBinder.providerOf(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyMock2));
            verify(keyMock).getTypeLiteral();
            verify(typeLiteralMock).getType();
            verify(keyMock).ofType(parameterizedTypeMock);
            types.verify(() -> Types.providerOf(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${6005d2c5-cd11-3b74-8e20-9bb3e96e9d03}, hash: 6CEF2DBBB573818E26EDB704FD88ECE2
    @Ignore()
    @Test()
    public void getKeyForDefaultBindingTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Class<RealOptionalBinder>[] classArray = new Class[]{RealOptionalBinder.class};
        doReturn(binderMock).when(binderMock2).skipSources(classArray);
        doNothing().when(binderMock).install((Module) any());
        doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
        doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).toProvider((Provider) any());
        Key key = Key.get(Object.class);
        RealOptionalBinder<Object> target = RealOptionalBinder.newRealOptionalBinder(binderMock2, key);
        //Act Statement(s)
        Key result = target.getKeyForDefaultBinding();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(binderMock2).skipSources(classArray);
        verify(binderMock).install((Module) any());
        verify(binderMock).bind(keyMock);
        verify(linkedBindingBuilderMock).toProvider((Provider) any());
    }

    //Sapient generated method id: ${4d8418b9-8e85-3fe8-9e5f-1589d6f830e9}, hash: 61F7FFC4E84E823E8338757E24F507DD
    @Ignore()
    @Test()
    public void setDefaultTest() {
        //Arrange Statement(s)
        Class<RealOptionalBinder>[] classArray = new Class[]{RealOptionalBinder.class};
        doReturn(binderMock).when(binderMock2).skipSources(classArray);
        doNothing().when(binderMock).install((Module) any());
        Key key = Key.get(Object.class);
        RealOptionalBinder<Object> target = spy(RealOptionalBinder.newRealOptionalBinder(binderMock2, key));
        doReturn(keyMock).when(target).getKeyForDefaultBinding();
        doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
        //Act Statement(s)
        LinkedBindingBuilder result = target.setDefault();
        //Assert statement(s)
        assertThat(result, equalTo(linkedBindingBuilderMock));
        verify(binderMock2).skipSources(classArray);
        verify(binderMock).install((Module) any());
        verify(target).getKeyForDefaultBinding();
        verify(binderMock).bind(keyMock);
    }

    //Sapient generated method id: ${15e97eea-adff-3e7c-88d1-1b2daf84127f}, hash: BFEF49987F62EF09E8F8675820E6D794
    @Ignore()
    @Test()
    public void getKeyForActualBindingTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Class<RealOptionalBinder>[] classArray = new Class[]{RealOptionalBinder.class};
        doReturn(binderMock).when(binderMock2).skipSources(classArray);
        doNothing().when(binderMock).install((Module) any());
        doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
        doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).toProvider((Provider) any());
        Key key = Key.get(Object.class);
        RealOptionalBinder<Object> target = RealOptionalBinder.newRealOptionalBinder(binderMock2, key);
        //Act Statement(s)
        Key result = target.getKeyForActualBinding();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(binderMock2).skipSources(classArray);
        verify(binderMock).install((Module) any());
        verify(binderMock).bind(keyMock);
        verify(linkedBindingBuilderMock).toProvider((Provider) any());
    }

    //Sapient generated method id: ${8328d3e5-807e-3d6a-a02a-2a3815a63620}, hash: 04EC79174C244C60B070A1733215195B
    @Ignore()
    @Test()
    public void setBindingTest() {
        //Arrange Statement(s)
        Class<RealOptionalBinder>[] classArray = new Class[]{RealOptionalBinder.class};
        doReturn(binderMock).when(binderMock2).skipSources(classArray);
        doNothing().when(binderMock).install((Module) any());
        Key key = Key.get(Object.class);
        RealOptionalBinder<Object> target = spy(RealOptionalBinder.newRealOptionalBinder(binderMock2, key));
        doReturn(keyMock).when(target).getKeyForActualBinding();
        doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
        //Act Statement(s)
        LinkedBindingBuilder result = target.setBinding();
        //Assert statement(s)
        assertThat(result, equalTo(linkedBindingBuilderMock));
        verify(binderMock2).skipSources(classArray);
        verify(binderMock).install((Module) any());
        verify(target).getKeyForActualBinding();
        verify(binderMock).bind(keyMock);
    }

    //Sapient generated method id: ${f56d41b4-cf00-3592-bb68-9a89456c3c5f}, hash: 0198495618EC33474B46F622F0D453EF
    @Ignore()
    @Test()
    public void configureTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class, "Binder");
        Key<Optional<Provider<Object>>> keyMock = mock(Key.class);
        LinkedBindingBuilder linkedBindingBuilderMock2 = mock(LinkedBindingBuilder.class);
        Key<java.util.Optional<Provider<Object>>> keyMock2 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock2 = mock(ScopedBindingBuilder.class);
        LinkedBindingBuilder linkedBindingBuilderMock3 = mock(LinkedBindingBuilder.class);
        Key keyMock3 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock3 = mock(ScopedBindingBuilder.class);
        LinkedBindingBuilder linkedBindingBuilderMock4 = mock(LinkedBindingBuilder.class);
        Key keyMock4 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock4 = mock(ScopedBindingBuilder.class);
        LinkedBindingBuilder linkedBindingBuilderMock5 = mock(LinkedBindingBuilder.class);
        Key<Optional<Object>> keyMock5 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock5 = mock(ScopedBindingBuilder.class);
        LinkedBindingBuilder linkedBindingBuilderMock6 = mock(LinkedBindingBuilder.class);
        Key<java.util.Optional<Object>> keyMock6 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock6 = mock(ScopedBindingBuilder.class);
        Binder binderMock3 = mock(Binder.class, "Binder");
        Type typeMock = mock(Type.class);
        ParameterizedType parameterizedTypeMock3 = mock(ParameterizedType.class);
        ParameterizedType parameterizedTypeMock4 = mock(ParameterizedType.class);
        TypeLiteral<java.util.Optional<Provider<Object>>> typeLiteralMock2 = mock(TypeLiteral.class);
        ParameterizedType parameterizedTypeMock5 = mock(ParameterizedType.class);
        ParameterizedType parameterizedTypeMock6 = mock(ParameterizedType.class);
        TypeLiteral<Optional<jakarta.inject.Provider<Object>>> typeLiteralMock3 = mock(TypeLiteral.class);
        ParameterizedType parameterizedTypeMock7 = mock(ParameterizedType.class);
        ParameterizedType parameterizedTypeMock8 = mock(ParameterizedType.class);
        TypeLiteral<java.util.Optional<jakarta.inject.Provider<Object>>> typeLiteralMock4 = mock(TypeLiteral.class);
        ParameterizedType parameterizedTypeMock9 = mock(ParameterizedType.class);
        TypeLiteral<Optional<Object>> typeLiteralMock5 = mock(TypeLiteral.class);
        ParameterizedType parameterizedTypeMock10 = mock(ParameterizedType.class);
        TypeLiteral<java.util.Optional<Object>> typeLiteralMock6 = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(linkedBindingBuilderMock).when(binderMock2).bind(keyMock);
            doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).toProvider((Provider) any());
            doReturn(linkedBindingBuilderMock2).when(binderMock2).bind(keyMock2);
            doReturn(scopedBindingBuilderMock2).when(linkedBindingBuilderMock2).toProvider((Provider) any());
            doReturn(linkedBindingBuilderMock3).when(binderMock2).bind(keyMock3);
            doReturn(scopedBindingBuilderMock3).when(linkedBindingBuilderMock3).to(keyMock);
            doReturn(linkedBindingBuilderMock4).when(binderMock2).bind(keyMock4);
            doReturn(scopedBindingBuilderMock4).when(linkedBindingBuilderMock4).to(keyMock2);
            doReturn(linkedBindingBuilderMock5).when(binderMock2).bind(keyMock5);
            doReturn(scopedBindingBuilderMock5).when(linkedBindingBuilderMock5).toProvider((Provider) any());
            doReturn(linkedBindingBuilderMock6).when(binderMock2).bind(keyMock6);
            doReturn(scopedBindingBuilderMock6).when(linkedBindingBuilderMock6).toProvider((Provider) any());
            Class<RealOptionalBinder>[] classArray = new Class[]{RealOptionalBinder.class};
            doReturn(null).when(binderMock3).skipSources(classArray);
            Type[] typeArray = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            Type[] typeArray2 = new Type[]{parameterizedTypeMock};
            types.when(() -> Types.newParameterizedType(Optional.class, typeArray2)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            Type[] typeArray3 = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(Provider.class, typeArray3)).thenReturn(parameterizedTypeMock3);
            Type[] typeArray4 = new Type[]{parameterizedTypeMock3};
            types.when(() -> Types.newParameterizedType(java.util.Optional.class, typeArray4)).thenReturn(parameterizedTypeMock4);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock4)).thenReturn(typeLiteralMock2);
            Type[] typeArray5 = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray5)).thenReturn(parameterizedTypeMock5);
            Type[] typeArray6 = new Type[]{parameterizedTypeMock5};
            types.when(() -> Types.newParameterizedType(Optional.class, typeArray6)).thenReturn(parameterizedTypeMock6);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock6)).thenReturn(typeLiteralMock3);
            Type[] typeArray7 = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray7)).thenReturn(parameterizedTypeMock7);
            Type[] typeArray8 = new Type[]{parameterizedTypeMock7};
            types.when(() -> Types.newParameterizedType(java.util.Optional.class, typeArray8)).thenReturn(parameterizedTypeMock8);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock8)).thenReturn(typeLiteralMock4);
            Type[] typeArray9 = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(Optional.class, typeArray9)).thenReturn(parameterizedTypeMock9);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock9)).thenReturn(typeLiteralMock5);
            Type[] typeArray10 = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(java.util.Optional.class, typeArray10)).thenReturn(parameterizedTypeMock10);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock10)).thenReturn(typeLiteralMock6);
            Key key = Key.get(Object.class);
            RealOptionalBinder<Object> target = RealOptionalBinder.newRealOptionalBinder(binderMock3, key);
            //Act Statement(s)
            target.configure(binderMock2);
            //Assert statement(s)
            verify(binderMock2).bind(keyMock);
            verify(linkedBindingBuilderMock).toProvider((Provider) any());
            verify(binderMock2).bind(keyMock2);
            verify(linkedBindingBuilderMock2).toProvider((Provider) any());
            verify(binderMock2).bind(keyMock3);
            verify(linkedBindingBuilderMock3).to(keyMock);
            verify(binderMock2).bind(keyMock4);
            verify(linkedBindingBuilderMock4).to(keyMock2);
            verify(binderMock2).bind(keyMock5);
            verify(linkedBindingBuilderMock5).toProvider((Provider) any());
            verify(binderMock2).bind(keyMock6);
            verify(linkedBindingBuilderMock6).toProvider((Provider) any());
            verify(binderMock3).skipSources(classArray);
            types.verify(() -> Types.newParameterizedType(Provider.class, typeArray), atLeast(1));
            types.verify(() -> Types.newParameterizedType(Optional.class, typeArray2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
            types.verify(() -> Types.newParameterizedType(Provider.class, typeArray3), atLeast(1));
            types.verify(() -> Types.newParameterizedType(java.util.Optional.class, typeArray4), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock4), atLeast(1));
            types.verify(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray5), atLeast(1));
            types.verify(() -> Types.newParameterizedType(Optional.class, typeArray6), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock6), atLeast(1));
            types.verify(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray7), atLeast(1));
            types.verify(() -> Types.newParameterizedType(java.util.Optional.class, typeArray8), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock8), atLeast(1));
            types.verify(() -> Types.newParameterizedType(Optional.class, typeArray9), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock9), atLeast(1));
            types.verify(() -> Types.newParameterizedType(java.util.Optional.class, typeArray10), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock10), atLeast(1));
        }
    }
}
