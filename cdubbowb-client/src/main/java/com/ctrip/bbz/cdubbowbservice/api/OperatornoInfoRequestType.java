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
    "ani"
})
public class OperatornoInfoRequestType implements SpecificRecord, Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    public static final transient Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"OperatornoInfoRequestType\",\"namespace\":\"" + OperatornoInfoRequestType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"ani\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    @JsonIgnore
    public Schema getSchema() { return SCHEMA; }

    public OperatornoInfoRequestType(
        String ani) {
        this.ani = ani;
    }

    public OperatornoInfoRequestType() {
    }

    @JsonProperty("ani") 
    public String ani;

    public String getAni() {
        return ani;
    }

    public void setAni(final String ani) {
        this.ani = ani;
    }

    // Used by DatumWriter. Applications should not call.
    public Object get(int fieldPos) {
        switch (fieldPos) {
            case 0: return this.ani;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int fieldPos, Object fieldValue) {
        switch (fieldPos) {
            case 0: this.ani = (String)fieldValue; break;
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

        final OperatornoInfoRequestType other = (OperatornoInfoRequestType)obj;
        return 
            Objects.equal(this.ani, other.ani);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (this.ani == null ? 0 : this.ani.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("ani", ani)
            .toString();
    }
}
