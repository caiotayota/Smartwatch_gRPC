package com.caiotayota.smartwatch.voiceMessage;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: voiceMessage.proto")
public final class VoiceMessageServiceGrpc {

  private VoiceMessageServiceGrpc() {}

  public static final String SERVICE_NAME = "voiceMessage.VoiceMessageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest,
      com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse> getSendVoiceMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendVoiceMessage",
      requestType = com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest.class,
      responseType = com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest,
      com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse> getSendVoiceMessageMethod() {
    io.grpc.MethodDescriptor<com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest, com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse> getSendVoiceMessageMethod;
    if ((getSendVoiceMessageMethod = VoiceMessageServiceGrpc.getSendVoiceMessageMethod) == null) {
      synchronized (VoiceMessageServiceGrpc.class) {
        if ((getSendVoiceMessageMethod = VoiceMessageServiceGrpc.getSendVoiceMessageMethod) == null) {
          VoiceMessageServiceGrpc.getSendVoiceMessageMethod = getSendVoiceMessageMethod = 
              io.grpc.MethodDescriptor.<com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest, com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "voiceMessage.VoiceMessageService", "sendVoiceMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VoiceMessageServiceMethodDescriptorSupplier("sendVoiceMessage"))
                  .build();
          }
        }
     }
     return getSendVoiceMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VoiceMessageServiceStub newStub(io.grpc.Channel channel) {
    return new VoiceMessageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VoiceMessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VoiceMessageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VoiceMessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VoiceMessageServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class VoiceMessageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Bi-directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest> sendVoiceMessage(
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendVoiceMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendVoiceMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest,
                com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse>(
                  this, METHODID_SEND_VOICE_MESSAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class VoiceMessageServiceStub extends io.grpc.stub.AbstractStub<VoiceMessageServiceStub> {
    private VoiceMessageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VoiceMessageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VoiceMessageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VoiceMessageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bi-directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.voiceMessage.VoiceMessageRequest> sendVoiceMessage(
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendVoiceMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class VoiceMessageServiceBlockingStub extends io.grpc.stub.AbstractStub<VoiceMessageServiceBlockingStub> {
    private VoiceMessageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VoiceMessageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VoiceMessageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VoiceMessageServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class VoiceMessageServiceFutureStub extends io.grpc.stub.AbstractStub<VoiceMessageServiceFutureStub> {
    private VoiceMessageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VoiceMessageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VoiceMessageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VoiceMessageServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_VOICE_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VoiceMessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VoiceMessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_VOICE_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendVoiceMessage(
              (io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.voiceMessage.VoiceMessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VoiceMessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VoiceMessageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caiotayota.smartwatch.voiceMessage.VoiceMessageServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VoiceMessageService");
    }
  }

  private static final class VoiceMessageServiceFileDescriptorSupplier
      extends VoiceMessageServiceBaseDescriptorSupplier {
    VoiceMessageServiceFileDescriptorSupplier() {}
  }

  private static final class VoiceMessageServiceMethodDescriptorSupplier
      extends VoiceMessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VoiceMessageServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VoiceMessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VoiceMessageServiceFileDescriptorSupplier())
              .addMethod(getSendVoiceMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
