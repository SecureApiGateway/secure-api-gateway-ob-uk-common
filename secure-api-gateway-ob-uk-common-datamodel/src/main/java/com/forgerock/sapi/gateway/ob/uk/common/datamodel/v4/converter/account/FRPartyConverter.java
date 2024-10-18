/*
 * Copyright © 2020-2024 ForgeRock AS (obst@forgerock.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.converter.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.v4.account.FRPartyData;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRPostalAddressConverter;
import uk.org.openbanking.datamodel.v4.account.OBInternalPartyType1Code;
import uk.org.openbanking.datamodel.v4.account.OBParty2;
import uk.org.openbanking.datamodel.v4.account.OBPartyRelationships1;
import uk.org.openbanking.datamodel.v4.account.OBPartyRelationships1Account;

import java.net.URI;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRPostalAddressConverter.toOBPostalAddress7;

public class FRPartyConverter {

    // FR to OB

    public static OBParty2 toOBParty2(FRPartyData party) {
        return party == null ? null : new OBParty2()
                .partyId(party.getPartyId())
                .partyNumber(party.getPartyNumber())
                .partyType(toOBInternalPartyType1Code(party.getPartyType()))
                .name(party.getName())
                .fullLegalName(party.getFullLegalName())
                .legalStructure(party.getLegalStructure())
                .beneficialOwnership(party.getBeneficialOwnership())
                .accountRole(party.getAccountRole())
                .emailAddress(party.getEmailAddress())
                .phone(party.getPhone())
                .mobile(party.getMobile())
                .relationships(toOBPartyRelationships1(party.getRelationship()))
                .LEI(party.getLEI())
                .address(toOBPostalAddress7(party.getAddresses()));
    }

    public static OBInternalPartyType1Code toOBInternalPartyType1Code(FRPartyData.FRPartyType partyType) {
        return partyType == null ? null : OBInternalPartyType1Code.valueOf(partyType.name());
    }

    public static OBPartyRelationships1 toOBPartyRelationships1(FRPartyData.FRRelationship relationship) {
        return relationship == null ? null : new OBPartyRelationships1()
                .account(new OBPartyRelationships1Account()
                        .related(relationship.getRelated() != null ? URI.create(relationship.getRelated()) : null)
                        .id(relationship.getId()));
    }

    // OB to FR
    public static FRPartyData toFRPartyData(OBParty2 party) {
        return party == null ? null : FRPartyData.builder()
                .partyId(party.getPartyId())
                .partyNumber(party.getPartyNumber())
                .partyType(toFRPartyType(party.getPartyType()))
                .name(party.getName())
                .fullLegalName(party.getFullLegalName())
                .legalStructure(party.getLegalStructure())
                .beneficialOwnership(party.getBeneficialOwnership())
                .accountRole(party.getAccountRole())
                .emailAddress(party.getEmailAddress())
                .phone(party.getPhone())
                .mobile(party.getMobile())
                .relationship(toFRRelationship(party.getRelationships()))
                .addresses(FRPostalAddressConverter.toFRPostalAddressListV4(party.getAddress()))
                .build();
    }

    public static FRPartyData.FRPartyType toFRPartyType(OBInternalPartyType1Code partyType) {
        return partyType == null ? null : FRPartyData.FRPartyType.valueOf(partyType.name());
    }

    public static FRPartyData.FRRelationship toFRRelationship(OBPartyRelationships1 relationship) {
        return relationship == null || relationship.getAccount() == null ? null : FRPartyData.FRRelationship.builder()
                .related(relationship.getAccount().getRelated() != null ? relationship.getAccount().getRelated().toString() : null)
                .id(relationship.getAccount().getId())
                .build();
    }
}
