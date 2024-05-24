# coding: utf-8

# flake8: noqa
"""
    Salesflare API

    # Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.

    The version of the OpenAPI document: 1.0.0
    Contact: support@salesflare.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


# import models into model package
from salesflare.models.get_contacts200_response_inner import GetContacts200ResponseInner
from salesflare.models.get_contacts200_response_inner_account import GetContacts200ResponseInnerAccount
from salesflare.models.get_contacts200_response_inner_addresses_inner import GetContacts200ResponseInnerAddressesInner
from salesflare.models.get_contacts200_response_inner_owner import GetContacts200ResponseInnerOwner
from salesflare.models.get_contacts200_response_inner_phone_numbers_inner import GetContacts200ResponseInnerPhoneNumbersInner
from salesflare.models.get_contacts200_response_inner_positions_inner import GetContacts200ResponseInnerPositionsInner
from salesflare.models.get_contacts200_response_inner_social_profiles_inner import GetContacts200ResponseInnerSocialProfilesInner
from salesflare.models.get_contacts200_response_inner_tags_inner import GetContacts200ResponseInnerTagsInner
from salesflare.models.get_currencies200_response_inner import GetCurrencies200ResponseInner
from salesflare.models.get_me200_response import GetMe200Response
from salesflare.models.get_me200_response_data_sources_inner import GetMe200ResponseDataSourcesInner
from salesflare.models.get_me200_response_data_sources_to_reconnect_inner import GetMe200ResponseDataSourcesToReconnectInner
from salesflare.models.get_me200_response_flags_inner import GetMe200ResponseFlagsInner
from salesflare.models.get_me200_response_phone_numbers_inner import GetMe200ResponsePhoneNumbersInner
from salesflare.models.get_me200_response_role import GetMe200ResponseRole
from salesflare.models.get_me200_response_role_permissions import GetMe200ResponseRolePermissions
from salesflare.models.get_me200_response_social_profiles_inner import GetMe200ResponseSocialProfilesInner
from salesflare.models.get_me200_response_team import GetMe200ResponseTeam
from salesflare.models.get_me200_response_team_currency import GetMe200ResponseTeamCurrency
from salesflare.models.get_me200_response_team_email_tracking_domain import GetMe200ResponseTeamEmailTrackingDomain
from salesflare.models.post_contacts200_response_inner import PostContacts200ResponseInner
from salesflare.models.post_contacts_request_inner import PostContactsRequestInner
from salesflare.models.post_contacts_request_inner_address import PostContactsRequestInnerAddress
from salesflare.models.post_contacts_request_inner_phone_numbers_inner import PostContactsRequestInnerPhoneNumbersInner
from salesflare.models.post_contacts_request_inner_position import PostContactsRequestInnerPosition
from salesflare.models.put_workflows_id_audience_record_id200_response import PutWorkflowsIdAudienceRecordId200Response
from salesflare.models.put_workflows_id_audience_record_id_request import PutWorkflowsIdAudienceRecordIdRequest
