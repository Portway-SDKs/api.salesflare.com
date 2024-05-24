# RegionalSettingsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrencies**](RegionalSettingsApi.md#getCurrencies) | **GET** /currencies | List supported currencies |


<a id="getCurrencies"></a>
# **getCurrencies**
> List&lt;GetCurrencies200ResponseInner&gt; getCurrencies()

List supported currencies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegionalSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.salesflare.com");

    RegionalSettingsApi apiInstance = new RegionalSettingsApi(defaultClient);
    try {
      List<GetCurrencies200ResponseInner> result = apiInstance.getCurrencies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegionalSettingsApi#getCurrencies");
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

[**List&lt;GetCurrencies200ResponseInner&gt;**](GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

