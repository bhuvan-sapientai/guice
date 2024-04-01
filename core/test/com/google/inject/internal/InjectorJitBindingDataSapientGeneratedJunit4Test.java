package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class InjectorJitBindingDataSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);

    private final InjectorJitBindingData injectorJitBindingDataMock = mock(InjectorJitBindingData.class);

    private final Key keyMock = mock(Key.class);

    //Sapient generated method id: ${25b50146-043e-3fae-b961-be562b76e141}, hash: 466253F66DB6A00658327574092100D9
    @Ignore()
    @Test()
    public void getJitBindingsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        Map<Key<?>, BindingImpl<?>> result = target.getJitBindings();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${4c0f4662-b73d-3df8-b67c-ce127ec70734}, hash: BDE2AAEAD1C3264DDAA2EB3BA8D20A02
    @Ignore()
    @Test()
    public void getJitBindingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        BindingImpl<?> result = target.getJitBinding(keyMock);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${fa3a7f9f-2eb4-3698-ae57-46ceb22e6515}, hash: 22D4EEA33D17D896D57C5A1E852E270A
    @Ignore()
    @Test()
    public void putJitBindingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        BindingImpl bindingImplMock = mock(BindingImpl.class);
        //Act Statement(s)
        target.putJitBinding(keyMock, bindingImplMock);
        //Assert statement(s)
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${9945e95c-f4d7-3162-9695-ecd75d845fa4}, hash: 7F3D1338F0D587081902EDD081D060A9
    @Ignore()
    @Test()
    public void removeJitBindingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        target.removeJitBinding(keyMock);
        //Assert statement(s)
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${a1756330-43df-3bdb-975f-94fc3c3a3033}, hash: 82169E936AF2259E32434E9F4C00418D
    @Ignore()
    @Test()
    public void isFailedJitBindingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        boolean result = target.isFailedJitBinding(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${5e193252-47ee-3d65-a246-fc323dd356d6}, hash: DCC296E27E6A812B80347BB5ECE449E9
    @Ignore()
    @Test()
    public void addFailedJitBindingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        target.addFailedJitBinding(keyMock);
        //Assert statement(s)
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${308bb749-c3ef-3a03-a812-01e576e84c79}, hash: 290F4850A5BCA5974FF68F5BBB98CC48
    @Ignore()
    @Test()
    public void banKeyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bannedKeys
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = spy(new InjectorJitBindingData((Optional) null));
        Object object2 = new Object();
        doNothing().when(target).banKeyInParent(keyMock, injectorBindingDataMock, object2);
        //Act Statement(s)
        target.banKey(keyMock, injectorBindingDataMock, object2);
        //Assert statement(s)
        verify(injectorJitBindingDataMock).lock();
        verify(target).banKeyInParent(keyMock, injectorBindingDataMock, object2);
    }

    //Sapient generated method id: ${43963278-080f-35af-b84f-e035fc3b9b4d}, hash: EA475CE571E6BD5D1F3A44C6E7948411
    @Ignore()
    @Test()
    public void banKeyInParentWhenParentIsPresent() {
        /* Branches:
         * (parent.isPresent()) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        Object object2 = new Object();
        doNothing().when(injectorJitBindingDataMock).banKey(keyMock, injectorBindingDataMock, object2);
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        target.banKeyInParent(keyMock, injectorBindingDataMock, object2);
        //Assert statement(s)
        verify(injectorJitBindingDataMock).lock();
        verify(injectorJitBindingDataMock).banKey(keyMock, injectorBindingDataMock, object2);
    }

    //Sapient generated method id: ${3f4ed625-f85b-39b7-add0-f9180ea64124}, hash: 6BB9B9FDD57257306E3822C406BF16B1
    @Ignore()
    @Test()
    public void isBannedKeyWhenBannedKeysContainsKey() {
        /* Branches:
         * (bannedKeys.contains(key)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bannedKeys
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        boolean result = target.isBannedKey(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${fb4c80ea-4f43-3aee-8a3d-ef17b2fdf5fe}, hash: B37822F81EA50FDD82450912D83D9635
    @Ignore()
    @Test()
    public void isBannedKeyWhenBannedKeysNotContainsKey() {
        /* Branches:
         * (bannedKeys.contains(key)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bannedKeys
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        boolean result = target.isBannedKey(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${6f94c28b-64aa-3692-a745-d428b68b6b66}, hash: A454437B7E3BC6469A2629AD5E9ECCCF
    @Ignore()
    @Test()
    public void getSourcesForBannedKeyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bannedKeys
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        Set<Object> result = target.getSourcesForBannedKey(keyMock);
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
        verify(injectorJitBindingDataMock).lock();
    }

    //Sapient generated method id: ${df989bdd-bf46-3e9a-9d63-d54a2b5bf6c3}, hash: 5D739FC248BE7FAA62F3B5E70E881E20
    @Ignore()
    @Test()
    public void lockTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        InjectorJitBindingData target = new InjectorJitBindingData((Optional) null);
        //Act Statement(s)
        Object result = target.lock();
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(injectorJitBindingDataMock).lock();
    }
}
