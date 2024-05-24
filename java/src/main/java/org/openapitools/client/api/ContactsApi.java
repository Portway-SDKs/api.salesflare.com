/*
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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import org.openapitools.client.model.GetContacts200ResponseInner;
import java.time.OffsetDateTime;
import org.openapitools.client.model.PostContacts200ResponseInner;
import org.openapitools.client.model.PostContactsRequestInner;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContactsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContactsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getContacts
     * @param id  (optional)
     * @param name  (optional)
     * @param email  (optional)
     * @param phoneNumber  (optional)
     * @param domain  (optional)
     * @param modificationAfter  (optional)
     * @param modificationBefore  (optional)
     * @param creationAfter  (optional)
     * @param creationBefore  (optional)
     * @param account  (optional)
     * @param tag  (optional)
     * @param tagName  (optional)
     * @param positionRole  (optional)
     * @param addressCountry  (optional)
     * @param addressStateRegion  (optional)
     * @param addressCity  (optional)
     * @param includeArchived  (optional)
     * @param search  (optional)
     * @param type  (optional)
     * @param limit  (optional, default to 20.0)
     * @param offset  (optional, default to 0.0)
     * @param custom  (optional)
     * @param orderBy Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. (optional)
     * @param q  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getContactsCall(List<BigDecimal> id, String name, String email, String phoneNumber, String domain, OffsetDateTime modificationAfter, OffsetDateTime modificationBefore, OffsetDateTime creationAfter, OffsetDateTime creationBefore, List<BigDecimal> account, List<BigDecimal> tag, List<String> tagName, List<String> positionRole, List<String> addressCountry, List<String> addressStateRegion, List<String> addressCity, Boolean includeArchived, String search, String type, BigDecimal limit, BigDecimal offset, String custom, List<String> orderBy, String q, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contacts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (id != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "id", id));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (email != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("email", email));
        }

        if (phoneNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("phone_number", phoneNumber));
        }

        if (domain != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("domain", domain));
        }

        if (modificationAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modification_after", modificationAfter));
        }

        if (modificationBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modification_before", modificationBefore));
        }

        if (creationAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("creation_after", creationAfter));
        }

        if (creationBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("creation_before", creationBefore));
        }

        if (account != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "account", account));
        }

        if (tag != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "tag", tag));
        }

        if (tagName != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "tag.name", tagName));
        }

        if (positionRole != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "position.role", positionRole));
        }

        if (addressCountry != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "address.country", addressCountry));
        }

        if (addressStateRegion != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "address.state_region", addressStateRegion));
        }

        if (addressCity != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "address.city", addressCity));
        }

        if (includeArchived != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeArchived", includeArchived));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (custom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("custom", custom));
        }

        if (orderBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "order_by", orderBy));
        }

        if (q != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("q", q));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getContactsValidateBeforeCall(List<BigDecimal> id, String name, String email, String phoneNumber, String domain, OffsetDateTime modificationAfter, OffsetDateTime modificationBefore, OffsetDateTime creationAfter, OffsetDateTime creationBefore, List<BigDecimal> account, List<BigDecimal> tag, List<String> tagName, List<String> positionRole, List<String> addressCountry, List<String> addressStateRegion, List<String> addressCity, Boolean includeArchived, String search, String type, BigDecimal limit, BigDecimal offset, String custom, List<String> orderBy, String q, final ApiCallback _callback) throws ApiException {
        return getContactsCall(id, name, email, phoneNumber, domain, modificationAfter, modificationBefore, creationAfter, creationBefore, account, tag, tagName, positionRole, addressCountry, addressStateRegion, addressCity, includeArchived, search, type, limit, offset, custom, orderBy, q, _callback);

    }

    /**
     * List contacts
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param email  (optional)
     * @param phoneNumber  (optional)
     * @param domain  (optional)
     * @param modificationAfter  (optional)
     * @param modificationBefore  (optional)
     * @param creationAfter  (optional)
     * @param creationBefore  (optional)
     * @param account  (optional)
     * @param tag  (optional)
     * @param tagName  (optional)
     * @param positionRole  (optional)
     * @param addressCountry  (optional)
     * @param addressStateRegion  (optional)
     * @param addressCity  (optional)
     * @param includeArchived  (optional)
     * @param search  (optional)
     * @param type  (optional)
     * @param limit  (optional, default to 20.0)
     * @param offset  (optional, default to 0.0)
     * @param custom  (optional)
     * @param orderBy Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. (optional)
     * @param q  (optional)
     * @return List&lt;GetContacts200ResponseInner&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public List<GetContacts200ResponseInner> getContacts(List<BigDecimal> id, String name, String email, String phoneNumber, String domain, OffsetDateTime modificationAfter, OffsetDateTime modificationBefore, OffsetDateTime creationAfter, OffsetDateTime creationBefore, List<BigDecimal> account, List<BigDecimal> tag, List<String> tagName, List<String> positionRole, List<String> addressCountry, List<String> addressStateRegion, List<String> addressCity, Boolean includeArchived, String search, String type, BigDecimal limit, BigDecimal offset, String custom, List<String> orderBy, String q) throws ApiException {
        ApiResponse<List<GetContacts200ResponseInner>> localVarResp = getContactsWithHttpInfo(id, name, email, phoneNumber, domain, modificationAfter, modificationBefore, creationAfter, creationBefore, account, tag, tagName, positionRole, addressCountry, addressStateRegion, addressCity, includeArchived, search, type, limit, offset, custom, orderBy, q);
        return localVarResp.getData();
    }

    /**
     * List contacts
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param email  (optional)
     * @param phoneNumber  (optional)
     * @param domain  (optional)
     * @param modificationAfter  (optional)
     * @param modificationBefore  (optional)
     * @param creationAfter  (optional)
     * @param creationBefore  (optional)
     * @param account  (optional)
     * @param tag  (optional)
     * @param tagName  (optional)
     * @param positionRole  (optional)
     * @param addressCountry  (optional)
     * @param addressStateRegion  (optional)
     * @param addressCity  (optional)
     * @param includeArchived  (optional)
     * @param search  (optional)
     * @param type  (optional)
     * @param limit  (optional, default to 20.0)
     * @param offset  (optional, default to 0.0)
     * @param custom  (optional)
     * @param orderBy Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. (optional)
     * @param q  (optional)
     * @return ApiResponse&lt;List&lt;GetContacts200ResponseInner&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<GetContacts200ResponseInner>> getContactsWithHttpInfo(List<BigDecimal> id, String name, String email, String phoneNumber, String domain, OffsetDateTime modificationAfter, OffsetDateTime modificationBefore, OffsetDateTime creationAfter, OffsetDateTime creationBefore, List<BigDecimal> account, List<BigDecimal> tag, List<String> tagName, List<String> positionRole, List<String> addressCountry, List<String> addressStateRegion, List<String> addressCity, Boolean includeArchived, String search, String type, BigDecimal limit, BigDecimal offset, String custom, List<String> orderBy, String q) throws ApiException {
        okhttp3.Call localVarCall = getContactsValidateBeforeCall(id, name, email, phoneNumber, domain, modificationAfter, modificationBefore, creationAfter, creationBefore, account, tag, tagName, positionRole, addressCountry, addressStateRegion, addressCity, includeArchived, search, type, limit, offset, custom, orderBy, q, null);
        Type localVarReturnType = new TypeToken<List<GetContacts200ResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List contacts (asynchronously)
     * 
     * @param id  (optional)
     * @param name  (optional)
     * @param email  (optional)
     * @param phoneNumber  (optional)
     * @param domain  (optional)
     * @param modificationAfter  (optional)
     * @param modificationBefore  (optional)
     * @param creationAfter  (optional)
     * @param creationBefore  (optional)
     * @param account  (optional)
     * @param tag  (optional)
     * @param tagName  (optional)
     * @param positionRole  (optional)
     * @param addressCountry  (optional)
     * @param addressStateRegion  (optional)
     * @param addressCity  (optional)
     * @param includeArchived  (optional)
     * @param search  (optional)
     * @param type  (optional)
     * @param limit  (optional, default to 20.0)
     * @param offset  (optional, default to 0.0)
     * @param custom  (optional)
     * @param orderBy Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. (optional)
     * @param q  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getContactsAsync(List<BigDecimal> id, String name, String email, String phoneNumber, String domain, OffsetDateTime modificationAfter, OffsetDateTime modificationBefore, OffsetDateTime creationAfter, OffsetDateTime creationBefore, List<BigDecimal> account, List<BigDecimal> tag, List<String> tagName, List<String> positionRole, List<String> addressCountry, List<String> addressStateRegion, List<String> addressCity, Boolean includeArchived, String search, String type, BigDecimal limit, BigDecimal offset, String custom, List<String> orderBy, String q, final ApiCallback<List<GetContacts200ResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getContactsValidateBeforeCall(id, name, email, phoneNumber, domain, modificationAfter, modificationBefore, creationAfter, creationBefore, account, tag, tagName, positionRole, addressCountry, addressStateRegion, addressCity, includeArchived, search, type, limit, offset, custom, orderBy, q, _callback);
        Type localVarReturnType = new TypeToken<List<GetContacts200ResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postContacts
     * @param force When force is false, the contact will not be created if a contact with the same email address used to exist. (optional, default to true)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postContactsCall(Boolean force, List<PostContactsRequestInner> body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/contacts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postContactsValidateBeforeCall(Boolean force, List<PostContactsRequestInner> body, final ApiCallback _callback) throws ApiException {
        return postContactsCall(force, body, _callback);

    }

    /**
     * Create a contact
     * When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back
     * @param force When force is false, the contact will not be created if a contact with the same email address used to exist. (optional, default to true)
     * @param body  (optional)
     * @return List&lt;PostContacts200ResponseInner&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public List<PostContacts200ResponseInner> postContacts(Boolean force, List<PostContactsRequestInner> body) throws ApiException {
        ApiResponse<List<PostContacts200ResponseInner>> localVarResp = postContactsWithHttpInfo(force, body);
        return localVarResp.getData();
    }

    /**
     * Create a contact
     * When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back
     * @param force When force is false, the contact will not be created if a contact with the same email address used to exist. (optional, default to true)
     * @param body  (optional)
     * @return ApiResponse&lt;List&lt;PostContacts200ResponseInner&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PostContacts200ResponseInner>> postContactsWithHttpInfo(Boolean force, List<PostContactsRequestInner> body) throws ApiException {
        okhttp3.Call localVarCall = postContactsValidateBeforeCall(force, body, null);
        Type localVarReturnType = new TypeToken<List<PostContacts200ResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a contact (asynchronously)
     * When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back
     * @param force When force is false, the contact will not be created if a contact with the same email address used to exist. (optional, default to true)
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postContactsAsync(Boolean force, List<PostContactsRequestInner> body, final ApiCallback<List<PostContacts200ResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = postContactsValidateBeforeCall(force, body, _callback);
        Type localVarReturnType = new TypeToken<List<PostContacts200ResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}