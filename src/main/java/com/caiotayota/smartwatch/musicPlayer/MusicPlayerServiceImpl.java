// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musicPlayer.proto

package com.caiotayota.smartwatch.musicPlayer;

public final class MusicPlayerServiceImpl {
  private MusicPlayerServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_musicPlayer_MusicRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_musicPlayer_MusicRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_musicPlayer_MusicResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_musicPlayer_MusicResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021musicPlayer.proto\022\013musicPlayer\"\037\n\014Musi" +
      "cRequest\022\017\n\007request\030\001 \001(\t\"&\n\rMusicRespon" +
      "se\022\025\n\rmusicResponse\030\001 \001(\t2Z\n\022MusicPlayer" +
      "Service\022D\n\tplayMusic\022\031.musicPlayer.Music" +
      "Request\032\032.musicPlayer.MusicResponse0\001BA\n" +
      "%com.caiotayota.smartwatch.musicPlayerB\026" +
      "MusicPlayerServiceImplP\001b\006proto3"
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
    internal_static_musicPlayer_MusicRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_musicPlayer_MusicRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_musicPlayer_MusicRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_musicPlayer_MusicResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_musicPlayer_MusicResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_musicPlayer_MusicResponse_descriptor,
        new java.lang.String[] { "MusicResponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
