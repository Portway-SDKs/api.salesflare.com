# GroupsAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGroups**](GroupsAPI.md#getgroups) | **GET** /groups | List groups


# **getGroups**
```swift
    open class func getGroups(completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```

List groups

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// List groups
GroupsAPI.getGroups() { (response, error) in
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

