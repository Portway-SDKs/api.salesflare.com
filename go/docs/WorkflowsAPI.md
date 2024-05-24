# \WorkflowsAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PutWorkflowsIdAudienceRecordId**](WorkflowsAPI.md#PutWorkflowsIdAudienceRecordId) | **Put** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow



## PutWorkflowsIdAudienceRecordId

> PutWorkflowsIdAudienceRecordId200Response PutWorkflowsIdAudienceRecordId(ctx, id, recordId).Body(body).Execute()

Re-enter or exit an entity from a workflow

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
	id := float32(8.14) // float32 | 
	recordId := float32(8.14) // float32 | This is the entity id. For email workflows this should be the contact id.
	body := *openapiclient.NewPutWorkflowsIdAudienceRecordIdRequest() // PutWorkflowsIdAudienceRecordIdRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WorkflowsAPI.PutWorkflowsIdAudienceRecordId(context.Background(), id, recordId).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WorkflowsAPI.PutWorkflowsIdAudienceRecordId``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PutWorkflowsIdAudienceRecordId`: PutWorkflowsIdAudienceRecordId200Response
	fmt.Fprintf(os.Stdout, "Response from `WorkflowsAPI.PutWorkflowsIdAudienceRecordId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **float32** |  | 
**recordId** | **float32** | This is the entity id. For email workflows this should be the contact id. | 

### Other Parameters

Other parameters are passed through a pointer to a apiPutWorkflowsIdAudienceRecordIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **body** | [**PutWorkflowsIdAudienceRecordIdRequest**](PutWorkflowsIdAudienceRecordIdRequest.md) |  | 

### Return type

[**PutWorkflowsIdAudienceRecordId200Response**](PutWorkflowsIdAudienceRecordId200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

