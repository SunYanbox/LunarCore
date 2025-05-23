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

public final class SceneEntityTeleportCsReqOuterClass {
  /**
   * Protobuf type {@code SceneEntityTeleportCsReq}
   */
  public static final class SceneEntityTeleportCsReq extends ProtoMessage<SceneEntityTeleportCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 entry_id = 6;</code>
     */
    private int entryId;

    /**
     * <code>optional .EntityMotion entity_motion = 11;</code>
     */
    private final EntityMotionOuterClass.EntityMotion entityMotion = EntityMotionOuterClass.EntityMotion.newInstance();

    private SceneEntityTeleportCsReq() {
    }

    /**
     * @return a new empty instance of {@code SceneEntityTeleportCsReq}
     */
    public static SceneEntityTeleportCsReq newInstance() {
      return new SceneEntityTeleportCsReq();
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @return whether the entryId field is set
     */
    public boolean hasEntryId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @return this
     */
    public SceneEntityTeleportCsReq clearEntryId() {
      bitField0_ &= ~0x00000001;
      entryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @return the entryId
     */
    public int getEntryId() {
      return entryId;
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @param value the entryId to set
     * @return this
     */
    public SceneEntityTeleportCsReq setEntryId(final int value) {
      bitField0_ |= 0x00000001;
      entryId = value;
      return this;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 11;</code>
     * @return whether the entityMotion field is set
     */
    public boolean hasEntityMotion() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 11;</code>
     * @return this
     */
    public SceneEntityTeleportCsReq clearEntityMotion() {
      bitField0_ &= ~0x00000002;
      entityMotion.clear();
      return this;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntityMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public EntityMotionOuterClass.EntityMotion getEntityMotion() {
      return entityMotion;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public EntityMotionOuterClass.EntityMotion getMutableEntityMotion() {
      bitField0_ |= 0x00000002;
      return entityMotion;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 11;</code>
     * @param value the entityMotion to set
     * @return this
     */
    public SceneEntityTeleportCsReq setEntityMotion(
        final EntityMotionOuterClass.EntityMotion value) {
      bitField0_ |= 0x00000002;
      entityMotion.copyFrom(value);
      return this;
    }

    @Override
    public SceneEntityTeleportCsReq copyFrom(final SceneEntityTeleportCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entryId = other.entryId;
        entityMotion.copyFrom(other.entityMotion);
      }
      return this;
    }

    @Override
    public SceneEntityTeleportCsReq mergeFrom(final SceneEntityTeleportCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntryId()) {
        setEntryId(other.entryId);
      }
      if (other.hasEntityMotion()) {
        getMutableEntityMotion().mergeFrom(other.entityMotion);
      }
      return this;
    }

    @Override
    public SceneEntityTeleportCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entryId = 0;
      entityMotion.clear();
      return this;
    }

    @Override
    public SceneEntityTeleportCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityMotion.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEntityTeleportCsReq)) {
        return false;
      }
      SceneEntityTeleportCsReq other = (SceneEntityTeleportCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEntryId() || entryId == other.entryId)
        && (!hasEntityMotion() || entityMotion.equals(other.entityMotion));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(entityMotion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(entityMotion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEntityTeleportCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // entryId
            entryId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // entityMotion
            input.readMessage(entityMotion);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.entryId, entryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.entityMotion, entityMotion);
      }
      output.endObject();
    }

    @Override
    public SceneEntityTeleportCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1591558867:
          case -2093663224: {
            if (input.isAtField(FieldNames.entryId)) {
              if (!input.trySkipNullValue()) {
                entryId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 558225785:
          case -1141226606: {
            if (input.isAtField(FieldNames.entityMotion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(entityMotion);
                bitField0_ |= 0x00000002;
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
    public SceneEntityTeleportCsReq clone() {
      return new SceneEntityTeleportCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEntityTeleportCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEntityTeleportCsReq(), data).checkInitialized();
    }

    public static SceneEntityTeleportCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityTeleportCsReq(), input).checkInitialized();
    }

    public static SceneEntityTeleportCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityTeleportCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEntityTeleportCsReq messages
     */
    public static MessageFactory<SceneEntityTeleportCsReq> getFactory() {
      return SceneEntityTeleportCsReqFactory.INSTANCE;
    }

    private enum SceneEntityTeleportCsReqFactory implements MessageFactory<SceneEntityTeleportCsReq> {
      INSTANCE;

      @Override
      public SceneEntityTeleportCsReq create() {
        return SceneEntityTeleportCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entryId = FieldName.forField("entryId", "entry_id");

      static final FieldName entityMotion = FieldName.forField("entityMotion", "entity_motion");
    }
  }
}
