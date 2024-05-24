# GetContacts200ResponseInnerAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | 
**picture** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**domain** | **str** |  | [optional] 

## Example

```python
from salesflare.models.get_contacts200_response_inner_account import GetContacts200ResponseInnerAccount

# TODO update the JSON string below
json = "{}"
# create an instance of GetContacts200ResponseInnerAccount from a JSON string
get_contacts200_response_inner_account_instance = GetContacts200ResponseInnerAccount.from_json(json)
# print the JSON string representation of the object
print(GetContacts200ResponseInnerAccount.to_json())

# convert the object into a dict
get_contacts200_response_inner_account_dict = get_contacts200_response_inner_account_instance.to_dict()
# create an instance of GetContacts200ResponseInnerAccount from a dict
get_contacts200_response_inner_account_from_dict = GetContacts200ResponseInnerAccount.from_dict(get_contacts200_response_inner_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


