// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

public interface CompilerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:krotoplus.compiler.CompilerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configuration entries for the 'gRPC Stub Extensions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcStubExtsGenOptions grpc_stub_exts = 20;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.GrpcStubExtsGenOptions> 
      getGrpcStubExtsList();
  /**
   * <pre>
   * Configuration entries for the 'gRPC Stub Extensions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcStubExtsGenOptions grpc_stub_exts = 20;</code>
   */
  com.github.marcoferrer.krotoplus.config.GrpcStubExtsGenOptions getGrpcStubExts(int index);
  /**
   * <pre>
   * Configuration entries for the 'gRPC Stub Extensions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcStubExtsGenOptions grpc_stub_exts = 20;</code>
   */
  int getGrpcStubExtsCount();
  /**
   * <pre>
   * Configuration entries for the 'gRPC Stub Extensions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcStubExtsGenOptions grpc_stub_exts = 20;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.GrpcStubExtsGenOptionsOrBuilder> 
      getGrpcStubExtsOrBuilderList();
  /**
   * <pre>
   * Configuration entries for the 'gRPC Stub Extensions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcStubExtsGenOptions grpc_stub_exts = 20;</code>
   */
  com.github.marcoferrer.krotoplus.config.GrpcStubExtsGenOptionsOrBuilder getGrpcStubExtsOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration entries for the 'Mock Service' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.MockServicesGenOptions mock_services = 21;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.MockServicesGenOptions> 
      getMockServicesList();
  /**
   * <pre>
   * Configuration entries for the 'Mock Service' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.MockServicesGenOptions mock_services = 21;</code>
   */
  com.github.marcoferrer.krotoplus.config.MockServicesGenOptions getMockServices(int index);
  /**
   * <pre>
   * Configuration entries for the 'Mock Service' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.MockServicesGenOptions mock_services = 21;</code>
   */
  int getMockServicesCount();
  /**
   * <pre>
   * Configuration entries for the 'Mock Service' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.MockServicesGenOptions mock_services = 21;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.MockServicesGenOptionsOrBuilder> 
      getMockServicesOrBuilderList();
  /**
   * <pre>
   * Configuration entries for the 'Mock Service' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.MockServicesGenOptions mock_services = 21;</code>
   */
  com.github.marcoferrer.krotoplus.config.MockServicesGenOptionsOrBuilder getMockServicesOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration entries for the 'Proto Builders' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ProtoBuildersGenOptions proto_builders = 22;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions> 
      getProtoBuildersList();
  /**
   * <pre>
   * Configuration entries for the 'Proto Builders' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ProtoBuildersGenOptions proto_builders = 22;</code>
   */
  com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptions getProtoBuilders(int index);
  /**
   * <pre>
   * Configuration entries for the 'Proto Builders' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ProtoBuildersGenOptions proto_builders = 22;</code>
   */
  int getProtoBuildersCount();
  /**
   * <pre>
   * Configuration entries for the 'Proto Builders' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ProtoBuildersGenOptions proto_builders = 22;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptionsOrBuilder> 
      getProtoBuildersOrBuilderList();
  /**
   * <pre>
   * Configuration entries for the 'Proto Builders' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ProtoBuildersGenOptions proto_builders = 22;</code>
   */
  com.github.marcoferrer.krotoplus.config.ProtoBuildersGenOptionsOrBuilder getProtoBuildersOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration entries for the 'Extendable Messages' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ExtendableMessagesGenOptions extendable_messages = 23;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.ExtendableMessagesGenOptions> 
      getExtendableMessagesList();
  /**
   * <pre>
   * Configuration entries for the 'Extendable Messages' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ExtendableMessagesGenOptions extendable_messages = 23;</code>
   */
  com.github.marcoferrer.krotoplus.config.ExtendableMessagesGenOptions getExtendableMessages(int index);
  /**
   * <pre>
   * Configuration entries for the 'Extendable Messages' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ExtendableMessagesGenOptions extendable_messages = 23;</code>
   */
  int getExtendableMessagesCount();
  /**
   * <pre>
   * Configuration entries for the 'Extendable Messages' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ExtendableMessagesGenOptions extendable_messages = 23;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.ExtendableMessagesGenOptionsOrBuilder> 
      getExtendableMessagesOrBuilderList();
  /**
   * <pre>
   * Configuration entries for the 'Extendable Messages' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.ExtendableMessagesGenOptions extendable_messages = 23;</code>
   */
  com.github.marcoferrer.krotoplus.config.ExtendableMessagesGenOptionsOrBuilder getExtendableMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration entries for the 'Protoc Insertions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions insertions = 24;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.InsertionsGenOptions> 
      getInsertionsList();
  /**
   * <pre>
   * Configuration entries for the 'Protoc Insertions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions insertions = 24;</code>
   */
  com.github.marcoferrer.krotoplus.config.InsertionsGenOptions getInsertions(int index);
  /**
   * <pre>
   * Configuration entries for the 'Protoc Insertions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions insertions = 24;</code>
   */
  int getInsertionsCount();
  /**
   * <pre>
   * Configuration entries for the 'Protoc Insertions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions insertions = 24;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.InsertionsGenOptionsOrBuilder> 
      getInsertionsOrBuilderList();
  /**
   * <pre>
   * Configuration entries for the 'Protoc Insertions' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.InsertionsGenOptions insertions = 24;</code>
   */
  com.github.marcoferrer.krotoplus.config.InsertionsGenOptionsOrBuilder getInsertionsOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration entries for the 'Generator Scripts' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GeneratorScriptsGenOptions generator_scripts = 25;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions> 
      getGeneratorScriptsList();
  /**
   * <pre>
   * Configuration entries for the 'Generator Scripts' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GeneratorScriptsGenOptions generator_scripts = 25;</code>
   */
  com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions getGeneratorScripts(int index);
  /**
   * <pre>
   * Configuration entries for the 'Generator Scripts' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GeneratorScriptsGenOptions generator_scripts = 25;</code>
   */
  int getGeneratorScriptsCount();
  /**
   * <pre>
   * Configuration entries for the 'Generator Scripts' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GeneratorScriptsGenOptions generator_scripts = 25;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptionsOrBuilder> 
      getGeneratorScriptsOrBuilderList();
  /**
   * <pre>
   * Configuration entries for the 'Generator Scripts' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GeneratorScriptsGenOptions generator_scripts = 25;</code>
   */
  com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptionsOrBuilder getGeneratorScriptsOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration entries for the 'Grpc Coroutines' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcCoroutinesGenOptions grpc_coroutines = 26;</code>
   */
  java.util.List<com.github.marcoferrer.krotoplus.config.GrpcCoroutinesGenOptions> 
      getGrpcCoroutinesList();
  /**
   * <pre>
   * Configuration entries for the 'Grpc Coroutines' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcCoroutinesGenOptions grpc_coroutines = 26;</code>
   */
  com.github.marcoferrer.krotoplus.config.GrpcCoroutinesGenOptions getGrpcCoroutines(int index);
  /**
   * <pre>
   * Configuration entries for the 'Grpc Coroutines' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcCoroutinesGenOptions grpc_coroutines = 26;</code>
   */
  int getGrpcCoroutinesCount();
  /**
   * <pre>
   * Configuration entries for the 'Grpc Coroutines' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcCoroutinesGenOptions grpc_coroutines = 26;</code>
   */
  java.util.List<? extends com.github.marcoferrer.krotoplus.config.GrpcCoroutinesGenOptionsOrBuilder> 
      getGrpcCoroutinesOrBuilderList();
  /**
   * <pre>
   * Configuration entries for the 'Grpc Coroutines' code generator.
   * </pre>
   *
   * <code>repeated .krotoplus.compiler.GrpcCoroutinesGenOptions grpc_coroutines = 26;</code>
   */
  com.github.marcoferrer.krotoplus.config.GrpcCoroutinesGenOptionsOrBuilder getGrpcCoroutinesOrBuilder(
      int index);
}
