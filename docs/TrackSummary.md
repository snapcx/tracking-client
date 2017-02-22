
# TrackSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **String** | Error Code in case of any problem for this particular tracking id. |  [optional]
**errorMessage** | **String** | Error Message in case of any problem for this particular tracking id.  |  [optional]
**status** | **String** | Two possible values, SUCCESS or FAIL. |  [optional]
**cached** | **Boolean** | if tracking details were retrieved from cache. Generally, it will be always be true (except for first time for a new tracking#). |  [optional]
**carrier** | **String** | Carrier code |  [optional]
**trackingId** | **String** | Tracking number of response. |  [optional]
**delivered** | **Boolean** | if package is delivered, then true otherwise false. |  [optional]
**lastCheckWithCarrier** | **String** | null |  [optional]
**estimatedDeliveryDate** | **String** | Estimated delivery date, as per carrier. |  [optional]
**destination** | **String** | Destination city, state, Country etc. |  [optional]
**origin** | **String** | Shipping origin city, state, Country etc. |  [optional]
**destinationLat** | **String** | Destination geo location Coordinates, Latitude. |  [optional]
**destinationLong** | **String** | Destination geo location Coordinates, Longtitude. |  [optional]



