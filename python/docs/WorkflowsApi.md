# salesflare.WorkflowsApi

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**put_workflows_id_audience_record_id**](WorkflowsApi.md#put_workflows_id_audience_record_id) | **PUT** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow


# **put_workflows_id_audience_record_id**
> PutWorkflowsIdAudienceRecordId200Response put_workflows_id_audience_record_id(id, record_id, body=body)

Re-enter or exit an entity from a workflow

### Example


```python
import salesflare
from salesflare.models.put_workflows_id_audience_record_id200_response import PutWorkflowsIdAudienceRecordId200Response
from salesflare.models.put_workflows_id_audience_record_id_request import PutWorkflowsIdAudienceRecordIdRequest
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
    api_instance = salesflare.WorkflowsApi(api_client)
    id = 3.4 # float | 
    record_id = 3.4 # float | This is the entity id. For email workflows this should be the contact id.
    body = salesflare.PutWorkflowsIdAudienceRecordIdRequest() # PutWorkflowsIdAudienceRecordIdRequest |  (optional)

    try:
        # Re-enter or exit an entity from a workflow
        api_response = api_instance.put_workflows_id_audience_record_id(id, record_id, body=body)
        print("The response of WorkflowsApi->put_workflows_id_audience_record_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling WorkflowsApi->put_workflows_id_audience_record_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  | 
 **record_id** | **float**| This is the entity id. For email workflows this should be the contact id. | 
 **body** | [**PutWorkflowsIdAudienceRecordIdRequest**](PutWorkflowsIdAudienceRecordIdRequest.md)|  | [optional] 

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
**200** | Successful |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

