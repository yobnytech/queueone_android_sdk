package com.yobny.queueone_sdk.handlers;


import com.yobny.queueone_sdk.types.AccountDetails;

import io.reactivex.Completable;

public interface IAuthenticationHandler {

    Completable authenticate(AccountDetails details);

    boolean isAuthenticated();

    boolean isAuthenticatedThisSession();

    Completable logout();

    String getCurrentUserEntityID();
}
