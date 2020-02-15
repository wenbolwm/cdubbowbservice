package com.ctrip.bbz.cdubbowbservice.api;

/**
 * *
 * * OperState:
 * * I login 登录
 * * O logout 登出
 * * W work 工作
 * * D deal 后处理
 * * P pause 暂停
 */
public enum OperState {

    I(0),
    O(1),
    W(2),
    D(3),
    P(4);

    private final int value;

    OperState(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Baiji IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Baiji IDL.
     */
    public static OperState findByValue(int value) {
        switch (value) {
            case 0:
                return I;
            case 1:
                return O;
            case 2:
                return W;
            case 3:
                return D;
            case 4:
                return P;
            default:
                return null;
        }
    }
}
