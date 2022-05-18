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

public val MyIconPack.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = Builder(name = "Profile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.9209f, 15.9961f)
                    curveTo(7.6599f, 15.9961f, 5.4999f, 16.7281f, 5.4999f, 18.1731f)
                    curveTo(5.4999f, 19.6311f, 7.6599f, 20.3701f, 11.9209f, 20.3701f)
                    curveTo(16.1809f, 20.3701f, 18.3399f, 19.6381f, 18.3399f, 18.1931f)
                    curveTo(18.3399f, 16.7351f, 16.1809f, 15.9961f, 11.9209f, 15.9961f)
                    close()
                    moveTo(11.9209f, 21.8701f)
                    curveTo(9.9619f, 21.8701f, 3.9999f, 21.8701f, 3.9999f, 18.1731f)
                    curveTo(3.9999f, 14.8771f, 8.5209f, 14.4961f, 11.9209f, 14.4961f)
                    curveTo(13.8799f, 14.4961f, 19.8399f, 14.4961f, 19.8399f, 18.1931f)
                    curveTo(19.8399f, 21.4891f, 15.3199f, 21.8701f, 11.9209f, 21.8701f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.9209f, 3.4277f)
                    curveTo(9.7799f, 3.4277f, 8.0379f, 5.1687f, 8.0379f, 7.3097f)
                    curveTo(8.0309f, 9.4437f, 9.7599f, 11.1837f, 11.8919f, 11.1917f)
                    lineTo(11.9209f, 11.9057f)
                    verticalLineTo(11.1917f)
                    curveTo(14.0609f, 11.1917f, 15.8019f, 9.4497f, 15.8019f, 7.3097f)
                    curveTo(15.8019f, 5.1687f, 14.0609f, 3.4277f, 11.9209f, 3.4277f)
                    close()
                    moveTo(11.9209f, 12.6187f)
                    horizontalLineTo(11.8889f)
                    curveTo(8.9669f, 12.6097f, 6.5999f, 10.2267f, 6.6099f, 7.3067f)
                    curveTo(6.6099f, 4.3817f, 8.9919f, 1.9997f, 11.9209f, 1.9997f)
                    curveTo(14.8489f, 1.9997f, 17.2299f, 4.3817f, 17.2299f, 7.3097f)
                    curveTo(17.2299f, 10.2377f, 14.8489f, 12.6187f, 11.9209f, 12.6187f)
                    close()
                }
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
