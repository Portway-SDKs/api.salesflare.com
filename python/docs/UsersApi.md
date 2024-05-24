# salesflare.UsersApi

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_me**](UsersApi.md#get_me) | **GET** /me | Get current user&#39;s details


# **get_me**
> GetMe200Response get_me()

Get current user's details

### Example


```python
import salesflare
from salesflare.models.get_me200_response import GetMe200Response
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
    api_instance = salesflare.UsersApi(api_client)

    try:
        # Get current user's details
        api_response = api_instance.get_me()
        print("The response of UsersApi->get_me:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UsersApi->get_me: %s\n" % e)
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

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

