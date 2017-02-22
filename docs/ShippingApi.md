# ShippingApi

All URIs are relative to *https://api.snapcx.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrackingDetails**](ShippingApi.md#getTrackingDetails) | **GET** /tracking/v1/getTrackingDetails | Get Shipping Tracking Details


<a name="getTrackingDetails"></a>
# **getTrackingDetails**
> InlineResponse200 getTrackingDetails(carrier, trackId, userKey)

Get Shipping Tracking Details

This API provides real time shipping tracking status (along with tracking events) for multiple carriers. It takes carrier code (UPS or USPS or FEDEX or DHL) and tracking number as input. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 

### Example
```java
// Import classes:
//import io.snapcx.tracking.client.ApiException;
//import io.snapcx.tracking.client.api.ShippingApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carrier** | **String**| Shipper Carrier code (UPS or USPS or FEDEX or DHL Or CAN (Canada Post) OR use AUTO for automatic detection.). |
 **trackId** | **String**| Carrier tracking number, which is being tracked. |
 **userKey** | **String**| Your private key, given after opening account with snapcx.io |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

