# WorkflowsAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**putWorkflowsIdAudienceRecordId**](WorkflowsAPI.md#putworkflowsidaudiencerecordid) | **PUT** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow


# **putWorkflowsIdAudienceRecordId**
```swift
    open class func putWorkflowsIdAudienceRecordId(id: Double, recordId: Double, body: PutWorkflowsIdAudienceRecordIdRequest? = nil, completion: @escaping (_ data: PutWorkflowsIdAudienceRecordId200Response?, _ error: Error?) -> Void)
```

Re-enter or exit an entity from a workflow

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let id = 987 // Double | 
let recordId = 987 // Double | This is the entity id. For email workflows this should be the contact id.
let body = putWorkflowsIdAudienceRecord_id_request(exited: false, metGoal: false) // PutWorkflowsIdAudienceRecordIdRequest |  (optional)

// Re-enter or exit an entity from a workflow
WorkflowsAPI.putWorkflowsIdAudienceRecordId(id: id, recordId: recordId, body: body) { (response, error) in
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Double** |  | 
 **recordId** | **Double** | This is the entity id. For email workflows this should be the contact id. | 
 **body** | [**PutWorkflowsIdAudienceRecordIdRequest**](PutWorkflowsIdAudienceRecordIdRequest.md) |  | [optional] 

### Return type

[**PutWorkflowsIdAudienceRecordId200Response**](PutWorkflowsIdAudienceRecordId200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

