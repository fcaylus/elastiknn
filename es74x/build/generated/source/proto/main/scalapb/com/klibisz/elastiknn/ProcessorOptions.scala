// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.klibisz.elastiknn

/** @param fieldRaw
  *   Path to the field where the raw floating-point vector is stored.
  * @param fieldProcessed
  *   Path to the field where the processed version of the vector is stored.
  * @param discardRaw
  *   Whether to keep or discard the original raw vector when ingesting. The processed vector is sufficient
  *   for all elastiknn searches, so removing the original one can save space if its otherwise unused.
  * @param dimension
  *   Dimensionality of the raw floating-point vector.
  */
@SerialVersionUID(0L)
final case class ProcessorOptions(
    fieldRaw: _root_.scala.Predef.String = "",
    fieldProcessed: _root_.scala.Predef.String = "",
    discardRaw: _root_.scala.Boolean = false,
    dimension: _root_.scala.Int = 0,
    modelOptions: com.klibisz.elastiknn.ProcessorOptions.ModelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ProcessorOptions] with scalapb.lenses.Updatable[ProcessorOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = fieldRaw
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = fieldProcessed
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = discardRaw
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
        }
      };
      
      {
        val __value = dimension
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, __value)
        }
      };
      if (modelOptions.exact.isDefined) {
        val __value = modelOptions.exact.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (modelOptions.lsh.isDefined) {
        val __value = modelOptions.lsh.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = fieldRaw
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = fieldProcessed
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = discardRaw
        if (__v != false) {
          _output__.writeBool(3, __v)
        }
      };
      {
        val __v = dimension
        if (__v != 0) {
          _output__.writeInt32(4, __v)
        }
      };
      modelOptions.exact.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      modelOptions.lsh.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.klibisz.elastiknn.ProcessorOptions = {
      var __fieldRaw = this.fieldRaw
      var __fieldProcessed = this.fieldProcessed
      var __discardRaw = this.discardRaw
      var __dimension = this.dimension
      var __modelOptions = this.modelOptions
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fieldRaw = _input__.readString()
          case 18 =>
            __fieldProcessed = _input__.readString()
          case 24 =>
            __discardRaw = _input__.readBool()
          case 32 =>
            __dimension = _input__.readInt32()
          case 42 =>
            __modelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Exact(_root_.scalapb.LiteParser.readMessage(_input__, modelOptions.exact.getOrElse(com.klibisz.elastiknn.ExactModelOptions.defaultInstance)))
          case 50 =>
            __modelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Lsh(_root_.scalapb.LiteParser.readMessage(_input__, modelOptions.lsh.getOrElse(com.klibisz.elastiknn.LshModelOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.klibisz.elastiknn.ProcessorOptions(
          fieldRaw = __fieldRaw,
          fieldProcessed = __fieldProcessed,
          discardRaw = __discardRaw,
          dimension = __dimension,
          modelOptions = __modelOptions
      )
    }
    def withFieldRaw(__v: _root_.scala.Predef.String): ProcessorOptions = copy(fieldRaw = __v)
    def withFieldProcessed(__v: _root_.scala.Predef.String): ProcessorOptions = copy(fieldProcessed = __v)
    def withDiscardRaw(__v: _root_.scala.Boolean): ProcessorOptions = copy(discardRaw = __v)
    def withDimension(__v: _root_.scala.Int): ProcessorOptions = copy(dimension = __v)
    def getExact: com.klibisz.elastiknn.ExactModelOptions = modelOptions.exact.getOrElse(com.klibisz.elastiknn.ExactModelOptions.defaultInstance)
    def withExact(__v: com.klibisz.elastiknn.ExactModelOptions): ProcessorOptions = copy(modelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Exact(__v))
    def getLsh: com.klibisz.elastiknn.LshModelOptions = modelOptions.lsh.getOrElse(com.klibisz.elastiknn.LshModelOptions.defaultInstance)
    def withLsh(__v: com.klibisz.elastiknn.LshModelOptions): ProcessorOptions = copy(modelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Lsh(__v))
    def clearModelOptions: ProcessorOptions = copy(modelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Empty)
    def withModelOptions(__v: com.klibisz.elastiknn.ProcessorOptions.ModelOptions): ProcessorOptions = copy(modelOptions = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = fieldRaw
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = fieldProcessed
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = discardRaw
          if (__t != false) __t else null
        }
        case 4 => {
          val __t = dimension
          if (__t != 0) __t else null
        }
        case 5 => modelOptions.exact.orNull
        case 6 => modelOptions.lsh.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(fieldRaw)
        case 2 => _root_.scalapb.descriptors.PString(fieldProcessed)
        case 3 => _root_.scalapb.descriptors.PBoolean(discardRaw)
        case 4 => _root_.scalapb.descriptors.PInt(dimension)
        case 5 => modelOptions.exact.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => modelOptions.lsh.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.klibisz.elastiknn.ProcessorOptions
}

object ProcessorOptions extends scalapb.GeneratedMessageCompanion[com.klibisz.elastiknn.ProcessorOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.klibisz.elastiknn.ProcessorOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.klibisz.elastiknn.ProcessorOptions = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.klibisz.elastiknn.ProcessorOptions(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), false).asInstanceOf[_root_.scala.Boolean],
      __fieldsMap.getOrElse(__fields.get(3), 0).asInstanceOf[_root_.scala.Int],
      modelOptions = __fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[com.klibisz.elastiknn.ExactModelOptions]].map(com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Exact)
    .orElse[com.klibisz.elastiknn.ProcessorOptions.ModelOptions](__fieldsMap.get(__fields.get(5)).asInstanceOf[_root_.scala.Option[com.klibisz.elastiknn.LshModelOptions]].map(com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Lsh))
    .getOrElse(com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Empty)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.klibisz.elastiknn.ProcessorOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.klibisz.elastiknn.ProcessorOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        modelOptions = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[com.klibisz.elastiknn.ExactModelOptions]]).map(com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Exact)
    .orElse[com.klibisz.elastiknn.ProcessorOptions.ModelOptions](__fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[com.klibisz.elastiknn.LshModelOptions]]).map(com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Lsh))
    .getOrElse(com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ElastiknnProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ElastiknnProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 5 => __out = com.klibisz.elastiknn.ExactModelOptions
      case 6 => __out = com.klibisz.elastiknn.LshModelOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.klibisz.elastiknn.ProcessorOptions(
  )
  sealed trait ModelOptions extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isExact: _root_.scala.Boolean = false
    def isLsh: _root_.scala.Boolean = false
    def exact: _root_.scala.Option[com.klibisz.elastiknn.ExactModelOptions] = _root_.scala.None
    def lsh: _root_.scala.Option[com.klibisz.elastiknn.LshModelOptions] = _root_.scala.None
  }
  object ModelOptions extends {
    @SerialVersionUID(0L)
    case object Empty extends com.klibisz.elastiknn.ProcessorOptions.ModelOptions {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class Exact(value: com.klibisz.elastiknn.ExactModelOptions) extends com.klibisz.elastiknn.ProcessorOptions.ModelOptions {
      type ValueType = com.klibisz.elastiknn.ExactModelOptions
      override def isExact: _root_.scala.Boolean = true
      override def exact: _root_.scala.Option[com.klibisz.elastiknn.ExactModelOptions] = Some(value)
      override def number: _root_.scala.Int = 5
    }
    @SerialVersionUID(0L)
    final case class Lsh(value: com.klibisz.elastiknn.LshModelOptions) extends com.klibisz.elastiknn.ProcessorOptions.ModelOptions {
      type ValueType = com.klibisz.elastiknn.LshModelOptions
      override def isLsh: _root_.scala.Boolean = true
      override def lsh: _root_.scala.Option[com.klibisz.elastiknn.LshModelOptions] = Some(value)
      override def number: _root_.scala.Int = 6
    }
  }
  implicit class ProcessorOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.klibisz.elastiknn.ProcessorOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.klibisz.elastiknn.ProcessorOptions](_l) {
    def fieldRaw: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.fieldRaw)((c_, f_) => c_.copy(fieldRaw = f_))
    def fieldProcessed: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.fieldProcessed)((c_, f_) => c_.copy(fieldProcessed = f_))
    def discardRaw: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.discardRaw)((c_, f_) => c_.copy(discardRaw = f_))
    def dimension: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.dimension)((c_, f_) => c_.copy(dimension = f_))
    def exact: _root_.scalapb.lenses.Lens[UpperPB, com.klibisz.elastiknn.ExactModelOptions] = field(_.getExact)((c_, f_) => c_.copy(modelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Exact(f_)))
    def lsh: _root_.scalapb.lenses.Lens[UpperPB, com.klibisz.elastiknn.LshModelOptions] = field(_.getLsh)((c_, f_) => c_.copy(modelOptions = com.klibisz.elastiknn.ProcessorOptions.ModelOptions.Lsh(f_)))
    def modelOptions: _root_.scalapb.lenses.Lens[UpperPB, com.klibisz.elastiknn.ProcessorOptions.ModelOptions] = field(_.modelOptions)((c_, f_) => c_.copy(modelOptions = f_))
  }
  final val FIELD_RAW_FIELD_NUMBER = 1
  final val FIELD_PROCESSED_FIELD_NUMBER = 2
  final val DISCARD_RAW_FIELD_NUMBER = 3
  final val DIMENSION_FIELD_NUMBER = 4
  final val EXACT_FIELD_NUMBER = 5
  final val LSH_FIELD_NUMBER = 6
  def of(
    fieldRaw: _root_.scala.Predef.String,
    fieldProcessed: _root_.scala.Predef.String,
    discardRaw: _root_.scala.Boolean,
    dimension: _root_.scala.Int,
    modelOptions: com.klibisz.elastiknn.ProcessorOptions.ModelOptions
  ): _root_.com.klibisz.elastiknn.ProcessorOptions = _root_.com.klibisz.elastiknn.ProcessorOptions(
    fieldRaw,
    fieldProcessed,
    discardRaw,
    dimension,
    modelOptions
  )
}