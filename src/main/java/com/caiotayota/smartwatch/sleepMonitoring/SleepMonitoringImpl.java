// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sleepMonitoring.proto

package com.caiotayota.smartwatch.sleepMonitoring;

public final class SleepMonitoringImpl {
  private SleepMonitoringImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sleepMonitoring_MovementRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sleepMonitoring_MovementRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sleepMonitoring_MovementsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sleepMonitoring_MovementsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sleepMonitoring_HeartRateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sleepMonitoring_HeartRateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sleepMonitoring_HeartRateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sleepMonitoring_HeartRateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025sleepMonitoring.proto\022\017sleepMonitoring" +
      "\"#\n\017MovementRequest\022\020\n\010movement\030\001 \001(\010\"2\n" +
      "\021MovementsResponse\022\035\n\025totalMovementsMess" +
      "age\030\001 \001(\t\".\n\020HeartRateRequest\022\032\n\022heartBe" +
      "atPerSecond\030\001 \001(\001\"&\n\021HeartRateResponse\022\021" +
      "\n\theartRate\030\001 \001(\0012\316\001\n\026SleepMonitoringSer" +
      "vice\022W\n\rtrackMovement\022 .sleepMonitoring." +
      "MovementRequest\032\".sleepMonitoring.Moveme" +
      "ntsResponse(\001\022[\n\016trackHeartRate\022!.sleepM" +
      "onitoring.HeartRateRequest\032\".sleepMonito" +
      "ring.HeartRateResponse(\0010\001BB\n)com.caiota" +
      "yota.smartwatch.sleepMonitoringB\023SleepMo" +
      "nitoringImplP\001b\006proto3"
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
    internal_static_sleepMonitoring_MovementRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sleepMonitoring_MovementRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sleepMonitoring_MovementRequest_descriptor,
        new java.lang.String[] { "Movement", });
    internal_static_sleepMonitoring_MovementsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sleepMonitoring_MovementsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sleepMonitoring_MovementsResponse_descriptor,
        new java.lang.String[] { "TotalMovementsMessage", });
    internal_static_sleepMonitoring_HeartRateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sleepMonitoring_HeartRateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sleepMonitoring_HeartRateRequest_descriptor,
        new java.lang.String[] { "HeartBeatPerSecond", });
    internal_static_sleepMonitoring_HeartRateResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sleepMonitoring_HeartRateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sleepMonitoring_HeartRateResponse_descriptor,
        new java.lang.String[] { "HeartRate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
