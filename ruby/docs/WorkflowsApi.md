# OpenapiClient::WorkflowsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**put_workflows_id_audience_record_id**](WorkflowsApi.md#put_workflows_id_audience_record_id) | **PUT** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow |


## put_workflows_id_audience_record_id

> <PutWorkflowsIdAudienceRecordId200Response> put_workflows_id_audience_record_id(id, record_id, opts)

Re-enter or exit an entity from a workflow

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::WorkflowsApi.new
id = 8.14 # Float | 
record_id = 8.14 # Float | This is the entity id. For email workflows this should be the contact id.
opts = {
  body: OpenapiClient::PutWorkflowsIdAudienceRecordIdRequest.new # PutWorkflowsIdAudienceRecordIdRequest | 
}

begin
  # Re-enter or exit an entity from a workflow
  result = api_instance.put_workflows_id_audience_record_id(id, record_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling WorkflowsApi->put_workflows_id_audience_record_id: #{e}"
end
```

#### Using the put_workflows_id_audience_record_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PutWorkflowsIdAudienceRecordId200Response>, Integer, Hash)> put_workflows_id_audience_record_id_with_http_info(id, record_id, opts)

```ruby
begin
  # Re-enter or exit an entity from a workflow
  data, status_code, headers = api_instance.put_workflows_id_audience_record_id_with_http_info(id, record_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PutWorkflowsIdAudienceRecordId200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling WorkflowsApi->put_workflows_id_audience_record_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Float** |  |  |
| **record_id** | **Float** | This is the entity id. For email workflows this should be the contact id. |  |
| **body** | [**PutWorkflowsIdAudienceRecordIdRequest**](PutWorkflowsIdAudienceRecordIdRequest.md) |  | [optional] |

### Return type

[**PutWorkflowsIdAudienceRecordId200Response**](PutWorkflowsIdAudienceRecordId200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

