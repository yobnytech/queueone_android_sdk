package com.yobny.queueone_sdk.types;

public enum AuthStatus {

    IDLE {
        @Override
        public String toString() {
            return "Idle";
        }
    },

    CHECKING_IF_AUTH {
        @Override
        public String toString() {
            return "Checking if Authenticated";
        }
    }
}
