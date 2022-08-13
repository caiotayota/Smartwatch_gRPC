// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sleepMonitoring.proto

package com.caiotayota.smartwatch.sleepMonitoring;

/**
 * Protobuf type {@code sleepMonitoring.MovementRequest}
 */
public  final class MovementRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sleepMonitoring.MovementRequest)
    MovementRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MovementRequest.newBuilder() to construct.
  private MovementRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MovementRequest() {
    movement_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MovementRequest(
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

            movement_ = input.readBool();
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
    return com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringImpl.internal_static_sleepMonitoring_MovementRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringImpl.internal_static_sleepMonitoring_MovementRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.class, com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.Builder.class);
  }

  public static final int MOVEMENT_FIELD_NUMBER = 1;
  private boolean movement_;
  /**
   * <code>bool movement = 1;</code>
   */
  public boolean getMovement() {
    return movement_;
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
    if (movement_ != false) {
      output.writeBool(1, movement_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (movement_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, movement_);
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
    if (!(obj instanceof com.caiotayota.smartwatch.sleepMonitoring.MovementRequest)) {
      return super.equals(obj);
    }
    com.caiotayota.smartwatch.sleepMonitoring.MovementRequest other = (com.caiotayota.smartwatch.sleepMonitoring.MovementRequest) obj;

    boolean result = true;
    result = result && (getMovement()
        == other.getMovement());
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
    hash = (37 * hash) + MOVEMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMovement());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parseFrom(
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
  public static Builder newBuilder(com.caiotayota.smartwatch.sleepMonitoring.MovementRequest prototype) {
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
   * Protobuf type {@code sleepMonitoring.MovementRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sleepMonitoring.MovementRequest)
      com.caiotayota.smartwatch.sleepMonitoring.MovementRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringImpl.internal_static_sleepMonitoring_MovementRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringImpl.internal_static_sleepMonitoring_MovementRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.class, com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.Builder.class);
    }

    // Construct using com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.newBuilder()
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
      movement_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringImpl.internal_static_sleepMonitoring_MovementRequest_descriptor;
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.sleepMonitoring.MovementRequest getDefaultInstanceForType() {
      return com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.sleepMonitoring.MovementRequest build() {
      com.caiotayota.smartwatch.sleepMonitoring.MovementRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.caiotayota.smartwatch.sleepMonitoring.MovementRequest buildPartial() {
      com.caiotayota.smartwatch.sleepMonitoring.MovementRequest result = new com.caiotayota.smartwatch.sleepMonitoring.MovementRequest(this);
      result.movement_ = movement_;
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
      if (other instanceof com.caiotayota.smartwatch.sleepMonitoring.MovementRequest) {
        return mergeFrom((com.caiotayota.smartwatch.sleepMonitoring.MovementRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.caiotayota.smartwatch.sleepMonitoring.MovementRequest other) {
      if (other == com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.getDefaultInstance()) return this;
      if (other.getMovement() != false) {
        setMovement(other.getMovement());
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
      com.caiotayota.smartwatch.sleepMonitoring.MovementRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.caiotayota.smartwatch.sleepMonitoring.MovementRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean movement_ ;
    /**
     * <code>bool movement = 1;</code>
     */
    public boolean getMovement() {
      return movement_;
    }
    /**
     * <code>bool movement = 1;</code>
     */
    public Builder setMovement(boolean value) {
      
      movement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool movement = 1;</code>
     */
    public Builder clearMovement() {
      
      movement_ = false;
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


    // @@protoc_insertion_point(builder_scope:sleepMonitoring.MovementRequest)
  }

  // @@protoc_insertion_point(class_scope:sleepMonitoring.MovementRequest)
  private static final com.caiotayota.smartwatch.sleepMonitoring.MovementRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.caiotayota.smartwatch.sleepMonitoring.MovementRequest();
  }

  public static com.caiotayota.smartwatch.sleepMonitoring.MovementRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MovementRequest>
      PARSER = new com.google.protobuf.AbstractParser<MovementRequest>() {
    @java.lang.Override
    public MovementRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MovementRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MovementRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MovementRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.caiotayota.smartwatch.sleepMonitoring.MovementRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
