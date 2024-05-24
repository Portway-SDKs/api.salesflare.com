# GetContacts200ResponseInnerOwner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | 
**name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**picture** | **str** |  | [optional] 

## Example

```python
from salesflare.models.get_contacts200_response_inner_owner import GetContacts200ResponseInnerOwner

# TODO update the JSON string below
json = "{}"
# create an instance of GetContacts200ResponseInnerOwner from a JSON string
get_contacts200_response_inner_owner_instance = GetContacts200ResponseInnerOwner.from_json(json)
# print the JSON string representation of the object
print(GetContacts200ResponseInnerOwner.to_json())

# convert the object into a dict
get_contacts200_response_inner_owner_dict = get_contacts200_response_inner_owner_instance.to_dict()
# create an instance of GetContacts200ResponseInnerOwner from a dict
get_contacts200_response_inner_owner_from_dict = GetContacts200ResponseInnerOwner.from_dict(get_contacts200_response_inner_owner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


