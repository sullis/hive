/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetDatabaseRequest implements org.apache.thrift.TBase<GetDatabaseRequest, GetDatabaseRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetDatabaseRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetDatabaseRequest");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CATALOG_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catalogName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PROCESSOR_CAPABILITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("processorCapabilities", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PROCESSOR_IDENTIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("processorIdentifier", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetDatabaseRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetDatabaseRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String catalogName; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> processorCapabilities; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String processorIdentifier; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    CATALOG_NAME((short)2, "catalogName"),
    PROCESSOR_CAPABILITIES((short)3, "processorCapabilities"),
    PROCESSOR_IDENTIFIER((short)4, "processorIdentifier");

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
        case 1: // NAME
          return NAME;
        case 2: // CATALOG_NAME
          return CATALOG_NAME;
        case 3: // PROCESSOR_CAPABILITIES
          return PROCESSOR_CAPABILITIES;
        case 4: // PROCESSOR_IDENTIFIER
          return PROCESSOR_IDENTIFIER;
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
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.CATALOG_NAME,_Fields.PROCESSOR_CAPABILITIES,_Fields.PROCESSOR_IDENTIFIER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CATALOG_NAME, new org.apache.thrift.meta_data.FieldMetaData("catalogName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROCESSOR_CAPABILITIES, new org.apache.thrift.meta_data.FieldMetaData("processorCapabilities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PROCESSOR_IDENTIFIER, new org.apache.thrift.meta_data.FieldMetaData("processorIdentifier", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetDatabaseRequest.class, metaDataMap);
  }

  public GetDatabaseRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetDatabaseRequest(GetDatabaseRequest other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetCatalogName()) {
      this.catalogName = other.catalogName;
    }
    if (other.isSetProcessorCapabilities()) {
      java.util.List<java.lang.String> __this__processorCapabilities = new java.util.ArrayList<java.lang.String>(other.processorCapabilities);
      this.processorCapabilities = __this__processorCapabilities;
    }
    if (other.isSetProcessorIdentifier()) {
      this.processorIdentifier = other.processorIdentifier;
    }
  }

  public GetDatabaseRequest deepCopy() {
    return new GetDatabaseRequest(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.catalogName = null;
    this.processorCapabilities = null;
    this.processorIdentifier = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public void setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatalogName() {
    return this.catalogName;
  }

  public void setCatalogName(@org.apache.thrift.annotation.Nullable java.lang.String catalogName) {
    this.catalogName = catalogName;
  }

  public void unsetCatalogName() {
    this.catalogName = null;
  }

  /** Returns true if field catalogName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalogName() {
    return this.catalogName != null;
  }

  public void setCatalogNameIsSet(boolean value) {
    if (!value) {
      this.catalogName = null;
    }
  }

  public int getProcessorCapabilitiesSize() {
    return (this.processorCapabilities == null) ? 0 : this.processorCapabilities.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getProcessorCapabilitiesIterator() {
    return (this.processorCapabilities == null) ? null : this.processorCapabilities.iterator();
  }

  public void addToProcessorCapabilities(java.lang.String elem) {
    if (this.processorCapabilities == null) {
      this.processorCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.processorCapabilities.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getProcessorCapabilities() {
    return this.processorCapabilities;
  }

  public void setProcessorCapabilities(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> processorCapabilities) {
    this.processorCapabilities = processorCapabilities;
  }

  public void unsetProcessorCapabilities() {
    this.processorCapabilities = null;
  }

  /** Returns true if field processorCapabilities is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessorCapabilities() {
    return this.processorCapabilities != null;
  }

  public void setProcessorCapabilitiesIsSet(boolean value) {
    if (!value) {
      this.processorCapabilities = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getProcessorIdentifier() {
    return this.processorIdentifier;
  }

  public void setProcessorIdentifier(@org.apache.thrift.annotation.Nullable java.lang.String processorIdentifier) {
    this.processorIdentifier = processorIdentifier;
  }

  public void unsetProcessorIdentifier() {
    this.processorIdentifier = null;
  }

  /** Returns true if field processorIdentifier is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessorIdentifier() {
    return this.processorIdentifier != null;
  }

  public void setProcessorIdentifierIsSet(boolean value) {
    if (!value) {
      this.processorIdentifier = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case CATALOG_NAME:
      if (value == null) {
        unsetCatalogName();
      } else {
        setCatalogName((java.lang.String)value);
      }
      break;

    case PROCESSOR_CAPABILITIES:
      if (value == null) {
        unsetProcessorCapabilities();
      } else {
        setProcessorCapabilities((java.util.List<java.lang.String>)value);
      }
      break;

    case PROCESSOR_IDENTIFIER:
      if (value == null) {
        unsetProcessorIdentifier();
      } else {
        setProcessorIdentifier((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case CATALOG_NAME:
      return getCatalogName();

    case PROCESSOR_CAPABILITIES:
      return getProcessorCapabilities();

    case PROCESSOR_IDENTIFIER:
      return getProcessorIdentifier();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case CATALOG_NAME:
      return isSetCatalogName();
    case PROCESSOR_CAPABILITIES:
      return isSetProcessorCapabilities();
    case PROCESSOR_IDENTIFIER:
      return isSetProcessorIdentifier();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetDatabaseRequest)
      return this.equals((GetDatabaseRequest)that);
    return false;
  }

  public boolean equals(GetDatabaseRequest that) {
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

    boolean this_present_catalogName = true && this.isSetCatalogName();
    boolean that_present_catalogName = true && that.isSetCatalogName();
    if (this_present_catalogName || that_present_catalogName) {
      if (!(this_present_catalogName && that_present_catalogName))
        return false;
      if (!this.catalogName.equals(that.catalogName))
        return false;
    }

    boolean this_present_processorCapabilities = true && this.isSetProcessorCapabilities();
    boolean that_present_processorCapabilities = true && that.isSetProcessorCapabilities();
    if (this_present_processorCapabilities || that_present_processorCapabilities) {
      if (!(this_present_processorCapabilities && that_present_processorCapabilities))
        return false;
      if (!this.processorCapabilities.equals(that.processorCapabilities))
        return false;
    }

    boolean this_present_processorIdentifier = true && this.isSetProcessorIdentifier();
    boolean that_present_processorIdentifier = true && that.isSetProcessorIdentifier();
    if (this_present_processorIdentifier || that_present_processorIdentifier) {
      if (!(this_present_processorIdentifier && that_present_processorIdentifier))
        return false;
      if (!this.processorIdentifier.equals(that.processorIdentifier))
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

    hashCode = hashCode * 8191 + ((isSetCatalogName()) ? 131071 : 524287);
    if (isSetCatalogName())
      hashCode = hashCode * 8191 + catalogName.hashCode();

    hashCode = hashCode * 8191 + ((isSetProcessorCapabilities()) ? 131071 : 524287);
    if (isSetProcessorCapabilities())
      hashCode = hashCode * 8191 + processorCapabilities.hashCode();

    hashCode = hashCode * 8191 + ((isSetProcessorIdentifier()) ? 131071 : 524287);
    if (isSetProcessorIdentifier())
      hashCode = hashCode * 8191 + processorIdentifier.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetDatabaseRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCatalogName(), other.isSetCatalogName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalogName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalogName, other.catalogName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetProcessorCapabilities(), other.isSetProcessorCapabilities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessorCapabilities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processorCapabilities, other.processorCapabilities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetProcessorIdentifier(), other.isSetProcessorIdentifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessorIdentifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processorIdentifier, other.processorIdentifier);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetDatabaseRequest(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetCatalogName()) {
      if (!first) sb.append(", ");
      sb.append("catalogName:");
      if (this.catalogName == null) {
        sb.append("null");
      } else {
        sb.append(this.catalogName);
      }
      first = false;
    }
    if (isSetProcessorCapabilities()) {
      if (!first) sb.append(", ");
      sb.append("processorCapabilities:");
      if (this.processorCapabilities == null) {
        sb.append("null");
      } else {
        sb.append(this.processorCapabilities);
      }
      first = false;
    }
    if (isSetProcessorIdentifier()) {
      if (!first) sb.append(", ");
      sb.append("processorIdentifier:");
      if (this.processorIdentifier == null) {
        sb.append("null");
      } else {
        sb.append(this.processorIdentifier);
      }
      first = false;
    }
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

  private static class GetDatabaseRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetDatabaseRequestStandardScheme getScheme() {
      return new GetDatabaseRequestStandardScheme();
    }
  }

  private static class GetDatabaseRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetDatabaseRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetDatabaseRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
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
          case 2: // CATALOG_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalogName = iprot.readString();
              struct.setCatalogNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROCESSOR_CAPABILITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1116 = iprot.readListBegin();
                struct.processorCapabilities = new java.util.ArrayList<java.lang.String>(_list1116.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1117;
                for (int _i1118 = 0; _i1118 < _list1116.size; ++_i1118)
                {
                  _elem1117 = iprot.readString();
                  struct.processorCapabilities.add(_elem1117);
                }
                iprot.readListEnd();
              }
              struct.setProcessorCapabilitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROCESSOR_IDENTIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.processorIdentifier = iprot.readString();
              struct.setProcessorIdentifierIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetDatabaseRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.catalogName != null) {
        if (struct.isSetCatalogName()) {
          oprot.writeFieldBegin(CATALOG_NAME_FIELD_DESC);
          oprot.writeString(struct.catalogName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.processorCapabilities != null) {
        if (struct.isSetProcessorCapabilities()) {
          oprot.writeFieldBegin(PROCESSOR_CAPABILITIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.processorCapabilities.size()));
            for (java.lang.String _iter1119 : struct.processorCapabilities)
            {
              oprot.writeString(_iter1119);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.processorIdentifier != null) {
        if (struct.isSetProcessorIdentifier()) {
          oprot.writeFieldBegin(PROCESSOR_IDENTIFIER_FIELD_DESC);
          oprot.writeString(struct.processorIdentifier);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetDatabaseRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetDatabaseRequestTupleScheme getScheme() {
      return new GetDatabaseRequestTupleScheme();
    }
  }

  private static class GetDatabaseRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetDatabaseRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetDatabaseRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetCatalogName()) {
        optionals.set(1);
      }
      if (struct.isSetProcessorCapabilities()) {
        optionals.set(2);
      }
      if (struct.isSetProcessorIdentifier()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetCatalogName()) {
        oprot.writeString(struct.catalogName);
      }
      if (struct.isSetProcessorCapabilities()) {
        {
          oprot.writeI32(struct.processorCapabilities.size());
          for (java.lang.String _iter1120 : struct.processorCapabilities)
          {
            oprot.writeString(_iter1120);
          }
        }
      }
      if (struct.isSetProcessorIdentifier()) {
        oprot.writeString(struct.processorIdentifier);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetDatabaseRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.catalogName = iprot.readString();
        struct.setCatalogNameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list1121 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.processorCapabilities = new java.util.ArrayList<java.lang.String>(_list1121.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1122;
          for (int _i1123 = 0; _i1123 < _list1121.size; ++_i1123)
          {
            _elem1122 = iprot.readString();
            struct.processorCapabilities.add(_elem1122);
          }
        }
        struct.setProcessorCapabilitiesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.processorIdentifier = iprot.readString();
        struct.setProcessorIdentifierIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

