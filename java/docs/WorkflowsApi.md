# WorkflowsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**putWorkflowsIdAudienceRecordId**](WorkflowsApi.md#putWorkflowsIdAudienceRecordId) | **PUT** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow |


<a id="putWorkflowsIdAudienceRecordId"></a>
# **putWorkflowsIdAudienceRecordId**
> PutWorkflowsIdAudienceRecordId200Response putWorkflowsIdAudienceRecordId(id, recordId, body)

Re-enter or exit an entity from a workflow

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.salesflare.com");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    BigDecimal id = new BigDecimal(78); // BigDecimal | 
    BigDecimal recordId = new BigDecimal(78); // BigDecimal | This is the entity id. For email workflows this should be the contact id.
    PutWorkflowsIdAudienceRecordIdRequest body = new PutWorkflowsIdAudienceRecordIdRequest(); // PutWorkflowsIdAudienceRecordIdRequest | 
    try {
      PutWorkflowsIdAudienceRecordId200Response result = apiInstance.putWorkflowsIdAudienceRecordId(id, recordId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#putWorkflowsIdAudienceRecordId");
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
| **id** | **BigDecimal**|  | |
| **recordId** | **BigDecimal**| This is the entity id. For email workflows this should be the contact id. | |
| **body** | [**PutWorkflowsIdAudienceRecordIdRequest**](PutWorkflowsIdAudienceRecordIdRequest.md)|  | [optional] |

### Return type

[**PutWorkflowsIdAudienceRecordId200Response**](PutWorkflowsIdAudienceRecordId200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

