package com.freddydev.transaact.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MyIconPack.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.777f, 13.4648f)
                curveTo(11.108f, 13.4648f, 10.441f, 13.2438f, 9.883f, 12.8018f)
                lineTo(5.398f, 9.1858f)
                curveTo(5.075f, 8.9258f, 5.025f, 8.4528f, 5.284f, 8.1308f)
                curveTo(5.545f, 7.8098f, 6.017f, 7.7588f, 6.339f, 8.0178f)
                lineTo(10.82f, 11.6298f)
                curveTo(11.383f, 12.0758f, 12.176f, 12.0758f, 12.743f, 11.6258f)
                lineTo(17.179f, 8.0198f)
                curveTo(17.501f, 7.7568f, 17.973f, 7.8068f, 18.235f, 8.1288f)
                curveTo(18.496f, 8.4498f, 18.447f, 8.9218f, 18.126f, 9.1838f)
                lineTo(13.682f, 12.7958f)
                curveTo(13.12f, 13.2418f, 12.448f, 13.4648f, 11.777f, 13.4648f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.839f, 20.0f)
                    horizontalLineTo(16.659f)
                    curveTo(16.661f, 19.998f, 16.669f, 20.0f, 16.675f, 20.0f)
                    curveTo(17.816f, 20.0f, 18.828f, 19.592f, 19.604f, 18.817f)
                    curveTo(20.505f, 17.92f, 21.0f, 16.631f, 21.0f, 15.188f)
                    verticalLineTo(8.32f)
                    curveTo(21.0f, 5.527f, 19.174f, 3.5f, 16.659f, 3.5f)
                    horizontalLineTo(6.841f)
                    curveTo(4.326f, 3.5f, 2.5f, 5.527f, 2.5f, 8.32f)
                    verticalLineTo(15.188f)
                    curveTo(2.5f, 16.631f, 2.996f, 17.92f, 3.896f, 18.817f)
                    curveTo(4.672f, 19.592f, 5.685f, 20.0f, 6.825f, 20.0f)
                    horizontalLineTo(6.839f)
                    close()
                    moveTo(6.822f, 21.5f)
                    curveTo(5.279f, 21.5f, 3.901f, 20.94f, 2.837f, 19.88f)
                    curveTo(1.652f, 18.698f, 1.0f, 17.032f, 1.0f, 15.188f)
                    verticalLineTo(8.32f)
                    curveTo(1.0f, 4.717f, 3.511f, 2.0f, 6.841f, 2.0f)
                    horizontalLineTo(16.659f)
                    curveTo(19.989f, 2.0f, 22.5f, 4.717f, 22.5f, 8.32f)
                    verticalLineTo(15.188f)
                    curveTo(22.5f, 17.032f, 21.848f, 18.698f, 20.663f, 19.88f)
                    curveTo(19.6f, 20.939f, 18.221f, 21.5f, 16.675f, 21.5f)
                    horizontalLineTo(16.659f)
                    horizontalLineTo(6.841f)
                    horizontalLineTo(6.822f)
                    close()
                }
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
