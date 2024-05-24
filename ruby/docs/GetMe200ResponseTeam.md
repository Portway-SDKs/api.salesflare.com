# OpenapiClient::GetMe200ResponseTeam

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Float** |  | [optional] |
| **name** | **String** |  | [optional] |
| **tracking_token** | **String** |  | [optional] |
| **days_until_account_inactive** | **Float** |  | [optional] |
| **total_user_count** | **Float** |  | [optional] |
| **enabled_user_count** | **Float** |  | [optional] |
| **paid_user_count** | **Float** |  | [optional] |
| **free_users** | **Float** |  | [optional] |
| **subscribed** | **Boolean** |  | [optional] |
| **payment_type** | **String** |  | [optional] |
| **discount_code** | **String** |  | [optional] |
| **discount_type** | **String** |  | [optional] |
| **promo_description** | **String** |  | [optional] |
| **promo_redeem_by** | **Time** |  | [optional] |
| **promo_code** | **String** |  | [optional] |
| **plan** | **Float** |  | [optional] |
| **currency** | [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  | [optional] |
| **billing_currency** | [**GetMe200ResponseTeamCurrency**](GetMe200ResponseTeamCurrency.md) |  | [optional] |
| **billing_frequency** | **String** |  | [optional] |
| **creation_date** | **Time** |  | [optional] |
| **time_zone** | **String** |  | [optional] |
| **stripe_customer_id** | **String** |  | [optional] |
| **campaign** | **String** |  | [optional] |
| **is_referred** | **Boolean** |  | [optional] |
| **credit_usage** | **Float** |  | [optional] |
| **credit_quota** | **Float** |  | [optional] |
| **credit_package** | **String** |  | [optional] |
| **email_tracking_subdomain** | **String** |  | [optional] |
| **email_tracking_domain** | [**GetMe200ResponseTeamEmailTrackingDomain**](GetMe200ResponseTeamEmailTrackingDomain.md) |  | [optional] |
| **automated_tagging** | **Boolean** |  | [optional] |
| **domain** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetMe200ResponseTeam.new(
  id: null,
  name: null,
  tracking_token: null,
  days_until_account_inactive: null,
  total_user_count: null,
  enabled_user_count: null,
  paid_user_count: null,
  free_users: null,
  subscribed: null,
  payment_type: null,
  discount_code: null,
  discount_type: null,
  promo_description: null,
  promo_redeem_by: null,
  promo_code: null,
  plan: null,
  currency: null,
  billing_currency: null,
  billing_frequency: null,
  creation_date: null,
  time_zone: null,
  stripe_customer_id: null,
  campaign: null,
  is_referred: null,
  credit_usage: null,
  credit_quota: null,
  credit_package: null,
  email_tracking_subdomain: null,
  email_tracking_domain: null,
  automated_tagging: null,
  domain: null
)
```

