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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.IsvSpiDefinition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * AlipayIserviceCcmServiceInitializeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmServiceInitializeModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SERVICE_ORDER_URL = "service_order_url";
  @SerializedName(SERIALIZED_NAME_SERVICE_ORDER_URL)
  private String serviceOrderUrl;

  public static final String SERIALIZED_NAME_SPIS = "spis";
  @SerializedName(SERIALIZED_NAME_SPIS)
  private List<IsvSpiDefinition> spis = null;

  public AlipayIserviceCcmServiceInitializeModel() { 
  }

  public AlipayIserviceCcmServiceInitializeModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 服务描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "热线工作台", value = "服务描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayIserviceCcmServiceInitializeModel icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * 服务图标url。支持 http(s) 链接。
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://127.0.0.1/", value = "服务图标url。支持 http(s) 链接。")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public AlipayIserviceCcmServiceInitializeModel serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务编码。可在服务上架后，在服务市场上查询此信息。
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testCode", value = "服务编码。可在服务上架后，在服务市场上查询此信息。")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public AlipayIserviceCcmServiceInitializeModel serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * 服务名称。可在服务上架后，在服务市场上查询此信息。
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "热线工作台", value = "服务名称。可在服务上架后，在服务市场上查询此信息。")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public AlipayIserviceCcmServiceInitializeModel serviceOrderUrl(String serviceOrderUrl) {
    
    this.serviceOrderUrl = serviceOrderUrl;
    return this;
  }

   /**
   * 服务订购二维码链接
   * @return serviceOrderUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://127.0.0.1/", value = "服务订购二维码链接")

  public String getServiceOrderUrl() {
    return serviceOrderUrl;
  }


  public void setServiceOrderUrl(String serviceOrderUrl) {
    this.serviceOrderUrl = serviceOrderUrl;
  }


  public AlipayIserviceCcmServiceInitializeModel spis(List<IsvSpiDefinition> spis) {
    
    this.spis = spis;
    return this;
  }

  public AlipayIserviceCcmServiceInitializeModel addSpisItem(IsvSpiDefinition spisItem) {
    if (this.spis == null) {
      this.spis = new ArrayList<>();
    }
    this.spis.add(spisItem);
    return this;
  }

   /**
   * spi定义列表
   * @return spis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "spi定义列表")

  public List<IsvSpiDefinition> getSpis() {
    return spis;
  }


  public void setSpis(List<IsvSpiDefinition> spis) {
    this.spis = spis;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmServiceInitializeModel alipayIserviceCcmServiceInitializeModel = (AlipayIserviceCcmServiceInitializeModel) o;
    return Objects.equals(this.description, alipayIserviceCcmServiceInitializeModel.description) &&
        Objects.equals(this.icon, alipayIserviceCcmServiceInitializeModel.icon) &&
        Objects.equals(this.serviceCode, alipayIserviceCcmServiceInitializeModel.serviceCode) &&
        Objects.equals(this.serviceName, alipayIserviceCcmServiceInitializeModel.serviceName) &&
        Objects.equals(this.serviceOrderUrl, alipayIserviceCcmServiceInitializeModel.serviceOrderUrl) &&
        Objects.equals(this.spis, alipayIserviceCcmServiceInitializeModel.spis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, icon, serviceCode, serviceName, serviceOrderUrl, spis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmServiceInitializeModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceOrderUrl: ").append(toIndentedString(serviceOrderUrl)).append("\n");
    sb.append("    spis: ").append(toIndentedString(spis)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("icon");
    openapiFields.add("service_code");
    openapiFields.add("service_name");
    openapiFields.add("service_order_url");
    openapiFields.add("spis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmServiceInitializeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmServiceInitializeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmServiceInitializeModel is not found in the empty JSON string", AlipayIserviceCcmServiceInitializeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmServiceInitializeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmServiceInitializeModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("service_name") != null && !jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
      if (jsonObj.get("service_order_url") != null && !jsonObj.get("service_order_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_order_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_order_url").toString()));
      }
      JsonArray jsonArrayspis = jsonObj.getAsJsonArray("spis");
      if (jsonArrayspis != null) {
        // ensure the json data is an array
        if (!jsonObj.get("spis").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `spis` to be an array in the JSON string but got `%s`", jsonObj.get("spis").toString()));
        }

        // validate the optional field `spis` (array)
        for (int i = 0; i < jsonArrayspis.size(); i++) {
          IsvSpiDefinition.validateJsonObject(jsonArrayspis.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmServiceInitializeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmServiceInitializeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmServiceInitializeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmServiceInitializeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmServiceInitializeModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmServiceInitializeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmServiceInitializeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmServiceInitializeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmServiceInitializeModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmServiceInitializeModel
  */
  public static AlipayIserviceCcmServiceInitializeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmServiceInitializeModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmServiceInitializeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

