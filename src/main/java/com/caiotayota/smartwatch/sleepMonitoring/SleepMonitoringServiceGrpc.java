package com.caiotayota.smartwatch.sleepMonitoring;

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
    comments = "Source: sleepMonitoring.proto")
public final class SleepMonitoringServiceGrpc {

  private SleepMonitoringServiceGrpc() {}

  public static final String SERVICE_NAME = "sleepMonitoring.SleepMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caiotayota.smartwatch.sleepMonitoring.MovementRequest,
      com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse> getTrackMovementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trackMovement",
      requestType = com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.class,
      responseType = com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.caiotayota.smartwatch.sleepMonitoring.MovementRequest,
      com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse> getTrackMovementMethod() {
    io.grpc.MethodDescriptor<com.caiotayota.smartwatch.sleepMonitoring.MovementRequest, com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse> getTrackMovementMethod;
    if ((getTrackMovementMethod = SleepMonitoringServiceGrpc.getTrackMovementMethod) == null) {
      synchronized (SleepMonitoringServiceGrpc.class) {
        if ((getTrackMovementMethod = SleepMonitoringServiceGrpc.getTrackMovementMethod) == null) {
          SleepMonitoringServiceGrpc.getTrackMovementMethod = getTrackMovementMethod = 
              io.grpc.MethodDescriptor.<com.caiotayota.smartwatch.sleepMonitoring.MovementRequest, com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sleepMonitoring.SleepMonitoringService", "trackMovement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.sleepMonitoring.MovementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SleepMonitoringServiceMethodDescriptorSupplier("trackMovement"))
                  .build();
          }
        }
     }
     return getTrackMovementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SleepMonitoringServiceStub newStub(io.grpc.Channel channel) {
    return new SleepMonitoringServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SleepMonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SleepMonitoringServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SleepMonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SleepMonitoringServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class SleepMonitoringServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.sleepMonitoring.MovementRequest> trackMovement(
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTrackMovementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrackMovementMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.caiotayota.smartwatch.sleepMonitoring.MovementRequest,
                com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse>(
                  this, METHODID_TRACK_MOVEMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SleepMonitoringServiceStub extends io.grpc.stub.AbstractStub<SleepMonitoringServiceStub> {
    private SleepMonitoringServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SleepMonitoringServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepMonitoringServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SleepMonitoringServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.sleepMonitoring.MovementRequest> trackMovement(
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTrackMovementMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SleepMonitoringServiceBlockingStub extends io.grpc.stub.AbstractStub<SleepMonitoringServiceBlockingStub> {
    private SleepMonitoringServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SleepMonitoringServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepMonitoringServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SleepMonitoringServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SleepMonitoringServiceFutureStub extends io.grpc.stub.AbstractStub<SleepMonitoringServiceFutureStub> {
    private SleepMonitoringServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SleepMonitoringServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepMonitoringServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SleepMonitoringServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TRACK_MOVEMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SleepMonitoringServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SleepMonitoringServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_TRACK_MOVEMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.trackMovement(
              (io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.sleepMonitoring.MovementsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SleepMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SleepMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caiotayota.smartwatch.sleepMonitoring.SleepMonitoringImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SleepMonitoringService");
    }
  }

  private static final class SleepMonitoringServiceFileDescriptorSupplier
      extends SleepMonitoringServiceBaseDescriptorSupplier {
    SleepMonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class SleepMonitoringServiceMethodDescriptorSupplier
      extends SleepMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SleepMonitoringServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SleepMonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SleepMonitoringServiceFileDescriptorSupplier())
              .addMethod(getTrackMovementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
