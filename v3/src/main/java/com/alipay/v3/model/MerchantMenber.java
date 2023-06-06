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
 * MerchantMenber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantMenber {
  public static final String SERIALIZED_NAME_BIRTH = "birth";
  @SerializedName(SERIALIZED_NAME_BIRTH)
  private String birth;

  public static final String SERIALIZED_NAME_CELL = "cell";
  @SerializedName(SERIALIZED_NAME_CELL)
  private String cell;

  public static final String SERIALIZED_NAME_GENDE = "gende";
  @SerializedName(SERIALIZED_NAME_GENDE)
  private String gende;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public MerchantMenber() { 
  }

  public MerchantMenber birth(String birth) {
    
    this.birth = birth;
    return this;
  }

   /**
   * 生日 yyyy-MM-dd
   * @return birth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-06-27", value = "生日 yyyy-MM-dd")

  public String getBirth() {
    return birth;
  }


  public void setBirth(String birth) {
    this.birth = birth;
  }


  public MerchantMenber cell(String cell) {
    
    this.cell = cell;
    return this;
  }

   /**
   * 手机号
   * @return cell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13000000000", value = "手机号")

  public String getCell() {
    return cell;
  }


  public void setCell(String cell) {
    this.cell = cell;
  }


  public MerchantMenber gende(String gende) {
    
    this.gende = gende;
    return this;
  }

   /**
   * 性别（男：MALE；女：FEMALE）
   * @return gende
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MALE", value = "性别（男：MALE；女：FEMALE）")

  public String getGende() {
    return gende;
  }


  public void setGende(String gende) {
    this.gende = gende;
  }


  public MerchantMenber name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "李洋", value = "姓名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantMenber merchantMenber = (MerchantMenber) o;
    return Objects.equals(this.birth, merchantMenber.birth) &&
        Objects.equals(this.cell, merchantMenber.cell) &&
        Objects.equals(this.gende, merchantMenber.gende) &&
        Objects.equals(this.name, merchantMenber.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birth, cell, gende, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantMenber {\n");
    sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
    sb.append("    gende: ").append(toIndentedString(gende)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("birth");
    openapiFields.add("cell");
    openapiFields.add("gende");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantMenber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantMenber.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantMenber is not found in the empty JSON string", MerchantMenber.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantMenber.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantMenber` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("birth") != null && !jsonObj.get("birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birth").toString()));
      }
      if (jsonObj.get("cell") != null && !jsonObj.get("cell").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cell` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cell").toString()));
      }
      if (jsonObj.get("gende") != null && !jsonObj.get("gende").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gende` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gende").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantMenber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantMenber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantMenber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantMenber.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantMenber>() {
           @Override
           public void write(JsonWriter out, MerchantMenber value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantMenber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantMenber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantMenber
  * @throws IOException if the JSON string is invalid with respect to MerchantMenber
  */
  public static MerchantMenber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantMenber.class);
  }

 /**
  * Convert an instance of MerchantMenber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

