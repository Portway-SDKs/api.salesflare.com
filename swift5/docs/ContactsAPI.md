# ContactsAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContacts**](ContactsAPI.md#getcontacts) | **GET** /contacts | List contacts
[**postContacts**](ContactsAPI.md#postcontacts) | **POST** /contacts | Create a contact


# **getContacts**
```swift
    open class func getContacts(id: [Double]? = nil, name: String? = nil, email: String? = nil, phoneNumber: String? = nil, domain: String? = nil, modificationAfter: Date? = nil, modificationBefore: Date? = nil, creationAfter: Date? = nil, creationBefore: Date? = nil, account: [Double]? = nil, tag: [Double]? = nil, tagName: [String]? = nil, positionRole: [String]? = nil, addressCountry: [String]? = nil, addressStateRegion: [String]? = nil, addressCity: [String]? = nil, includeArchived: Bool? = nil, search: String? = nil, type: ModelType_getContacts? = nil, limit: Double? = nil, offset: Double? = nil, custom: String? = nil, orderBy: [String]? = nil, q: String? = nil, completion: @escaping (_ data: [GetContacts200ResponseInner]?, _ error: Error?) -> Void)
```

List contacts

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = [123] // [Double] |  (optional)
let name = "name_example" // String |  (optional)
let email = "email_example" // String |  (optional)
let phoneNumber = "phoneNumber_example" // String |  (optional)
let domain = "domain_example" // String |  (optional)
let modificationAfter = Date() // Date |  (optional)
let modificationBefore = Date() // Date |  (optional)
let creationAfter = Date() // Date |  (optional)
let creationBefore = Date() // Date |  (optional)
let account = [123] // [Double] |  (optional)
let tag = [123] // [Double] |  (optional)
let tagName = ["inner_example"] // [String] |  (optional)
let positionRole = ["inner_example"] // [String] |  (optional)
let addressCountry = ["inner_example"] // [String] |  (optional)
let addressStateRegion = ["inner_example"] // [String] |  (optional)
let addressCity = ["inner_example"] // [String] |  (optional)
let includeArchived = true // Bool |  (optional)
let search = "search_example" // String |  (optional)
let type = "type_example" // String |  (optional)
let limit = 987 // Double |  (optional) (default to 20.0)
let offset = 987 // Double |  (optional) (default to 0.0)
let custom = "custom_example" // String |  (optional)
let orderBy = ["inner_example"] // [String] | Can be just 'key' e.g. 'name' or 'key sortOrder' e.g. 'name desc'. Defaults to asc. (optional)
let q = "q_example" // String |  (optional)

// List contacts
ContactsAPI.getContacts(id: id, name: name, email: email, phoneNumber: phoneNumber, domain: domain, modificationAfter: modificationAfter, modificationBefore: modificationBefore, creationAfter: creationAfter, creationBefore: creationBefore, account: account, tag: tag, tagName: tagName, positionRole: positionRole, addressCountry: addressCountry, addressStateRegion: addressStateRegion, addressCity: addressCity, includeArchived: includeArchived, search: search, type: type, limit: limit, offset: offset, custom: custom, orderBy: orderBy, q: q) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**[Double]**](Double.md) |  | [optional] 
 **name** | **String** |  | [optional] 
 **email** | **String** |  | [optional] 
 **phoneNumber** | **String** |  | [optional] 
 **domain** | **String** |  | [optional] 
 **modificationAfter** | **Date** |  | [optional] 
 **modificationBefore** | **Date** |  | [optional] 
 **creationAfter** | **Date** |  | [optional] 
 **creationBefore** | **Date** |  | [optional] 
 **account** | [**[Double]**](Double.md) |  | [optional] 
 **tag** | [**[Double]**](Double.md) |  | [optional] 
 **tagName** | [**[String]**](String.md) |  | [optional] 
 **positionRole** | [**[String]**](String.md) |  | [optional] 
 **addressCountry** | [**[String]**](String.md) |  | [optional] 
 **addressStateRegion** | [**[String]**](String.md) |  | [optional] 
 **addressCity** | [**[String]**](String.md) |  | [optional] 
 **includeArchived** | **Bool** |  | [optional] 
 **search** | **String** |  | [optional] 
 **type** | **String** |  | [optional] 
 **limit** | **Double** |  | [optional] [default to 20.0]
 **offset** | **Double** |  | [optional] [default to 0.0]
 **custom** | **String** |  | [optional] 
 **orderBy** | [**[String]**](String.md) | Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. | [optional] 
 **q** | **String** |  | [optional] 

### Return type

[**[GetContacts200ResponseInner]**](GetContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postContacts**
```swift
    open class func postContacts(force: Bool? = nil, body: [PostContactsRequestInner]? = nil, completion: @escaping (_ data: [PostContacts200ResponseInner]?, _ error: Error?) -> Void)
```

Create a contact

When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let force = true // Bool | When force is false, the contact will not be created if a contact with the same email address used to exist. (optional) (default to true)
let body = [postContacts_request_inner(owner: 123, email: "email_example", _prefix: "_prefix_example", firstname: "firstname_example", middle: "middle_example", lastname: "lastname_example", suffix: "suffix_example", name: "name_example", picture: "picture_example", account: 123, birthDate: Date(), optOut: false, optOutDate: Date(), optOutCampaign: "optOutCampaign_example", bounced: false, bouncedDate: Date(), files: [123], tags: ["tags_example"], address: postContacts_request_inner_address(city: "city_example", country: "country_example", region: "region_example", stateRegion: "stateRegion_example", street: "street_example", type: "type_example", zip: "zip_example"), addresses: [nil], phoneNumber: "phoneNumber_example", mobilePhoneNumber: "mobilePhoneNumber_example", homePhoneNumber: "homePhoneNumber_example", faxNumber: "faxNumber_example", phoneNumbers: [postContacts_request_inner_phone_numbers_inner(number: "number_example", type: "type_example")], position: postContacts_request_inner_position(organisation: "organisation_example", role: "role_example"), positions: [nil], socialProfiles: ["socialProfiles_example"], custom: 123)] // [PostContactsRequestInner] |  (optional)

// Create a contact
ContactsAPI.postContacts(force: force, body: body) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **force** | **Bool** | When force is false, the contact will not be created if a contact with the same email address used to exist. | [optional] [default to true]
 **body** | [**[PostContactsRequestInner]**](PostContactsRequestInner.md) |  | [optional] 

### Return type

[**[PostContacts200ResponseInner]**](PostContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

