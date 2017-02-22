package io.snapcx.tracking.client.api;

import io.snapcx.tracking.client.ApiException;
import io.snapcx.tracking.client.ApiClient;
import io.snapcx.tracking.client.Configuration;
import io.snapcx.tracking.client.Pair;

import javax.ws.rs.core.GenericType;

import io.snapcx.tracking.client.model.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-03T19:17:01.024-05:00")
public class ShippingApi {
  private ApiClient apiClient;

  public ShippingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShippingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Shipping Tracking Details
   * This API provides real time shipping tracking status (along with tracking events) for multiple carriers. It takes carrier code (UPS or USPS or FEDEX or DHL) and tracking number as input. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 
   * @param carrier Shipper Carrier code (UPS or USPS or FEDEX or DHL Or CAN (Canada Post) OR use AUTO for automatic detection.). (required)
   * @param trackId Carrier tracking number, which is being tracked. (required)
   * @param userKey Your private key, given after opening account with snapcx.io (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 getTrackingDetails(String carrier, String trackId, String userKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'carrier' is set
    if (carrier == null) {
      throw new ApiException(400, "Missing the required parameter 'carrier' when calling getTrackingDetails");
    }
    
    // verify the required parameter 'trackId' is set
    if (trackId == null) {
      throw new ApiException(400, "Missing the required parameter 'trackId' when calling getTrackingDetails");
    }
    
    // verify the required parameter 'userKey' is set
    if (userKey == null) {
      throw new ApiException(400, "Missing the required parameter 'userKey' when calling getTrackingDetails");
    }
    
    // create path and map variables
    String localVarPath = "/tracking/v1/getTrackingDetails".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "carrier", carrier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trackId", trackId));

    if (userKey != null)
      localVarHeaderParams.put("user_key", apiClient.parameterToString(userKey));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
