// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_token.proto

package com.cmd.protobuf.service;

public final class AppTokenProtobuf {
  private AppTokenProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface app_token_protobufOrBuilder extends
      // @@protoc_insertion_point(interface_extends:app_token_protobuf)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 app_token_id = 1;</code>
     */
    long getAppTokenId();

    /**
     * <code>string client_id = 2;</code>
     */
    java.lang.String getClientId();
    /**
     * <code>string client_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getClientIdBytes();

    /**
     * <code>string access_token = 3;</code>
     */
    java.lang.String getAccessToken();
    /**
     * <code>string access_token = 3;</code>
     */
    com.google.protobuf.ByteString
        getAccessTokenBytes();

    /**
     * <code>int64 access_expire_time = 4;</code>
     */
    long getAccessExpireTime();
  }
  /**
   * Protobuf type {@code app_token_protobuf}
   */
  public  static final class app_token_protobuf extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:app_token_protobuf)
      app_token_protobufOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use app_token_protobuf.newBuilder() to construct.
    private app_token_protobuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private app_token_protobuf() {
      appTokenId_ = 0L;
      clientId_ = "";
      accessToken_ = "";
      accessExpireTime_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private app_token_protobuf(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              appTokenId_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              clientId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              accessToken_ = s;
              break;
            }
            case 32: {

              accessExpireTime_ = input.readInt64();
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
      return com.cmd.protobuf.service.AppTokenProtobuf.internal_static_app_token_protobuf_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cmd.protobuf.service.AppTokenProtobuf.internal_static_app_token_protobuf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf.class, com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf.Builder.class);
    }

    public static final int APP_TOKEN_ID_FIELD_NUMBER = 1;
    private long appTokenId_;
    /**
     * <code>int64 app_token_id = 1;</code>
     */
    public long getAppTokenId() {
      return appTokenId_;
    }

    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object clientId_;
    /**
     * <code>string client_id = 2;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      }
    }
    /**
     * <code>string client_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACCESS_TOKEN_FIELD_NUMBER = 3;
    private volatile java.lang.Object accessToken_;
    /**
     * <code>string access_token = 3;</code>
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      }
    }
    /**
     * <code>string access_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACCESS_EXPIRE_TIME_FIELD_NUMBER = 4;
    private long accessExpireTime_;
    /**
     * <code>int64 access_expire_time = 4;</code>
     */
    public long getAccessExpireTime() {
      return accessExpireTime_;
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
      if (appTokenId_ != 0L) {
        output.writeInt64(1, appTokenId_);
      }
      if (!getClientIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientId_);
      }
      if (!getAccessTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, accessToken_);
      }
      if (accessExpireTime_ != 0L) {
        output.writeInt64(4, accessExpireTime_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (appTokenId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, appTokenId_);
      }
      if (!getClientIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientId_);
      }
      if (!getAccessTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, accessToken_);
      }
      if (accessExpireTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, accessExpireTime_);
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
      if (!(obj instanceof com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf)) {
        return super.equals(obj);
      }
      com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf other = (com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf) obj;

      boolean result = true;
      result = result && (getAppTokenId()
          == other.getAppTokenId());
      result = result && getClientId()
          .equals(other.getClientId());
      result = result && getAccessToken()
          .equals(other.getAccessToken());
      result = result && (getAccessExpireTime()
          == other.getAccessExpireTime());
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
      hash = (37 * hash) + APP_TOKEN_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAppTokenId());
      hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getClientId().hashCode();
      hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getAccessToken().hashCode();
      hash = (37 * hash) + ACCESS_EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAccessExpireTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code app_token_protobuf}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:app_token_protobuf)
        com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobufOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cmd.protobuf.service.AppTokenProtobuf.internal_static_app_token_protobuf_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cmd.protobuf.service.AppTokenProtobuf.internal_static_app_token_protobuf_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf.class, com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf.Builder.class);
      }

      // Construct using com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf.newBuilder()
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
      public Builder clear() {
        super.clear();
        appTokenId_ = 0L;

        clientId_ = "";

        accessToken_ = "";

        accessExpireTime_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cmd.protobuf.service.AppTokenProtobuf.internal_static_app_token_protobuf_descriptor;
      }

      public com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf getDefaultInstanceForType() {
        return com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf.getDefaultInstance();
      }

      public com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf build() {
        com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf buildPartial() {
        com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf result = new com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf(this);
        result.appTokenId_ = appTokenId_;
        result.clientId_ = clientId_;
        result.accessToken_ = accessToken_;
        result.accessExpireTime_ = accessExpireTime_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf) {
          return mergeFrom((com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf other) {
        if (other == com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf.getDefaultInstance()) return this;
        if (other.getAppTokenId() != 0L) {
          setAppTokenId(other.getAppTokenId());
        }
        if (!other.getClientId().isEmpty()) {
          clientId_ = other.clientId_;
          onChanged();
        }
        if (!other.getAccessToken().isEmpty()) {
          accessToken_ = other.accessToken_;
          onChanged();
        }
        if (other.getAccessExpireTime() != 0L) {
          setAccessExpireTime(other.getAccessExpireTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long appTokenId_ ;
      /**
       * <code>int64 app_token_id = 1;</code>
       */
      public long getAppTokenId() {
        return appTokenId_;
      }
      /**
       * <code>int64 app_token_id = 1;</code>
       */
      public Builder setAppTokenId(long value) {
        
        appTokenId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 app_token_id = 1;</code>
       */
      public Builder clearAppTokenId() {
        
        appTokenId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object clientId_ = "";
      /**
       * <code>string client_id = 2;</code>
       */
      public java.lang.String getClientId() {
        java.lang.Object ref = clientId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string client_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        java.lang.Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string client_id = 2;</code>
       */
      public Builder setClientId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string client_id = 2;</code>
       */
      public Builder clearClientId() {
        
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }
      /**
       * <code>string client_id = 2;</code>
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object accessToken_ = "";
      /**
       * <code>string access_token = 3;</code>
       */
      public java.lang.String getAccessToken() {
        java.lang.Object ref = accessToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          accessToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string access_token = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAccessTokenBytes() {
        java.lang.Object ref = accessToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          accessToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string access_token = 3;</code>
       */
      public Builder setAccessToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        accessToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string access_token = 3;</code>
       */
      public Builder clearAccessToken() {
        
        accessToken_ = getDefaultInstance().getAccessToken();
        onChanged();
        return this;
      }
      /**
       * <code>string access_token = 3;</code>
       */
      public Builder setAccessTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        accessToken_ = value;
        onChanged();
        return this;
      }

      private long accessExpireTime_ ;
      /**
       * <code>int64 access_expire_time = 4;</code>
       */
      public long getAccessExpireTime() {
        return accessExpireTime_;
      }
      /**
       * <code>int64 access_expire_time = 4;</code>
       */
      public Builder setAccessExpireTime(long value) {
        
        accessExpireTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 access_expire_time = 4;</code>
       */
      public Builder clearAccessExpireTime() {
        
        accessExpireTime_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:app_token_protobuf)
    }

    // @@protoc_insertion_point(class_scope:app_token_protobuf)
    private static final com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf();
    }

    public static com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<app_token_protobuf>
        PARSER = new com.google.protobuf.AbstractParser<app_token_protobuf>() {
      public app_token_protobuf parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new app_token_protobuf(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<app_token_protobuf> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<app_token_protobuf> getParserForType() {
      return PARSER;
    }

    public com.cmd.protobuf.service.AppTokenProtobuf.app_token_protobuf getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_app_token_protobuf_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_app_token_protobuf_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017app_token.proto\"o\n\022app_token_protobuf\022" +
      "\024\n\014app_token_id\030\001 \001(\003\022\021\n\tclient_id\030\002 \001(\t" +
      "\022\024\n\014access_token\030\003 \001(\t\022\032\n\022access_expire_" +
      "time\030\004 \001(\003B,\n\030com.cmd.protobuf.serviceB\020" +
      "AppTokenProtobufb\006proto3"
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
    internal_static_app_token_protobuf_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_app_token_protobuf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_app_token_protobuf_descriptor,
        new java.lang.String[] { "AppTokenId", "ClientId", "AccessToken", "AccessExpireTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
