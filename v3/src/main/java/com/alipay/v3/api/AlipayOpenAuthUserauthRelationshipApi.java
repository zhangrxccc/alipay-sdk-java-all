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


import com.alipay.v3.model.AlipayOpenAuthUserauthRelationshipQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenAuthUserauthRelationshipQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenAuthUserauthRelationshipApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenAuthUserauthRelationshipApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenAuthUserauthRelationshipApi(ApiClient apiClient) {
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
     * Build call for query
     * @param userId 蚂蚁统一会员ID，如果未开启openid改造，则此值必传 (optional)
     * @param openId 蚂蚁统一会员ID，蚂蚁统一会员ID，如果已完成openid改造，则此值必传 (optional)
     * @param scopes 查询授权关系所关联的scope，半角逗号分隔的列表，且不允许有重复值 (optional)
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
    public okhttp3.Call queryCall(String userId, String openId, String scopes, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/auth/userauth/relationship/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user_id", userId));
        }

        if (openId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("open_id", openId));
        }

        if (scopes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scopes", scopes));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String userId, String openId, String scopes, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(userId, openId, scopes, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 用户授权关系查询
     * 校验本应用和用户的授权关系有效性
     * @param userId 蚂蚁统一会员ID，如果未开启openid改造，则此值必传 (optional)
     * @param openId 蚂蚁统一会员ID，蚂蚁统一会员ID，如果已完成openid改造，则此值必传 (optional)
     * @param scopes 查询授权关系所关联的scope，半角逗号分隔的列表，且不允许有重复值 (optional)
     * @return AlipayOpenAuthUserauthRelationshipQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenAuthUserauthRelationshipQueryResponseModel query(String userId, String openId, String scopes) throws ApiException {
        ApiResponse<AlipayOpenAuthUserauthRelationshipQueryResponseModel> localVarResp = queryWithHttpInfo(userId, openId, scopes, null);
        return localVarResp.getData();
    }

    public AlipayOpenAuthUserauthRelationshipQueryResponseModel query(String userId, String openId, String scopes, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenAuthUserauthRelationshipQueryResponseModel> localVarResp = queryWithHttpInfo(userId, openId, scopes, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 用户授权关系查询
     * 校验本应用和用户的授权关系有效性
     * @param userId 蚂蚁统一会员ID，如果未开启openid改造，则此值必传 (optional)
     * @param openId 蚂蚁统一会员ID，蚂蚁统一会员ID，如果已完成openid改造，则此值必传 (optional)
     * @param scopes 查询授权关系所关联的scope，半角逗号分隔的列表，且不允许有重复值 (optional)
     * @return ApiResponse&lt;AlipayOpenAuthUserauthRelationshipQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenAuthUserauthRelationshipQueryResponseModel> queryWithHttpInfo(String userId, String openId, String scopes, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(userId, openId, scopes, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenAuthUserauthRelationshipQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAuthUserauthRelationshipQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 用户授权关系查询 (asynchronously)
     * 校验本应用和用户的授权关系有效性
     * @param userId 蚂蚁统一会员ID，如果未开启openid改造，则此值必传 (optional)
     * @param openId 蚂蚁统一会员ID，蚂蚁统一会员ID，如果已完成openid改造，则此值必传 (optional)
     * @param scopes 查询授权关系所关联的scope，半角逗号分隔的列表，且不允许有重复值 (optional)
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
    public okhttp3.Call queryAsync(String userId, String openId, String scopes, final ApiCallback<AlipayOpenAuthUserauthRelationshipQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(userId, openId, scopes, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenAuthUserauthRelationshipQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String userId, String openId, String scopes, final ApiCallback<AlipayOpenAuthUserauthRelationshipQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(userId, openId, scopes, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenAuthUserauthRelationshipQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
