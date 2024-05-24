# GroupsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGroups**](GroupsApi.md#getGroups) | **GET** /groups | List groups |


<a id="getGroups"></a>
# **getGroups**
> String getGroups()

List groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.salesflare.com");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    try {
      String result = apiInstance.getGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Successful |  -  |

