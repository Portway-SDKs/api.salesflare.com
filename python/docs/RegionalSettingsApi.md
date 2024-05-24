# salesflare.RegionalSettingsApi

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_currencies**](RegionalSettingsApi.md#get_currencies) | **GET** /currencies | List supported currencies


# **get_currencies**
> List[GetCurrencies200ResponseInner] get_currencies()

List supported currencies

### Example


```python
import salesflare
from salesflare.models.get_currencies200_response_inner import GetCurrencies200ResponseInner
from salesflare.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.salesflare.com
# See configuration.py for a list of all supported configuration parameters.
configuration = salesflare.Configuration(
    host = "https://api.salesflare.com"
)


# Enter a context with an instance of the API client
with salesflare.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = salesflare.RegionalSettingsApi(api_client)

    try:
        # List supported currencies
        api_response = api_instance.get_currencies()
        print("The response of RegionalSettingsApi->get_currencies:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RegionalSettingsApi->get_currencies: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[GetCurrencies200ResponseInner]**](GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

