# salesflare.ContactsApi

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_contacts**](ContactsApi.md#get_contacts) | **GET** /contacts | List contacts
[**post_contacts**](ContactsApi.md#post_contacts) | **POST** /contacts | Create a contact


# **get_contacts**
> List[GetContacts200ResponseInner] get_contacts(id=id, name=name, email=email, phone_number=phone_number, domain=domain, modification_after=modification_after, modification_before=modification_before, creation_after=creation_after, creation_before=creation_before, account=account, tag=tag, tag_name=tag_name, position_role=position_role, address_country=address_country, address_state_region=address_state_region, address_city=address_city, include_archived=include_archived, search=search, type=type, limit=limit, offset=offset, custom=custom, order_by=order_by, q=q)

List contacts

### Example


```python
import salesflare
from salesflare.models.get_contacts200_response_inner import GetContacts200ResponseInner
from salesflare.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.salesflare.com
# See configuration.py for a list of all supported configuration parameters.
configuration = salesflare.Configuration(
    host = "https://api.salesflare.com"
)


# Enter a context with an instance of the API client
with salesflare.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = salesflare.ContactsApi(api_client)
    id = [3.4] # List[float] |  (optional)
    name = 'name_example' # str |  (optional)
    email = 'email_example' # str |  (optional)
    phone_number = 'phone_number_example' # str |  (optional)
    domain = 'domain_example' # str |  (optional)
    modification_after = '2013-10-20T19:20:30+01:00' # datetime |  (optional)
    modification_before = '2013-10-20T19:20:30+01:00' # datetime |  (optional)
    creation_after = '2013-10-20T19:20:30+01:00' # datetime |  (optional)
    creation_before = '2013-10-20T19:20:30+01:00' # datetime |  (optional)
    account = [3.4] # List[float] |  (optional)
    tag = [3.4] # List[float] |  (optional)
    tag_name = ['tag_name_example'] # List[str] |  (optional)
    position_role = ['position_role_example'] # List[str] |  (optional)
    address_country = ['address_country_example'] # List[str] |  (optional)
    address_state_region = ['address_state_region_example'] # List[str] |  (optional)
    address_city = ['address_city_example'] # List[str] |  (optional)
    include_archived = True # bool |  (optional)
    search = 'search_example' # str |  (optional)
    type = 'type_example' # str |  (optional)
    limit = 20.0 # float |  (optional) (default to 20.0)
    offset = 0.0 # float |  (optional) (default to 0.0)
    custom = 'custom_example' # str |  (optional)
    order_by = ['order_by_example'] # List[str] | Can be just 'key' e.g. 'name' or 'key sortOrder' e.g. 'name desc'. Defaults to asc. (optional)
    q = 'q_example' # str |  (optional)

    try:
        # List contacts
        api_response = api_instance.get_contacts(id=id, name=name, email=email, phone_number=phone_number, domain=domain, modification_after=modification_after, modification_before=modification_before, creation_after=creation_after, creation_before=creation_before, account=account, tag=tag, tag_name=tag_name, position_role=position_role, address_country=address_country, address_state_region=address_state_region, address_city=address_city, include_archived=include_archived, search=search, type=type, limit=limit, offset=offset, custom=custom, order_by=order_by, q=q)
        print("The response of ContactsApi->get_contacts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContactsApi->get_contacts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List[float]**](float.md)|  | [optional] 
 **name** | **str**|  | [optional] 
 **email** | **str**|  | [optional] 
 **phone_number** | **str**|  | [optional] 
 **domain** | **str**|  | [optional] 
 **modification_after** | **datetime**|  | [optional] 
 **modification_before** | **datetime**|  | [optional] 
 **creation_after** | **datetime**|  | [optional] 
 **creation_before** | **datetime**|  | [optional] 
 **account** | [**List[float]**](float.md)|  | [optional] 
 **tag** | [**List[float]**](float.md)|  | [optional] 
 **tag_name** | [**List[str]**](str.md)|  | [optional] 
 **position_role** | [**List[str]**](str.md)|  | [optional] 
 **address_country** | [**List[str]**](str.md)|  | [optional] 
 **address_state_region** | [**List[str]**](str.md)|  | [optional] 
 **address_city** | [**List[str]**](str.md)|  | [optional] 
 **include_archived** | **bool**|  | [optional] 
 **search** | **str**|  | [optional] 
 **type** | **str**|  | [optional] 
 **limit** | **float**|  | [optional] [default to 20.0]
 **offset** | **float**|  | [optional] [default to 0.0]
 **custom** | **str**|  | [optional] 
 **order_by** | [**List[str]**](str.md)| Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. | [optional] 
 **q** | **str**|  | [optional] 

### Return type

[**List[GetContacts200ResponseInner]**](GetContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_contacts**
> List[PostContacts200ResponseInner] post_contacts(force=force, body=body)

Create a contact

When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back

### Example


```python
import salesflare
from salesflare.models.post_contacts200_response_inner import PostContacts200ResponseInner
from salesflare.models.post_contacts_request_inner import PostContactsRequestInner
from salesflare.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.salesflare.com
# See configuration.py for a list of all supported configuration parameters.
configuration = salesflare.Configuration(
    host = "https://api.salesflare.com"
)


# Enter a context with an instance of the API client
with salesflare.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = salesflare.ContactsApi(api_client)
    force = True # bool | When force is false, the contact will not be created if a contact with the same email address used to exist. (optional) (default to True)
    body = [salesflare.PostContactsRequestInner()] # List[PostContactsRequestInner] |  (optional)

    try:
        # Create a contact
        api_response = api_instance.post_contacts(force=force, body=body)
        print("The response of ContactsApi->post_contacts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ContactsApi->post_contacts: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **force** | **bool**| When force is false, the contact will not be created if a contact with the same email address used to exist. | [optional] [default to True]
 **body** | [**List[PostContactsRequestInner]**](PostContactsRequestInner.md)|  | [optional] 

### Return type

[**List[PostContacts200ResponseInner]**](PostContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

