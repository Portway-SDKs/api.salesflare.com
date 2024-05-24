# OpenapiClient::UsersApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_me**](UsersApi.md#get_me) | **GET** /me | Get current user&#39;s details |


## get_me

> <GetMe200Response> get_me

Get current user's details

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::UsersApi.new

begin
  # Get current user's details
  result = api_instance.get_me
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_me: #{e}"
end
```

#### Using the get_me_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetMe200Response>, Integer, Hash)> get_me_with_http_info

```ruby
begin
  # Get current user's details
  data, status_code, headers = api_instance.get_me_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetMe200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling UsersApi->get_me_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetMe200Response**](GetMe200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

