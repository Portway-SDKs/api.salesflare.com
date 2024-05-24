# OpenapiClient::PostContactsRequestInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **owner** | **Float** |  | [optional] |
| **email** | **String** |  | [optional] |
| **prefix** | **String** |  | [optional] |
| **firstname** | **String** |  | [optional] |
| **middle** | **String** |  | [optional] |
| **lastname** | **String** |  | [optional] |
| **suffix** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **picture** | **String** |  | [optional] |
| **account** | **Float** | Any existing account will be removed from the contact when specifically passing &#x60;null&#x60;! | [optional] |
| **birth_date** | **Time** |  | [optional] |
| **opt_out** | **Boolean** |  | [optional] |
| **opt_out_date** | **Time** |  | [optional] |
| **opt_out_campaign** | **String** |  | [optional] |
| **bounced** | **Boolean** |  | [optional] |
| **bounced_date** | **Time** |  | [optional] |
| **files** | **Array&lt;Object&gt;** |  | [optional] |
| **tags** | **Array&lt;String&gt;** |  | [optional] |
| **address** | [**PostContactsRequestInnerAddress**](PostContactsRequestInnerAddress.md) |  | [optional] |
| **addresses** | [**Array&lt;PostContactsRequestInnerAddress&gt;**](PostContactsRequestInnerAddress.md) |  | [optional] |
| **phone_number** | **String** |  | [optional] |
| **mobile_phone_number** | **String** |  | [optional] |
| **home_phone_number** | **String** |  | [optional] |
| **fax_number** | **String** |  | [optional] |
| **phone_numbers** | [**Array&lt;PostContactsRequestInnerPhoneNumbersInner&gt;**](PostContactsRequestInnerPhoneNumbersInner.md) |  | [optional] |
| **position** | [**PostContactsRequestInnerPosition**](PostContactsRequestInnerPosition.md) |  | [optional] |
| **positions** | [**Array&lt;PostContactsRequestInnerPosition&gt;**](PostContactsRequestInnerPosition.md) |  | [optional] |
| **social_profiles** | **Array&lt;String&gt;** |  | [optional] |
| **custom** | **Object** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PostContactsRequestInner.new(
  owner: null,
  email: null,
  prefix: null,
  firstname: null,
  middle: null,
  lastname: null,
  suffix: null,
  name: null,
  picture: null,
  account: null,
  birth_date: null,
  opt_out: null,
  opt_out_date: null,
  opt_out_campaign: null,
  bounced: null,
  bounced_date: null,
  files: null,
  tags: null,
  address: null,
  addresses: null,
  phone_number: null,
  mobile_phone_number: null,
  home_phone_number: null,
  fax_number: null,
  phone_numbers: null,
  position: null,
  positions: null,
  social_profiles: null,
  custom: null
)
```

