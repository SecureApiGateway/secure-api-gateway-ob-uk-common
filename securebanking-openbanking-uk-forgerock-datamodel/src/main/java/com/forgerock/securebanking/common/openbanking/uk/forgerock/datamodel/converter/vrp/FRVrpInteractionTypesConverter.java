package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.vrp;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.vrp.FRVRPInteractionTypes;

import uk.org.openbanking.datamodel.vrp.OBVRPInteractionTypes;

public class FRVrpInteractionTypesConverter {

    public static FRVRPInteractionTypes toFRVRPInteractionTypes(OBVRPInteractionTypes vrpInteractionTypes) {
        return vrpInteractionTypes == null ? null : FRVRPInteractionTypes.fromValue(vrpInteractionTypes.getValue());
    }

    public static OBVRPInteractionTypes toFRVRPInteractionTypes(FRVRPInteractionTypes vrpInteractionTypes) {
        return vrpInteractionTypes == null ? null : OBVRPInteractionTypes.fromValue(vrpInteractionTypes.getValue());
    }
}
