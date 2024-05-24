# # PostContactsRequestInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**owner** | **float** |  | [optional]
**email** | **string** |  | [optional]
**prefix** | **string** |  | [optional]
**firstname** | **string** |  | [optional]
**middle** | **string** |  | [optional]
**lastname** | **string** |  | [optional]
**suffix** | **string** |  | [optional]
**name** | **string** |  | [optional]
**picture** | **string** |  | [optional]
**account** | **float** | Any existing account will be removed from the contact when specifically passing &#x60;null&#x60;! | [optional]
**birth_date** | **\DateTime** |  | [optional]
**opt_out** | **bool** |  | [optional]
**opt_out_date** | **\DateTime** |  | [optional]
**opt_out_campaign** | **string** |  | [optional]
**bounced** | **bool** |  | [optional]
**bounced_date** | **\DateTime** |  | [optional]
**files** | **object[]** |  | [optional]
**tags** | **string[]** |  | [optional]
**address** | [**\OpenAPI\Client\Model\PostContactsRequestInnerAddress**](PostContactsRequestInnerAddress.md) |  | [optional]
**addresses** | [**\OpenAPI\Client\Model\PostContactsRequestInnerAddress[]**](PostContactsRequestInnerAddress.md) |  | [optional]
**phone_number** | **string** |  | [optional]
**mobile_phone_number** | **string** |  | [optional]
**home_phone_number** | **string** |  | [optional]
**fax_number** | **string** |  | [optional]
**phone_numbers** | [**\OpenAPI\Client\Model\PostContactsRequestInnerPhoneNumbersInner[]**](PostContactsRequestInnerPhoneNumbersInner.md) |  | [optional]
**position** | [**\OpenAPI\Client\Model\PostContactsRequestInnerPosition**](PostContactsRequestInnerPosition.md) |  | [optional]
**positions** | [**\OpenAPI\Client\Model\PostContactsRequestInnerPosition[]**](PostContactsRequestInnerPosition.md) |  | [optional]
**social_profiles** | **string[]** |  | [optional]
**custom** | **object** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
