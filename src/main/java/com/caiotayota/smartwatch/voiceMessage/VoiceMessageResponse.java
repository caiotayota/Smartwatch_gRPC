// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: voiceMessage.proto

package com.caiotayota.smartwatch.voiceMessage;

/**
 * Protobuf type {@code voiceMessage.VoiceMessageResponse}
 */
public  final class VoiceMessageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:voiceMessage.VoiceMessageResponse)
    VoiceMessageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoiceMessageResponse.newBuilder() to construct.
  private VoiceMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoiceMessageResponse() {
    voiceMessageReceived_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoiceMessageResponse(
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

            voiceMessageReceived_ = input.readBytes();
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
    return com.caiotayota.smartwatch.voiceMessage.VoiceMessageServiceImpl.internal_static_voiceMessage_VoiceMessageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.caiotayota.smartwatch.voiceMessage.VoiceMessageServiceImpl.internal_static_voiceMessage_VoiceMessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.class, com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.Builder.class);
  }

  public static final int VOICEMESSAGERECEIVED_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString voiceMessageReceived_;
  /**
   * <code>bytes voiceMessageReceived = 1;</code>
   */
  public com.google.protobuf.ByteString getVoiceMessageReceived() {
    return voiceMessageReceived_;
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
    if (!voiceMessageReceived_.isEmpty()) {
      output.writeBytes(1, voiceMessageReceived_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!voiceMessageReceived_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, voiceMessageReceived_);
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
    if (!(obj instanceof com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse)) {
      return super.equals(obj);
    }
    com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse other = (com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse) obj;

    boolean result = true;
    result = result && getVoiceMessageReceived()
        .equals(other.getVoiceMessageReceived());
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
    hash = (37 * hash) + VOICEMESSAGERECEIVED_FIELD_NUMBER;
    hash = (53 * hash) + getVoiceMessageReceived().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parseFrom(
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
  public static Builder newBuilder(com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse prototype) {
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
   * Protobuf type {@code voiceMessage.VoiceMessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:voiceMessage.VoiceMessageResponse)
      com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.caiotayota.smartwatch.voiceMessage.VoiceMessageServiceImpl.internal_static_voiceMessage_VoiceMessageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.caiotayota.smartwatch.voiceMessage.VoiceMessageServiceImpl.internal_static_voiceMessage_VoiceMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.class, com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.Builder.class);
    }

    // Construct using com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.newBuilder()
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
      voiceMessageReceived_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.caiotayota.smartwatch.voiceMessage.VoiceMessageServiceImpl.internal_static_voiceMessage_VoiceMessageResponse_descriptor;
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse getDefaultInstanceForType() {
      return com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse build() {
      com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse buildPartial() {
      com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse result = new com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse(this);
      result.voiceMessageReceived_ = voiceMessageReceived_;
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
      if (other instanceof com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse) {
        return mergeFrom((com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse other) {
      if (other == com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.getDefaultInstance()) return this;
      if (other.getVoiceMessageReceived() != com.google.protobuf.ByteString.EMPTY) {
        setVoiceMessageReceived(other.getVoiceMessageReceived());
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
      com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString voiceMessageReceived_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes voiceMessageReceived = 1;</code>
     */
    public com.google.protobuf.ByteString getVoiceMessageReceived() {
      return voiceMessageReceived_;
    }
    /**
     * <code>bytes voiceMessageReceived = 1;</code>
     */
    public Builder setVoiceMessageReceived(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      voiceMessageReceived_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes voiceMessageReceived = 1;</code>
     */
    public Builder clearVoiceMessageReceived() {
      
      voiceMessageReceived_ = getDefaultInstance().getVoiceMessageReceived();
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


    // @@protoc_insertion_point(builder_scope:voiceMessage.VoiceMessageResponse)
  }

  // @@protoc_insertion_point(class_scope:voiceMessage.VoiceMessageResponse)
  private static final com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse();
  }

  public static com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoiceMessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<VoiceMessageResponse>() {
    @java.lang.Override
    public VoiceMessageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoiceMessageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoiceMessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoiceMessageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

