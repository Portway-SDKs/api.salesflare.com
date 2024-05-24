# ContactsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContacts**](ContactsApi.md#getContacts) | **GET** /contacts | List contacts |
| [**postContacts**](ContactsApi.md#postContacts) | **POST** /contacts | Create a contact |


<a id="getContacts"></a>
# **getContacts**
> List&lt;GetContacts200ResponseInner&gt; getContacts(id, name, email, phoneNumber, domain, modificationAfter, modificationBefore, creationAfter, creationBefore, account, tag, tagName, positionRole, addressCountry, addressStateRegion, addressCity, includeArchived, search, type, limit, offset, custom, orderBy, q)

List contacts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.salesflare.com");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    List<BigDecimal> id = Arrays.asList(); // List<BigDecimal> | 
    String name = "name_example"; // String | 
    String email = "email_example"; // String | 
    String phoneNumber = "phoneNumber_example"; // String | 
    String domain = "domain_example"; // String | 
    OffsetDateTime modificationAfter = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime modificationBefore = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime creationAfter = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime creationBefore = OffsetDateTime.now(); // OffsetDateTime | 
    List<BigDecimal> account = Arrays.asList(); // List<BigDecimal> | 
    List<BigDecimal> tag = Arrays.asList(); // List<BigDecimal> | 
    List<String> tagName = Arrays.asList(); // List<String> | 
    List<String> positionRole = Arrays.asList(); // List<String> | 
    List<String> addressCountry = Arrays.asList(); // List<String> | 
    List<String> addressStateRegion = Arrays.asList(); // List<String> | 
    List<String> addressCity = Arrays.asList(); // List<String> | 
    Boolean includeArchived = true; // Boolean | 
    String search = "search_example"; // String | 
    String type = "customer"; // String | 
    BigDecimal limit = new BigDecimal("20.0"); // BigDecimal | 
    BigDecimal offset = new BigDecimal("0.0"); // BigDecimal | 
    String custom = "custom_example"; // String | 
    List<String> orderBy = Arrays.asList(); // List<String> | Can be just 'key' e.g. 'name' or 'key sortOrder' e.g. 'name desc'. Defaults to asc.
    String q = "q_example"; // String | 
    try {
      List<GetContacts200ResponseInner> result = apiInstance.getContacts(id, name, email, phoneNumber, domain, modificationAfter, modificationBefore, creationAfter, creationBefore, account, tag, tagName, positionRole, addressCountry, addressStateRegion, addressCity, includeArchived, search, type, limit, offset, custom, orderBy, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**List&lt;BigDecimal&gt;**](BigDecimal.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **email** | **String**|  | [optional] |
| **phoneNumber** | **String**|  | [optional] |
| **domain** | **String**|  | [optional] |
| **modificationAfter** | **OffsetDateTime**|  | [optional] |
| **modificationBefore** | **OffsetDateTime**|  | [optional] |
| **creationAfter** | **OffsetDateTime**|  | [optional] |
| **creationBefore** | **OffsetDateTime**|  | [optional] |
| **account** | [**List&lt;BigDecimal&gt;**](BigDecimal.md)|  | [optional] |
| **tag** | [**List&lt;BigDecimal&gt;**](BigDecimal.md)|  | [optional] |
| **tagName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **positionRole** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **addressCountry** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **addressStateRegion** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **addressCity** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **includeArchived** | **Boolean**|  | [optional] |
| **search** | **String**|  | [optional] |
| **type** | **String**|  | [optional] [enum: customer, mycontacts] |
| **limit** | **BigDecimal**|  | [optional] [default to 20.0] |
| **offset** | **BigDecimal**|  | [optional] [default to 0.0] |
| **custom** | **String**|  | [optional] |
| **orderBy** | [**List&lt;String&gt;**](String.md)| Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. | [optional] |
| **q** | **String**|  | [optional] |

### Return type

[**List&lt;GetContacts200ResponseInner&gt;**](GetContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

<a id="postContacts"></a>
# **postContacts**
> List&lt;PostContacts200ResponseInner&gt; postContacts(force, body)

Create a contact

When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.salesflare.com");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Boolean force = true; // Boolean | When force is false, the contact will not be created if a contact with the same email address used to exist.
    List<PostContactsRequestInner> body = Arrays.asList(); // List<PostContactsRequestInner> | 
    try {
      List<PostContacts200ResponseInner> result = apiInstance.postContacts(force, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#postContacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **force** | **Boolean**| When force is false, the contact will not be created if a contact with the same email address used to exist. | [optional] [default to true] |
| **body** | [**List&lt;PostContactsRequestInner&gt;**](PostContactsRequestInner.md)|  | [optional] |

### Return type

[**List&lt;PostContacts200ResponseInner&gt;**](PostContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

