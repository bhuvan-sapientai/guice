package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class InternalContextSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl.InjectorOptions injectorImplInjectorOptionsMock = mock(InjectorImpl.InjectorOptions.class);

    //Sapient generated method id: ${8956e69c-8d9a-317e-9b8c-50d272c39a92}, hash: CB6D933826AC6D7E18986948E788B055
    @Test()
    public void enterTest() {
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        InternalContext target = new InternalContext(injectorImplInjectorOptionsMock, objectArray);

        //Act Statement(s)
        target.enter();
    }

    //Sapient generated method id: ${f719a96e-537e-3964-b7d8-6475fdddf58e}, hash: 2DDE162D6ABA6073D080D016C912BE06
    @Test()
    public void closeWhenNewCountEquals0() {
        /* Branches:
         * (newCount < 0) : false
         * (newCount == 0) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{null};
        InternalContext target = new InternalContext(injectorImplInjectorOptionsMock, objectArray);

        //Act Statement(s)
        target.close();
    }

    //Sapient generated method id: ${bbf53055-1c68-3c35-8f16-e0d628801d2d}, hash: C2E5A74735B7E4A77572457B35BA2184
    @Test()
    public void getConstructionContextWhenConstructionContextIsNull() {
        /* Branches:
         * (constructionContext == null) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        InternalContext target = new InternalContext(injectorImplInjectorOptionsMock, objectArray);
        Object object = new Object();

        //Act Statement(s)
        ConstructionContext result = target.getConstructionContext(object);

        //Assert statement(s)
        //TODO: Please implement equals method in ConstructionContext for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}
