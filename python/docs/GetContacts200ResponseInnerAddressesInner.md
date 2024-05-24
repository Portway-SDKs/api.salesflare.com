# GetContacts200ResponseInnerAddressesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | 
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**region** | **str** | Deprecated property. Use state_region instead. | [optional] 
**state_region** | **str** |  | [optional] 
**street** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**zip** | **str** |  | [optional] 

## Example

```python
from salesflare.models.get_contacts200_response_inner_addresses_inner import GetContacts200ResponseInnerAddressesInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetContacts200ResponseInnerAddressesInner from a JSON string
get_contacts200_response_inner_addresses_inner_instance = GetContacts200ResponseInnerAddressesInner.from_json(json)
# print the JSON string representation of the object
print(GetContacts200ResponseInnerAddressesInner.to_json())

# convert the object into a dict
get_contacts200_response_inner_addresses_inner_dict = get_contacts200_response_inner_addresses_inner_instance.to_dict()
# create an instance of GetContacts200ResponseInnerAddressesInner from a dict
get_contacts200_response_inner_addresses_inner_from_dict = GetContacts200ResponseInnerAddressesInner.from_dict(get_contacts200_response_inner_addresses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


