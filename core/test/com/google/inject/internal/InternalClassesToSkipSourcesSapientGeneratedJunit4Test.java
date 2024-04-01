package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.common.collect.ImmutableSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class InternalClassesToSkipSourcesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${c31ce036-1434-3580-bd58-65adf0895d3c}, hash: 7FF587E3ECFD96962FB9A030E1BA42BF
    @Test()
    public void classesToSkipSourcesTest() {

        //Act Statement(s)
        ImmutableSet<Class<?>> result = InternalClassesToSkipSources.classesToSkipSources();
        ImmutableSet<Class<?>> anySet = ImmutableSet.of(RealMapBinder.class, RealMapBinder.MultimapBinder.class, RealMultibinder.class, RealOptionalBinder.class, ProviderMethodsModule.class);

        //Assert statement(s)
        assertThat(result, equalTo(anySet));
    }
}
