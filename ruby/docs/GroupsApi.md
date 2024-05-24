# OpenapiClient::GroupsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_groups**](GroupsApi.md#get_groups) | **GET** /groups | List groups |


## get_groups

> String get_groups

List groups

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::GroupsApi.new

begin
  # List groups
  result = api_instance.get_groups
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling GroupsApi->get_groups: #{e}"
end
```

#### Using the get_groups_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> get_groups_with_http_info

```ruby
begin
  # List groups
  data, status_code, headers = api_instance.get_groups_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling GroupsApi->get_groups_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

