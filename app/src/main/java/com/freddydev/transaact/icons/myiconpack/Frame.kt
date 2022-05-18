package com.freddydev.transaact.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.icons.MyIconPack

public val MyIconPack.Frame: ImageVector
    get() {
        if (_frame != null) {
            return _frame!!
        }
        _frame = Builder(name = "Frame", defaultWidth = 34.0.dp, defaultHeight = 26.0.dp,
                viewportWidth = 34.0f, viewportHeight = 26.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFF2F2F2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.6014f, 18.1811f)
                    curveTo(18.1656f, 18.7319f, 17.5716f, 19.2441f, 16.7828f, 19.6938f)
                    curveTo(14.022f, 21.2691f, 10.7645f, 20.7364f, 8.6197f, 17.6977f)
                    lineTo(24.599f, 8.5841f)
                    curveTo(24.308f, 7.8158f, 23.9368f, 7.0919f, 23.5265f, 6.3896f)
                    curveTo(19.7688f, -0.0412f, 12.8266f, -1.7464f, 6.5138f, 1.8539f)
                    curveTo(0.0439f, 5.5443f, -1.9257f, 12.4357f, 2.0609f, 19.2561f)
                    curveTo(6.0244f, 26.0381f, 13.1918f, 27.7709f, 19.5436f, 24.1478f)
                    curveTo(19.6775f, 24.0721f, 19.809f, 23.9939f, 19.938f, 23.9145f)
                    curveTo(19.0676f, 22.4704f, 18.5685f, 20.7821f, 18.5685f, 18.9784f)
                    curveTo(18.5685f, 18.7102f, 18.5795f, 18.4445f, 18.6014f, 18.1811f)
                    close()
                    moveTo(8.9763f, 6.4257f)
                    curveTo(11.8163f, 4.806f, 15.1528f, 5.293f, 16.8948f, 8.0935f)
                    lineTo(6.5186f, 14.0121f)
                    curveTo(5.221f, 10.8027f, 6.3324f, 7.9336f, 8.9763f, 6.4257f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF2F2F2)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(27.9574f, 25.3434f)
                    curveTo(31.2946f, 25.3434f, 34.0f, 22.671f, 34.0f, 19.3743f)
                    curveTo(34.0f, 16.0777f, 31.2946f, 13.4052f, 27.9574f, 13.4052f)
                    curveTo(24.6202f, 13.4052f, 21.9148f, 16.0777f, 21.9148f, 19.3743f)
                    curveTo(21.9148f, 22.671f, 24.6202f, 25.3434f, 27.9574f, 25.3434f)
                    close()
                }
            }
        }
        .build()
        return _frame!!
    }

private var _frame: ImageVector? = null
