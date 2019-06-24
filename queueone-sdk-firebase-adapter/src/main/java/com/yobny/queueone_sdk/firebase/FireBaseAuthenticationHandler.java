package com.yobny.queueone_sdk.firebase;

import com.yobny.queueone_sdk.base.AbstractAuthenticationHandler;
import com.yobny.queueone_sdk.types.AccountDetails;

import io.reactivex.Completable;

public class FireBaseAuthenticationHandler extends AbstractAuthenticationHandler {


    @Override
    public Completable authenticate(AccountDetails details) {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return false;
    }

    @Override
    public boolean isAuthenticatedThisSession() {
        return false;
    }

    @Override
    public Completable logout() {
        return null;
    }

    @Override
    public String getCurrentUserEntityID() {
        return null;
    }
}
