package com.freddydev.transaact.data.operator

import androidx.datastore.core.CorruptionException
import androidx.datastore.core.Serializer
import com.freddydev.transaact.operator_prefs.OperatorPrefs
import com.google.protobuf.InvalidProtocolBufferException
import java.io.InputStream
import java.io.OutputStream

/**
 * Serializer for the [OperatorPrefs] object defined in operator_prefs.proto.
 */
object OperatorSerializer : Serializer<OperatorPrefs> {
  override val defaultValue: OperatorPrefs = OperatorPrefs
    .getDefaultInstance()
    .toBuilder()
    .setId(operators[0].id)
    .setName(operators[0].name)
    .setIcon(operators[0].icon)
    .build()

  @Suppress("BlockingMethodInNonBlockingContext")
  override suspend fun readFrom(input: InputStream): OperatorPrefs {
    try {
      return OperatorPrefs.parseFrom(input)
    } catch (exception: InvalidProtocolBufferException) {
      throw CorruptionException("Cannot read proto.", exception)
    }
  }

  @Suppress("BlockingMethodInNonBlockingContext")
  override suspend fun writeTo(t: OperatorPrefs, output: OutputStream) = t.writeTo(output)
}