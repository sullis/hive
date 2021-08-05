/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetProjectionsSpec implements org.apache.thrift.TBase<GetProjectionsSpec, GetProjectionsSpec._Fields>, java.io.Serializable, Cloneable, Comparable<GetProjectionsSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetProjectionsSpec");

  private static final org.apache.thrift.protocol.TField FIELD_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField INCLUDE_PARAM_KEY_PATTERN_FIELD_DESC = new org.apache.thrift.protocol.TField("includeParamKeyPattern", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXCLUDE_PARAM_KEY_PATTERN_FIELD_DESC = new org.apache.thrift.protocol.TField("excludeParamKeyPattern", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetProjectionsSpecStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetProjectionsSpecTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> fieldList; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String includeParamKeyPattern; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String excludeParamKeyPattern; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD_LIST((short)1, "fieldList"),
    INCLUDE_PARAM_KEY_PATTERN((short)2, "includeParamKeyPattern"),
    EXCLUDE_PARAM_KEY_PATTERN((short)3, "excludeParamKeyPattern");

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
      switch(fieldId) {
        case 1: // FIELD_LIST
          return FIELD_LIST;
        case 2: // INCLUDE_PARAM_KEY_PATTERN
          return INCLUDE_PARAM_KEY_PATTERN;
        case 3: // EXCLUDE_PARAM_KEY_PATTERN
          return EXCLUDE_PARAM_KEY_PATTERN;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD_LIST, new org.apache.thrift.meta_data.FieldMetaData("fieldList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.INCLUDE_PARAM_KEY_PATTERN, new org.apache.thrift.meta_data.FieldMetaData("includeParamKeyPattern", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXCLUDE_PARAM_KEY_PATTERN, new org.apache.thrift.meta_data.FieldMetaData("excludeParamKeyPattern", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetProjectionsSpec.class, metaDataMap);
  }

  public GetProjectionsSpec() {
  }

  public GetProjectionsSpec(
    java.util.List<java.lang.String> fieldList,
    java.lang.String includeParamKeyPattern,
    java.lang.String excludeParamKeyPattern)
  {
    this();
    this.fieldList = fieldList;
    this.includeParamKeyPattern = includeParamKeyPattern;
    this.excludeParamKeyPattern = excludeParamKeyPattern;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetProjectionsSpec(GetProjectionsSpec other) {
    if (other.isSetFieldList()) {
      java.util.List<java.lang.String> __this__fieldList = new java.util.ArrayList<java.lang.String>(other.fieldList);
      this.fieldList = __this__fieldList;
    }
    if (other.isSetIncludeParamKeyPattern()) {
      this.includeParamKeyPattern = other.includeParamKeyPattern;
    }
    if (other.isSetExcludeParamKeyPattern()) {
      this.excludeParamKeyPattern = other.excludeParamKeyPattern;
    }
  }

  public GetProjectionsSpec deepCopy() {
    return new GetProjectionsSpec(this);
  }

  @Override
  public void clear() {
    this.fieldList = null;
    this.includeParamKeyPattern = null;
    this.excludeParamKeyPattern = null;
  }

  public int getFieldListSize() {
    return (this.fieldList == null) ? 0 : this.fieldList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getFieldListIterator() {
    return (this.fieldList == null) ? null : this.fieldList.iterator();
  }

  public void addToFieldList(java.lang.String elem) {
    if (this.fieldList == null) {
      this.fieldList = new java.util.ArrayList<java.lang.String>();
    }
    this.fieldList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getFieldList() {
    return this.fieldList;
  }

  public void setFieldList(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> fieldList) {
    this.fieldList = fieldList;
  }

  public void unsetFieldList() {
    this.fieldList = null;
  }

  /** Returns true if field fieldList is set (has been assigned a value) and false otherwise */
  public boolean isSetFieldList() {
    return this.fieldList != null;
  }

  public void setFieldListIsSet(boolean value) {
    if (!value) {
      this.fieldList = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getIncludeParamKeyPattern() {
    return this.includeParamKeyPattern;
  }

  public void setIncludeParamKeyPattern(@org.apache.thrift.annotation.Nullable java.lang.String includeParamKeyPattern) {
    this.includeParamKeyPattern = includeParamKeyPattern;
  }

  public void unsetIncludeParamKeyPattern() {
    this.includeParamKeyPattern = null;
  }

  /** Returns true if field includeParamKeyPattern is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeParamKeyPattern() {
    return this.includeParamKeyPattern != null;
  }

  public void setIncludeParamKeyPatternIsSet(boolean value) {
    if (!value) {
      this.includeParamKeyPattern = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getExcludeParamKeyPattern() {
    return this.excludeParamKeyPattern;
  }

  public void setExcludeParamKeyPattern(@org.apache.thrift.annotation.Nullable java.lang.String excludeParamKeyPattern) {
    this.excludeParamKeyPattern = excludeParamKeyPattern;
  }

  public void unsetExcludeParamKeyPattern() {
    this.excludeParamKeyPattern = null;
  }

  /** Returns true if field excludeParamKeyPattern is set (has been assigned a value) and false otherwise */
  public boolean isSetExcludeParamKeyPattern() {
    return this.excludeParamKeyPattern != null;
  }

  public void setExcludeParamKeyPatternIsSet(boolean value) {
    if (!value) {
      this.excludeParamKeyPattern = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FIELD_LIST:
      if (value == null) {
        unsetFieldList();
      } else {
        setFieldList((java.util.List<java.lang.String>)value);
      }
      break;

    case INCLUDE_PARAM_KEY_PATTERN:
      if (value == null) {
        unsetIncludeParamKeyPattern();
      } else {
        setIncludeParamKeyPattern((java.lang.String)value);
      }
      break;

    case EXCLUDE_PARAM_KEY_PATTERN:
      if (value == null) {
        unsetExcludeParamKeyPattern();
      } else {
        setExcludeParamKeyPattern((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD_LIST:
      return getFieldList();

    case INCLUDE_PARAM_KEY_PATTERN:
      return getIncludeParamKeyPattern();

    case EXCLUDE_PARAM_KEY_PATTERN:
      return getExcludeParamKeyPattern();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FIELD_LIST:
      return isSetFieldList();
    case INCLUDE_PARAM_KEY_PATTERN:
      return isSetIncludeParamKeyPattern();
    case EXCLUDE_PARAM_KEY_PATTERN:
      return isSetExcludeParamKeyPattern();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetProjectionsSpec)
      return this.equals((GetProjectionsSpec)that);
    return false;
  }

  public boolean equals(GetProjectionsSpec that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fieldList = true && this.isSetFieldList();
    boolean that_present_fieldList = true && that.isSetFieldList();
    if (this_present_fieldList || that_present_fieldList) {
      if (!(this_present_fieldList && that_present_fieldList))
        return false;
      if (!this.fieldList.equals(that.fieldList))
        return false;
    }

    boolean this_present_includeParamKeyPattern = true && this.isSetIncludeParamKeyPattern();
    boolean that_present_includeParamKeyPattern = true && that.isSetIncludeParamKeyPattern();
    if (this_present_includeParamKeyPattern || that_present_includeParamKeyPattern) {
      if (!(this_present_includeParamKeyPattern && that_present_includeParamKeyPattern))
        return false;
      if (!this.includeParamKeyPattern.equals(that.includeParamKeyPattern))
        return false;
    }

    boolean this_present_excludeParamKeyPattern = true && this.isSetExcludeParamKeyPattern();
    boolean that_present_excludeParamKeyPattern = true && that.isSetExcludeParamKeyPattern();
    if (this_present_excludeParamKeyPattern || that_present_excludeParamKeyPattern) {
      if (!(this_present_excludeParamKeyPattern && that_present_excludeParamKeyPattern))
        return false;
      if (!this.excludeParamKeyPattern.equals(that.excludeParamKeyPattern))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFieldList()) ? 131071 : 524287);
    if (isSetFieldList())
      hashCode = hashCode * 8191 + fieldList.hashCode();

    hashCode = hashCode * 8191 + ((isSetIncludeParamKeyPattern()) ? 131071 : 524287);
    if (isSetIncludeParamKeyPattern())
      hashCode = hashCode * 8191 + includeParamKeyPattern.hashCode();

    hashCode = hashCode * 8191 + ((isSetExcludeParamKeyPattern()) ? 131071 : 524287);
    if (isSetExcludeParamKeyPattern())
      hashCode = hashCode * 8191 + excludeParamKeyPattern.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetProjectionsSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetFieldList(), other.isSetFieldList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFieldList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fieldList, other.fieldList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIncludeParamKeyPattern(), other.isSetIncludeParamKeyPattern());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeParamKeyPattern()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeParamKeyPattern, other.includeParamKeyPattern);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetExcludeParamKeyPattern(), other.isSetExcludeParamKeyPattern());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExcludeParamKeyPattern()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.excludeParamKeyPattern, other.excludeParamKeyPattern);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetProjectionsSpec(");
    boolean first = true;

    sb.append("fieldList:");
    if (this.fieldList == null) {
      sb.append("null");
    } else {
      sb.append(this.fieldList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("includeParamKeyPattern:");
    if (this.includeParamKeyPattern == null) {
      sb.append("null");
    } else {
      sb.append(this.includeParamKeyPattern);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("excludeParamKeyPattern:");
    if (this.excludeParamKeyPattern == null) {
      sb.append("null");
    } else {
      sb.append(this.excludeParamKeyPattern);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetProjectionsSpecStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetProjectionsSpecStandardScheme getScheme() {
      return new GetProjectionsSpecStandardScheme();
    }
  }

  private static class GetProjectionsSpecStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetProjectionsSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetProjectionsSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1052 = iprot.readListBegin();
                struct.fieldList = new java.util.ArrayList<java.lang.String>(_list1052.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1053;
                for (int _i1054 = 0; _i1054 < _list1052.size; ++_i1054)
                {
                  _elem1053 = iprot.readString();
                  struct.fieldList.add(_elem1053);
                }
                iprot.readListEnd();
              }
              struct.setFieldListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INCLUDE_PARAM_KEY_PATTERN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.includeParamKeyPattern = iprot.readString();
              struct.setIncludeParamKeyPatternIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXCLUDE_PARAM_KEY_PATTERN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.excludeParamKeyPattern = iprot.readString();
              struct.setExcludeParamKeyPatternIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetProjectionsSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fieldList != null) {
        oprot.writeFieldBegin(FIELD_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.fieldList.size()));
          for (java.lang.String _iter1055 : struct.fieldList)
          {
            oprot.writeString(_iter1055);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.includeParamKeyPattern != null) {
        oprot.writeFieldBegin(INCLUDE_PARAM_KEY_PATTERN_FIELD_DESC);
        oprot.writeString(struct.includeParamKeyPattern);
        oprot.writeFieldEnd();
      }
      if (struct.excludeParamKeyPattern != null) {
        oprot.writeFieldBegin(EXCLUDE_PARAM_KEY_PATTERN_FIELD_DESC);
        oprot.writeString(struct.excludeParamKeyPattern);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetProjectionsSpecTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetProjectionsSpecTupleScheme getScheme() {
      return new GetProjectionsSpecTupleScheme();
    }
  }

  private static class GetProjectionsSpecTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetProjectionsSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetProjectionsSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFieldList()) {
        optionals.set(0);
      }
      if (struct.isSetIncludeParamKeyPattern()) {
        optionals.set(1);
      }
      if (struct.isSetExcludeParamKeyPattern()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetFieldList()) {
        {
          oprot.writeI32(struct.fieldList.size());
          for (java.lang.String _iter1056 : struct.fieldList)
          {
            oprot.writeString(_iter1056);
          }
        }
      }
      if (struct.isSetIncludeParamKeyPattern()) {
        oprot.writeString(struct.includeParamKeyPattern);
      }
      if (struct.isSetExcludeParamKeyPattern()) {
        oprot.writeString(struct.excludeParamKeyPattern);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetProjectionsSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list1057 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.fieldList = new java.util.ArrayList<java.lang.String>(_list1057.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1058;
          for (int _i1059 = 0; _i1059 < _list1057.size; ++_i1059)
          {
            _elem1058 = iprot.readString();
            struct.fieldList.add(_elem1058);
          }
        }
        struct.setFieldListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.includeParamKeyPattern = iprot.readString();
        struct.setIncludeParamKeyPatternIsSet(true);
      }
      if (incoming.get(2)) {
        struct.excludeParamKeyPattern = iprot.readString();
        struct.setExcludeParamKeyPatternIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

