# GetContacts200ResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | [**GetContacts200ResponseInnerAccount**](GetContacts200ResponseInnerAccount.md) |  | [optional] 
**id** | **float** |  | 
**prefix** | **str** |  | [optional] 
**firstname** | **str** |  | [optional] 
**middle** | **str** |  | [optional] 
**lastname** | **str** |  | [optional] 
**suffix** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**domain** | **str** |  | [optional] 
**birth_date** | **str** |  | [optional] 
**opt_out** | **bool** |  | [optional] 
**opt_out_date** | **datetime** |  | [optional] 
**opt_out_campaign** | **str** |  | [optional] 
**bounced** | **bool** |  | [optional] 
**bounced_date** | **datetime** |  | [optional] 
**files** | **List[object]** |  | [optional] 
**owner** | [**GetContacts200ResponseInnerOwner**](GetContacts200ResponseInnerOwner.md) |  | [optional] 
**picture** | **str** |  | [optional] 
**archived** | **bool** |  | [optional] 
**not_viewed** | **bool** |  | [optional] 
**can_edit** | **bool** |  | [optional] 
**creation_date** | **datetime** |  | [optional] 
**modification_date** | **datetime** |  | [optional] 
**type** | **str** |  | [optional] 
**tags** | [**List[GetContacts200ResponseInnerTagsInner]**](GetContacts200ResponseInnerTagsInner.md) |  | [optional] 
**addresses** | [**List[GetContacts200ResponseInnerAddressesInner]**](GetContacts200ResponseInnerAddressesInner.md) |  | [optional] 
**phone_number** | **str** |  | [optional] 
**mobile_phone_number** | **str** |  | [optional] 
**home_phone_number** | **str** |  | [optional] 
**fax_number** | **str** |  | [optional] 
**phone_numbers** | [**List[GetContacts200ResponseInnerPhoneNumbersInner]**](GetContacts200ResponseInnerPhoneNumbersInner.md) |  | [optional] 
**positions** | [**List[GetContacts200ResponseInnerPositionsInner]**](GetContacts200ResponseInnerPositionsInner.md) |  | [optional] 
**social_profiles** | [**List[GetContacts200ResponseInnerSocialProfilesInner]**](GetContacts200ResponseInnerSocialProfilesInner.md) |  | [optional] 
**organisation** | **str** |  | [optional] 
**role** | **str** |  | [optional] 
**custom** | **object** |  | [optional] 
**last_email_date** | **datetime** |  | [optional] 
**last_meeting_date** | **datetime** |  | [optional] 

## Example

```python
from salesflare.models.get_contacts200_response_inner import GetContacts200ResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of GetContacts200ResponseInner from a JSON string
get_contacts200_response_inner_instance = GetContacts200ResponseInner.from_json(json)
# print the JSON string representation of the object
print(GetContacts200ResponseInner.to_json())

# convert the object into a dict
get_contacts200_response_inner_dict = get_contacts200_response_inner_instance.to_dict()
# create an instance of GetContacts200ResponseInner from a dict
get_contacts200_response_inner_from_dict = GetContacts200ResponseInner.from_dict(get_contacts200_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


