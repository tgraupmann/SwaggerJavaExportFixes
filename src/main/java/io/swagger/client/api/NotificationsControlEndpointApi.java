/*
 * Polling API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.ResponseOutputModelNotificationProfileCompleteOutputModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationsControlEndpointApi {
    private ApiClient apiClient;

    public NotificationsControlEndpointApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationsControlEndpointApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for notificationList */
    private okhttp3.Call notificationListCall(String lastDateTime, Integer topCount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'lastDateTime' is set
        if (lastDateTime == null) {
            throw new ApiException("Missing the required parameter 'lastDateTime' when calling notificationList(Async)");
        }
        
        // verify the required parameter 'topCount' is set
        if (topCount == null) {
            throw new ApiException("Missing the required parameter 'topCount' when calling notificationList(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/API/Notifications".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (lastDateTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastDateTime", lastDateTime));
        if (topCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "topCount", topCount));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get a list of outstanding notifications for the logged in player
     * 
     * @param lastDateTime  (required)
     * @param topCount  (required)
     * @return ResponseOutputModelNotificationProfileCompleteOutputModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseOutputModelNotificationProfileCompleteOutputModel notificationList(String lastDateTime, Integer topCount) throws ApiException {
        ApiResponse<ResponseOutputModelNotificationProfileCompleteOutputModel> resp = notificationListWithHttpInfo(lastDateTime, topCount);
        return resp.getData();
    }

    /**
     * Get a list of outstanding notifications for the logged in player
     * 
     * @param lastDateTime  (required)
     * @param topCount  (required)
     * @return ApiResponse&lt;ResponseOutputModelNotificationProfileCompleteOutputModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseOutputModelNotificationProfileCompleteOutputModel> notificationListWithHttpInfo(String lastDateTime, Integer topCount) throws ApiException {
        okhttp3.Call call = notificationListCall(lastDateTime, topCount, null, null);
        Type localVarReturnType = new TypeToken<ResponseOutputModelNotificationProfileCompleteOutputModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of outstanding notifications for the logged in player (asynchronously)
     * 
     * @param lastDateTime  (required)
     * @param topCount  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call notificationListAsync(String lastDateTime, Integer topCount, final ApiCallback<ResponseOutputModelNotificationProfileCompleteOutputModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = notificationListCall(lastDateTime, topCount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseOutputModelNotificationProfileCompleteOutputModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
