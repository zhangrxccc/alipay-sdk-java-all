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
 * AlipayIserviceCcmSwArticleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwArticleModifyModel {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_EXTEND_TITLES = "extend_titles";
  @SerializedName(SERIALIZED_NAME_EXTEND_TITLES)
  private List<String> extendTitles = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_SCENE_CODES = "scene_codes";
  @SerializedName(SERIALIZED_NAME_SCENE_CODES)
  private List<String> sceneCodes = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AlipayIserviceCcmSwArticleModifyModel() { 
  }

  public AlipayIserviceCcmSwArticleModifyModel categoryId(Integer categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 所属类目ID，如果search_all_category为true则不用填
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "所属类目ID，如果search_all_category为true则不用填")

  public Integer getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public AlipayIserviceCcmSwArticleModifyModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 子部门ID，不传为默认部门
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZPNASDK", value = "子部门ID，不传为默认部门")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmSwArticleModifyModel content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 内容
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个普通的内容文本", value = "内容")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public AlipayIserviceCcmSwArticleModifyModel extendTitles(List<String> extendTitles) {
    
    this.extendTitles = extendTitles;
    return this;
  }

  public AlipayIserviceCcmSwArticleModifyModel addExtendTitlesItem(String extendTitlesItem) {
    if (this.extendTitles == null) {
      this.extendTitles = new ArrayList<>();
    }
    this.extendTitles.add(extendTitlesItem);
    return this;
  }

   /**
   * 扩展标题
   * @return extendTitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"支付宝\",\"知识库\"]", value = "扩展标题")

  public List<String> getExtendTitles() {
    return extendTitles;
  }


  public void setExtendTitles(List<String> extendTitles) {
    this.extendTitles = extendTitles;
  }


  public AlipayIserviceCcmSwArticleModifyModel id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 文章ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "文章ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AlipayIserviceCcmSwArticleModifyModel keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public AlipayIserviceCcmSwArticleModifyModel addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 标签
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"关键\",\"核心\"]", value = "标签")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public AlipayIserviceCcmSwArticleModifyModel sceneCodes(List<String> sceneCodes) {
    
    this.sceneCodes = sceneCodes;
    return this;
  }

  public AlipayIserviceCcmSwArticleModifyModel addSceneCodesItem(String sceneCodesItem) {
    if (this.sceneCodes == null) {
      this.sceneCodes = new ArrayList<>();
    }
    this.sceneCodes.add(sceneCodesItem);
    return this;
  }

   /**
   * 场景ID。1（内部知识库）；2（机器人）;3（帮助中心）；4（无线帮助中心）
   * @return sceneCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1\",\"2\",\"3\",\"4\"]", value = "场景ID。1（内部知识库）；2（机器人）;3（帮助中心）；4（无线帮助中心）")

  public List<String> getSceneCodes() {
    return sceneCodes;
  }


  public void setSceneCodes(List<String> sceneCodes) {
    this.sceneCodes = sceneCodes;
  }


  public AlipayIserviceCcmSwArticleModifyModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个普通的标题", value = "标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmSwArticleModifyModel alipayIserviceCcmSwArticleModifyModel = (AlipayIserviceCcmSwArticleModifyModel) o;
    return Objects.equals(this.categoryId, alipayIserviceCcmSwArticleModifyModel.categoryId) &&
        Objects.equals(this.ccsInstanceId, alipayIserviceCcmSwArticleModifyModel.ccsInstanceId) &&
        Objects.equals(this.content, alipayIserviceCcmSwArticleModifyModel.content) &&
        Objects.equals(this.extendTitles, alipayIserviceCcmSwArticleModifyModel.extendTitles) &&
        Objects.equals(this.id, alipayIserviceCcmSwArticleModifyModel.id) &&
        Objects.equals(this.keywords, alipayIserviceCcmSwArticleModifyModel.keywords) &&
        Objects.equals(this.sceneCodes, alipayIserviceCcmSwArticleModifyModel.sceneCodes) &&
        Objects.equals(this.title, alipayIserviceCcmSwArticleModifyModel.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, ccsInstanceId, content, extendTitles, id, keywords, sceneCodes, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwArticleModifyModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    extendTitles: ").append(toIndentedString(extendTitles)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    sceneCodes: ").append(toIndentedString(sceneCodes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("ccs_instance_id");
    openapiFields.add("content");
    openapiFields.add("extend_titles");
    openapiFields.add("id");
    openapiFields.add("keywords");
    openapiFields.add("scene_codes");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwArticleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwArticleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwArticleModifyModel is not found in the empty JSON string", AlipayIserviceCcmSwArticleModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwArticleModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwArticleModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("extend_titles") != null && !jsonObj.get("extend_titles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_titles` to be an array in the JSON string but got `%s`", jsonObj.get("extend_titles").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("scene_codes") != null && !jsonObj.get("scene_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_codes` to be an array in the JSON string but got `%s`", jsonObj.get("scene_codes").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwArticleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwArticleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwArticleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwArticleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwArticleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwArticleModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwArticleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwArticleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwArticleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwArticleModifyModel
  */
  public static AlipayIserviceCcmSwArticleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwArticleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwArticleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

