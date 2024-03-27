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

public final class ChangeLineupLeaderCsReqOuterClass {
  /**
   * Protobuf type {@code ChangeLineupLeaderCsReq}
   */
  public static final class ChangeLineupLeaderCsReq extends ProtoMessage<ChangeLineupLeaderCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 slot = 1;</code>
     */
    private int slot;

    private ChangeLineupLeaderCsReq() {
    }

    /**
     * @return a new empty instance of {@code ChangeLineupLeaderCsReq}
     */
    public static ChangeLineupLeaderCsReq newInstance() {
      return new ChangeLineupLeaderCsReq();
    }

    /**
     * <code>optional uint32 slot = 1;</code>
     * @return whether the slot field is set
     */
    public boolean hasSlot() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 slot = 1;</code>
     * @return this
     */
    public ChangeLineupLeaderCsReq clearSlot() {
      bitField0_ &= ~0x00000001;
      slot = 0;
      return this;
    }

    /**
     * <code>optional uint32 slot = 1;</code>
     * @return the slot
     */
    public int getSlot() {
      return slot;
    }

    /**
     * <code>optional uint32 slot = 1;</code>
     * @param value the slot to set
     * @return this
     */
    public ChangeLineupLeaderCsReq setSlot(final int value) {
      bitField0_ |= 0x00000001;
      slot = value;
      return this;
    }

    @Override
    public ChangeLineupLeaderCsReq copyFrom(final ChangeLineupLeaderCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        slot = other.slot;
      }
      return this;
    }

    @Override
    public ChangeLineupLeaderCsReq mergeFrom(final ChangeLineupLeaderCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSlot()) {
        setSlot(other.slot);
      }
      return this;
    }

    @Override
    public ChangeLineupLeaderCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      slot = 0;
      return this;
    }

    @Override
    public ChangeLineupLeaderCsReq clearQuick() {
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
      if (!(o instanceof ChangeLineupLeaderCsReq)) {
        return false;
      }
      ChangeLineupLeaderCsReq other = (ChangeLineupLeaderCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasSlot() || slot == other.slot);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(slot);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(slot);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChangeLineupLeaderCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // slot
            slot = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.slot, slot);
      }
      output.endObject();
    }

    @Override
    public ChangeLineupLeaderCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3533310: {
            if (input.isAtField(FieldNames.slot)) {
              if (!input.trySkipNullValue()) {
                slot = input.readUInt32();
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
    public ChangeLineupLeaderCsReq clone() {
      return new ChangeLineupLeaderCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChangeLineupLeaderCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChangeLineupLeaderCsReq(), data).checkInitialized();
    }

    public static ChangeLineupLeaderCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChangeLineupLeaderCsReq(), input).checkInitialized();
    }

    public static ChangeLineupLeaderCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChangeLineupLeaderCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChangeLineupLeaderCsReq messages
     */
    public static MessageFactory<ChangeLineupLeaderCsReq> getFactory() {
      return ChangeLineupLeaderCsReqFactory.INSTANCE;
    }

    private enum ChangeLineupLeaderCsReqFactory implements MessageFactory<ChangeLineupLeaderCsReq> {
      INSTANCE;

      @Override
      public ChangeLineupLeaderCsReq create() {
        return ChangeLineupLeaderCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName slot = FieldName.forField("slot");
    }
  }
}
