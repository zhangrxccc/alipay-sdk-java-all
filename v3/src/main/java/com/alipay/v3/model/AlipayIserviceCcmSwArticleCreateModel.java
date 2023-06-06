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
 * AlipayIserviceCcmSwArticleCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwArticleCreateModel {
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

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_LIBRARY_ID = "library_id";
  @SerializedName(SERIALIZED_NAME_LIBRARY_ID)
  private String libraryId;

  public static final String SERIALIZED_NAME_SCENE_CODES = "scene_codes";
  @SerializedName(SERIALIZED_NAME_SCENE_CODES)
  private List<String> sceneCodes = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AlipayIserviceCcmSwArticleCreateModel() { 
  }

  public AlipayIserviceCcmSwArticleCreateModel categoryId(Integer categoryId) {
    
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


  public AlipayIserviceCcmSwArticleCreateModel ccsInstanceId(String ccsInstanceId) {
    
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


  public AlipayIserviceCcmSwArticleCreateModel content(String content) {
    
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


  public AlipayIserviceCcmSwArticleCreateModel extendTitles(List<String> extendTitles) {
    
    this.extendTitles = extendTitles;
    return this;
  }

  public AlipayIserviceCcmSwArticleCreateModel addExtendTitlesItem(String extendTitlesItem) {
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


  public AlipayIserviceCcmSwArticleCreateModel keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public AlipayIserviceCcmSwArticleCreateModel addKeywordsItem(String keywordsItem) {
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


  public AlipayIserviceCcmSwArticleCreateModel libraryId(String libraryId) {
    
    this.libraryId = libraryId;
    return this;
  }

   /**
   * 知识库ID
   * @return libraryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "知识库ID")

  public String getLibraryId() {
    return libraryId;
  }


  public void setLibraryId(String libraryId) {
    this.libraryId = libraryId;
  }


  public AlipayIserviceCcmSwArticleCreateModel sceneCodes(List<String> sceneCodes) {
    
    this.sceneCodes = sceneCodes;
    return this;
  }

  public AlipayIserviceCcmSwArticleCreateModel addSceneCodesItem(String sceneCodesItem) {
    if (this.sceneCodes == null) {
      this.sceneCodes = new ArrayList<>();
    }
    this.sceneCodes.add(sceneCodesItem);
    return this;
  }

   /**
   * 场景ID。KNOWLEDGE（内部知识库）；ROBOT（机器人）;HELP（帮助中心）；WHELP（无线帮助中心）
   * @return sceneCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"KNOWLEDGE\",\"ROBOT\",\"HELP\",\"WHELP\"]", value = "场景ID。KNOWLEDGE（内部知识库）；ROBOT（机器人）;HELP（帮助中心）；WHELP（无线帮助中心）")

  public List<String> getSceneCodes() {
    return sceneCodes;
  }


  public void setSceneCodes(List<String> sceneCodes) {
    this.sceneCodes = sceneCodes;
  }


  public AlipayIserviceCcmSwArticleCreateModel title(String title) {
    
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
    AlipayIserviceCcmSwArticleCreateModel alipayIserviceCcmSwArticleCreateModel = (AlipayIserviceCcmSwArticleCreateModel) o;
    return Objects.equals(this.categoryId, alipayIserviceCcmSwArticleCreateModel.categoryId) &&
        Objects.equals(this.ccsInstanceId, alipayIserviceCcmSwArticleCreateModel.ccsInstanceId) &&
        Objects.equals(this.content, alipayIserviceCcmSwArticleCreateModel.content) &&
        Objects.equals(this.extendTitles, alipayIserviceCcmSwArticleCreateModel.extendTitles) &&
        Objects.equals(this.keywords, alipayIserviceCcmSwArticleCreateModel.keywords) &&
        Objects.equals(this.libraryId, alipayIserviceCcmSwArticleCreateModel.libraryId) &&
        Objects.equals(this.sceneCodes, alipayIserviceCcmSwArticleCreateModel.sceneCodes) &&
        Objects.equals(this.title, alipayIserviceCcmSwArticleCreateModel.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, ccsInstanceId, content, extendTitles, keywords, libraryId, sceneCodes, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwArticleCreateModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    extendTitles: ").append(toIndentedString(extendTitles)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    libraryId: ").append(toIndentedString(libraryId)).append("\n");
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
    openapiFields.add("keywords");
    openapiFields.add("library_id");
    openapiFields.add("scene_codes");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwArticleCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwArticleCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwArticleCreateModel is not found in the empty JSON string", AlipayIserviceCcmSwArticleCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwArticleCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwArticleCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("library_id") != null && !jsonObj.get("library_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `library_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("library_id").toString()));
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
       if (!AlipayIserviceCcmSwArticleCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwArticleCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwArticleCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwArticleCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwArticleCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwArticleCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwArticleCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwArticleCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwArticleCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwArticleCreateModel
  */
  public static AlipayIserviceCcmSwArticleCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwArticleCreateModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwArticleCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

