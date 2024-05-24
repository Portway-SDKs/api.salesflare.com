/*
 * Salesflare API
 * # Introduction  ## Getting Started  The Salesflare API allows you to access and build your own applications or integrations that interact with Salesflare.  The Salesflare API provides a RESTful interface with JSON-formatted responses to access most Salesflare resources.  ## Authentication  The Salesflare API uses bearer token based authentication, which means you need to use the key-value pair \"Authorization : Bearer APIKEY\" in the header to authenticate.  You can make an API key in [\"Settings\" > \"API keys\"](https://app.salesflare.com/#/settings/apikeys).  Click on the large orange \"+\" button on the bottom right of the screen to create an API key.  ![Screenshot API Key Settings](https://lib.salesflare.com/api_docs/screenshot_settings_apikeys.png)  ## Requests  All requests must be sent using HTTPS with TLS 1.2 or higher. Please make sure your developer tools support this version of TLS as older versions or SSL are not supported for security reasons.  For PUT or POST requests (e.g. create, update), the payload must be provided as JSON in the request body.  ## Responses  Responses use HTTP status codes, with the most typical ones being:  | Code                   | Meaning               | |------------------------|-----------------------| | Successful Responses                           | | 200                    | OK                    | | Error Responses                                | | 400                    | Bad Request           | | 401                    | Unauthorized          | | 404                    | Not Found             | | 429                    | Too Many Requests     | | 500                    | Internal Server Error |  ## Testing  We recommend testing our API with Postman.  ### Download specification  Our API is documented following the OpenAPI specification. You can download it [here](https://api.salesflare.com/openapi.json)  ### Import in Postman  To import the collection, open Postman and click Import, then select \"Import From Link\"  Copy & Paste the following link and press the \"Import\" button:  > https://api.salesflare.com/openapi.json  ![Screenshot Postman Import](https://lib.salesflare.com/api_docs/screenshot_postman_import.png)  ## Support  For API questions and support, please email support@salesflare.com or click the chat bubble below.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@salesflare.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.GetMe200ResponseTeamCurrency;
import org.openapitools.client.model.GetMe200ResponseTeamEmailTrackingDomain;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for GetMe200ResponseTeam
 */
public class GetMe200ResponseTeamTest {
    private final GetMe200ResponseTeam model = new GetMe200ResponseTeam();

    /**
     * Model tests for GetMe200ResponseTeam
     */
    @Test
    public void testGetMe200ResponseTeam() {
        // TODO: test GetMe200ResponseTeam
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'trackingToken'
     */
    @Test
    public void trackingTokenTest() {
        // TODO: test trackingToken
    }

    /**
     * Test the property 'daysUntilAccountInactive'
     */
    @Test
    public void daysUntilAccountInactiveTest() {
        // TODO: test daysUntilAccountInactive
    }

    /**
     * Test the property 'totalUserCount'
     */
    @Test
    public void totalUserCountTest() {
        // TODO: test totalUserCount
    }

    /**
     * Test the property 'enabledUserCount'
     */
    @Test
    public void enabledUserCountTest() {
        // TODO: test enabledUserCount
    }

    /**
     * Test the property 'paidUserCount'
     */
    @Test
    public void paidUserCountTest() {
        // TODO: test paidUserCount
    }

    /**
     * Test the property 'freeUsers'
     */
    @Test
    public void freeUsersTest() {
        // TODO: test freeUsers
    }

    /**
     * Test the property 'subscribed'
     */
    @Test
    public void subscribedTest() {
        // TODO: test subscribed
    }

    /**
     * Test the property 'paymentType'
     */
    @Test
    public void paymentTypeTest() {
        // TODO: test paymentType
    }

    /**
     * Test the property 'discountCode'
     */
    @Test
    public void discountCodeTest() {
        // TODO: test discountCode
    }

    /**
     * Test the property 'discountType'
     */
    @Test
    public void discountTypeTest() {
        // TODO: test discountType
    }

    /**
     * Test the property 'promoDescription'
     */
    @Test
    public void promoDescriptionTest() {
        // TODO: test promoDescription
    }

    /**
     * Test the property 'promoRedeemBy'
     */
    @Test
    public void promoRedeemByTest() {
        // TODO: test promoRedeemBy
    }

    /**
     * Test the property 'promoCode'
     */
    @Test
    public void promoCodeTest() {
        // TODO: test promoCode
    }

    /**
     * Test the property 'plan'
     */
    @Test
    public void planTest() {
        // TODO: test plan
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'billingCurrency'
     */
    @Test
    public void billingCurrencyTest() {
        // TODO: test billingCurrency
    }

    /**
     * Test the property 'billingFrequency'
     */
    @Test
    public void billingFrequencyTest() {
        // TODO: test billingFrequency
    }

    /**
     * Test the property 'creationDate'
     */
    @Test
    public void creationDateTest() {
        // TODO: test creationDate
    }

    /**
     * Test the property 'timeZone'
     */
    @Test
    public void timeZoneTest() {
        // TODO: test timeZone
    }

    /**
     * Test the property 'stripeCustomerId'
     */
    @Test
    public void stripeCustomerIdTest() {
        // TODO: test stripeCustomerId
    }

    /**
     * Test the property 'campaign'
     */
    @Test
    public void campaignTest() {
        // TODO: test campaign
    }

    /**
     * Test the property 'isReferred'
     */
    @Test
    public void isReferredTest() {
        // TODO: test isReferred
    }

    /**
     * Test the property 'creditUsage'
     */
    @Test
    public void creditUsageTest() {
        // TODO: test creditUsage
    }

    /**
     * Test the property 'creditQuota'
     */
    @Test
    public void creditQuotaTest() {
        // TODO: test creditQuota
    }

    /**
     * Test the property 'creditPackage'
     */
    @Test
    public void creditPackageTest() {
        // TODO: test creditPackage
    }

    /**
     * Test the property 'emailTrackingSubdomain'
     */
    @Test
    public void emailTrackingSubdomainTest() {
        // TODO: test emailTrackingSubdomain
    }

    /**
     * Test the property 'emailTrackingDomain'
     */
    @Test
    public void emailTrackingDomainTest() {
        // TODO: test emailTrackingDomain
    }

    /**
     * Test the property 'automatedTagging'
     */
    @Test
    public void automatedTaggingTest() {
        // TODO: test automatedTagging
    }

    /**
     * Test the property 'domain'
     */
    @Test
    public void domainTest() {
        // TODO: test domain
    }

}
