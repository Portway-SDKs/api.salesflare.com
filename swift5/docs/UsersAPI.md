# UsersAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMe**](UsersAPI.md#getme) | **GET** /me | Get current user&#39;s details


# **getMe**
```swift
    open class func getMe(completion: @escaping (_ data: GetMe200Response?, _ error: Error?) -> Void)
```

Get current user's details

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get current user's details
UsersAPI.getMe() { (response, error) in
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

[**GetMe200Response**](GetMe200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

