// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: config/java_proto/UserModule.proto

package com.xinyue.network.message.impl.proto;

public final class UserModule {
  private UserModule() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConnectConfirmRequestModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ConnectConfirmRequestModel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string token = 1;</code>
     */
    boolean hasToken();
    /**
     * <code>required string token = 1;</code>
     */
    java.lang.String getToken();
    /**
     * <code>required string token = 1;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();

    /**
     * <code>required int64 userId = 2;</code>
     */
    boolean hasUserId();
    /**
     * <code>required int64 userId = 2;</code>
     */
    long getUserId();

    /**
     * <code>required int64 roleId = 3;</code>
     */
    boolean hasRoleId();
    /**
     * <code>required int64 roleId = 3;</code>
     */
    long getRoleId();
  }
  /**
   * Protobuf type {@code ConnectConfirmRequestModel}
   */
  public static final class ConnectConfirmRequestModel extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ConnectConfirmRequestModel)
      ConnectConfirmRequestModelOrBuilder {
    // Use ConnectConfirmRequestModel.newBuilder() to construct.
    private ConnectConfirmRequestModel(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ConnectConfirmRequestModel(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ConnectConfirmRequestModel defaultInstance;
    public static ConnectConfirmRequestModel getDefaultInstance() {
      return defaultInstance;
    }

    public ConnectConfirmRequestModel getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ConnectConfirmRequestModel(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              token_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              userId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              roleId_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmRequestModel_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmRequestModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel.class, com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel.Builder.class);
    }

    public static com.google.protobuf.Parser<ConnectConfirmRequestModel> PARSER =
        new com.google.protobuf.AbstractParser<ConnectConfirmRequestModel>() {
      public ConnectConfirmRequestModel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConnectConfirmRequestModel(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ConnectConfirmRequestModel> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private java.lang.Object token_;
    /**
     * <code>required string token = 1;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string token = 1;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          token_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERID_FIELD_NUMBER = 2;
    private long userId_;
    /**
     * <code>required int64 userId = 2;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 userId = 2;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int ROLEID_FIELD_NUMBER = 3;
    private long roleId_;
    /**
     * <code>required int64 roleId = 3;</code>
     */
    public boolean hasRoleId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 roleId = 3;</code>
     */
    public long getRoleId() {
      return roleId_;
    }

    private void initFields() {
      token_ = "";
      userId_ = 0L;
      roleId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRoleId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTokenBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, userId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, roleId_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTokenBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, userId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, roleId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ConnectConfirmRequestModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ConnectConfirmRequestModel)
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmRequestModel_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmRequestModel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel.class, com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel.Builder.class);
      }

      // Construct using com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        token_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        roleId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmRequestModel_descriptor;
      }

      public com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel getDefaultInstanceForType() {
        return com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel.getDefaultInstance();
      }

      public com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel build() {
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel buildPartial() {
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel result = new com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.token_ = token_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userId_ = userId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.roleId_ = roleId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel) {
          return mergeFrom((com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel other) {
        if (other == com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel.getDefaultInstance()) return this;
        if (other.hasToken()) {
          bitField0_ |= 0x00000001;
          token_ = other.token_;
          onChanged();
        }
        if (other.hasUserId()) {
          setUserId(other.getUserId());
        }
        if (other.hasRoleId()) {
          setRoleId(other.getRoleId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasToken()) {
          
          return false;
        }
        if (!hasUserId()) {
          
          return false;
        }
        if (!hasRoleId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmRequestModel) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object token_ = "";
      /**
       * <code>required string token = 1;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string token = 1;</code>
       */
      public java.lang.String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            token_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string token = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        java.lang.Object ref = token_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          token_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string token = 1;</code>
       */
      public Builder setToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string token = 1;</code>
       */
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000001);
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      /**
       * <code>required string token = 1;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        token_ = value;
        onChanged();
        return this;
      }

      private long userId_ ;
      /**
       * <code>required int64 userId = 2;</code>
       */
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 userId = 2;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>required int64 userId = 2;</code>
       */
      public Builder setUserId(long value) {
        bitField0_ |= 0x00000002;
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 userId = 2;</code>
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userId_ = 0L;
        onChanged();
        return this;
      }

      private long roleId_ ;
      /**
       * <code>required int64 roleId = 3;</code>
       */
      public boolean hasRoleId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 roleId = 3;</code>
       */
      public long getRoleId() {
        return roleId_;
      }
      /**
       * <code>required int64 roleId = 3;</code>
       */
      public Builder setRoleId(long value) {
        bitField0_ |= 0x00000004;
        roleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 roleId = 3;</code>
       */
      public Builder clearRoleId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        roleId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ConnectConfirmRequestModel)
    }

    static {
      defaultInstance = new ConnectConfirmRequestModel(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ConnectConfirmRequestModel)
  }

  public interface ConnectConfirmResponseModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ConnectConfirmResponseModel)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code ConnectConfirmResponseModel}
   */
  public static final class ConnectConfirmResponseModel extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ConnectConfirmResponseModel)
      ConnectConfirmResponseModelOrBuilder {
    // Use ConnectConfirmResponseModel.newBuilder() to construct.
    private ConnectConfirmResponseModel(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ConnectConfirmResponseModel(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ConnectConfirmResponseModel defaultInstance;
    public static ConnectConfirmResponseModel getDefaultInstance() {
      return defaultInstance;
    }

    public ConnectConfirmResponseModel getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ConnectConfirmResponseModel(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
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
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmResponseModel_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmResponseModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel.class, com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel.Builder.class);
    }

    public static com.google.protobuf.Parser<ConnectConfirmResponseModel> PARSER =
        new com.google.protobuf.AbstractParser<ConnectConfirmResponseModel>() {
      public ConnectConfirmResponseModel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConnectConfirmResponseModel(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ConnectConfirmResponseModel> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ConnectConfirmResponseModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ConnectConfirmResponseModel)
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmResponseModel_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmResponseModel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel.class, com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel.Builder.class);
      }

      // Construct using com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinyue.network.message.impl.proto.UserModule.internal_static_ConnectConfirmResponseModel_descriptor;
      }

      public com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel getDefaultInstanceForType() {
        return com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel.getDefaultInstance();
      }

      public com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel build() {
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel buildPartial() {
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel result = new com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel) {
          return mergeFrom((com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel other) {
        if (other == com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xinyue.network.message.impl.proto.UserModule.ConnectConfirmResponseModel) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ConnectConfirmResponseModel)
    }

    static {
      defaultInstance = new ConnectConfirmResponseModel(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ConnectConfirmResponseModel)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConnectConfirmRequestModel_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ConnectConfirmRequestModel_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConnectConfirmResponseModel_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ConnectConfirmResponseModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"config/java_proto/UserModule.proto\"K\n\032" +
      "ConnectConfirmRequestModel\022\r\n\005token\030\001 \002(" +
      "\t\022\016\n\006userId\030\002 \002(\003\022\016\n\006roleId\030\003 \002(\003\"\035\n\033Con" +
      "nectConfirmResponseModelB3\n%com.xinyue.n" +
      "etwork.message.impl.protoB\nUserModule"
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
        }, assigner);
    internal_static_ConnectConfirmRequestModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ConnectConfirmRequestModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ConnectConfirmRequestModel_descriptor,
        new java.lang.String[] { "Token", "UserId", "RoleId", });
    internal_static_ConnectConfirmResponseModel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ConnectConfirmResponseModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ConnectConfirmResponseModel_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
