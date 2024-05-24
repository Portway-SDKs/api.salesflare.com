# RegionalSettingsAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrencies**](RegionalSettingsAPI.md#getcurrencies) | **GET** /currencies | List supported currencies


# **getCurrencies**
```swift
    open class func getCurrencies(completion: @escaping (_ data: [GetCurrencies200ResponseInner]?, _ error: Error?) -> Void)
```

List supported currencies

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// List supported currencies
RegionalSettingsAPI.getCurrencies() { (response, error) in
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

[**[GetCurrencies200ResponseInner]**](GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

