// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musicPlayer.proto

package com.caiotayota.smartwatch.musicPlayer;

/**
 * Protobuf type {@code musicPlayer.MusicRequest}
 */
public  final class MusicRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:musicPlayer.MusicRequest)
    MusicRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MusicRequest.newBuilder() to construct.
  private MusicRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MusicRequest() {
    request_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MusicRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            request_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceImpl.internal_static_musicPlayer_MusicRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceImpl.internal_static_musicPlayer_MusicRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.caiotayota.smartwatch.musicPlayer.MusicRequest.class, com.caiotayota.smartwatch.musicPlayer.MusicRequest.Builder.class);
  }

  public static final int REQUEST_FIELD_NUMBER = 1;
  private volatile java.lang.Object request_;
  /**
   * <code>string request = 1;</code>
   */
  public java.lang.String getRequest() {
    java.lang.Object ref = request_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      request_ = s;
      return s;
    }
  }
  /**
   * <code>string request = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRequestBytes() {
    java.lang.Object ref = request_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      request_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRequestBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, request_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, request_);
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
    if (!(obj instanceof com.caiotayota.smartwatch.musicPlayer.MusicRequest)) {
      return super.equals(obj);
    }
    com.caiotayota.smartwatch.musicPlayer.MusicRequest other = (com.caiotayota.smartwatch.musicPlayer.MusicRequest) obj;

    boolean result = true;
    result = result && getRequest()
        .equals(other.getRequest());
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
    hash = (37 * hash) + REQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getRequest().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest parseFrom(
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
  public static Builder newBuilder(com.caiotayota.smartwatch.musicPlayer.MusicRequest prototype) {
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
   * Protobuf type {@code musicPlayer.MusicRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:musicPlayer.MusicRequest)
      com.caiotayota.smartwatch.musicPlayer.MusicRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceImpl.internal_static_musicPlayer_MusicRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceImpl.internal_static_musicPlayer_MusicRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.caiotayota.smartwatch.musicPlayer.MusicRequest.class, com.caiotayota.smartwatch.musicPlayer.MusicRequest.Builder.class);
    }

    // Construct using com.caiotayota.smartwatch.musicPlayer.MusicRequest.newBuilder()
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
      request_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceImpl.internal_static_musicPlayer_MusicRequest_descriptor;
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.musicPlayer.MusicRequest getDefaultInstanceForType() {
      return com.caiotayota.smartwatch.musicPlayer.MusicRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.musicPlayer.MusicRequest build() {
      com.caiotayota.smartwatch.musicPlayer.MusicRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.musicPlayer.MusicRequest buildPartial() {
      com.caiotayota.smartwatch.musicPlayer.MusicRequest result = new com.caiotayota.smartwatch.musicPlayer.MusicRequest(this);
      result.request_ = request_;
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
      if (other instanceof com.caiotayota.smartwatch.musicPlayer.MusicRequest) {
        return mergeFrom((com.caiotayota.smartwatch.musicPlayer.MusicRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.caiotayota.smartwatch.musicPlayer.MusicRequest other) {
      if (other == com.caiotayota.smartwatch.musicPlayer.MusicRequest.getDefaultInstance()) return this;
      if (!other.getRequest().isEmpty()) {
        request_ = other.request_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.caiotayota.smartwatch.musicPlayer.MusicRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.caiotayota.smartwatch.musicPlayer.MusicRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object request_ = "";
    /**
     * <code>string request = 1;</code>
     */
    public java.lang.String getRequest() {
      java.lang.Object ref = request_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        request_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string request = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestBytes() {
      java.lang.Object ref = request_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        request_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string request = 1;</code>
     */
    public Builder setRequest(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      request_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string request = 1;</code>
     */
    public Builder clearRequest() {
      
      request_ = getDefaultInstance().getRequest();
      onChanged();
      return this;
    }
    /**
     * <code>string request = 1;</code>
     */
    public Builder setRequestBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      request_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:musicPlayer.MusicRequest)
  }

  // @@protoc_insertion_point(class_scope:musicPlayer.MusicRequest)
  private static final com.caiotayota.smartwatch.musicPlayer.MusicRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.caiotayota.smartwatch.musicPlayer.MusicRequest();
  }

  public static com.caiotayota.smartwatch.musicPlayer.MusicRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MusicRequest>
      PARSER = new com.google.protobuf.AbstractParser<MusicRequest>() {
    @java.lang.Override
    public MusicRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MusicRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MusicRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MusicRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.caiotayota.smartwatch.musicPlayer.MusicRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
