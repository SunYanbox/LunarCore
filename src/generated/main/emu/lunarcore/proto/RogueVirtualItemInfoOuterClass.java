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

public final class RogueVirtualItemInfoOuterClass {
  /**
   * Protobuf type {@code RogueVirtualItemInfo}
   */
  public static final class RogueVirtualItemInfo extends ProtoMessage<RogueVirtualItemInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 money = 8;</code>
     */
    private int money;

    /**
     * <code>optional uint32 X = 9;</code>
     */
    private int x;

    private RogueVirtualItemInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueVirtualItemInfo}
     */
    public static RogueVirtualItemInfo newInstance() {
      return new RogueVirtualItemInfo();
    }

    /**
     * <code>optional uint32 money = 8;</code>
     * @return whether the money field is set
     */
    public boolean hasMoney() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 money = 8;</code>
     * @return this
     */
    public RogueVirtualItemInfo clearMoney() {
      bitField0_ &= ~0x00000001;
      money = 0;
      return this;
    }

    /**
     * <code>optional uint32 money = 8;</code>
     * @return the money
     */
    public int getMoney() {
      return money;
    }

    /**
     * <code>optional uint32 money = 8;</code>
     * @param value the money to set
     * @return this
     */
    public RogueVirtualItemInfo setMoney(final int value) {
      bitField0_ |= 0x00000001;
      money = value;
      return this;
    }

    /**
     * <code>optional uint32 X = 9;</code>
     * @return whether the x field is set
     */
    public boolean hasX() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 X = 9;</code>
     * @return this
     */
    public RogueVirtualItemInfo clearX() {
      bitField0_ &= ~0x00000002;
      x = 0;
      return this;
    }

    /**
     * <code>optional uint32 X = 9;</code>
     * @return the x
     */
    public int getX() {
      return x;
    }

    /**
     * <code>optional uint32 X = 9;</code>
     * @param value the x to set
     * @return this
     */
    public RogueVirtualItemInfo setX(final int value) {
      bitField0_ |= 0x00000002;
      x = value;
      return this;
    }

    @Override
    public RogueVirtualItemInfo copyFrom(final RogueVirtualItemInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        money = other.money;
        x = other.x;
      }
      return this;
    }

    @Override
    public RogueVirtualItemInfo mergeFrom(final RogueVirtualItemInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMoney()) {
        setMoney(other.money);
      }
      if (other.hasX()) {
        setX(other.x);
      }
      return this;
    }

    @Override
    public RogueVirtualItemInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      money = 0;
      x = 0;
      return this;
    }

    @Override
    public RogueVirtualItemInfo clearQuick() {
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
      if (!(o instanceof RogueVirtualItemInfo)) {
        return false;
      }
      RogueVirtualItemInfo other = (RogueVirtualItemInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasMoney() || money == other.money)
        && (!hasX() || x == other.x);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(money);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(x);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(money);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(x);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueVirtualItemInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // money
            money = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // x
            x = input.readUInt32();
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
        output.writeUInt32(FieldNames.money, money);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.x, x);
      }
      output.endObject();
    }

    @Override
    public RogueVirtualItemInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 104079552: {
            if (input.isAtField(FieldNames.money)) {
              if (!input.trySkipNullValue()) {
                money = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 88: {
            if (input.isAtField(FieldNames.x)) {
              if (!input.trySkipNullValue()) {
                x = input.readUInt32();
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
    public RogueVirtualItemInfo clone() {
      return new RogueVirtualItemInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueVirtualItemInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), data).checkInitialized();
    }

    public static RogueVirtualItemInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), input).checkInitialized();
    }

    public static RogueVirtualItemInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueVirtualItemInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueVirtualItemInfo messages
     */
    public static MessageFactory<RogueVirtualItemInfo> getFactory() {
      return RogueVirtualItemInfoFactory.INSTANCE;
    }

    private enum RogueVirtualItemInfoFactory implements MessageFactory<RogueVirtualItemInfo> {
      INSTANCE;

      @Override
      public RogueVirtualItemInfo create() {
        return RogueVirtualItemInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName money = FieldName.forField("money");

      static final FieldName x = FieldName.forField("X");
    }
  }
}
