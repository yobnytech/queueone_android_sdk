package com.yobny.queueone_sdk.types;

import java.util.HashMap;

public class AccountDetails {

    public String username;

    public String password;

    public HashMap<String, String> meta = new HashMap<>();

    public boolean loginDetailsValid() {
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }

    public void setMetaValue(String key, String value) {
        meta.put(key, value);
    }

    public String getMetaValue(String key){
        return meta.get(key);
    }
}
