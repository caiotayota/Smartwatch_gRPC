package com.caiotayota.smartwatch.musicPlayer;

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
    comments = "Source: musicPlayer.proto")
public final class MusicPlayerServiceGrpc {

  private MusicPlayerServiceGrpc() {}

  public static final String SERVICE_NAME = "musicPlayer.MusicPlayerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.caiotayota.smartwatch.musicPlayer.MusicRequest,
      com.caiotayota.smartwatch.musicPlayer.MusicResponse> getPlayMusicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "playMusic",
      requestType = com.caiotayota.smartwatch.musicPlayer.MusicRequest.class,
      responseType = com.caiotayota.smartwatch.musicPlayer.MusicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.caiotayota.smartwatch.musicPlayer.MusicRequest,
      com.caiotayota.smartwatch.musicPlayer.MusicResponse> getPlayMusicMethod() {
    io.grpc.MethodDescriptor<com.caiotayota.smartwatch.musicPlayer.MusicRequest, com.caiotayota.smartwatch.musicPlayer.MusicResponse> getPlayMusicMethod;
    if ((getPlayMusicMethod = MusicPlayerServiceGrpc.getPlayMusicMethod) == null) {
      synchronized (MusicPlayerServiceGrpc.class) {
        if ((getPlayMusicMethod = MusicPlayerServiceGrpc.getPlayMusicMethod) == null) {
          MusicPlayerServiceGrpc.getPlayMusicMethod = getPlayMusicMethod = 
              io.grpc.MethodDescriptor.<com.caiotayota.smartwatch.musicPlayer.MusicRequest, com.caiotayota.smartwatch.musicPlayer.MusicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "musicPlayer.MusicPlayerService", "playMusic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.musicPlayer.MusicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.caiotayota.smartwatch.musicPlayer.MusicResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MusicPlayerServiceMethodDescriptorSupplier("playMusic"))
                  .build();
          }
        }
     }
     return getPlayMusicMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MusicPlayerServiceStub newStub(io.grpc.Channel channel) {
    return new MusicPlayerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MusicPlayerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MusicPlayerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MusicPlayerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MusicPlayerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MusicPlayerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public void playMusic(com.caiotayota.smartwatch.musicPlayer.MusicRequest request,
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.musicPlayer.MusicResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMusicMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMusicMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.caiotayota.smartwatch.musicPlayer.MusicRequest,
                com.caiotayota.smartwatch.musicPlayer.MusicResponse>(
                  this, METHODID_PLAY_MUSIC)))
          .build();
    }
  }

  /**
   */
  public static final class MusicPlayerServiceStub extends io.grpc.stub.AbstractStub<MusicPlayerServiceStub> {
    private MusicPlayerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MusicPlayerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicPlayerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MusicPlayerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public void playMusic(com.caiotayota.smartwatch.musicPlayer.MusicRequest request,
        io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.musicPlayer.MusicResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlayMusicMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MusicPlayerServiceBlockingStub extends io.grpc.stub.AbstractStub<MusicPlayerServiceBlockingStub> {
    private MusicPlayerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MusicPlayerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicPlayerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MusicPlayerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public java.util.Iterator<com.caiotayota.smartwatch.musicPlayer.MusicResponse> playMusic(
        com.caiotayota.smartwatch.musicPlayer.MusicRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPlayMusicMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MusicPlayerServiceFutureStub extends io.grpc.stub.AbstractStub<MusicPlayerServiceFutureStub> {
    private MusicPlayerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MusicPlayerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MusicPlayerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MusicPlayerServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PLAY_MUSIC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MusicPlayerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MusicPlayerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY_MUSIC:
          serviceImpl.playMusic((com.caiotayota.smartwatch.musicPlayer.MusicRequest) request,
              (io.grpc.stub.StreamObserver<com.caiotayota.smartwatch.musicPlayer.MusicResponse>) responseObserver);
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

  private static abstract class MusicPlayerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MusicPlayerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.caiotayota.smartwatch.musicPlayer.MusicPlayerServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MusicPlayerService");
    }
  }

  private static final class MusicPlayerServiceFileDescriptorSupplier
      extends MusicPlayerServiceBaseDescriptorSupplier {
    MusicPlayerServiceFileDescriptorSupplier() {}
  }

  private static final class MusicPlayerServiceMethodDescriptorSupplier
      extends MusicPlayerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MusicPlayerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MusicPlayerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MusicPlayerServiceFileDescriptorSupplier())
              .addMethod(getPlayMusicMethod())
              .build();
        }
      }
    }
    return result;
  }
}
