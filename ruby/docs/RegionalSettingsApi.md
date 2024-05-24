# OpenapiClient::RegionalSettingsApi

All URIs are relative to *https://api.salesflare.com*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_currencies**](RegionalSettingsApi.md#get_currencies) | **GET** /currencies | List supported currencies |


## get_currencies

> <Array<GetCurrencies200ResponseInner>> get_currencies

List supported currencies

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RegionalSettingsApi.new

begin
  # List supported currencies
  result = api_instance.get_currencies
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionalSettingsApi->get_currencies: #{e}"
end
```

#### Using the get_currencies_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<GetCurrencies200ResponseInner>>, Integer, Hash)> get_currencies_with_http_info

```ruby
begin
  # List supported currencies
  data, status_code, headers = api_instance.get_currencies_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<GetCurrencies200ResponseInner>>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionalSettingsApi->get_currencies_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;GetCurrencies200ResponseInner&gt;**](GetCurrencies200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

