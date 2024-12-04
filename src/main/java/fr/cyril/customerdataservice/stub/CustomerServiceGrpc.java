package fr.cyril.customerdataservice.stub;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: CustomerService.proto")
public class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "CustomerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> METHOD_GET_ALL_CUSTOMERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CustomerService", "getAllCustomers"),
          io.grpc.protobuf.ProtoUtils.marshaller(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> METHOD_GET_CUSTOMER_BY_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CustomerService", "getCustomerById"),
          io.grpc.protobuf.ProtoUtils.marshaller(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest,
      fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> METHOD_ADD_CUSTOMER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "CustomerService", "addCustomer"),
          io.grpc.protobuf.ProtoUtils.marshaller(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCustomers(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_CUSTOMERS, responseObserver);
    }

    /**
     */
    public void getCustomerById(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CUSTOMER_BY_ID, responseObserver);
    }

    /**
     */
    public void addCustomer(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_CUSTOMER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ALL_CUSTOMERS,
            asyncUnaryCall(
              new MethodHandlers<
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse>(
                  this, METHODID_GET_ALL_CUSTOMERS)))
          .addMethod(
            METHOD_GET_CUSTOMER_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>(
                  this, METHODID_GET_CUSTOMER_BY_ID)))
          .addMethod(
            METHOD_ADD_CUSTOMER,
            asyncUnaryCall(
              new MethodHandlers<
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest,
                fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse>(
                  this, METHODID_ADD_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCustomers(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CUSTOMERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerById(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CUSTOMER_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCustomer(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request,
        io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_CUSTOMER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse getAllCustomers(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_CUSTOMERS, getCallOptions(), request);
    }

    /**
     */
    public fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse getCustomerById(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CUSTOMER_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse addCustomer(fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_CUSTOMER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse> getAllCustomers(
        fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CUSTOMERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getCustomerById(
        fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CUSTOMER_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse> addCustomer(
        fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_CUSTOMER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CUSTOMERS = 0;
  private static final int METHODID_GET_CUSTOMER_BY_ID = 1;
  private static final int METHODID_ADD_CUSTOMER = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CUSTOMERS:
          serviceImpl.getAllCustomers((fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest) request,
              (io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BY_ID:
          serviceImpl.getCustomerById((fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest) request,
              (io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>) responseObserver);
          break;
        case METHODID_ADD_CUSTOMER:
          serviceImpl.addCustomer((fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest) request,
              (io.grpc.stub.StreamObserver<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_ALL_CUSTOMERS,
        METHOD_GET_CUSTOMER_BY_ID,
        METHOD_ADD_CUSTOMER);
  }

}
