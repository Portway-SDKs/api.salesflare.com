# OpenapiClient::GetMe200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Float** |  | [optional] |
| **team** | [**GetMe200ResponseTeam**](GetMe200ResponseTeam.md) |  | [optional] |
| **group** | **Float** |  | [optional] |
| **amount_of_trial_days_earned** | **Float** |  | [optional] |
| **has_received_account_suggestions** | **Boolean** |  | [optional] |
| **has_archived_contacts** | **Boolean** |  | [optional] |
| **notification_channel_id** | **String** |  | [optional] |
| **needs_password** | **Boolean** |  | [optional] |
| **disabled** | **Boolean** |  | [optional] |
| **creation_date** | **Time** |  | [optional] |
| **modification_date** | **Time** |  | [optional] |
| **prefix** | **String** |  | [optional] |
| **firstname** | **String** |  | [optional] |
| **middle** | **String** |  | [optional] |
| **lastname** | **String** |  | [optional] |
| **suffix** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **email** | **String** |  | [optional] |
| **domain** | **String** |  | [optional] |
| **picture** | **String** |  | [optional] |
| **type** | **String** |  | [optional] |
| **is_admin** | **Boolean** |  | [optional] |
| **credit_usage** | **Float** |  | [optional] |
| **is_importing** | **Boolean** |  | [optional] |
| **sync_status** | **String** |  | [optional] |
| **calendar_sync_status** | **String** |  | [optional] |
| **first_calendar_sync_done** | **Boolean** |  | [optional] |
| **trial_expired** | **Boolean** |  | [optional] |
| **trial_expiry_date** | **Time** |  | [optional] |
| **trial_extended** | **Boolean** |  | [optional] |
| **restricted** | **Boolean** |  | [optional] |
| **restricted_reason** | **String** |  | [optional] |
| **team_discount_code** | **String** |  | [optional] |
| **referral_code** | **String** |  | [optional] |
| **referral_reward** | **Float** |  | [optional] |
| **is_delinquent** | **Boolean** |  | [optional] |
| **social_profiles** | [**Array&lt;GetMe200ResponseSocialProfilesInner&gt;**](GetMe200ResponseSocialProfilesInner.md) |  | [optional] |
| **phone_numbers** | [**Array&lt;GetMe200ResponsePhoneNumbersInner&gt;**](GetMe200ResponsePhoneNumbersInner.md) |  | [optional] |
| **positions** | [**Array&lt;GetContacts200ResponseInnerPositionsInner&gt;**](GetContacts200ResponseInnerPositionsInner.md) |  | [optional] |
| **addresses** | **Array&lt;Object&gt;** |  | [optional] |
| **tags** | **Array&lt;Object&gt;** |  | [optional] |
| **intercom_hash** | **String** |  | [optional] |
| **first_day_of_week** | **Float** |  | [optional] |
| **am_pm_notation** | **Boolean** |  | [optional] |
| **auto_find_email_linkedin** | **Boolean** |  | [optional] |
| **data_sources_to_reconnect** | [**Array&lt;GetMe200ResponseDataSourcesToReconnectInner&gt;**](GetMe200ResponseDataSourcesToReconnectInner.md) |  | [optional] |
| **data_sources** | [**Array&lt;GetMe200ResponseDataSourcesInner&gt;**](GetMe200ResponseDataSourcesInner.md) |  | [optional] |
| **plan_flags** | **Object** |  | [optional] |
| **flags** | [**Array&lt;GetMe200ResponseFlagsInner&gt;**](GetMe200ResponseFlagsInner.md) |  | [optional] |
| **role** | [**GetMe200ResponseRole**](GetMe200ResponseRole.md) |  | [optional] |
| **call_log_sync_date** | **Time** |  | [optional] |
| **two_fa_enabled** | **Boolean** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetMe200Response.new(
  id: null,
  team: null,
  group: null,
  amount_of_trial_days_earned: null,
  has_received_account_suggestions: null,
  has_archived_contacts: null,
  notification_channel_id: null,
  needs_password: null,
  disabled: null,
  creation_date: null,
  modification_date: null,
  prefix: null,
  firstname: null,
  middle: null,
  lastname: null,
  suffix: null,
  name: null,
  email: null,
  domain: null,
  picture: null,
  type: null,
  is_admin: null,
  credit_usage: null,
  is_importing: null,
  sync_status: null,
  calendar_sync_status: null,
  first_calendar_sync_done: null,
  trial_expired: null,
  trial_expiry_date: null,
  trial_extended: null,
  restricted: null,
  restricted_reason: null,
  team_discount_code: null,
  referral_code: null,
  referral_reward: null,
  is_delinquent: null,
  social_profiles: null,
  phone_numbers: null,
  positions: null,
  addresses: null,
  tags: null,
  intercom_hash: null,
  first_day_of_week: null,
  am_pm_notation: null,
  auto_find_email_linkedin: null,
  data_sources_to_reconnect: null,
  data_sources: null,
  plan_flags: null,
  flags: null,
  role: null,
  call_log_sync_date: null,
  two_fa_enabled: null
)
```

