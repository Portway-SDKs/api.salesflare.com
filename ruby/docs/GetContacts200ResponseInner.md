# OpenapiClient::GetContacts200ResponseInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **account** | [**GetContacts200ResponseInnerAccount**](GetContacts200ResponseInnerAccount.md) |  | [optional] |
| **id** | **Float** |  |  |
| **prefix** | **String** |  | [optional] |
| **firstname** | **String** |  | [optional] |
| **middle** | **String** |  | [optional] |
| **lastname** | **String** |  | [optional] |
| **suffix** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **email** | **String** |  | [optional] |
| **domain** | **String** |  | [optional] |
| **birth_date** | **String** |  | [optional] |
| **opt_out** | **Boolean** |  | [optional] |
| **opt_out_date** | **Time** |  | [optional] |
| **opt_out_campaign** | **String** |  | [optional] |
| **bounced** | **Boolean** |  | [optional] |
| **bounced_date** | **Time** |  | [optional] |
| **files** | **Array&lt;Object&gt;** |  | [optional] |
| **owner** | [**GetContacts200ResponseInnerOwner**](GetContacts200ResponseInnerOwner.md) |  | [optional] |
| **picture** | **String** |  | [optional] |
| **archived** | **Boolean** |  | [optional] |
| **not_viewed** | **Boolean** |  | [optional] |
| **can_edit** | **Boolean** |  | [optional] |
| **creation_date** | **Time** |  | [optional] |
| **modification_date** | **Time** |  | [optional] |
| **type** | **String** |  | [optional] |
| **tags** | [**Array&lt;GetContacts200ResponseInnerTagsInner&gt;**](GetContacts200ResponseInnerTagsInner.md) |  | [optional] |
| **addresses** | [**Array&lt;GetContacts200ResponseInnerAddressesInner&gt;**](GetContacts200ResponseInnerAddressesInner.md) |  | [optional] |
| **phone_number** | **String** |  | [optional] |
| **mobile_phone_number** | **String** |  | [optional] |
| **home_phone_number** | **String** |  | [optional] |
| **fax_number** | **String** |  | [optional] |
| **phone_numbers** | [**Array&lt;GetContacts200ResponseInnerPhoneNumbersInner&gt;**](GetContacts200ResponseInnerPhoneNumbersInner.md) |  | [optional] |
| **positions** | [**Array&lt;GetContacts200ResponseInnerPositionsInner&gt;**](GetContacts200ResponseInnerPositionsInner.md) |  | [optional] |
| **social_profiles** | [**Array&lt;GetContacts200ResponseInnerSocialProfilesInner&gt;**](GetContacts200ResponseInnerSocialProfilesInner.md) |  | [optional] |
| **organisation** | **String** |  | [optional] |
| **role** | **String** |  | [optional] |
| **custom** | **Object** |  | [optional] |
| **last_email_date** | **Time** |  | [optional] |
| **last_meeting_date** | **Time** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetContacts200ResponseInner.new(
  account: null,
  id: null,
  prefix: null,
  firstname: null,
  middle: null,
  lastname: null,
  suffix: null,
  name: null,
  email: null,
  domain: null,
  birth_date: null,
  opt_out: null,
  opt_out_date: null,
  opt_out_campaign: null,
  bounced: null,
  bounced_date: null,
  files: null,
  owner: null,
  picture: null,
  archived: null,
  not_viewed: null,
  can_edit: null,
  creation_date: null,
  modification_date: null,
  type: null,
  tags: null,
  addresses: null,
  phone_number: null,
  mobile_phone_number: null,
  home_phone_number: null,
  fax_number: null,
  phone_numbers: null,
  positions: null,
  social_profiles: null,
  organisation: null,
  role: null,
  custom: null,
  last_email_date: null,
  last_meeting_date: null
)
```

