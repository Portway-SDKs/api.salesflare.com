# GetMe200ResponseRole


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**permissions** | [**GetMe200ResponseRolePermissions**](GetMe200ResponseRolePermissions.md) |  | [optional] 

## Example

```python
from salesflare.models.get_me200_response_role import GetMe200ResponseRole

# TODO update the JSON string below
json = "{}"
# create an instance of GetMe200ResponseRole from a JSON string
get_me200_response_role_instance = GetMe200ResponseRole.from_json(json)
# print the JSON string representation of the object
print(GetMe200ResponseRole.to_json())

# convert the object into a dict
get_me200_response_role_dict = get_me200_response_role_instance.to_dict()
# create an instance of GetMe200ResponseRole from a dict
get_me200_response_role_from_dict = GetMe200ResponseRole.from_dict(get_me200_response_role_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


