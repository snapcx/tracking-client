# snapCX.io Shipping Tracking *Java* Client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.snapcx</groupId>
    <artifactId>tracking-client</artifactId>
    <version>1.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.snapcx:tracking-client:1.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/tracking-client-1.0.1.jar
* target/lib/*.jar

## Getting Started

### cURL Examples
```curl
curl -X GET -H "user_key: 817d94a03dd15c0d5782686aae84974c" "https://api.snapcx.io/tracking/v1/getTrackingDetails?carrier=FEDEX&trackId=074347350384592"

curl -X GET -H "user_key: 817d94a03dd15c0d5782686aae84974c" "https://api.snapcx.io/tracking/v1/getTrackingDetails?carrier=UPS&trackId=1Z884AR10211041421"

```

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.snapcx.tracking.client.*;
import io.snapcx.tracking.client.auth.*;
import io.snapcx.tracking.client.model.*;
import io.snapcx.tracking.client.api.ShippingApi;

import java.io.File;
import java.util.*;

public class ShippingApiExample {

    public static void main(String[] args) {
        
        ShippingApi apiInstance = new ShippingApi();
        String carrier = "carrier_example"; // String | Shipper Carrier code (UPS or USPS or FEDEX or DHL Or CAN (Canada Post) OR use AUTO for automatic detection.).
        String trackId = "trackId_example"; // String | Carrier tracking number, which is being tracked.
        String userKey = "userKey_example"; // String | Your private key, given after opening account with snapcx.io
        try {
            InlineResponse200 result = apiInstance.getTrackingDetails(carrier, trackId, userKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShippingApi#getTrackingDetails");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.snapcx.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ShippingApi* | [**getTrackingDetails**](docs/ShippingApi.md#getTrackingDetails) | **GET** /tracking/v1/getTrackingDetails | Get Shipping Tracking Details


## Documentation for Models

 - [Header](docs/Header.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [RequestObject](docs/RequestObject.md)
 - [RequestParams](docs/RequestParams.md)
 - [TrackEvent](docs/TrackEvent.md)
 - [TrackRecord](docs/TrackRecord.md)
 - [TrackSummary](docs/TrackSummary.md)


## Documentation for Authorization

All endpoints require *API KEY* in request *header*. You can get your api key from [developer portal of snapcx.io](https://developer.snapcx.io). Name of header key is *user_key*
Example
```
user_key:d111120ba53b07fxxxx05bc8c754a33f
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Website

https://snapcx.io

### Pricing & Subscription plans

https://snapcx.io/pricing

### Contact us

https://snapcx.io/contactus

### API Status

https://status.snapcx.io

### Troubleshooting and API Explorer

(You can use your API Key to test API end point)
https://snapcx.io/shippingTrackingAPI
