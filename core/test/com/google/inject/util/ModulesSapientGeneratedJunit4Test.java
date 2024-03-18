package com.google.inject.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.Module;
import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ModulesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Iterable iterableMock = mock(Iterable.class, "valid_value");

    private final Module moduleMock = mock(Module.class);

    private final Modules.OverriddenModuleBuilder modulesOverriddenModuleBuilderMock = mock(Modules.OverriddenModuleBuilder.class);

    //Sapient generated method id: ${dcd30e4f-0310-3a91-a93b-2188bf6b3998}, hash: 70BAB3840C61EE391B6D77EC6776B659
    @Test()
    public void overrideTest() {
        //Arrange Statement(s)
        try (MockedStatic<Modules> modules = mockStatic(Modules.class, CALLS_REAL_METHODS)) {
            modules.when(() -> Modules.override(anyList())).thenReturn(modulesOverriddenModuleBuilderMock);
            Module[] moduleArray = new Module[]{};
            //Act Statement(s)
            Modules.OverriddenModuleBuilder result = Modules.override(moduleArray);
            //Assert statement(s)
            assertThat(result, equalTo(modulesOverriddenModuleBuilderMock));
            modules.verify(() -> Modules.override(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${eb4796c2-39a7-3799-86db-1b535ee5dd37}, hash: 678A93BE2B611AB7EDD1CD22E2D5B694
    @Test()
    public void override1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Modules> modules = mockStatic(Modules.class, CALLS_REAL_METHODS)) {
            modules.when(() -> Modules.override(anyList())).thenReturn(modulesOverriddenModuleBuilderMock);
            //Act Statement(s)
            Modules.OverriddenModuleBuilder result = Modules.override();
            //Assert statement(s)
            assertThat(result, equalTo(modulesOverriddenModuleBuilderMock));
            modules.verify(() -> Modules.override(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${df6530a8-5bb6-31da-a95b-9cc9f8aa01bf}, hash: 2670A984474A128C080468AF99B6F769
    @Ignore()
    @Test()
    public void override2Test() {
        //Act Statement(s)
        Modules.OverriddenModuleBuilder result = Modules.override(iterableMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${acf56173-551d-3f31-a907-dd506cc7c526}, hash: C448F1D4A32406DEF0E05233A9E13267
    @Test()
    public void combineTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Module moduleMock2 = mock(Module.class, "value1");
        //Module moduleMock3 = mock(Module.class, "value2");
        //Module moduleMock4 = mock(Module.class, "value3");
        //Module moduleMock5 = mock(Module.class, "value4");
        /*try (MockedStatic<Modules> modules = mockStatic(Modules.class, CALLS_REAL_METHODS)) {
    modules.when(() -> Modules.combine((Iterable) any())).thenReturn(moduleMock);
    Module[][][] moduleArray4 = new Module[][][] { moduleMock2 };
    Module[][][] moduleArray5 = new Module[][][] { moduleMock3 };
    Module[][] moduleArray3 = new Module[][] { moduleArray4, moduleArray5 };
    Module[] moduleArray2 = new Module[] { moduleArray3 };
    Module[][][] moduleArray8 = new Module[][][] { moduleMock4 };
    Module[][][] moduleArray9 = new Module[][][] { moduleMock5 };
    Module[][] moduleArray7 = new Module[][] { moduleArray8, moduleArray9 };
    Module[] moduleArray6 = new Module[] { moduleArray7 };
    Module[] moduleArray = new Module[] { moduleArray2, moduleArray6 };
    //Act Statement(s)
    Module result = Modules.combine(moduleArray);
    //Assert statement(s)
    assertThat(result, equalTo(moduleMock));
    modules.verify(() -> Modules.combine((Iterable) any()), atLeast(1));
}*/
    }

    //Sapient generated method id: ${8704a27a-a5d3-3b89-97ad-86361d0aefcc}, hash: 2FBF9A9187DA604D13DEC5DE9215291C
    @Test()
    public void combine1Test() {
        //Act Statement(s)
        Module result = Modules.combine(moduleMock);
        //Assert statement(s)
        assertThat(result, equalTo(moduleMock));
    }

    //Sapient generated method id: ${53d090ba-bb5f-3296-b4ce-3dd1d6c00785}, hash: 74D4ACB3D0A39597A22A2C7D3703B14A
    @Test()
    public void combine2Test() {
        //Act Statement(s)
        Module result = Modules.combine();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${5d127df9-5961-3b9c-afcc-50ec8b0302d7}, hash: 6DEEB04E29D46B46679AFA0409DF572D
    @Ignore()
    @Test()
    public void combine3Test() {
        //Act Statement(s)
        Module result = Modules.combine(iterableMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${45f0f5d3-0910-3533-9250-ab6d856d48f5}, hash: 329E507353CEA3DA7D2352D0B168A62F
    @Test()
    public void requireExplicitBindingsModuleTest() {
        //Act Statement(s)
        Module result = Modules.requireExplicitBindingsModule();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9d40357a-f041-341c-a5fd-2566fb664aed}, hash: E19D6DA56A663D99BE80D373D65D1350
    @Test()
    public void requireAtInjectOnConstructorsModuleTest() {
        //Act Statement(s)
        Module result = Modules.requireAtInjectOnConstructorsModule();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${2e3b345c-9883-3d27-a309-145e37992d12}, hash: 5E14B24B60D8B927D2C23AB875DD9C2F
    @Test()
    public void requireExactBindingAnnotationsModuleTest() {
        //Act Statement(s)
        Module result = Modules.requireExactBindingAnnotationsModule();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${e8720130-d886-3a62-be19-f71e63c394af}, hash: 7D3AA44AAC118FA3B06CE1329951A72D
    @Test()
    public void disableCircularProxiesModuleTest() {
        //Act Statement(s)
        Module result = Modules.disableCircularProxiesModule();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}
