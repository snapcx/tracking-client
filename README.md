# snapcx-tracking-client

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
    <groupId>io.snapcx.tracking.client</groupId>
    <artifactId>snapcx-tracking-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.snapcx.tracking.client:snapcx-tracking-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/snapcx-tracking-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

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

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

support@snapcx.io

