package com.ctrip.bbz.cdubbowbservice.api;

import com.ctriposs.baiji.exception.BaijiRuntimeException;
import com.ctriposs.baiji.rpc.common.*;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.ctriposs.baiji.schema.*;
import com.ctriposs.baiji.specific.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.io.Serializable;

@SuppressWarnings("all")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE) 
@JsonPropertyOrder({
    "responseStatus",
    "operatornoInfo"
})
public class OperatornoInfoResponseType implements SpecificRecord, HasResponseStatus, Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    public static final transient Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"OperatornoInfoResponseType\",\"namespace\":\"" + OperatornoInfoResponseType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"ResponseStatus\",\"type\":[{\"type\":\"record\",\"name\":\"ResponseStatusType\",\"namespace\":\"com.ctriposs.baiji.rpc.common.types\",\"doc\":null,\"fields\":[{\"name\":\"Timestamp\",\"type\":[\"datetime\",\"null\"]},{\"name\":\"Ack\",\"type\":[{\"type\":\"enum\",\"name\":\"AckCodeType\",\"namespace\":\"com.ctriposs.baiji.rpc.common.types\",\"doc\":null,\"symbols\":[\"Success\",\"Failure\",\"Warning\",\"PartialFailure\"]},\"null\"]},{\"name\":\"Errors\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ErrorDataType\",\"namespace\":\"com.ctriposs.baiji.rpc.common.types\",\"doc\":null,\"fields\":[{\"name\":\"Message\",\"type\":[\"string\",\"null\"]},{\"name\":\"ErrorCode\",\"type\":[\"string\",\"null\"]},{\"name\":\"StackTrace\",\"type\":[\"string\",\"null\"]},{\"name\":\"SeverityCode\",\"type\":[{\"type\":\"enum\",\"name\":\"SeverityCodeType\",\"namespace\":\"com.ctriposs.baiji.rpc.common.types\",\"doc\":null,\"symbols\":[\"Error\",\"Warning\"]},\"null\"]},{\"name\":\"ErrorFields\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ErrorFieldType\",\"namespace\":\"com.ctriposs.baiji.rpc.common.types\",\"doc\":null,\"fields\":[{\"name\":\"FieldName\",\"type\":[\"string\",\"null\"]},{\"name\":\"ErrorCode\",\"type\":[\"string\",\"null\"]},{\"name\":\"Message\",\"type\":[\"string\",\"null\"]}]}},\"null\"]},{\"name\":\"ErrorClassification\",\"type\":[{\"type\":\"enum\",\"name\":\"ErrorClassificationCodeType\",\"namespace\":\"com.ctriposs.baiji.rpc.common.types\",\"doc\":null,\"symbols\":[\"ServiceError\",\"ValidationError\",\"FrameworkError\",\"SLAError\",\"SecurityError\"]},\"null\"]}]}},\"null\"]},{\"name\":\"Build\",\"type\":[\"string\",\"null\"]},{\"name\":\"Version\",\"type\":[\"string\",\"null\"]},{\"name\":\"Extension\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ExtensionType\",\"namespace\":\"com.ctriposs.baiji.rpc.common.types\",\"doc\":null,\"fields\":[{\"name\":\"Id\",\"type\":[\"string\",\"null\"]},{\"name\":\"Version\",\"type\":[\"string\",\"null\"]},{\"name\":\"ContentType\",\"type\":[\"string\",\"null\"]},{\"name\":\"Value\",\"type\":[\"string\",\"null\"]}]}},\"null\"]}]},\"null\"]},{\"name\":\"operatornoInfo\",\"type\":[{\"type\":\"record\",\"name\":\"OperatornoInfo\",\"namespace\":\"" + OperatornoInfo.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"operatorNo\",\"type\":[\"string\",\"null\"]},{\"name\":\"loginKey\",\"type\":[\"string\",\"null\"]},{\"name\":\"employeeID\",\"type\":[\"string\",\"null\"]},{\"name\":\"deviceID\",\"type\":[\"string\",\"null\"]},{\"name\":\"operState\",\"type\":[{\"type\":\"enum\",\"name\":\"OperState\",\"namespace\":\"" + OperState.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"I\",\"O\",\"W\",\"D\",\"P\"]},\"null\"]}]},\"null\"]}]}");

    @Override
    @JsonIgnore
    public Schema getSchema() { return SCHEMA; }

    public OperatornoInfoResponseType(
        ResponseStatusType responseStatus,
        OperatornoInfo operatornoInfo) {
        this.responseStatus = responseStatus;
        this.operatornoInfo = operatornoInfo;
    }

    public OperatornoInfoResponseType() {
    }

    @JsonProperty("ResponseStatus") 
    public ResponseStatusType responseStatus;

    @JsonProperty("operatornoInfo") 
    public OperatornoInfo operatornoInfo;

    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(final ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }
    public OperatornoInfo getOperatornoInfo() {
        return operatornoInfo;
    }

    public void setOperatornoInfo(final OperatornoInfo operatornoInfo) {
        this.operatornoInfo = operatornoInfo;
    }

    // Used by DatumWriter. Applications should not call.
    public Object get(int fieldPos) {
        switch (fieldPos) {
            case 0: return this.responseStatus;
            case 1: return this.operatornoInfo;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int fieldPos, Object fieldValue) {
        switch (fieldPos) {
            case 0: this.responseStatus = (ResponseStatusType)fieldValue; break;
            case 1: this.operatornoInfo = (OperatornoInfo)fieldValue; break;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in put()");
        }
    }

    @Override
    public Object get(String fieldName) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return null;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        return field != null ? get(field.getPos()) : null;
    }

    @Override
    public void put(String fieldName, Object fieldValue) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        if (field != null) {
            put(field.getPos(), fieldValue);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final OperatornoInfoResponseType other = (OperatornoInfoResponseType)obj;
        return 
            Objects.equal(this.responseStatus, other.responseStatus) &&
            Objects.equal(this.operatornoInfo, other.operatornoInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (this.responseStatus == null ? 0 : this.responseStatus.hashCode());
        result = 31 * result + (this.operatornoInfo == null ? 0 : this.operatornoInfo.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("operatornoInfo", operatornoInfo)
            .toString();
    }
}
