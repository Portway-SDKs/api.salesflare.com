# OpenapiClient::PostContactsRequestInnerAddress

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **city** | **String** |  | [optional] |
| **country** | **String** |  | [optional] |
| **region** | **String** | Deprecated property. Use state_region instead. | [optional] |
| **state_region** | **String** |  | [optional] |
| **street** | **String** |  | [optional] |
| **type** | **String** |  | [optional] |
| **zip** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PostContactsRequestInnerAddress.new(
  city: null,
  country: null,
  region: null,
  state_region: null,
  street: null,
  type: null,
  zip: null
)
```

