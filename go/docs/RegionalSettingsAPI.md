# \RegionalSettingsAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCurrencies**](RegionalSettingsAPI.md#GetCurrencies) | **Get** /currencies | List supported currencies



## GetCurrencies

> []GetCurrencies200ResponseInner GetCurrencies(ctx).Execute()

List supported currencies

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RegionalSettingsAPI.GetCurrencies(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RegionalSettingsAPI.GetCurrencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCurrencies`: []GetCurrencies200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `RegionalSettingsAPI.GetCurrencies`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetCurrenciesRequest struct via the builder pattern


### Return type

[**[]GetCurrencies200ResponseInner**](GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

