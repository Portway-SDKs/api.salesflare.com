# PostContactsRequestInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**owner** | **float** |  | [optional] 
**email** | **str** |  | [optional] 
**prefix** | **str** |  | [optional] 
**firstname** | **str** |  | [optional] 
**middle** | **str** |  | [optional] 
**lastname** | **str** |  | [optional] 
**suffix** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**picture** | **str** |  | [optional] 
**account** | **float** | Any existing account will be removed from the contact when specifically passing &#x60;null&#x60;! | [optional] 
**birth_date** | **datetime** |  | [optional] 
**opt_out** | **bool** |  | [optional] 
**opt_out_date** | **datetime** |  | [optional] 
**opt_out_campaign** | **str** |  | [optional] 
**bounced** | **bool** |  | [optional] 
**bounced_date** | **datetime** |  | [optional] 
**files** | **List[object]** |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**address** | [**PostContactsRequestInnerAddress**](PostContactsRequestInnerAddress.md) |  | [optional] 
**addresses** | [**List[PostContactsRequestInnerAddress]**](PostContactsRequestInnerAddress.md) |  | [optional] 
**phone_number** | **str** |  | [optional] 
**mobile_phone_number** | **str** |  | [optional] 
**home_phone_number** | **str** |  | [optional] 
**fax_number** | **str** |  | [optional] 
**phone_numbers** | [**List[PostContactsRequestInnerPhoneNumbersInner]**](PostContactsRequestInnerPhoneNumbersInner.md) |  | [optional] 
**position** | [**PostContactsRequestInnerPosition**](PostContactsRequestInnerPosition.md) |  | [optional] 
**positions** | [**List[PostContactsRequestInnerPosition]**](PostContactsRequestInnerPosition.md) |  | [optional] 
**social_profiles** | **List[str]** |  | [optional] 
**custom** | **object** |  | [optional] 

## Example

```python
from salesflare.models.post_contacts_request_inner import PostContactsRequestInner

# TODO update the JSON string below
json = "{}"
# create an instance of PostContactsRequestInner from a JSON string
post_contacts_request_inner_instance = PostContactsRequestInner.from_json(json)
# print the JSON string representation of the object
print(PostContactsRequestInner.to_json())

# convert the object into a dict
post_contacts_request_inner_dict = post_contacts_request_inner_instance.to_dict()
# create an instance of PostContactsRequestInner from a dict
post_contacts_request_inner_from_dict = PostContactsRequestInner.from_dict(post_contacts_request_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


