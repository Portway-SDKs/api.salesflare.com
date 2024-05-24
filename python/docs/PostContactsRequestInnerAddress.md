# PostContactsRequestInnerAddress


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**region** | **str** | Deprecated property. Use state_region instead. | [optional] 
**state_region** | **str** |  | [optional] 
**street** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**zip** | **str** |  | [optional] 

## Example

```python
from salesflare.models.post_contacts_request_inner_address import PostContactsRequestInnerAddress

# TODO update the JSON string below
json = "{}"
# create an instance of PostContactsRequestInnerAddress from a JSON string
post_contacts_request_inner_address_instance = PostContactsRequestInnerAddress.from_json(json)
# print the JSON string representation of the object
print(PostContactsRequestInnerAddress.to_json())

# convert the object into a dict
post_contacts_request_inner_address_dict = post_contacts_request_inner_address_instance.to_dict()
# create an instance of PostContactsRequestInnerAddress from a dict
post_contacts_request_inner_address_from_dict = PostContactsRequestInnerAddress.from_dict(post_contacts_request_inner_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


