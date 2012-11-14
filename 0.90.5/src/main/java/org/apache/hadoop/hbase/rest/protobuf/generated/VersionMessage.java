// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VersionMessage.proto

package org.apache.hadoop.hbase.rest.protobuf.generated;

public final class VersionMessage {
  private VersionMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Version extends
      com.google.protobuf.GeneratedMessage {
    // Use Version.newBuilder() to construct.
    private Version() {
      initFields();
    }
    private Version(boolean noInit) {}
    
    private static final Version defaultInstance;
    public static Version getDefaultInstance() {
      return defaultInstance;
    }
    
    public Version getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_fieldAccessorTable;
    }
    
    // optional string restVersion = 1;
    public static final int RESTVERSION_FIELD_NUMBER = 1;
    private boolean hasRestVersion;
    private java.lang.String restVersion_ = "";
    public boolean hasRestVersion() { return hasRestVersion; }
    public java.lang.String getRestVersion() { return restVersion_; }
    
    // optional string jvmVersion = 2;
    public static final int JVMVERSION_FIELD_NUMBER = 2;
    private boolean hasJvmVersion;
    private java.lang.String jvmVersion_ = "";
    public boolean hasJvmVersion() { return hasJvmVersion; }
    public java.lang.String getJvmVersion() { return jvmVersion_; }
    
    // optional string osVersion = 3;
    public static final int OSVERSION_FIELD_NUMBER = 3;
    private boolean hasOsVersion;
    private java.lang.String osVersion_ = "";
    public boolean hasOsVersion() { return hasOsVersion; }
    public java.lang.String getOsVersion() { return osVersion_; }
    
    // optional string serverVersion = 4;
    public static final int SERVERVERSION_FIELD_NUMBER = 4;
    private boolean hasServerVersion;
    private java.lang.String serverVersion_ = "";
    public boolean hasServerVersion() { return hasServerVersion; }
    public java.lang.String getServerVersion() { return serverVersion_; }
    
    // optional string jerseyVersion = 5;
    public static final int JERSEYVERSION_FIELD_NUMBER = 5;
    private boolean hasJerseyVersion;
    private java.lang.String jerseyVersion_ = "";
    public boolean hasJerseyVersion() { return hasJerseyVersion; }
    public java.lang.String getJerseyVersion() { return jerseyVersion_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRestVersion()) {
        output.writeString(1, getRestVersion());
      }
      if (hasJvmVersion()) {
        output.writeString(2, getJvmVersion());
      }
      if (hasOsVersion()) {
        output.writeString(3, getOsVersion());
      }
      if (hasServerVersion()) {
        output.writeString(4, getServerVersion());
      }
      if (hasJerseyVersion()) {
        output.writeString(5, getJerseyVersion());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRestVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getRestVersion());
      }
      if (hasJvmVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getJvmVersion());
      }
      if (hasOsVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getOsVersion());
      }
      if (hasServerVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getServerVersion());
      }
      if (hasJerseyVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getJerseyVersion());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version result;
      
      // Construct using org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version();
        return builder;
      }
      
      protected org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version) {
          return mergeFrom((org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version other) {
        if (other == org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.getDefaultInstance()) return this;
        if (other.hasRestVersion()) {
          setRestVersion(other.getRestVersion());
        }
        if (other.hasJvmVersion()) {
          setJvmVersion(other.getJvmVersion());
        }
        if (other.hasOsVersion()) {
          setOsVersion(other.getOsVersion());
        }
        if (other.hasServerVersion()) {
          setServerVersion(other.getServerVersion());
        }
        if (other.hasJerseyVersion()) {
          setJerseyVersion(other.getJerseyVersion());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setRestVersion(input.readString());
              break;
            }
            case 18: {
              setJvmVersion(input.readString());
              break;
            }
            case 26: {
              setOsVersion(input.readString());
              break;
            }
            case 34: {
              setServerVersion(input.readString());
              break;
            }
            case 42: {
              setJerseyVersion(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string restVersion = 1;
      public boolean hasRestVersion() {
        return result.hasRestVersion();
      }
      public java.lang.String getRestVersion() {
        return result.getRestVersion();
      }
      public Builder setRestVersion(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRestVersion = true;
        result.restVersion_ = value;
        return this;
      }
      public Builder clearRestVersion() {
        result.hasRestVersion = false;
        result.restVersion_ = getDefaultInstance().getRestVersion();
        return this;
      }
      
      // optional string jvmVersion = 2;
      public boolean hasJvmVersion() {
        return result.hasJvmVersion();
      }
      public java.lang.String getJvmVersion() {
        return result.getJvmVersion();
      }
      public Builder setJvmVersion(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasJvmVersion = true;
        result.jvmVersion_ = value;
        return this;
      }
      public Builder clearJvmVersion() {
        result.hasJvmVersion = false;
        result.jvmVersion_ = getDefaultInstance().getJvmVersion();
        return this;
      }
      
      // optional string osVersion = 3;
      public boolean hasOsVersion() {
        return result.hasOsVersion();
      }
      public java.lang.String getOsVersion() {
        return result.getOsVersion();
      }
      public Builder setOsVersion(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasOsVersion = true;
        result.osVersion_ = value;
        return this;
      }
      public Builder clearOsVersion() {
        result.hasOsVersion = false;
        result.osVersion_ = getDefaultInstance().getOsVersion();
        return this;
      }
      
      // optional string serverVersion = 4;
      public boolean hasServerVersion() {
        return result.hasServerVersion();
      }
      public java.lang.String getServerVersion() {
        return result.getServerVersion();
      }
      public Builder setServerVersion(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasServerVersion = true;
        result.serverVersion_ = value;
        return this;
      }
      public Builder clearServerVersion() {
        result.hasServerVersion = false;
        result.serverVersion_ = getDefaultInstance().getServerVersion();
        return this;
      }
      
      // optional string jerseyVersion = 5;
      public boolean hasJerseyVersion() {
        return result.hasJerseyVersion();
      }
      public java.lang.String getJerseyVersion() {
        return result.getJerseyVersion();
      }
      public Builder setJerseyVersion(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasJerseyVersion = true;
        result.jerseyVersion_ = value;
        return this;
      }
      public Builder clearJerseyVersion() {
        result.hasJerseyVersion = false;
        result.jerseyVersion_ = getDefaultInstance().getJerseyVersion();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.hbase.rest.protobuf.generated.Version)
    }
    
    static {
      defaultInstance = new Version(true);
      org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.apache.hadoop.hbase.rest.protobuf.generated.Version)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024VersionMessage.proto\022/org.apache.hadoo" +
      "p.hbase.rest.protobuf.generated\"s\n\007Versi" +
      "on\022\023\n\013restVersion\030\001 \001(\t\022\022\n\njvmVersion\030\002 " +
      "\001(\t\022\021\n\tosVersion\030\003 \001(\t\022\025\n\rserverVersion\030" +
      "\004 \001(\t\022\025\n\rjerseyVersion\030\005 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor,
              new java.lang.String[] { "RestVersion", "JvmVersion", "OsVersion", "ServerVersion", "JerseyVersion", },
              org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.class,
              org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}