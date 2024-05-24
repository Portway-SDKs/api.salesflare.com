# salesflare.GroupsApi

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_groups**](GroupsApi.md#get_groups) | **GET** /groups | List groups


# **get_groups**
> str get_groups()

List groups

### Example


```python
import salesflare
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
    api_instance = salesflare.GroupsApi(api_client)

    try:
        # List groups
        api_response = api_instance.get_groups()
        print("The response of GroupsApi->get_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GroupsApi->get_groups: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Successful |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

