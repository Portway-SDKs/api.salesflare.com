# PutWorkflowsIdAudienceRecordIdRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exited** | **bool** | Setting &#x60;exited&#x60; to &#x60;true&#x60; will exit the entity from the workflow. Setting &#x60;exited&#x60; to &#x60;false&#x60; will re-enter the entity into the workflow. | [optional] 
**met_goal** | **bool** | Setting &#x60;met_goal&#x60; of a workflow record to &#x60;false&#x60; is currently not possible. | [optional] 

## Example

```python
from salesflare.models.put_workflows_id_audience_record_id_request import PutWorkflowsIdAudienceRecordIdRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutWorkflowsIdAudienceRecordIdRequest from a JSON string
put_workflows_id_audience_record_id_request_instance = PutWorkflowsIdAudienceRecordIdRequest.from_json(json)
# print the JSON string representation of the object
print(PutWorkflowsIdAudienceRecordIdRequest.to_json())

# convert the object into a dict
put_workflows_id_audience_record_id_request_dict = put_workflows_id_audience_record_id_request_instance.to_dict()
# create an instance of PutWorkflowsIdAudienceRecordIdRequest from a dict
put_workflows_id_audience_record_id_request_from_dict = PutWorkflowsIdAudienceRecordIdRequest.from_dict(put_workflows_id_audience_record_id_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


