# OpenAPI\Client\WorkflowsApi

All URIs are relative to https://api.salesflare.com, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**putWorkflowsIdAudienceRecordId()**](WorkflowsApi.md#putWorkflowsIdAudienceRecordId) | **PUT** /workflows/{id}/audience/{record_id} | Re-enter or exit an entity from a workflow |


## `putWorkflowsIdAudienceRecordId()`

```php
putWorkflowsIdAudienceRecordId($id, $record_id, $body): \OpenAPI\Client\Model\PutWorkflowsIdAudienceRecordId200Response
```

Re-enter or exit an entity from a workflow

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\WorkflowsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 3.4; // float
$record_id = 3.4; // float | This is the entity id. For email workflows this should be the contact id.
$body = new \OpenAPI\Client\Model\PutWorkflowsIdAudienceRecordIdRequest(); // \OpenAPI\Client\Model\PutWorkflowsIdAudienceRecordIdRequest

try {
    $result = $apiInstance->putWorkflowsIdAudienceRecordId($id, $record_id, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WorkflowsApi->putWorkflowsIdAudienceRecordId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **float**|  | |
| **record_id** | **float**| This is the entity id. For email workflows this should be the contact id. | |
| **body** | [**\OpenAPI\Client\Model\PutWorkflowsIdAudienceRecordIdRequest**](../Model/PutWorkflowsIdAudienceRecordIdRequest.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\PutWorkflowsIdAudienceRecordId200Response**](../Model/PutWorkflowsIdAudienceRecordId200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
