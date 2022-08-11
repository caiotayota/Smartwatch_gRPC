package smartwatch.sleepmonitoring;

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
    comments = "Source: sleepmonitoring.proto")
public final class SleepMonitoringGrpc {

  private SleepMonitoringGrpc() {}

  public static final String SERVICE_NAME = "sleepmonitoring.SleepMonitoring";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartwatch.sleepmonitoring.MovementTracked,
      smartwatch.sleepmonitoring.TotalMovementsResponse> getMovementTrackerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "movementTracker",
      requestType = smartwatch.sleepmonitoring.MovementTracked.class,
      responseType = smartwatch.sleepmonitoring.TotalMovementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<smartwatch.sleepmonitoring.MovementTracked,
      smartwatch.sleepmonitoring.TotalMovementsResponse> getMovementTrackerMethod() {
    io.grpc.MethodDescriptor<smartwatch.sleepmonitoring.MovementTracked, smartwatch.sleepmonitoring.TotalMovementsResponse> getMovementTrackerMethod;
    if ((getMovementTrackerMethod = SleepMonitoringGrpc.getMovementTrackerMethod) == null) {
      synchronized (SleepMonitoringGrpc.class) {
        if ((getMovementTrackerMethod = SleepMonitoringGrpc.getMovementTrackerMethod) == null) {
          SleepMonitoringGrpc.getMovementTrackerMethod = getMovementTrackerMethod = 
              io.grpc.MethodDescriptor.<smartwatch.sleepmonitoring.MovementTracked, smartwatch.sleepmonitoring.TotalMovementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sleepmonitoring.SleepMonitoring", "movementTracker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartwatch.sleepmonitoring.MovementTracked.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartwatch.sleepmonitoring.TotalMovementsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SleepMonitoringMethodDescriptorSupplier("movementTracker"))
                  .build();
          }
        }
     }
     return getMovementTrackerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartwatch.sleepmonitoring.heartRateRequest,
      smartwatch.sleepmonitoring.heartRateResponse> getHeartRateTrackerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "heartRateTracker",
      requestType = smartwatch.sleepmonitoring.heartRateRequest.class,
      responseType = smartwatch.sleepmonitoring.heartRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<smartwatch.sleepmonitoring.heartRateRequest,
      smartwatch.sleepmonitoring.heartRateResponse> getHeartRateTrackerMethod() {
    io.grpc.MethodDescriptor<smartwatch.sleepmonitoring.heartRateRequest, smartwatch.sleepmonitoring.heartRateResponse> getHeartRateTrackerMethod;
    if ((getHeartRateTrackerMethod = SleepMonitoringGrpc.getHeartRateTrackerMethod) == null) {
      synchronized (SleepMonitoringGrpc.class) {
        if ((getHeartRateTrackerMethod = SleepMonitoringGrpc.getHeartRateTrackerMethod) == null) {
          SleepMonitoringGrpc.getHeartRateTrackerMethod = getHeartRateTrackerMethod = 
              io.grpc.MethodDescriptor.<smartwatch.sleepmonitoring.heartRateRequest, smartwatch.sleepmonitoring.heartRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sleepmonitoring.SleepMonitoring", "heartRateTracker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartwatch.sleepmonitoring.heartRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartwatch.sleepmonitoring.heartRateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SleepMonitoringMethodDescriptorSupplier("heartRateTracker"))
                  .build();
          }
        }
     }
     return getHeartRateTrackerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SleepMonitoringStub newStub(io.grpc.Channel channel) {
    return new SleepMonitoringStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SleepMonitoringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SleepMonitoringBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SleepMonitoringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SleepMonitoringFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class SleepMonitoringImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.MovementTracked> movementTracker(
        io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.TotalMovementsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMovementTrackerMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.heartRateRequest> heartRateTracker(
        io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.heartRateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHeartRateTrackerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMovementTrackerMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                smartwatch.sleepmonitoring.MovementTracked,
                smartwatch.sleepmonitoring.TotalMovementsResponse>(
                  this, METHODID_MOVEMENT_TRACKER)))
          .addMethod(
            getHeartRateTrackerMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                smartwatch.sleepmonitoring.heartRateRequest,
                smartwatch.sleepmonitoring.heartRateResponse>(
                  this, METHODID_HEART_RATE_TRACKER)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SleepMonitoringStub extends io.grpc.stub.AbstractStub<SleepMonitoringStub> {
    private SleepMonitoringStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SleepMonitoringStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepMonitoringStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SleepMonitoringStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.MovementTracked> movementTracker(
        io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.TotalMovementsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getMovementTrackerMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.heartRateRequest> heartRateTracker(
        io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.heartRateResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHeartRateTrackerMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SleepMonitoringBlockingStub extends io.grpc.stub.AbstractStub<SleepMonitoringBlockingStub> {
    private SleepMonitoringBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SleepMonitoringBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepMonitoringBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SleepMonitoringBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SleepMonitoringFutureStub extends io.grpc.stub.AbstractStub<SleepMonitoringFutureStub> {
    private SleepMonitoringFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SleepMonitoringFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepMonitoringFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SleepMonitoringFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MOVEMENT_TRACKER = 0;
  private static final int METHODID_HEART_RATE_TRACKER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SleepMonitoringImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SleepMonitoringImplBase serviceImpl, int methodId) {
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
        case METHODID_MOVEMENT_TRACKER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.movementTracker(
              (io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.TotalMovementsResponse>) responseObserver);
        case METHODID_HEART_RATE_TRACKER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heartRateTracker(
              (io.grpc.stub.StreamObserver<smartwatch.sleepmonitoring.heartRateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SleepMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SleepMonitoringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartwatch.sleepmonitoring.SleepMonitoringImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SleepMonitoring");
    }
  }

  private static final class SleepMonitoringFileDescriptorSupplier
      extends SleepMonitoringBaseDescriptorSupplier {
    SleepMonitoringFileDescriptorSupplier() {}
  }

  private static final class SleepMonitoringMethodDescriptorSupplier
      extends SleepMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SleepMonitoringMethodDescriptorSupplier(String methodName) {
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
      synchronized (SleepMonitoringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SleepMonitoringFileDescriptorSupplier())
              .addMethod(getMovementTrackerMethod())
              .addMethod(getHeartRateTrackerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
