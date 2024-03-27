// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class UnlockedMusicOuterClass {
  /**
   * Protobuf type {@code UnlockedMusic}
   */
  public static final class UnlockedMusic extends ProtoMessage<UnlockedMusic> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 group_id = 6;</code>
     */
    private int groupId;

    /**
     * <code>optional uint32 id = 10;</code>
     */
    private int id;

    /**
     * <code>optional bool unkbool = 13;</code>
     */
    private boolean unkbool;

    private UnlockedMusic() {
    }

    /**
     * @return a new empty instance of {@code UnlockedMusic}
     */
    public static UnlockedMusic newInstance() {
      return new UnlockedMusic();
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @return this
     */
    public UnlockedMusic clearGroupId() {
      bitField0_ &= ~0x00000001;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 6;</code>
     * @param value the groupId to set
     * @return this
     */
    public UnlockedMusic setGroupId(final int value) {
      bitField0_ |= 0x00000001;
      groupId = value;
      return this;
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @return this
     */
    public UnlockedMusic clearId() {
      bitField0_ &= ~0x00000002;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 10;</code>
     * @param value the id to set
     * @return this
     */
    public UnlockedMusic setId(final int value) {
      bitField0_ |= 0x00000002;
      id = value;
      return this;
    }

    /**
     * <code>optional bool unkbool = 13;</code>
     * @return whether the unkbool field is set
     */
    public boolean hasUnkbool() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool unkbool = 13;</code>
     * @return this
     */
    public UnlockedMusic clearUnkbool() {
      bitField0_ &= ~0x00000004;
      unkbool = false;
      return this;
    }

    /**
     * <code>optional bool unkbool = 13;</code>
     * @return the unkbool
     */
    public boolean getUnkbool() {
      return unkbool;
    }

    /**
     * <code>optional bool unkbool = 13;</code>
     * @param value the unkbool to set
     * @return this
     */
    public UnlockedMusic setUnkbool(final boolean value) {
      bitField0_ |= 0x00000004;
      unkbool = value;
      return this;
    }

    @Override
    public UnlockedMusic copyFrom(final UnlockedMusic other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupId = other.groupId;
        id = other.id;
        unkbool = other.unkbool;
      }
      return this;
    }

    @Override
    public UnlockedMusic mergeFrom(final UnlockedMusic other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasUnkbool()) {
        setUnkbool(other.unkbool);
      }
      return this;
    }

    @Override
    public UnlockedMusic clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupId = 0;
      id = 0;
      unkbool = false;
      return this;
    }

    @Override
    public UnlockedMusic clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof UnlockedMusic)) {
        return false;
      }
      UnlockedMusic other = (UnlockedMusic) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasId() || id == other.id)
        && (!hasUnkbool() || unkbool == other.unkbool);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeBoolNoTag(unkbool);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UnlockedMusic mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // unkbool
            unkbool = input.readBool();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.unkbool, unkbool);
      }
      output.endObject();
    }

    @Override
    public UnlockedMusic mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -285198628: {
            if (input.isAtField(FieldNames.unkbool)) {
              if (!input.trySkipNullValue()) {
                unkbool = input.readBool();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public UnlockedMusic clone() {
      return new UnlockedMusic().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UnlockedMusic parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UnlockedMusic(), data).checkInitialized();
    }

    public static UnlockedMusic parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockedMusic(), input).checkInitialized();
    }

    public static UnlockedMusic parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockedMusic(), input).checkInitialized();
    }

    /**
     * @return factory for creating UnlockedMusic messages
     */
    public static MessageFactory<UnlockedMusic> getFactory() {
      return UnlockedMusicFactory.INSTANCE;
    }

    private enum UnlockedMusicFactory implements MessageFactory<UnlockedMusic> {
      INSTANCE;

      @Override
      public UnlockedMusic create() {
        return UnlockedMusic.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName id = FieldName.forField("id");

      static final FieldName unkbool = FieldName.forField("unkbool");
    }
  }
}
