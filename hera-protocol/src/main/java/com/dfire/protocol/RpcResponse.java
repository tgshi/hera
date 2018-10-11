// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response.proto

package com.dfire.protocol;

public final class RpcResponse {
  private RpcResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *状态码
     * </pre>
     *
     * <code>required .Status statusEnum = 1;</code>
     */
    boolean hasStatusEnum();
    /**
     * <pre>
     *状态码
     * </pre>
     *
     * <code>required .Status statusEnum = 1;</code>
     */
    com.dfire.protocol.ResponseStatus.Status getStatusEnum();

    /**
     * <pre>
     *request id,响应时原封不动返回,提供给client配对.
     * </pre>
     *
     * <code>required sint32 rid = 2;</code>
     */
    boolean hasRid();
    /**
     * <pre>
     *request id,响应时原封不动返回,提供给client配对.
     * </pre>
     *
     * <code>required sint32 rid = 2;</code>
     */
    int getRid();

    /**
     * <code>required .Operate operate = 3;</code>
     */
    boolean hasOperate();
    /**
     * <code>required .Operate operate = 3;</code>
     */
    com.dfire.protocol.RpcOperate.Operate getOperate();

    /**
     * <pre>
     *如果出错,会有出错信息.纯文本形式.client自行包装
     * </pre>
     *
     * <code>optional string errorText = 4;</code>
     */
    boolean hasErrorText();
    /**
     * <pre>
     *如果出错,会有出错信息.纯文本形式.client自行包装
     * </pre>
     *
     * <code>optional string errorText = 4;</code>
     */
    java.lang.String getErrorText();
    /**
     * <pre>
     *如果出错,会有出错信息.纯文本形式.client自行包装
     * </pre>
     *
     * <code>optional string errorText = 4;</code>
     */
    com.google.protobuf.ByteString
        getErrorTextBytes();

