# \ContactsAPI

All URIs are relative to *https://api.salesflare.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetContacts**](ContactsAPI.md#GetContacts) | **Get** /contacts | List contacts
[**PostContacts**](ContactsAPI.md#PostContacts) | **Post** /contacts | Create a contact



## GetContacts

> []GetContacts200ResponseInner GetContacts(ctx).Id(id).Name(name).Email(email).PhoneNumber(phoneNumber).Domain(domain).ModificationAfter(modificationAfter).ModificationBefore(modificationBefore).CreationAfter(creationAfter).CreationBefore(creationBefore).Account(account).Tag(tag).TagName(tagName).PositionRole(positionRole).AddressCountry(addressCountry).AddressStateRegion(addressStateRegion).AddressCity(addressCity).IncludeArchived(includeArchived).Search(search).Type_(type_).Limit(limit).Offset(offset).Custom(custom).OrderBy(orderBy).Q(q).Execute()

List contacts

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	id := []float32{float32(123)} // []float32 |  (optional)
	name := "name_example" // string |  (optional)
	email := "email_example" // string |  (optional)
	phoneNumber := "phoneNumber_example" // string |  (optional)
	domain := "domain_example" // string |  (optional)
	modificationAfter := time.Now() // time.Time |  (optional)
	modificationBefore := time.Now() // time.Time |  (optional)
	creationAfter := time.Now() // time.Time |  (optional)
	creationBefore := time.Now() // time.Time |  (optional)
	account := []float32{float32(123)} // []float32 |  (optional)
	tag := []float32{float32(123)} // []float32 |  (optional)
	tagName := []string{"Inner_example"} // []string |  (optional)
	positionRole := []string{"Inner_example"} // []string |  (optional)
	addressCountry := []string{"Inner_example"} // []string |  (optional)
	addressStateRegion := []string{"Inner_example"} // []string |  (optional)
	addressCity := []string{"Inner_example"} // []string |  (optional)
	includeArchived := true // bool |  (optional)
	search := "search_example" // string |  (optional)
	type_ := "type__example" // string |  (optional)
	limit := float32(8.14) // float32 |  (optional) (default to 20.0)
	offset := float32(8.14) // float32 |  (optional) (default to 0.0)
	custom := "custom_example" // string |  (optional)
	orderBy := []string{"Inner_example"} // []string | Can be just 'key' e.g. 'name' or 'key sortOrder' e.g. 'name desc'. Defaults to asc. (optional)
	q := "q_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ContactsAPI.GetContacts(context.Background()).Id(id).Name(name).Email(email).PhoneNumber(phoneNumber).Domain(domain).ModificationAfter(modificationAfter).ModificationBefore(modificationBefore).CreationAfter(creationAfter).CreationBefore(creationBefore).Account(account).Tag(tag).TagName(tagName).PositionRole(positionRole).AddressCountry(addressCountry).AddressStateRegion(addressStateRegion).AddressCity(addressCity).IncludeArchived(includeArchived).Search(search).Type_(type_).Limit(limit).Offset(offset).Custom(custom).OrderBy(orderBy).Q(q).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ContactsAPI.GetContacts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetContacts`: []GetContacts200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `ContactsAPI.GetContacts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetContactsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **[]float32** |  | 
 **name** | **string** |  | 
 **email** | **string** |  | 
 **phoneNumber** | **string** |  | 
 **domain** | **string** |  | 
 **modificationAfter** | **time.Time** |  | 
 **modificationBefore** | **time.Time** |  | 
 **creationAfter** | **time.Time** |  | 
 **creationBefore** | **time.Time** |  | 
 **account** | **[]float32** |  | 
 **tag** | **[]float32** |  | 
 **tagName** | **[]string** |  | 
 **positionRole** | **[]string** |  | 
 **addressCountry** | **[]string** |  | 
 **addressStateRegion** | **[]string** |  | 
 **addressCity** | **[]string** |  | 
 **includeArchived** | **bool** |  | 
 **search** | **string** |  | 
 **type_** | **string** |  | 
 **limit** | **float32** |  | [default to 20.0]
 **offset** | **float32** |  | [default to 0.0]
 **custom** | **string** |  | 
 **orderBy** | **[]string** | Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc. | 
 **q** | **string** |  | 

### Return type

[**[]GetContacts200ResponseInner**](GetContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PostContacts

> []PostContacts200ResponseInner PostContacts(ctx).Force(force).Body(body).Execute()

Create a contact



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	force := true // bool | When force is false, the contact will not be created if a contact with the same email address used to exist. (optional) (default to true)
	body := []openapiclient.PostContactsRequestInner{*openapiclient.NewPostContactsRequestInner()} // []PostContactsRequestInner |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ContactsAPI.PostContacts(context.Background()).Force(force).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ContactsAPI.PostContacts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PostContacts`: []PostContacts200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `ContactsAPI.PostContacts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPostContactsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **force** | **bool** | When force is false, the contact will not be created if a contact with the same email address used to exist. | [default to true]
 **body** | [**[]PostContactsRequestInner**](PostContactsRequestInner.md) |  | 

### Return type

[**[]PostContacts200ResponseInner**](PostContacts200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

