=begin
#Salesflare API

## Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.

The version of the OpenAPI document: 1.0.0
Contact: support@salesflare.com
Generated by: https://openapi-generator.tech
Generator version: 7.6.0

=end

require 'cgi'

module OpenapiClient
  class ContactsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # List contacts
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Float>] :id 
    # @option opts [String] :name 
    # @option opts [String] :email 
    # @option opts [String] :phone_number 
    # @option opts [String] :domain 
    # @option opts [Time] :modification_after 
    # @option opts [Time] :modification_before 
    # @option opts [Time] :creation_after 
    # @option opts [Time] :creation_before 
    # @option opts [Array<Float>] :account 
    # @option opts [Array<Float>] :tag 
    # @option opts [Array<String>] :tag_name 
    # @option opts [Array<String>] :position_role 
    # @option opts [Array<String>] :address_country 
    # @option opts [Array<String>] :address_state_region 
    # @option opts [Array<String>] :address_city 
    # @option opts [Boolean] :include_archived 
    # @option opts [String] :search 
    # @option opts [String] :type 
    # @option opts [Float] :limit  (default to 20.0)
    # @option opts [Float] :offset  (default to 0.0)
    # @option opts [String] :custom 
    # @option opts [Array<String>] :order_by Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc.
    # @option opts [String] :q 
    # @return [Array<GetContacts200ResponseInner>]
    def get_contacts(opts = {})
      data, _status_code, _headers = get_contacts_with_http_info(opts)
      data
    end

    # List contacts
    # @param [Hash] opts the optional parameters
    # @option opts [Array<Float>] :id 
    # @option opts [String] :name 
    # @option opts [String] :email 
    # @option opts [String] :phone_number 
    # @option opts [String] :domain 
    # @option opts [Time] :modification_after 
    # @option opts [Time] :modification_before 
    # @option opts [Time] :creation_after 
    # @option opts [Time] :creation_before 
    # @option opts [Array<Float>] :account 
    # @option opts [Array<Float>] :tag 
    # @option opts [Array<String>] :tag_name 
    # @option opts [Array<String>] :position_role 
    # @option opts [Array<String>] :address_country 
    # @option opts [Array<String>] :address_state_region 
    # @option opts [Array<String>] :address_city 
    # @option opts [Boolean] :include_archived 
    # @option opts [String] :search 
    # @option opts [String] :type 
    # @option opts [Float] :limit  (default to 20.0)
    # @option opts [Float] :offset  (default to 0.0)
    # @option opts [String] :custom 
    # @option opts [Array<String>] :order_by Can be just &#39;key&#39; e.g. &#39;name&#39; or &#39;key sortOrder&#39; e.g. &#39;name desc&#39;. Defaults to asc.
    # @option opts [String] :q 
    # @return [Array<(Array<GetContacts200ResponseInner>, Integer, Hash)>] Array<GetContacts200ResponseInner> data, response status code and response headers
    def get_contacts_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ContactsApi.get_contacts ...'
      end
      allowable_values = ["customer", "mycontacts"]
      if @api_client.config.client_side_validation && opts[:'type'] && !allowable_values.include?(opts[:'type'])
        fail ArgumentError, "invalid value for \"type\", must be one of #{allowable_values}"
      end
      if @api_client.config.client_side_validation && !opts[:'limit'].nil? && opts[:'limit'] < 1
        fail ArgumentError, 'invalid value for "opts[:"limit"]" when calling ContactsApi.get_contacts, must be greater than or equal to 1.'
      end

      # resource path
      local_var_path = '/contacts'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'id'] = @api_client.build_collection_param(opts[:'id'], :multi) if !opts[:'id'].nil?
      query_params[:'name'] = opts[:'name'] if !opts[:'name'].nil?
      query_params[:'email'] = opts[:'email'] if !opts[:'email'].nil?
      query_params[:'phone_number'] = opts[:'phone_number'] if !opts[:'phone_number'].nil?
      query_params[:'domain'] = opts[:'domain'] if !opts[:'domain'].nil?
      query_params[:'modification_after'] = opts[:'modification_after'] if !opts[:'modification_after'].nil?
      query_params[:'modification_before'] = opts[:'modification_before'] if !opts[:'modification_before'].nil?
      query_params[:'creation_after'] = opts[:'creation_after'] if !opts[:'creation_after'].nil?
      query_params[:'creation_before'] = opts[:'creation_before'] if !opts[:'creation_before'].nil?
      query_params[:'account'] = @api_client.build_collection_param(opts[:'account'], :multi) if !opts[:'account'].nil?
      query_params[:'tag'] = @api_client.build_collection_param(opts[:'tag'], :multi) if !opts[:'tag'].nil?
      query_params[:'tag.name'] = @api_client.build_collection_param(opts[:'tag_name'], :multi) if !opts[:'tag_name'].nil?
      query_params[:'position.role'] = @api_client.build_collection_param(opts[:'position_role'], :multi) if !opts[:'position_role'].nil?
      query_params[:'address.country'] = @api_client.build_collection_param(opts[:'address_country'], :multi) if !opts[:'address_country'].nil?
      query_params[:'address.state_region'] = @api_client.build_collection_param(opts[:'address_state_region'], :multi) if !opts[:'address_state_region'].nil?
      query_params[:'address.city'] = @api_client.build_collection_param(opts[:'address_city'], :multi) if !opts[:'address_city'].nil?
      query_params[:'includeArchived'] = opts[:'include_archived'] if !opts[:'include_archived'].nil?
      query_params[:'search'] = opts[:'search'] if !opts[:'search'].nil?
      query_params[:'type'] = opts[:'type'] if !opts[:'type'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?
      query_params[:'offset'] = opts[:'offset'] if !opts[:'offset'].nil?
      query_params[:'custom'] = opts[:'custom'] if !opts[:'custom'].nil?
      query_params[:'order_by'] = @api_client.build_collection_param(opts[:'order_by'], :multi) if !opts[:'order_by'].nil?
      query_params[:'q'] = opts[:'q'] if !opts[:'q'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Array<GetContacts200ResponseInner>'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"ContactsApi.get_contacts",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ContactsApi#get_contacts\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Create a contact
    # When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :force When force is false, the contact will not be created if a contact with the same email address used to exist. (default to true)
    # @option opts [Array<PostContactsRequestInner>] :body 
    # @return [Array<PostContacts200ResponseInner>]
    def post_contacts(opts = {})
      data, _status_code, _headers = post_contacts_with_http_info(opts)
      data
    end

    # Create a contact
    # When payload is an array you will get an array back, if just an object or an array with 1 item you get an object back
    # @param [Hash] opts the optional parameters
    # @option opts [Boolean] :force When force is false, the contact will not be created if a contact with the same email address used to exist. (default to true)
    # @option opts [Array<PostContactsRequestInner>] :body 
    # @return [Array<(Array<PostContacts200ResponseInner>, Integer, Hash)>] Array<PostContacts200ResponseInner> data, response status code and response headers
    def post_contacts_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ContactsApi.post_contacts ...'
      end
      # resource path
      local_var_path = '/contacts'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'force'] = opts[:'force'] if !opts[:'force'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'body'])

      # return_type
      return_type = opts[:debug_return_type] || 'Array<PostContacts200ResponseInner>'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"ContactsApi.post_contacts",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ContactsApi#post_contacts\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end