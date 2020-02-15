package com.ctrip.bbz.cdubbowbservice.api;

import com.ctriposs.baiji.exception.BaijiRuntimeException;
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
    "operatorNo",
    "loginKey",
    "employeeID",
    "deviceID",
    "operState"
})
public class OperatornoInfo implements SpecificRecord, Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    public static final transient Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"OperatornoInfo\",\"namespace\":\"" + OperatornoInfo.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"operatorNo\",\"type\":[\"string\",\"null\"]},{\"name\":\"loginKey\",\"type\":[\"string\",\"null\"]},{\"name\":\"employeeID\",\"type\":[\"string\",\"null\"]},{\"name\":\"deviceID\",\"type\":[\"string\",\"null\"]},{\"name\":\"operState\",\"type\":[{\"type\":\"enum\",\"name\":\"OperState\",\"namespace\":\"" + OperState.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"I\",\"O\",\"W\",\"D\",\"P\"]},\"null\"]}]}");

    @Override
    @JsonIgnore
    public Schema getSchema() { return SCHEMA; }

    public OperatornoInfo(
        String operatorNo,
        String loginKey,
        String employeeID,
        String deviceID,
        OperState operState) {
        this.operatorNo = operatorNo;
        this.loginKey = loginKey;
        this.employeeID = employeeID;
        this.deviceID = deviceID;
        this.operState = operState;
    }

    public OperatornoInfo() {
    }

    @JsonProperty("operatorNo") 
    public String operatorNo;

    @JsonProperty("loginKey") 
    public String loginKey;

    @JsonProperty("employeeID") 
    public String employeeID;

    @JsonProperty("deviceID") 
    public String deviceID;

    @JsonProperty("operState") 
    public OperState operState;

    public String getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(final String operatorNo) {
        this.operatorNo = operatorNo;
    }
    public String getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(final String loginKey) {
        this.loginKey = loginKey;
    }
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final String employeeID) {
        this.employeeID = employeeID;
    }
    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(final String deviceID) {
        this.deviceID = deviceID;
    }
    public OperState getOperState() {
        return operState;
    }

    public void setOperState(final OperState operState) {
        this.operState = operState;
    }

    // Used by DatumWriter. Applications should not call.
    public Object get(int fieldPos) {
        switch (fieldPos) {
            case 0: return this.operatorNo;
            case 1: return this.loginKey;
            case 2: return this.employeeID;
            case 3: return this.deviceID;
            case 4: return this.operState;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int fieldPos, Object fieldValue) {
        switch (fieldPos) {
            case 0: this.operatorNo = (String)fieldValue; break;
            case 1: this.loginKey = (String)fieldValue; break;
            case 2: this.employeeID = (String)fieldValue; break;
            case 3: this.deviceID = (String)fieldValue; break;
            case 4: this.operState = (OperState)fieldValue; break;
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

        final OperatornoInfo other = (OperatornoInfo)obj;
        return 
            Objects.equal(this.operatorNo, other.operatorNo) &&
            Objects.equal(this.loginKey, other.loginKey) &&
            Objects.equal(this.employeeID, other.employeeID) &&
            Objects.equal(this.deviceID, other.deviceID) &&
            Objects.equal(this.operState, other.operState);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (this.operatorNo == null ? 0 : this.operatorNo.hashCode());
        result = 31 * result + (this.loginKey == null ? 0 : this.loginKey.hashCode());
        result = 31 * result + (this.employeeID == null ? 0 : this.employeeID.hashCode());
        result = 31 * result + (this.deviceID == null ? 0 : this.deviceID.hashCode());
        result = 31 * result + (this.operState == null ? 0 : this.operState.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("operatorNo", operatorNo)
            .add("loginKey", loginKey)
            .add("employeeID", employeeID)
            .add("deviceID", deviceID)
            .add("operState", operState)
            .toString();
    }
}
