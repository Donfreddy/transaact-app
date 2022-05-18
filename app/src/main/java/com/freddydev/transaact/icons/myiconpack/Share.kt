package com.freddydev.transaact.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.icons.MyIconPack

public val MyIconPack.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 10.375f)
                curveTo(11.3047f, 10.375f, 10.8937f, 10.5312f, 10.5719f, 10.7922f)
                lineTo(7.3344f, 8.45f)
                curveTo(7.3886f, 8.1524f, 7.3886f, 7.8475f, 7.3344f, 7.55f)
                lineTo(10.5719f, 5.2078f)
                curveTo(10.8937f, 5.4688f, 11.3047f, 5.625f, 11.75f, 5.625f)
                curveTo(12.7844f, 5.625f, 13.625f, 4.7844f, 13.625f, 3.75f)
                curveTo(13.625f, 2.7156f, 12.7844f, 1.875f, 11.75f, 1.875f)
                curveTo(10.7156f, 1.875f, 9.875f, 2.7156f, 9.875f, 3.75f)
                curveTo(9.875f, 3.9313f, 9.9f, 4.1047f, 9.9484f, 4.2703f)
                lineTo(6.8734f, 6.4969f)
                curveTo(6.4172f, 5.8922f, 5.6922f, 5.5f, 4.875f, 5.5f)
                curveTo(3.4938f, 5.5f, 2.375f, 6.6188f, 2.375f, 8.0f)
                curveTo(2.375f, 9.3813f, 3.4938f, 10.5f, 4.875f, 10.5f)
                curveTo(5.6922f, 10.5f, 6.4172f, 10.1078f, 6.8734f, 9.5031f)
                lineTo(9.9484f, 11.7297f)
                curveTo(9.9f, 11.8953f, 9.875f, 12.0703f, 9.875f, 12.25f)
                curveTo(9.875f, 13.2844f, 10.7156f, 14.125f, 11.75f, 14.125f)
                curveTo(12.7844f, 14.125f, 13.625f, 13.2844f, 13.625f, 12.25f)
                curveTo(13.625f, 11.2156f, 12.7844f, 10.375f, 11.75f, 10.375f)
                close()
                moveTo(11.75f, 2.9375f)
                curveTo(12.1984f, 2.9375f, 12.5625f, 3.3016f, 12.5625f, 3.75f)
                curveTo(12.5625f, 4.1984f, 12.1984f, 4.5625f, 11.75f, 4.5625f)
                curveTo(11.3016f, 4.5625f, 10.9375f, 4.1984f, 10.9375f, 3.75f)
                curveTo(10.9375f, 3.3016f, 11.3016f, 2.9375f, 11.75f, 2.9375f)
                close()
                moveTo(4.875f, 9.375f)
                curveTo(4.1172f, 9.375f, 3.5f, 8.7578f, 3.5f, 8.0f)
                curveTo(3.5f, 7.2422f, 4.1172f, 6.625f, 4.875f, 6.625f)
                curveTo(5.6328f, 6.625f, 6.25f, 7.2422f, 6.25f, 8.0f)
                curveTo(6.25f, 8.7578f, 5.6328f, 9.375f, 4.875f, 9.375f)
                close()
                moveTo(11.75f, 13.0625f)
                curveTo(11.3016f, 13.0625f, 10.9375f, 12.6984f, 10.9375f, 12.25f)
                curveTo(10.9375f, 11.8016f, 11.3016f, 11.4375f, 11.75f, 11.4375f)
                curveTo(12.1984f, 11.4375f, 12.5625f, 11.8016f, 12.5625f, 12.25f)
                curveTo(12.5625f, 12.6984f, 12.1984f, 13.0625f, 11.75f, 13.0625f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
