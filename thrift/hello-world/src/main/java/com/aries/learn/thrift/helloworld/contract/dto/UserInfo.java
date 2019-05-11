/**
 * Autogenerated by Thrift Compiler (0.12.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.aries.learn.thrift.helloworld.contract.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-05-13")
public class UserInfo implements org.apache.thrift.TBase<UserInfo, UserInfo._Fields>, java.io.Serializable, Cloneable, Comparable<UserInfo> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserInfo");

    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.I32, (short) 2);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserInfoStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserInfoTupleSchemeFactory();

    public @org.apache.thrift.annotation.Nullable
    java.lang.String name; // required
    public int age; // required

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        NAME((short) 1, "name"),
        AGE((short) 2, "age");

        private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // NAME
                    return NAME;
                case 2: // AGE
                    return AGE;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByName(java.lang.String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final java.lang.String _fieldName;

        _Fields(short thriftId, java.lang.String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public java.lang.String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __AGE_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData("age", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserInfo.class, metaDataMap);
    }

    public UserInfo() {
    }

    public UserInfo(
            java.lang.String name,
            int age) {
        this();
        this.name = name;
        this.age = age;
        setAgeIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public UserInfo(UserInfo other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetName()) {
            this.name = other.name;
        }
        this.age = other.age;
    }

    public UserInfo deepCopy() {
        return new UserInfo(this);
    }

    @Override
    public void clear() {
        this.name = null;
        setAgeIsSet(false);
        this.age = 0;
    }

    @org.apache.thrift.annotation.Nullable
    public java.lang.String getName() {
        return this.name;
    }

    public UserInfo setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
        this.name = name;
        return this;
    }

    public void unsetName() {
        this.name = null;
    }

    /**
     * Returns true if field name is set (has been assigned a value) and false otherwise
     */
    public boolean isSetName() {
        return this.name != null;
    }

    public void setNameIsSet(boolean value) {
        if (!value) {
            this.name = null;
        }
    }

    public int getAge() {
        return this.age;
    }

    public UserInfo setAge(int age) {
        this.age = age;
        setAgeIsSet(true);
        return this;
    }

    public void unsetAge() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AGE_ISSET_ID);
    }

    /**
     * Returns true if field age is set (has been assigned a value) and false otherwise
     */
    public boolean isSetAge() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AGE_ISSET_ID);
    }

    public void setAgeIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AGE_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
        switch (field) {
            case NAME:
                if (value == null) {
                    unsetName();
                } else {
                    setName((java.lang.String) value);
                }
                break;

            case AGE:
                if (value == null) {
                    unsetAge();
                } else {
                    setAge((java.lang.Integer) value);
                }
                break;

        }
    }

    @org.apache.thrift.annotation.Nullable
    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case NAME:
                return getName();

            case AGE:
                return getAge();

        }
        throw new java.lang.IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new java.lang.IllegalArgumentException();
        }

        switch (field) {
            case NAME:
                return isSetName();
            case AGE:
                return isSetAge();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof UserInfo)
            return this.equals((UserInfo) that);
        return false;
    }

    public boolean equals(UserInfo that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name) {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        boolean this_present_age = true;
        boolean that_present_age = true;
        if (this_present_age || that_present_age) {
            if (!(this_present_age && that_present_age))
                return false;
            if (this.age != that.age)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
        if (isSetName())
            hashCode = hashCode * 8191 + name.hashCode();

        hashCode = hashCode * 8191 + age;

        return hashCode;
    }

    @Override
    public int compareTo(UserInfo other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetAge()).compareTo(other.isSetAge());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAge()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    @org.apache.thrift.annotation.Nullable
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserInfo(");
        boolean first = true;

        sb.append("name:");
        if (this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("age:");
        sb.append(this.age);
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class UserInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public UserInfoStandardScheme getScheme() {
            return new UserInfoStandardScheme();
        }
    }

    private static class UserInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserInfo> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, UserInfo struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // AGE
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.age = iprot.readI32();
                            struct.setAgeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, UserInfo struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.name != null) {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(AGE_FIELD_DESC);
            oprot.writeI32(struct.age);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class UserInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public UserInfoTupleScheme getScheme() {
            return new UserInfoTupleScheme();
        }
    }

    private static class UserInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserInfo> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, UserInfo struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetName()) {
                optionals.set(0);
            }
            if (struct.isSetAge()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetName()) {
                oprot.writeString(struct.name);
            }
            if (struct.isSetAge()) {
                oprot.writeI32(struct.age);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, UserInfo struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.name = iprot.readString();
                struct.setNameIsSet(true);
            }
            if (incoming.get(1)) {
                struct.age = iprot.readI32();
                struct.setAgeIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}

