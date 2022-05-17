package com.freddydev.transaact.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.icons.MyIconPack

public val MyIconPack.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.7168f, 15.2913f)
                    curveTo(14.9208f, 15.2913f, 15.9008f, 16.2643f, 15.9008f, 17.4603f)
                    verticalLineTo(20.5363f)
                    curveTo(15.9008f, 20.7933f, 16.1068f, 20.9993f, 16.3708f, 21.0053f)
                    horizontalLineTo(18.2768f)
                    curveTo(19.7788f, 21.0053f, 20.9998f, 19.7993f, 20.9998f, 18.3173f)
                    verticalLineTo(9.5933f)
                    curveTo(20.9928f, 9.0833f, 20.7498f, 8.6033f, 20.3328f, 8.2843f)
                    lineTo(13.7398f, 3.0263f)
                    curveTo(12.8548f, 2.3253f, 11.6168f, 2.3253f, 10.7288f, 3.0283f)
                    lineTo(4.1808f, 8.2823f)
                    curveTo(3.7478f, 8.6113f, 3.5048f, 9.0913f, 3.4998f, 9.6103f)
                    verticalLineTo(18.3173f)
                    curveTo(3.4998f, 19.7993f, 4.7208f, 21.0053f, 6.2228f, 21.0053f)
                    horizontalLineTo(8.1468f)
                    curveTo(8.4178f, 21.0053f, 8.6378f, 20.7903f, 8.6378f, 20.5263f)
                    curveTo(8.6378f, 20.4683f, 8.6448f, 20.4103f, 8.6568f, 20.3553f)
                    verticalLineTo(17.4603f)
                    curveTo(8.6568f, 16.2713f, 9.6308f, 15.2993f, 10.8258f, 15.2913f)
                    horizontalLineTo(13.7168f)
                    close()
                    moveTo(18.2768f, 22.5053f)
                    horizontalLineTo(16.3528f)
                    curveTo(15.2508f, 22.4793f, 14.4008f, 21.6143f, 14.4008f, 20.5363f)
                    verticalLineTo(17.4603f)
                    curveTo(14.4008f, 17.0913f, 14.0938f, 16.7913f, 13.7168f, 16.7913f)
                    horizontalLineTo(10.8308f)
                    curveTo(10.4618f, 16.7933f, 10.1568f, 17.0943f, 10.1568f, 17.4603f)
                    verticalLineTo(20.5263f)
                    curveTo(10.1568f, 20.6013f, 10.1468f, 20.6733f, 10.1258f, 20.7413f)
                    curveTo(10.0178f, 21.7313f, 9.1718f, 22.5053f, 8.1468f, 22.5053f)
                    horizontalLineTo(6.2228f)
                    curveTo(3.8938f, 22.5053f, 1.9998f, 20.6263f, 1.9998f, 18.3173f)
                    verticalLineTo(9.6033f)
                    curveTo(2.0098f, 8.6093f, 2.4678f, 7.6993f, 3.2588f, 7.1003f)
                    lineTo(9.7938f, 1.8553f)
                    curveTo(11.2328f, 0.7153f, 13.2378f, 0.7153f, 14.6738f, 1.8533f)
                    lineTo(21.2558f, 7.1033f)
                    curveTo(22.0288f, 7.6923f, 22.4868f, 8.6003f, 22.4998f, 9.5823f)
                    verticalLineTo(18.3173f)
                    curveTo(22.4998f, 20.6263f, 20.6058f, 22.5053f, 18.2768f, 22.5053f)
                    close()
                }
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
