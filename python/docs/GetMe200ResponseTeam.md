# GetMe200ResponseTeam


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**tracking_token** | **str** |  | [optional] 
**days_until_account_inactive** | **float** |  | [optional] 
**total_user_count** | **float** |  | [optional] 
**enabled_user_count** | **float** |  | [optional] 
**paid_user_count** | **float** |  | [optional] 
**free_users** | **float** |  | [optional] 
**subscribed** | **bool** |  | [optional] 
**payment_type** | **str** |  | [optional] 
**discount_code** | **str** |  | [optional] 
**discount_type** | **str** |  | [optional] 
**promo_description** | **str** |  | [optional] 
**promo_redeem_by** | **datetime** |  | [optional] 
**promo_code** | **str** |  | [optional] 
**plan** | **float** |  | [optional] 
**currency** | [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  | [optional] 
**billing_currency** | [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  | [optional] 
**billing_frequency** | **str** |  | [optional] 
**creation_date** | **datetime** |  | [optional] 
**time_zone** | **str** |  | [optional] 
**stripe_customer_id** | **str** |  | [optional] 
**campaign** | **str** |  | [optional] 
**is_referred** | **bool** |  | [optional] 
**credit_usage** | **float** |  | [optional] 
**credit_quota** | **float** |  | [optional] 
**credit_package** | **str** |  | [optional] 
**email_tracking_subdomain** | **str** |  | [optional] 
**email_tracking_domain** | [**GetMe200ResponseTeamEmailTrackingDomain**](GetMe200ResponseTeamEmailTrackingDomain.md) |  | [optional] 
**automated_tagging** | **bool** |  | [optional] 
**domain** | **str** |  | [optional] 

## Example

```python
from salesflare.models.get_me200_response_team import GetMe200ResponseTeam

# TODO update the JSON string below
json = "{}"
# create an instance of GetMe200ResponseTeam from a JSON string
get_me200_response_team_instance = GetMe200ResponseTeam.from_json(json)
# print the JSON string representation of the object
print(GetMe200ResponseTeam.to_json())

# convert the object into a dict
get_me200_response_team_dict = get_me200_response_team_instance.to_dict()
# create an instance of GetMe200ResponseTeam from a dict
get_me200_response_team_from_dict = GetMe200ResponseTeam.from_dict(get_me200_response_team_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


