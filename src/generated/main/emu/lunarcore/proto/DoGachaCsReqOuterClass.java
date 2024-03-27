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

public final class DoGachaCsReqOuterClass {
  /**
   * Protobuf type {@code DoGachaCsReq}
   */
  public static final class DoGachaCsReq extends ProtoMessage<DoGachaCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     */
    private int gachaId;

    /**
     * <code>optional uint32 simulate_magic = 7;</code>
     */
    private int simulateMagic;

    /**
     * <code>optional uint32 gacha_random = 11;</code>
     */
    private int gachaRandom;

    /**
     * <code>optional uint32 gacha_num = 12;</code>
     */
    private int gachaNum;

    private DoGachaCsReq() {
    }

    /**
     * @return a new empty instance of {@code DoGachaCsReq}
     */
    public static DoGachaCsReq newInstance() {
      return new DoGachaCsReq();
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @return whether the gachaId field is set
     */
    public boolean hasGachaId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @return this
     */
    public DoGachaCsReq clearGachaId() {
      bitField0_ &= ~0x00000001;
      gachaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @return the gachaId
     */
    public int getGachaId() {
      return gachaId;
    }

    /**
     * <code>optional uint32 gacha_id = 4;</code>
     * @param value the gachaId to set
     * @return this
     */
    public DoGachaCsReq setGachaId(final int value) {
      bitField0_ |= 0x00000001;
      gachaId = value;
      return this;
    }

    /**
     * <code>optional uint32 simulate_magic = 7;</code>
     * @return whether the simulateMagic field is set
     */
    public boolean hasSimulateMagic() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 simulate_magic = 7;</code>
     * @return this
     */
    public DoGachaCsReq clearSimulateMagic() {
      bitField0_ &= ~0x00000002;
      simulateMagic = 0;
      return this;
    }

    /**
     * <code>optional uint32 simulate_magic = 7;</code>
     * @return the simulateMagic
     */
    public int getSimulateMagic() {
      return simulateMagic;
    }

    /**
     * <code>optional uint32 simulate_magic = 7;</code>
     * @param value the simulateMagic to set
     * @return this
     */
    public DoGachaCsReq setSimulateMagic(final int value) {
      bitField0_ |= 0x00000002;
      simulateMagic = value;
      return this;
    }

    /**
     * <code>optional uint32 gacha_random = 11;</code>
     * @return whether the gachaRandom field is set
     */
    public boolean hasGachaRandom() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 gacha_random = 11;</code>
     * @return this
     */
    public DoGachaCsReq clearGachaRandom() {
      bitField0_ &= ~0x00000004;
      gachaRandom = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_random = 11;</code>
     * @return the gachaRandom
     */
    public int getGachaRandom() {
      return gachaRandom;
    }

    /**
     * <code>optional uint32 gacha_random = 11;</code>
     * @param value the gachaRandom to set
     * @return this
     */
    public DoGachaCsReq setGachaRandom(final int value) {
      bitField0_ |= 0x00000004;
      gachaRandom = value;
      return this;
    }

    /**
     * <code>optional uint32 gacha_num = 12;</code>
     * @return whether the gachaNum field is set
     */
    public boolean hasGachaNum() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 gacha_num = 12;</code>
     * @return this
     */
    public DoGachaCsReq clearGachaNum() {
      bitField0_ &= ~0x00000008;
      gachaNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_num = 12;</code>
     * @return the gachaNum
     */
    public int getGachaNum() {
      return gachaNum;
    }

    /**
     * <code>optional uint32 gacha_num = 12;</code>
     * @param value the gachaNum to set
     * @return this
     */
    public DoGachaCsReq setGachaNum(final int value) {
      bitField0_ |= 0x00000008;
      gachaNum = value;
      return this;
    }

    @Override
    public DoGachaCsReq copyFrom(final DoGachaCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gachaId = other.gachaId;
        simulateMagic = other.simulateMagic;
        gachaRandom = other.gachaRandom;
        gachaNum = other.gachaNum;
      }
      return this;
    }

    @Override
    public DoGachaCsReq mergeFrom(final DoGachaCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGachaId()) {
        setGachaId(other.gachaId);
      }
      if (other.hasSimulateMagic()) {
        setSimulateMagic(other.simulateMagic);
      }
      if (other.hasGachaRandom()) {
        setGachaRandom(other.gachaRandom);
      }
      if (other.hasGachaNum()) {
        setGachaNum(other.gachaNum);
      }
      return this;
    }

    @Override
    public DoGachaCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaId = 0;
      simulateMagic = 0;
      gachaRandom = 0;
      gachaNum = 0;
      return this;
    }

    @Override
    public DoGachaCsReq clearQuick() {
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
      if (!(o instanceof DoGachaCsReq)) {
        return false;
      }
      DoGachaCsReq other = (DoGachaCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasGachaId() || gachaId == other.gachaId)
        && (!hasSimulateMagic() || simulateMagic == other.simulateMagic)
        && (!hasGachaRandom() || gachaRandom == other.gachaRandom)
        && (!hasGachaNum() || gachaNum == other.gachaNum);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(gachaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(simulateMagic);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(gachaRandom);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(gachaNum);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(simulateMagic);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaRandom);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaNum);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DoGachaCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // gachaId
            gachaId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // simulateMagic
            simulateMagic = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // gachaRandom
            gachaRandom = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // gachaNum
            gachaNum = input.readUInt32();
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.gachaId, gachaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.simulateMagic, simulateMagic);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.gachaRandom, gachaRandom);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.gachaNum, gachaNum);
      }
      output.endObject();
    }

    @Override
    public DoGachaCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -204751299:
          case -2052301576: {
            if (input.isAtField(FieldNames.gachaId)) {
              if (!input.trySkipNullValue()) {
                gachaId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -370053655:
          case 1939465170: {
            if (input.isAtField(FieldNames.simulateMagic)) {
              if (!input.trySkipNullValue()) {
                simulateMagic = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1635961627:
          case -47579616: {
            if (input.isAtField(FieldNames.gachaRandom)) {
              if (!input.trySkipNullValue()) {
                gachaRandom = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2052317532:
          case 803166025: {
            if (input.isAtField(FieldNames.gachaNum)) {
              if (!input.trySkipNullValue()) {
                gachaNum = input.readUInt32();
                bitField0_ |= 0x00000008;
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
    public DoGachaCsReq clone() {
      return new DoGachaCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DoGachaCsReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DoGachaCsReq(), data).checkInitialized();
    }

    public static DoGachaCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DoGachaCsReq(), input).checkInitialized();
    }

    public static DoGachaCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DoGachaCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating DoGachaCsReq messages
     */
    public static MessageFactory<DoGachaCsReq> getFactory() {
      return DoGachaCsReqFactory.INSTANCE;
    }

    private enum DoGachaCsReqFactory implements MessageFactory<DoGachaCsReq> {
      INSTANCE;

      @Override
      public DoGachaCsReq create() {
        return DoGachaCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gachaId = FieldName.forField("gachaId", "gacha_id");

      static final FieldName simulateMagic = FieldName.forField("simulateMagic", "simulate_magic");

      static final FieldName gachaRandom = FieldName.forField("gachaRandom", "gacha_random");

      static final FieldName gachaNum = FieldName.forField("gachaNum", "gacha_num");
    }
  }
}
