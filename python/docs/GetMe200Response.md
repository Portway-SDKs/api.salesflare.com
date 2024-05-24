# GetMe200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | [optional] 
**team** | [**GetMe200ResponseTeam**](GetMe200ResponseTeam.md) |  | [optional] 
**group** | **float** |  | [optional] 
**amount_of_trial_days_earned** | **float** |  | [optional] 
**has_received_account_suggestions** | **bool** |  | [optional] 
**has_archived_contacts** | **bool** |  | [optional] 
**notification_channel_id** | **str** |  | [optional] 
**needs_password** | **bool** |  | [optional] 
**disabled** | **bool** |  | [optional] 
**creation_date** | **datetime** |  | [optional] 
**modification_date** | **datetime** |  | [optional] 
**prefix** | **str** |  | [optional] 
**firstname** | **str** |  | [optional] 
**middle** | **str** |  | [optional] 
**lastname** | **str** |  | [optional] 
**suffix** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**domain** | **str** |  | [optional] 
**picture** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**is_admin** | **bool** |  | [optional] 
**credit_usage** | **float** |  | [optional] 
**is_importing** | **bool** |  | [optional] 
**sync_status** | **str** |  | [optional] 
**calendar_sync_status** | **str** |  | [optional] 
**first_calendar_sync_done** | **bool** |  | [optional] 
**trial_expired** | **bool** |  | [optional] 
**trial_expiry_date** | **datetime** |  | [optional] 
**trial_extended** | **bool** |  | [optional] 
**restricted** | **bool** |  | [optional] 
**restricted_reason** | **str** |  | [optional] 
**team_discount_code** | **str** |  | [optional] 
**referral_code** | **str** |  | [optional] 
**referral_reward** | **float** |  | [optional] 
**is_delinquent** | **bool** |  | [optional] 
**social_profiles** | [**List[GetMe200ResponseSocialProfilesInner]**](GetMe200ResponseSocialProfilesInner.md) |  | [optional] 
**phone_numbers** | [**List[GetMe200ResponsePhoneNumbersInner]**](GetMe200ResponsePhoneNumbersInner.md) |  | [optional] 
**positions** | [**List[GetContacts200ResponseInnerPositionsInner]**](GetContacts200ResponseInnerPositionsInner.md) |  | [optional] 
**addresses** | **List[object]** |  | [optional] 
**tags** | **List[object]** |  | [optional] 
**intercom_hash** | **str** |  | [optional] 
**first_day_of_week** | **float** |  | [optional] 
**am_pm_notation** | **bool** |  | [optional] 
**auto_find_email_linkedin** | **bool** |  | [optional] 
**data_sources_to_reconnect** | [**List[GetMe200ResponseDataSourcesToReconnectInner]**](GetMe200ResponseDataSourcesToReconnectInner.md) |  | [optional] 
**data_sources** | [**List[GetMe200ResponseDataSourcesInner]**](GetMe200ResponseDataSourcesInner.md) |  | [optional] 
**plan_flags** | **object** |  | [optional] 
**flags** | [**List[GetMe200ResponseFlagsInner]**](GetMe200ResponseFlagsInner.md) |  | [optional] 
**role** | [**GetMe200ResponseRole**](GetMe200ResponseRole.md) |  | [optional] 
**call_log_sync_date** | **datetime** |  | [optional] 
**two_fa_enabled** | **bool** |  | [optional] 

## Example

```python
from salesflare.models.get_me200_response import GetMe200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetMe200Response from a JSON string
get_me200_response_instance = GetMe200Response.from_json(json)
# print the JSON string representation of the object
print(GetMe200Response.to_json())

# convert the object into a dict
get_me200_response_dict = get_me200_response_instance.to_dict()
# create an instance of GetMe200Response from a dict
get_me200_response_from_dict = GetMe200Response.from_dict(get_me200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


