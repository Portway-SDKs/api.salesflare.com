/**
 * Salesflare API
 * # Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@salesflare.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import localVarRequest from 'request';
import http from 'http';

/* tslint:disable:no-unused-locals */
import { GetContacts200ResponseInner } from '../model/getContacts200ResponseInner';
import { PostContacts200ResponseInner } from '../model/postContacts200ResponseInner';
import { PostContactsRequestInner } from '../model/postContactsRequestInner';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://api.salesflare.com';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum ContactsApiApiKeys {
}

export class ContactsApi {
    protected _basePath = defaultBasePath;
    protected _defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    protected interceptors: Interceptor[] = [];

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    set defaultHeaders(defaultHeaders: any) {
        this._defaultHeaders = defaultHeaders;
    }

    get defaultHeaders() {
        return this._defaultHeaders;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
        this.authentications.default = auth;
    }

    public setApiKey(key: ContactsApiApiKeys, value: string) {
        (this.authentications as any)[ContactsApiApiKeys[key]].apiKey = value;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * 
     * @summary List contacts
     * @param id 
     * @param name 
     * @param email 
     * @param phoneNumber 
     * @param domain 
     * @param modificationAfter 
     * @param modificationBefore 
     * @param creationAfter 
     * @param creationBefore 
     * @param account 
     * @param tag 
     * @param tagName 
     * @param positionRole 
     * @param addressCountry 
     * @param addressStateRegion 
     * @param addressCity 
     * @param includeArchived 
     * @param search 
     * @param type 
     * @param limit 
     * @param offset 
     * @param custom 
     * @param orderBy Can be just \&#39;key\&#39; e.g. \&#39;name\&#39; or \&#39;key sortOrder\&#39; e.g. \&#39;name desc\&#39;. Defaults to asc.
     * @param q 
     */
    public async getContacts (id?: Array<number>, name?: string, email?: string, phoneNumber?: string, domain?: string, modificationAfter?: Date, modificationBefore?: Date, creationAfter?: Date, creationBefore?: Date, account?: Array<number>, tag?: Array<number>, tagName?: Array<string>, positionRole?: Array<string>, addressCountry?: Array<string>, addressStateRegion?: Array<string>, addressCity?: Array<string>, includeArchived?: boolean, search?: string, type?: 'customer' | 'mycontacts', limit?: number, offset?: number, custom?: string, orderBy?: Array<string>, q?: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: Array<GetContacts200ResponseInner>;  }> {
        const localVarPath = this.basePath + '/contacts';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['*/*'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        if (id !== undefined) {
            localVarQueryParameters['id'] = ObjectSerializer.serialize(id, "Array<number>");
        }

        if (name !== undefined) {
            localVarQueryParameters['name'] = ObjectSerializer.serialize(name, "string");
        }

        if (email !== undefined) {
            localVarQueryParameters['email'] = ObjectSerializer.serialize(email, "string");
        }

        if (phoneNumber !== undefined) {
            localVarQueryParameters['phone_number'] = ObjectSerializer.serialize(phoneNumber, "string");
        }

        if (domain !== undefined) {
            localVarQueryParameters['domain'] = ObjectSerializer.serialize(domain, "string");
        }

        if (modificationAfter !== undefined) {
            localVarQueryParameters['modification_after'] = ObjectSerializer.serialize(modificationAfter, "Date");
        }

        if (modificationBefore !== undefined) {
            localVarQueryParameters['modification_before'] = ObjectSerializer.serialize(modificationBefore, "Date");
        }

        if (creationAfter !== undefined) {
            localVarQueryParameters['creation_after'] = ObjectSerializer.serialize(creationAfter, "Date");
        }

        if (creationBefore !== undefined) {
            localVarQueryParameters['creation_before'] = ObjectSerializer.serialize(creationBefore, "Date");
        }

        if (account !== undefined) {
            localVarQueryParameters['account'] = ObjectSerializer.serialize(account, "Array<number>");
        }

        if (tag !== undefined) {
            localVarQueryParameters['tag'] = ObjectSerializer.serialize(tag, "Array<number>");
        }

        if (tagName !== undefined) {
            localVarQueryParameters['tag.name'] = ObjectSerializer.serialize(tagName, "Array<string>");
        }

        if (positionRole !== undefined) {
            localVarQueryParameters['position.role'] = ObjectSerializer.serialize(positionRole, "Array<string>");
        }

        if (addressCountry !== undefined) {
            localVarQueryParameters['address.country'] = ObjectSerializer.serialize(addressCountry, "Array<string>");
        }

        if (addressStateRegion !== undefined) {
            localVarQueryParameters['address.state_region'] = ObjectSerializer.serialize(addressStateRegion, "Array<string>");
        }

        if (addressCity !== undefined) {
            localVarQueryParameters['address.city'] = ObjectSerializer.serialize(addressCity, "Array<string>");
        }

        if (includeArchived !== undefined) {
            localVarQueryParameters['includeArchived'] = ObjectSerializer.serialize(includeArchived, "boolean");
        }

        if (search !== undefined) {
            localVarQueryParameters['search'] = ObjectSerializer.serialize(search, "string");
        }

        if (type !== undefined) {
            localVarQueryParameters['type'] = ObjectSerializer.serialize(type, "'customer' | 'mycontacts'");
        }

        if (limit !== undefined) {
            localVarQueryParameters['limit'] = ObjectSerializer.serialize(limit, "number");
        }

        if (offset !== undefined) {
            localVarQueryParameters['offset'] = ObjectSerializer.serialize(offset, "number");
        }

        if (custom !== undefined) {
            localVarQueryParameters['custom'] = ObjectSerializer.serialize(custom, "string");
        }

        if (orderBy !== undefined) {
            localVarQueryParameters['order_by'] = ObjectSerializer.serialize(orderBy, "Array<string>");
        }

        if (q !== undefined) {
            localVarQueryParameters['q'] = ObjectSerializer.serialize(q, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        let authenticationPromise = Promise.resolve();
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: Array<GetContacts200ResponseInner>;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "Array<GetContacts200ResponseInner>");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
    /**
     * When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back
     * @summary Create a contact
     * @param force When force is false, the contact will not be created if a contact with the same email address used to exist.
     * @param body 
     */
    public async postContacts (force?: boolean, body?: Array<PostContactsRequestInner>, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: Array<PostContacts200ResponseInner>;  }> {
        const localVarPath = this.basePath + '/contacts';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['*/*'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        if (force !== undefined) {
            localVarQueryParameters['force'] = ObjectSerializer.serialize(force, "boolean");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(body, "Array<PostContactsRequestInner>")
        };

        let authenticationPromise = Promise.resolve();
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: Array<PostContacts200ResponseInner>;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "Array<PostContacts200ResponseInner>");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
}
