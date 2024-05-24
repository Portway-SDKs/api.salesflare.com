import localVarRequest from 'request';

export * from './getContacts200ResponseInner';
export * from './getContacts200ResponseInnerAccount';
export * from './getContacts200ResponseInnerAddressesInner';
export * from './getContacts200ResponseInnerOwner';
export * from './getContacts200ResponseInnerPhoneNumbersInner';
export * from './getContacts200ResponseInnerPositionsInner';
export * from './getContacts200ResponseInnerSocialProfilesInner';
export * from './getContacts200ResponseInnerTagsInner';
export * from './getCurrencies200ResponseInner';
export * from './getMe200Response';
export * from './getMe200ResponseDataSourcesInner';
export * from './getMe200ResponseDataSourcesToReconnectInner';
export * from './getMe200ResponseFlagsInner';
export * from './getMe200ResponsePhoneNumbersInner';
export * from './getMe200ResponseRole';
export * from './getMe200ResponseRolePermissions';
export * from './getMe200ResponseSocialProfilesInner';
export * from './getMe200ResponseTeam';
export * from './getMe200ResponseTeamCurrency';
export * from './getMe200ResponseTeamEmailTrackingDomain';
export * from './postContacts200ResponseInner';
export * from './postContactsRequestInner';
export * from './postContactsRequestInnerAddress';
export * from './postContactsRequestInnerPhoneNumbersInner';
export * from './postContactsRequestInnerPosition';
export * from './putWorkflowsIdAudienceRecordId200Response';
export * from './putWorkflowsIdAudienceRecordIdRequest';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { GetContacts200ResponseInner } from './getContacts200ResponseInner';
import { GetContacts200ResponseInnerAccount } from './getContacts200ResponseInnerAccount';
import { GetContacts200ResponseInnerAddressesInner } from './getContacts200ResponseInnerAddressesInner';
import { GetContacts200ResponseInnerOwner } from './getContacts200ResponseInnerOwner';
import { GetContacts200ResponseInnerPhoneNumbersInner } from './getContacts200ResponseInnerPhoneNumbersInner';
import { GetContacts200ResponseInnerPositionsInner } from './getContacts200ResponseInnerPositionsInner';
import { GetContacts200ResponseInnerSocialProfilesInner } from './getContacts200ResponseInnerSocialProfilesInner';
import { GetContacts200ResponseInnerTagsInner } from './getContacts200ResponseInnerTagsInner';
import { GetCurrencies200ResponseInner } from './getCurrencies200ResponseInner';
import { GetMe200Response } from './getMe200Response';
import { GetMe200ResponseDataSourcesInner } from './getMe200ResponseDataSourcesInner';
import { GetMe200ResponseDataSourcesToReconnectInner } from './getMe200ResponseDataSourcesToReconnectInner';
import { GetMe200ResponseFlagsInner } from './getMe200ResponseFlagsInner';
import { GetMe200ResponsePhoneNumbersInner } from './getMe200ResponsePhoneNumbersInner';
import { GetMe200ResponseRole } from './getMe200ResponseRole';
import { GetMe200ResponseRolePermissions } from './getMe200ResponseRolePermissions';
import { GetMe200ResponseSocialProfilesInner } from './getMe200ResponseSocialProfilesInner';
import { GetMe200ResponseTeam } from './getMe200ResponseTeam';
import { GetMe200ResponseTeamCurrency } from './getMe200ResponseTeamCurrency';
import { GetMe200ResponseTeamEmailTrackingDomain } from './getMe200ResponseTeamEmailTrackingDomain';
import { PostContacts200ResponseInner } from './postContacts200ResponseInner';
import { PostContactsRequestInner } from './postContactsRequestInner';
import { PostContactsRequestInnerAddress } from './postContactsRequestInnerAddress';
import { PostContactsRequestInnerPhoneNumbersInner } from './postContactsRequestInnerPhoneNumbersInner';
import { PostContactsRequestInnerPosition } from './postContactsRequestInnerPosition';
import { PutWorkflowsIdAudienceRecordId200Response } from './putWorkflowsIdAudienceRecordId200Response';
import { PutWorkflowsIdAudienceRecordIdRequest } from './putWorkflowsIdAudienceRecordIdRequest';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "GetMe200ResponseDataSourcesInner.StatusEnum": GetMe200ResponseDataSourcesInner.StatusEnum,
        "GetMe200ResponseRolePermissions.ViewEnum": GetMe200ResponseRolePermissions.ViewEnum,
        "GetMe200ResponseRolePermissions.CedEnum": GetMe200ResponseRolePermissions.CedEnum,
        "GetMe200ResponseTeam.PaymentTypeEnum": GetMe200ResponseTeam.PaymentTypeEnum,
        "GetMe200ResponseTeam.BillingFrequencyEnum": GetMe200ResponseTeam.BillingFrequencyEnum,
        "GetMe200ResponseTeam.CreditPackageEnum": GetMe200ResponseTeam.CreditPackageEnum,
}

let typeMap: {[index: string]: any} = {
    "GetContacts200ResponseInner": GetContacts200ResponseInner,
    "GetContacts200ResponseInnerAccount": GetContacts200ResponseInnerAccount,
    "GetContacts200ResponseInnerAddressesInner": GetContacts200ResponseInnerAddressesInner,
    "GetContacts200ResponseInnerOwner": GetContacts200ResponseInnerOwner,
    "GetContacts200ResponseInnerPhoneNumbersInner": GetContacts200ResponseInnerPhoneNumbersInner,
    "GetContacts200ResponseInnerPositionsInner": GetContacts200ResponseInnerPositionsInner,
    "GetContacts200ResponseInnerSocialProfilesInner": GetContacts200ResponseInnerSocialProfilesInner,
    "GetContacts200ResponseInnerTagsInner": GetContacts200ResponseInnerTagsInner,
    "GetCurrencies200ResponseInner": GetCurrencies200ResponseInner,
    "GetMe200Response": GetMe200Response,
    "GetMe200ResponseDataSourcesInner": GetMe200ResponseDataSourcesInner,
    "GetMe200ResponseDataSourcesToReconnectInner": GetMe200ResponseDataSourcesToReconnectInner,
    "GetMe200ResponseFlagsInner": GetMe200ResponseFlagsInner,
    "GetMe200ResponsePhoneNumbersInner": GetMe200ResponsePhoneNumbersInner,
    "GetMe200ResponseRole": GetMe200ResponseRole,
    "GetMe200ResponseRolePermissions": GetMe200ResponseRolePermissions,
    "GetMe200ResponseSocialProfilesInner": GetMe200ResponseSocialProfilesInner,
    "GetMe200ResponseTeam": GetMe200ResponseTeam,
    "GetMe200ResponseTeamCurrency": GetMe200ResponseTeamCurrency,
    "GetMe200ResponseTeamEmailTrackingDomain": GetMe200ResponseTeamEmailTrackingDomain,
    "PostContacts200ResponseInner": PostContacts200ResponseInner,
    "PostContactsRequestInner": PostContactsRequestInner,
    "PostContactsRequestInnerAddress": PostContactsRequestInnerAddress,
    "PostContactsRequestInnerPhoneNumbersInner": PostContactsRequestInnerPhoneNumbersInner,
    "PostContactsRequestInnerPosition": PostContactsRequestInnerPosition,
    "PutWorkflowsIdAudienceRecordId200Response": PutWorkflowsIdAudienceRecordId200Response,
    "PutWorkflowsIdAudienceRecordIdRequest": PutWorkflowsIdAudienceRecordIdRequest,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
