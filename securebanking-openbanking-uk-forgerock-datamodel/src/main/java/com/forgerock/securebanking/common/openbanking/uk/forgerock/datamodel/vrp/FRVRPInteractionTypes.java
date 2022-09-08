package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.vrp;

import java.util.stream.Stream;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRChargeBearerType;

public enum FRVRPInteractionTypes {

    INSESSION("InSession"),

    OFFSESSION("OffSession");

    private String value;

    FRVRPInteractionTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }

    public static FRVRPInteractionTypes fromValue(String value) {
        return Stream.of(values())
                .filter(type -> type.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }

}
