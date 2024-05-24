# OpenapiClient::ContactsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_contacts**](ContactsApi.md#get_contacts) | **GET** /contacts | List contacts |
| [**post_contacts**](ContactsApi.md#post_contacts) | **POST** /contacts | Create a contact |


## get_contacts

> <Array<GetContacts200ResponseInner>> get_contacts(opts)

List contacts

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ContactsApi.new
opts = {
  id: [3.56], # Array<Float> | 
  name: 'name_example', # String | 
  email: 'email_example', # String | 
  phone_number: 'phone_number_example', # String | 
  domain: 'domain_example', # String | 
  modification_after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  modification_before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  creation_after: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  creation_before: Time.parse('2013-10-20T19:20:30+01:00'), # Time | 
  account: [3.56], # Array<Float> | 
  tag: [3.56], # Array<Float> | 
  tag_name: ['inner_example'], # Array<String> | 
  position_role: ['inner_example'], # Array<String> | 
  address_country: ['inner_example'], # Array<String> | 
  address_state_region: ['inner_example'], # Array<String> | 
  address_city: ['inner_example'], # Array<String> | 
  include_archived: true, # Boolean | 
  search: 'search_example', # String | 
  type: 'customer', # String | 
  limit: 8.14, # Float | 
  offset: 8.14, # Float | 
  custom: 'custom_example', # String | 
  order_by: ['inner_example'], # Array<String> | Can be just 'key' e.g. 'name' or 'key sortOrder' e.g. 'name desc'. Defaults to asc.
  q: 'q_example' # String | 
}

begin
  # List contacts
  result = api_instance.get_contacts(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContactsApi->get_contacts: #{e}"
end
```

#### Using the get_contacts_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<GetContacts200ResponseInner>>, Integer, Hash)> get_contacts_with_http_info(opts)

```ruby
begin
  # List contacts
  data, status_code, headers = api_instance.get_contacts_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<GetContacts200ResponseInner>>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContactsApi->get_contacts_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | [**Array&lt;Float&gt;**](Float.md) |  | [optional] |
| **name** | **String** |  | [optional] |
| **email** | **String** |  | [optional] |
| **phone_number** | **String** |  | [optional] |
| **domain** | **String** |  | [optional] |
| **modification_after** | **Time** |  | [optional] |
| **modification_before** | **Time** |  | [optional] |
| **creation_after** | **Time** |  | [optional] |
| **creation_before** | **Time** |  | [optional] |
| **account** | [**Array&lt;Float&gt;**](Float.md) |  | [optional] |
| **tag** | [**Array&lt;Float&gt;**](Float.md) |  | [optional] |
| **tag_name** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **position_role** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **address_country** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **address_state_region** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **address_city** | [**Array&lt;String&gt;**](String.md) |  | [optional] |
| **include_archived** | **Boolean** |  | [optional] |
| **search** | **String** |  | [optional] |
| **type** | **String** |  | [optional] |
| **limit** | **Float** |  | [optional][default to 20.0] |
| **offset** | **Float** |  | [optional][default to 0.0] |
| **custom** | **String** |  | [optional] |
| **order_by** | [**Array&lt;String&gt;**](String.md) | Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. | [optional] |
| **q** | **String** |  | [optional] |

### Return type

[**Array&lt;GetContacts200ResponseInner&gt;**](GetContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## post_contacts

> <Array<PostContacts200ResponseInner>> post_contacts(opts)

Create a contact

When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ContactsApi.new
opts = {
  force: true, # Boolean | When force is false, the contact will not be created if a contact with the same email address used to exist.
  body: [OpenapiClient::PostContactsRequestInner.new] # Array<PostContactsRequestInner> | 
}

begin
  # Create a contact
  result = api_instance.post_contacts(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContactsApi->post_contacts: #{e}"
end
```

#### Using the post_contacts_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<PostContacts200ResponseInner>>, Integer, Hash)> post_contacts_with_http_info(opts)

```ruby
begin
  # Create a contact
  data, status_code, headers = api_instance.post_contacts_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<PostContacts200ResponseInner>>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContactsApi->post_contacts_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **force** | **Boolean** | When force is false, the contact will not be created if a contact with the same email address used to exist. | [optional][default to true] |
| **body** | [**Array&lt;PostContactsRequestInner&gt;**](PostContactsRequestInner.md) |  | [optional] |

### Return type

[**Array&lt;PostContacts200ResponseInner&gt;**](PostContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

