/*
 * Copyright 2017-2024 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.serialization.json

import kotlin.test.*

class DynamicSerializerTest {
    @Test
    fun happyPath() {
        val value = js("{a: 42}")
        assertEquals("""{"a":42}""", JSON.stringify(Json.encodeToDynamic(DynamicSerializer, value)))
        assertEquals("""{"a":42}""", JSON.stringify(Json.decodeFromDynamic(DynamicSerializer, value)))
    }
}
