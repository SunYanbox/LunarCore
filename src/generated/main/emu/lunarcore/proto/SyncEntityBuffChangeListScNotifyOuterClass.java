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
import us.hebi.quickbuf.RepeatedMessage;

public final class SyncEntityBuffChangeListScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncEntityBuffChangeListScNotify}
   */
  public static final class SyncEntityBuffChangeListScNotify extends ProtoMessage<SyncEntityBuffChangeListScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .EntityBuffChangeInfo entity_buff_info_list = 9;</code>
     */
    private final RepeatedMessage<EntityBuffChangeInfoOuterClass.EntityBuffChangeInfo> entityBuffInfoList = RepeatedMessage.newEmptyInstance(EntityBuffChangeInfoOuterClass.EntityBuffChangeInfo.getFactory());

    private SyncEntityBuffChangeListScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncEntityBuffChangeListScNotify}
     */
    public static SyncEntityBuffChangeListScNotify newInstance() {
      return new SyncEntityBuffChangeListScNotify();
    }

    /**
     * <code>repeated .EntityBuffChangeInfo entity_buff_info_list = 9;</code>
     * @return whether the entityBuffInfoList field is set
     */
    public boolean hasEntityBuffInfoList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .EntityBuffChangeInfo entity_buff_info_list = 9;</code>
     * @return this
     */
    public SyncEntityBuffChangeListScNotify clearEntityBuffInfoList() {
      bitField0_ &= ~0x00000001;
      entityBuffInfoList.clear();
      return this;
    }

    /**
     * <code>repeated .EntityBuffChangeInfo entity_buff_info_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntityBuffInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<EntityBuffChangeInfoOuterClass.EntityBuffChangeInfo> getEntityBuffInfoList(
        ) {
      return entityBuffInfoList;
    }

    /**
     * <code>repeated .EntityBuffChangeInfo entity_buff_info_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<EntityBuffChangeInfoOuterClass.EntityBuffChangeInfo> getMutableEntityBuffInfoList(
        ) {
      bitField0_ |= 0x00000001;
      return entityBuffInfoList;
    }

    /**
     * <code>repeated .EntityBuffChangeInfo entity_buff_info_list = 9;</code>
     * @param value the entityBuffInfoList to add
     * @return this
     */
    public SyncEntityBuffChangeListScNotify addEntityBuffInfoList(
        final EntityBuffChangeInfoOuterClass.EntityBuffChangeInfo value) {
      bitField0_ |= 0x00000001;
      entityBuffInfoList.add(value);
      return this;
    }

    /**
     * <code>repeated .EntityBuffChangeInfo entity_buff_info_list = 9;</code>
     * @param values the entityBuffInfoList to add
     * @return this
     */
    public SyncEntityBuffChangeListScNotify addAllEntityBuffInfoList(
        final EntityBuffChangeInfoOuterClass.EntityBuffChangeInfo... values) {
      bitField0_ |= 0x00000001;
      entityBuffInfoList.addAll(values);
      return this;
    }

    @Override
    public SyncEntityBuffChangeListScNotify copyFrom(final SyncEntityBuffChangeListScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        entityBuffInfoList.copyFrom(other.entityBuffInfoList);
      }
      return this;
    }

    @Override
    public SyncEntityBuffChangeListScNotify mergeFrom(
        final SyncEntityBuffChangeListScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEntityBuffInfoList()) {
        getMutableEntityBuffInfoList().addAll(other.entityBuffInfoList);
      }
      return this;
    }

    @Override
    public SyncEntityBuffChangeListScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityBuffInfoList.clear();
      return this;
    }

    @Override
    public SyncEntityBuffChangeListScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityBuffInfoList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncEntityBuffChangeListScNotify)) {
        return false;
      }
      SyncEntityBuffChangeListScNotify other = (SyncEntityBuffChangeListScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasEntityBuffInfoList() || entityBuffInfoList.equals(other.entityBuffInfoList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < entityBuffInfoList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(entityBuffInfoList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * entityBuffInfoList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(entityBuffInfoList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncEntityBuffChangeListScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 74: {
            // entityBuffInfoList
            tag = input.readRepeatedMessage(entityBuffInfoList, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.entityBuffInfoList, entityBuffInfoList);
      }
      output.endObject();
    }

    @Override
    public SyncEntityBuffChangeListScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -614748318:
          case -1583683457: {
            if (input.isAtField(FieldNames.entityBuffInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(entityBuffInfoList);
                bitField0_ |= 0x00000001;
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
    public SyncEntityBuffChangeListScNotify clone() {
      return new SyncEntityBuffChangeListScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncEntityBuffChangeListScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncEntityBuffChangeListScNotify(), data).checkInitialized();
    }

    public static SyncEntityBuffChangeListScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncEntityBuffChangeListScNotify(), input).checkInitialized();
    }

    public static SyncEntityBuffChangeListScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncEntityBuffChangeListScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncEntityBuffChangeListScNotify messages
     */
    public static MessageFactory<SyncEntityBuffChangeListScNotify> getFactory() {
      return SyncEntityBuffChangeListScNotifyFactory.INSTANCE;
    }

    private enum SyncEntityBuffChangeListScNotifyFactory implements MessageFactory<SyncEntityBuffChangeListScNotify> {
      INSTANCE;

      @Override
      public SyncEntityBuffChangeListScNotify create() {
        return SyncEntityBuffChangeListScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName entityBuffInfoList = FieldName.forField("entityBuffInfoList", "entity_buff_info_list");
    }
  }
}