    /**
     * <pre>
     *响应体
     * </pre>
     *
     * <code>optional bytes body = 5;</code>
     */
    boolean hasBody();
    /**
     * <pre>
     *响应体
     * </pre>
     *
     * <code>optional bytes body = 5;</code>
     */
    com.google.protobuf.ByteString getBody();
  }
  /**
   * <pre>
   *rpc 请求响应体
   * </pre>
   *
   * Protobuf type {@code Response}
   */
  public  static final class Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Response)
      ResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Response() {
      statusEnum_ = 0;
      rid_ = 0;
      operate_ = 0;
      errorText_ = "";
      body_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              com.dfire.protocol.ResponseStatus.Status value = com.dfire.protocol.ResponseStatus.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                statusEnum_ = rawValue;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              rid_ = input.readSInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              com.dfire.protocol.RpcOperate.Operate value = com.dfire.protocol.RpcOperate.Operate.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                operate_ = rawValue;
              }
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              errorText_ = bs;
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              body_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dfire.protocol.RpcResponse.internal_static_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dfire.protocol.RpcResponse.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dfire.protocol.RpcResponse.Response.class, com.dfire.protocol.RpcResponse.Response.Builder.class);
    }

    private int bitField0_;
    public static final int STATUSENUM_FIELD_NUMBER = 1;
    private int statusEnum_;
    /**
     * <pre>
     *状态码
     * </pre>
     *
     * <code>required .Status statusEnum = 1;</code>
     */
    public boolean hasStatusEnum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *状态码
     * </pre>
     *
     * <code>required .Status statusEnum = 1;</code>
     */
    public com.dfire.protocol.ResponseStatus.Status getStatusEnum() {
      @SuppressWarnings("deprecation")
      com.dfire.protocol.ResponseStatus.Status result = com.dfire.protocol.ResponseStatus.Status.valueOf(statusEnum_);
      return result == null ? com.dfire.protocol.ResponseStatus.Status.OK : result;
    }

    public static final int RID_FIELD_NUMBER = 2;
    private int rid_;
    /**
     * <pre>
     *request id,响应时原封不动返回,提供给client配对.
     * </pre>
     *
     * <code>required sint32 rid = 2;</code>
     */
    public boolean hasRid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *request id,响应时原封不动返回,提供给client配对.
     * </pre>
     *
     * <code>required sint32 rid = 2;</code>
     */
    public int getRid() {
      return rid_;
    }

    public static final int OPERATE_FIELD_NUMBER = 3;
    private int operate_;
    /**
     * <code>required .Operate operate = 3;</code>
     */
    public boolean hasOperate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .Operate operate = 3;</code>
     */
    public com.dfire.protocol.RpcOperate.Operate getOperate() {
      @SuppressWarnings("deprecation")
      com.dfire.protocol.RpcOperate.Operate result = com.dfire.protocol.RpcOperate.Operate.valueOf(operate_);
      return result == null ? com.dfire.protocol.RpcOperate.Operate.HeartBeat : result;
    }

    public static final int ERRORTEXT_FIELD_NUMBER = 4;
    private volatile java.lang.Object errorText_;
    /**
     * <pre>
     *如果出错,会有出错信息.纯文本形式.client自行包装
     * </pre>
     *
     * <code>optional string errorText = 4;</code>
     */
    public boolean hasErrorText() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <pre>
     *如果出错,会有出错信息.纯文本形式.client自行包装
     * </pre>
     *
     * <code>optional string errorText = 4;</code>
     */
    public java.lang.String getErrorText() {
      java.lang.Object ref = errorText_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorText_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     *如果出错,会有出错信息.纯文本形式.client自行包装
     * </pre>
     *
     * <code>optional string errorText = 4;</code>
     */
    public com.google.protobuf.ByteString
        getErrorTextBytes() {
      java.lang.Object ref = errorText_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BODY_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString body_;
    /**
     * <pre>
     *响应体
     * </pre>
     *
     * <code>optional bytes body = 5;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <pre>
     *响应体
     * </pre>
     *
     * <code>optional bytes body = 5;</code>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasStatusEnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOperate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, statusEnum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSInt32(2, rid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, operate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, errorText_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, body_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, statusEnum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(2, rid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, operate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, errorText_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, body_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.dfire.protocol.RpcResponse.Response)) {
        return super.equals(obj);
      }
      com.dfire.protocol.RpcResponse.Response other = (com.dfire.protocol.RpcResponse.Response) obj;

      boolean result = true;
      result = result && (hasStatusEnum() == other.hasStatusEnum());
      if (hasStatusEnum()) {
        result = result && statusEnum_ == other.statusEnum_;
      }
      result = result && (hasRid() == other.hasRid());
      if (hasRid()) {
        result = result && (getRid()
            == other.getRid());
      }
      result = result && (hasOperate() == other.hasOperate());
      if (hasOperate()) {
        result = result && operate_ == other.operate_;
      }
      result = result && (hasErrorText() == other.hasErrorText());
      if (hasErrorText()) {
        result = result && getErrorText()
            .equals(other.getErrorText());
      }
      result = result && (hasBody() == other.hasBody());
      if (hasBody()) {
        result = result && getBody()
            .equals(other.getBody());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasStatusEnum()) {
        hash = (37 * hash) + STATUSENUM_FIELD_NUMBER;
        hash = (53 * hash) + statusEnum_;
      }
      if (hasRid()) {
        hash = (37 * hash) + RID_FIELD_NUMBER;
        hash = (53 * hash) + getRid();
      }
      if (hasOperate()) {
        hash = (37 * hash) + OPERATE_FIELD_NUMBER;
        hash = (53 * hash) + operate_;
      }
      if (hasErrorText()) {
        hash = (37 * hash) + ERRORTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getErrorText().hashCode();
      }
      if (hasBody()) {
        hash = (37 * hash) + BODY_FIELD_NUMBER;
        hash = (53 * hash) + getBody().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcResponse.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcResponse.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcResponse.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.dfire.protocol.RpcResponse.Response prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *rpc 请求响应体
     * </pre>
     *
     * Protobuf type {@code Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Response)
        com.dfire.protocol.RpcResponse.ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dfire.protocol.RpcResponse.internal_static_Response_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dfire.protocol.RpcResponse.internal_static_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dfire.protocol.RpcResponse.Response.class, com.dfire.protocol.RpcResponse.Response.Builder.class);
      }

      // Construct using com.dfire.protocol.RpcResponse.Response.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        statusEnum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        rid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        operate_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        errorText_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        body_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dfire.protocol.RpcResponse.internal_static_Response_descriptor;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcResponse.Response getDefaultInstanceForType() {
        return com.dfire.protocol.RpcResponse.Response.getDefaultInstance();
      }

      @java.lang.Override
      public com.dfire.protocol.RpcResponse.Response build() {
        com.dfire.protocol.RpcResponse.Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcResponse.Response buildPartial() {
        com.dfire.protocol.RpcResponse.Response result = new com.dfire.protocol.RpcResponse.Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.statusEnum_ = statusEnum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.rid_ = rid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.operate_ = operate_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.errorText_ = errorText_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.body_ = body_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dfire.protocol.RpcResponse.Response) {
          return mergeFrom((com.dfire.protocol.RpcResponse.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dfire.protocol.RpcResponse.Response other) {
        if (other == com.dfire.protocol.RpcResponse.Response.getDefaultInstance()) return this;
        if (other.hasStatusEnum()) {
          setStatusEnum(other.getStatusEnum());
        }
        if (other.hasRid()) {
          setRid(other.getRid());
        }
        if (other.hasOperate()) {
          setOperate(other.getOperate());
        }
        if (other.hasErrorText()) {
          bitField0_ |= 0x00000008;
          errorText_ = other.errorText_;
          onChanged();
        }
        if (other.hasBody()) {
          setBody(other.getBody());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasStatusEnum()) {
          return false;
        }
        if (!hasRid()) {
          return false;
        }
        if (!hasOperate()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dfire.protocol.RpcResponse.Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dfire.protocol.RpcResponse.Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int statusEnum_ = 0;
      /**
       * <pre>
       *状态码
       * </pre>
       *
       * <code>required .Status statusEnum = 1;</code>
       */
      public boolean hasStatusEnum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       *状态码
       * </pre>
       *
       * <code>required .Status statusEnum = 1;</code>
       */
      public com.dfire.protocol.ResponseStatus.Status getStatusEnum() {
        @SuppressWarnings("deprecation")
        com.dfire.protocol.ResponseStatus.Status result = com.dfire.protocol.ResponseStatus.Status.valueOf(statusEnum_);
        return result == null ? com.dfire.protocol.ResponseStatus.Status.OK : result;
      }
      /**
       * <pre>
       *状态码
       * </pre>
       *
       * <code>required .Status statusEnum = 1;</code>
       */
      public Builder setStatusEnum(com.dfire.protocol.ResponseStatus.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        statusEnum_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *状态码
       * </pre>
       *
       * <code>required .Status statusEnum = 1;</code>
       */
      public Builder clearStatusEnum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        statusEnum_ = 0;
        onChanged();
        return this;
      }

      private int rid_ ;
      /**
       * <pre>
       *request id,响应时原封不动返回,提供给client配对.
       * </pre>
       *
       * <code>required sint32 rid = 2;</code>
       */
      public boolean hasRid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       *request id,响应时原封不动返回,提供给client配对.
       * </pre>
       *
       * <code>required sint32 rid = 2;</code>
       */
      public int getRid() {
        return rid_;
      }
      /**
       * <pre>
       *request id,响应时原封不动返回,提供给client配对.
       * </pre>
       *
       * <code>required sint32 rid = 2;</code>
       */
      public Builder setRid(int value) {
        bitField0_ |= 0x00000002;
        rid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *request id,响应时原封不动返回,提供给client配对.
       * </pre>
       *
       * <code>required sint32 rid = 2;</code>
       */
      public Builder clearRid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rid_ = 0;
        onChanged();
        return this;
      }

      private int operate_ = 0;
      /**
       * <code>required .Operate operate = 3;</code>
       */
      public boolean hasOperate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .Operate operate = 3;</code>
       */
      public com.dfire.protocol.RpcOperate.Operate getOperate() {
        @SuppressWarnings("deprecation")
        com.dfire.protocol.RpcOperate.Operate result = com.dfire.protocol.RpcOperate.Operate.valueOf(operate_);
        return result == null ? com.dfire.protocol.RpcOperate.Operate.HeartBeat : result;
      }
      /**
       * <code>required .Operate operate = 3;</code>
       */
      public Builder setOperate(com.dfire.protocol.RpcOperate.Operate value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        operate_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .Operate operate = 3;</code>
       */
      public Builder clearOperate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        operate_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object errorText_ = "";
      /**
       * <pre>
       *如果出错,会有出错信息.纯文本形式.client自行包装
       * </pre>
       *
       * <code>optional string errorText = 4;</code>
       */
      public boolean hasErrorText() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <pre>
       *如果出错,会有出错信息.纯文本形式.client自行包装
       * </pre>
       *
       * <code>optional string errorText = 4;</code>
       */
      public java.lang.String getErrorText() {
        java.lang.Object ref = errorText_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            errorText_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *如果出错,会有出错信息.纯文本形式.client自行包装
       * </pre>
       *
       * <code>optional string errorText = 4;</code>
       */
      public com.google.protobuf.ByteString
          getErrorTextBytes() {
        java.lang.Object ref = errorText_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorText_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *如果出错,会有出错信息.纯文本形式.client自行包装
       * </pre>
       *
       * <code>optional string errorText = 4;</code>
       */
      public Builder setErrorText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        errorText_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *如果出错,会有出错信息.纯文本形式.client自行包装
       * </pre>
       *
       * <code>optional string errorText = 4;</code>
       */
      public Builder clearErrorText() {
        bitField0_ = (bitField0_ & ~0x00000008);
        errorText_ = getDefaultInstance().getErrorText();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *如果出错,会有出错信息.纯文本形式.client自行包装
       * </pre>
       *
       * <code>optional string errorText = 4;</code>
       */
      public Builder setErrorTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        errorText_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *响应体
       * </pre>
       *
       * <code>optional bytes body = 5;</code>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <pre>
       *响应体
       * </pre>
       *
       * <code>optional bytes body = 5;</code>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }
      /**
       * <pre>
       *响应体
       * </pre>
       *
       * <code>optional bytes body = 5;</code>
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *响应体
       * </pre>
       *
       * <code>optional bytes body = 5;</code>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~0x00000010);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Response)
    }

    // @@protoc_insertion_point(class_scope:Response)
    private static final com.dfire.protocol.RpcResponse.Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.dfire.protocol.RpcResponse.Response();
    }

    public static com.dfire.protocol.RpcResponse.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Response>
        PARSER = new com.google.protobuf.AbstractParser<Response>() {
      @java.lang.Override
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Response> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.dfire.protocol.RpcResponse.Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016response.proto\032\014status.proto\032\roperate." +
      "proto\"p\n\010Response\022\033\n\nstatusEnum\030\001 \002(\0162\007." +
      "Status\022\013\n\003rid\030\002 \002(\021\022\031\n\007operate\030\003 \002(\0162\010.O" +
      "perate\022\021\n\terrorText\030\004 \001(\t\022\014\n\004body\030\005 \001(\014B" +
      "#\n\022com.dfire.protocolB\013RpcResponseH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dfire.protocol.ResponseStatus.getDescriptor(),
          com.dfire.protocol.RpcOperate.getDescriptor(),
        }, assigner);
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new java.lang.String[] { "StatusEnum", "Rid", "Operate", "ErrorText", "Body", });
    com.dfire.protocol.ResponseStatus.getDescriptor();
    com.dfire.protocol.RpcOperate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}