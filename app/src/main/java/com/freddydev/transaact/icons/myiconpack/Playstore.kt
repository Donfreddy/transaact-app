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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.icons.MyIconPack

public val MyIconPack.Playstore: ImageVector
    get() {
        if (_playstore != null) {
            return _playstore!!
        }
        _playstore = Builder(name = "Playstore", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 1.8591f)
                verticalLineTo(14.1403f)
                curveTo(1.5001f, 14.167f, 1.508f, 14.193f, 1.5228f, 14.2151f)
                curveTo(1.5377f, 14.2373f, 1.5587f, 14.2546f, 1.5833f, 14.2648f)
                curveTo(1.6079f, 14.2751f, 1.635f, 14.2778f, 1.6611f, 14.2727f)
                curveTo(1.6873f, 14.2677f, 1.7113f, 14.255f, 1.7303f, 14.2363f)
                lineTo(8.125f, 8.0f)
                lineTo(1.7303f, 1.7631f)
                curveTo(1.7113f, 1.7444f, 1.6873f, 1.7317f, 1.6611f, 1.7267f)
                curveTo(1.635f, 1.7216f, 1.6079f, 1.7243f, 1.5833f, 1.7346f)
                curveTo(1.5587f, 1.7448f, 1.5377f, 1.7621f, 1.5228f, 1.7843f)
                curveTo(1.508f, 1.8064f, 1.5001f, 1.8324f, 1.5f, 1.8591f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8062f, 5.4375f)
                lineTo(2.7881f, 1.02f)
                lineTo(2.7831f, 1.0172f)
                curveTo(2.645f, 0.9422f, 2.5137f, 1.1291f, 2.6269f, 1.2378f)
                lineTo(8.9122f, 7.2478f)
                lineTo(10.8062f, 5.4375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6275f, 14.7622f)
                curveTo(2.5137f, 14.8709f, 2.645f, 15.0578f, 2.7837f, 14.9828f)
                lineTo(2.7887f, 14.98f)
                lineTo(10.8062f, 10.5625f)
                lineTo(8.9122f, 8.7515f)
                lineTo(2.6275f, 14.7622f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0431f, 7.2187f)
                lineTo(11.804f, 5.9856f)
                lineTo(9.6987f, 8.0f)
                lineTo(11.804f, 10.0134f)
                lineTo(14.0431f, 8.7812f)
                curveTo(14.6522f, 8.4446f, 14.6522f, 7.5553f, 14.0431f, 7.2187f)
                close()
            }
        }
        .build()
        return _playstore!!
    }

private var _playstore: ImageVector? = null
