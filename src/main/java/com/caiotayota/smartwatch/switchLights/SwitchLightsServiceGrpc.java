package com.caiotayota.smartwatch.switchLights;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: switchLights.proto")
public final class SwitchLightsServiceGrpc {

  private SwitchLightsServiceGrpc() {}

  public static final String SERVICE_NAME = "switchLights.SwitchLightsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caiotayota.smartwatch.switchLights.SwitchLightRequest,
      com.caiotayota.smartwatch.switchLights.SwitchLightResponse> getSwitchLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchLight",
      requestType = com.caiotayota.smartwatch.switchLights.SwitchLightRequest.class,
      responseType = com.caiotayota.smartwatch.switchLights.SwitchLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.caiotayota.smartwatch.switchLights.SwitchLightRequest,
      com.caiotayota.smartwatch.switchLights.SwitchLightResponse> getSwitchLightMethod() {
    io.grpc.MethodDescriptor<com.caiotayota.smartwatch.switchLights.SwitchLightRequest, com.caiotayota.smartwatch.switchLights.SwitchLightResponse> getSwitchLightMethod;
    if ((getSwitchLightMethod = SwitchLightsServiceGrpc.getSwitchLightMethod) == null) {
      synchronized (SwitchLightsServiceGrpc.class) {
        if ((getSwitchLightMethod = SwitchLightsServiceGrpc.getSwitchLightMethod) == null) {
          SwitchLightsServiceGrpc.getSwitchLightMethod = getSwitchLightMethod = 
              io.grpc.MethodDescriptor.<com.caiotayota.smartwatch.switchLights.SwitchLightRequest, com.caiotayota.smartwatch.switchLights.SwitchLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "switchLights.SwitchLightsService", "switchLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.switchLights.SwitchLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.switchLights.SwitchLightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SwitchLightsServiceMethodDescriptorSupplier("switchLight"))
                  .build();
          }
        }
     }
     return getSwitchLightMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SwitchLightsServiceStub newStub(io.grpc.Channel channel) {
    return new SwitchLightsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SwitchLightsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SwitchLightsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SwitchLightsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SwitchLightsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SwitchLightsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary call
     * </pre>
     */
    public void switchLight(com.caiotayota.smartwatch.switchLights.SwitchLightRequest request,
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.switchLights.SwitchLightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchLightMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSwitchLightMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.caiotayota.smartwatch.switchLights.SwitchLightRequest,
                com.caiotayota.smartwatch.switchLights.SwitchLightResponse>(
                  this, METHODID_SWITCH_LIGHT)))
          .build();
    }
  }

  /**
   */
  public static final class SwitchLightsServiceStub extends io.grpc.stub.AbstractStub<SwitchLightsServiceStub> {
    private SwitchLightsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SwitchLightsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchLightsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SwitchLightsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary call
     * </pre>
     */
    public void switchLight(com.caiotayota.smartwatch.switchLights.SwitchLightRequest request,
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.switchLights.SwitchLightResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchLightMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SwitchLightsServiceBlockingStub extends io.grpc.stub.AbstractStub<SwitchLightsServiceBlockingStub> {
    private SwitchLightsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SwitchLightsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchLightsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SwitchLightsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary call
     * </pre>
     */
    public com.caiotayota.smartwatch.switchLights.SwitchLightResponse switchLight(com.caiotayota.smartwatch.switchLights.SwitchLightRequest request) {
      return blockingUnaryCall(
          getChannel(), getSwitchLightMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SwitchLightsServiceFutureStub extends io.grpc.stub.AbstractStub<SwitchLightsServiceFutureStub> {
    private SwitchLightsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SwitchLightsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchLightsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SwitchLightsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.caiotayota.smartwatch.switchLights.SwitchLightResponse> switchLight(
        com.caiotayota.smartwatch.switchLights.SwitchLightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchLightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWITCH_LIGHT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SwitchLightsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SwitchLightsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SWITCH_LIGHT:
          serviceImpl.switchLight((com.caiotayota.smartwatch.switchLights.SwitchLightRequest) request,
              (io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.switchLights.SwitchLightResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SwitchLightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SwitchLightsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caiotayota.smartwatch.switchLights.SwitchLightsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SwitchLightsService");
    }
  }

  private static final class SwitchLightsServiceFileDescriptorSupplier
      extends SwitchLightsServiceBaseDescriptorSupplier {
    SwitchLightsServiceFileDescriptorSupplier() {}
  }

  private static final class SwitchLightsServiceMethodDescriptorSupplier
      extends SwitchLightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SwitchLightsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SwitchLightsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SwitchLightsServiceFileDescriptorSupplier())
              .addMethod(getSwitchLightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
