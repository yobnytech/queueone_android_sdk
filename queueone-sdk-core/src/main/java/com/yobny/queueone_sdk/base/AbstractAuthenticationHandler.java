package com.yobny.queueone_sdk.base;

import com.yobny.queueone_sdk.handlers.IAuthenticationHandler;
import com.yobny.queueone_sdk.types.AccountDetails;
import com.yobny.queueone_sdk.types.AuthKeys;
import com.yobny.queueone_sdk.types.AuthStatus;

import java.util.HashMap;

import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public abstract class AbstractAuthenticationHandler implements IAuthenticationHandler {

    private AuthStatus authStatus;

    public AuthStatus getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(AuthStatus authStatus) {
        this.authStatus = authStatus;
    }

    public boolean isAuthenticating() {
        return authStatus != AuthStatus.IDLE;
    }

    public void setAuthStatusToIdle() {
        this.authStatus = AuthStatus.IDLE;
    }

    public Completable authenticateWithDetails(final HashMap<String, String> details) {
        return Single.create((SingleOnSubscribe<AccountDetails>) e -> {
            AccountDetails accountDetails = new AccountDetails();
            accountDetails.username = details.get(AuthKeys.Email);
            accountDetails.password = details.get(AuthKeys.Password);
            e.onSuccess(accountDetails);
        }).flatMapCompletable(this::authenticate).subscribeOn(Schedulers.io());
    }
}
