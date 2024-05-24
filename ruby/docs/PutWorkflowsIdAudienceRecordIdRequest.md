# OpenapiClient::PutWorkflowsIdAudienceRecordIdRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **exited** | **Boolean** | Setting &#x60;exited&#x60; to &#x60;true&#x60; will exit the entity from the workflow. Setting &#x60;exited&#x60; to &#x60;false&#x60; will re-enter the entity into the workflow. | [optional] |
| **met_goal** | **Boolean** | Setting &#x60;met_goal&#x60; of a workflow record to &#x60;false&#x60; is currently not possible. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PutWorkflowsIdAudienceRecordIdRequest.new(
  exited: null,
  met_goal: null
)
```

