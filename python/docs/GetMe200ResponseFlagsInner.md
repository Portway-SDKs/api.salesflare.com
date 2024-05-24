# GetMe200ResponseFlagsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | [optional] 
**flag** | **float** |  | 
**name** | **str** |  | 
**state** | **bool** |  | 
**user** | **float** |  | [optional] 
**plan** | **float** |  | [optional] 
**creation_date** | **datetime** |  | [optional] 
**modification_date** | **datetime** |  | [optional] 

## Example

```python
from salesflare.models.get_me200_response_flags_inner import GetMe200ResponseFlagsInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetMe200ResponseFlagsInner from a JSON string
get_me200_response_flags_inner_instance = GetMe200ResponseFlagsInner.from_json(json)
# print the JSON string representation of the object
print(GetMe200ResponseFlagsInner.to_json())

# convert the object into a dict
get_me200_response_flags_inner_dict = get_me200_response_flags_inner_instance.to_dict()
# create an instance of GetMe200ResponseFlagsInner from a dict
get_me200_response_flags_inner_from_dict = GetMe200ResponseFlagsInner.from_dict(get_me200_response_flags_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


