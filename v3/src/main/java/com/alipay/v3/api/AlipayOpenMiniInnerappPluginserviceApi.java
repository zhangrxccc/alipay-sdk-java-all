/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-06-06
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.api;

import com.alipay.v3.ApiCallback;
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import com.alipay.v3.Configuration;
import com.alipay.v3.Pair;
import com.alipay.v3.ProgressRequestBody;
import com.alipay.v3.ProgressResponseBody;
import com.alipay.v3.util.AlipayLogger;
import com.alipay.v3.util.model.CustomizedParams;

import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alipay.v3.model.AlipayOpenMiniInnerappPluginservicePublishDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniInnerappPluginservicePublishModel;
import com.alipay.v3.model.AlipayOpenMiniInnerappPluginservicePublishResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniInnerappPluginserviceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniInnerappPluginserviceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniInnerappPluginserviceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for publish
     * @param alipayOpenMiniInnerappPluginservicePublishModel  (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call publishCall(AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayOpenMiniInnerappPluginservicePublishModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/innerapp/pluginservice/publish";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call publishValidateBeforeCall(AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = publishCall(alipayOpenMiniInnerappPluginservicePublishModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 插件发布能力中心
     * 插件发布能力中心
     * @param alipayOpenMiniInnerappPluginservicePublishModel  (optional)
     * @return AlipayOpenMiniInnerappPluginservicePublishResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniInnerappPluginservicePublishResponseModel publish(AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerappPluginservicePublishResponseModel> localVarResp = publishWithHttpInfo(alipayOpenMiniInnerappPluginservicePublishModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniInnerappPluginservicePublishResponseModel publish(AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniInnerappPluginservicePublishResponseModel> localVarResp = publishWithHttpInfo(alipayOpenMiniInnerappPluginservicePublishModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 插件发布能力中心
     * 插件发布能力中心
     * @param alipayOpenMiniInnerappPluginservicePublishModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniInnerappPluginservicePublishResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniInnerappPluginservicePublishResponseModel> publishWithHttpInfo(AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = publishValidateBeforeCall(alipayOpenMiniInnerappPluginservicePublishModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappPluginservicePublishResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniInnerappPluginservicePublishDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 插件发布能力中心 (asynchronously)
     * 插件发布能力中心
     * @param alipayOpenMiniInnerappPluginservicePublishModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call publishAsync(AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel, final ApiCallback<AlipayOpenMiniInnerappPluginservicePublishResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = publishValidateBeforeCall(alipayOpenMiniInnerappPluginservicePublishModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappPluginservicePublishResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call publishAsync(AlipayOpenMiniInnerappPluginservicePublishModel alipayOpenMiniInnerappPluginservicePublishModel, final ApiCallback<AlipayOpenMiniInnerappPluginservicePublishResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = publishValidateBeforeCall(alipayOpenMiniInnerappPluginservicePublishModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniInnerappPluginservicePublishResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
