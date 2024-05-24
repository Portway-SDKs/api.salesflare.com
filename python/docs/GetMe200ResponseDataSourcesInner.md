# GetMe200ResponseDataSourcesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | [optional] 
**email** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**sync_status** | **str** |  | [optional] 
**status** | **str** |  | [optional] 
**status_message** | **str** |  | [optional] 

## Example

```python
from salesflare.models.get_me200_response_data_sources_inner import GetMe200ResponseDataSourcesInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetMe200ResponseDataSourcesInner from a JSON string
get_me200_response_data_sources_inner_instance = GetMe200ResponseDataSourcesInner.from_json(json)
# print the JSON string representation of the object
print(GetMe200ResponseDataSourcesInner.to_json())

# convert the object into a dict
get_me200_response_data_sources_inner_dict = get_me200_response_data_sources_inner_instance.to_dict()
# create an instance of GetMe200ResponseDataSourcesInner from a dict
get_me200_response_data_sources_inner_from_dict = GetMe200ResponseDataSourcesInner.from_dict(get_me200_response_data_sources_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


