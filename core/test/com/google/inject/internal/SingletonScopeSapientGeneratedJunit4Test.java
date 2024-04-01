package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.Provider;
import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class SingletonScopeSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${4cca813d-2b33-3e30-846b-7bf082a41614}, hash: 7FFDE1DE8206220C4626D890F1D1567E
    @Test()
    public void scopeTest() {
        //Arrange Statement(s)
        SingletonScope target = new SingletonScope();
        Key key = Key.get(Object.class);
        Provider<Object> providerMock = mock(Provider.class);

        //Act Statement(s)
        Provider result = target.scope(key, providerMock);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: AE039B27DDA2CEB8D49BD7F49F20E9E7
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        SingletonScope target = new SingletonScope();

        //Act Statement(s)
        String result = target.toString();

        //Assert statement(s)
        assertThat(result, equalTo("Scopes.SINGLETON"));
    }
}
