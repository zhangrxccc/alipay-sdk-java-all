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
 * AlipayIserviceCcmRoleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmRoleModifyModel {
  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FUNCTION_IDS = "function_ids";
  @SerializedName(SERIALIZED_NAME_FUNCTION_IDS)
  private List<String> functionIds = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UPDATER_ID = "updater_id";
  @SerializedName(SERIALIZED_NAME_UPDATER_ID)
  private String updaterId;

  public AlipayIserviceCcmRoleModifyModel() { 
  }

  public AlipayIserviceCcmRoleModifyModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 部门id（即租户实例ID、数据权限ID），不传默认使用租户id
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alw_J1Ds", value = "部门id（即租户实例ID、数据权限ID），不传默认使用租户id")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmRoleModifyModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 描述信息
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是角色描述", value = "描述信息")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AlipayIserviceCcmRoleModifyModel functionIds(List<String> functionIds) {
    
    this.functionIds = functionIds;
    return this;
  }

  public AlipayIserviceCcmRoleModifyModel addFunctionIdsItem(String functionIdsItem) {
    if (this.functionIds == null) {
      this.functionIds = new ArrayList<>();
    }
    this.functionIds.add(functionIdsItem);
    return this;
  }

   /**
   * 角色关联额功能点id
   * @return functionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123\",\"456\"]", value = "角色关联额功能点id")

  public List<String> getFunctionIds() {
    return functionIds;
  }


  public void setFunctionIds(List<String> functionIds) {
    this.functionIds = functionIds;
  }


  public AlipayIserviceCcmRoleModifyModel id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 角色id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "角色id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AlipayIserviceCcmRoleModifyModel updaterId(String updaterId) {
    
    this.updaterId = updaterId;
    return this;
  }

   /**
   * 最后修改人id
   * @return updaterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20181422342134", value = "最后修改人id")

  public String getUpdaterId() {
    return updaterId;
  }


  public void setUpdaterId(String updaterId) {
    this.updaterId = updaterId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmRoleModifyModel alipayIserviceCcmRoleModifyModel = (AlipayIserviceCcmRoleModifyModel) o;
    return Objects.equals(this.ccsInstanceId, alipayIserviceCcmRoleModifyModel.ccsInstanceId) &&
        Objects.equals(this.description, alipayIserviceCcmRoleModifyModel.description) &&
        Objects.equals(this.functionIds, alipayIserviceCcmRoleModifyModel.functionIds) &&
        Objects.equals(this.id, alipayIserviceCcmRoleModifyModel.id) &&
        Objects.equals(this.updaterId, alipayIserviceCcmRoleModifyModel.updaterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsInstanceId, description, functionIds, id, updaterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmRoleModifyModel {\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    functionIds: ").append(toIndentedString(functionIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
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
    openapiFields.add("ccs_instance_id");
    openapiFields.add("description");
    openapiFields.add("function_ids");
    openapiFields.add("id");
    openapiFields.add("updater_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmRoleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmRoleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmRoleModifyModel is not found in the empty JSON string", AlipayIserviceCcmRoleModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmRoleModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmRoleModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("function_ids") != null && !jsonObj.get("function_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `function_ids` to be an array in the JSON string but got `%s`", jsonObj.get("function_ids").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("updater_id") != null && !jsonObj.get("updater_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updater_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updater_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmRoleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmRoleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmRoleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmRoleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmRoleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmRoleModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmRoleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmRoleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmRoleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmRoleModifyModel
  */
  public static AlipayIserviceCcmRoleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmRoleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmRoleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

