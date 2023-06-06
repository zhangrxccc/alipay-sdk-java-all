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
import com.alipay.v3.model.TicketDetailInfo;
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
 * AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_TICKETS = "tickets";
  @SerializedName(SERIALIZED_NAME_TICKETS)
  private List<TicketDetailInfo> tickets = null;

  public AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel() { 
  }

  public AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel tickets(List<TicketDetailInfo> tickets) {
    
    this.tickets = tickets;
    return this;
  }

  public AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel addTicketsItem(TicketDetailInfo ticketsItem) {
    if (this.tickets == null) {
      this.tickets = new ArrayList<>();
    }
    this.tickets.add(ticketsItem);
    return this;
  }

   /**
   * 查询到的订单信息列表
   * @return tickets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "查询到的订单信息列表")

  public List<TicketDetailInfo> getTickets() {
    return tickets;
  }


  public void setTickets(List<TicketDetailInfo> tickets) {
    this.tickets = tickets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel alipayCommerceCityfacilitatorVoucherBatchqueryResponseModel = (AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel) o;
    return Objects.equals(this.tickets, alipayCommerceCityfacilitatorVoucherBatchqueryResponseModel.tickets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel {\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
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
    openapiFields.add("tickets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel is not found in the empty JSON string", AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraytickets = jsonObj.getAsJsonArray("tickets");
      if (jsonArraytickets != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tickets").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tickets` to be an array in the JSON string but got `%s`", jsonObj.get("tickets").toString()));
        }

        // validate the optional field `tickets` (array)
        for (int i = 0; i < jsonArraytickets.size(); i++) {
          TicketDetailInfo.validateJsonObject(jsonArraytickets.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel
  */
  public static AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceCityfacilitatorVoucherBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

