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

public val MyIconPack.Notification: ImageVector
    get() {
        if (_notification != null) {
            return _notification!!
        }
        _notification = Builder(name = "Notification", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.2471f, 2.5f)
                    curveTo(8.7521f, 2.5f, 6.3161f, 5.238f, 6.3161f, 7.695f)
                    curveTo(6.3161f, 9.774f, 5.7391f, 10.735f, 5.2291f, 11.583f)
                    curveTo(4.8201f, 12.264f, 4.4971f, 12.802f, 4.4971f, 13.971f)
                    curveTo(4.6641f, 15.857f, 5.9091f, 16.848f, 12.2471f, 16.848f)
                    curveTo(18.5501f, 16.848f, 19.8341f, 15.813f, 20.0001f, 13.906f)
                    curveTo(19.9971f, 12.802f, 19.6741f, 12.264f, 19.2651f, 11.583f)
                    curveTo(18.7551f, 10.735f, 18.1781f, 9.774f, 18.1781f, 7.695f)
                    curveTo(18.1781f, 5.238f, 15.7421f, 2.5f, 12.2471f, 2.5f)
                    close()
                    moveTo(12.2471f, 18.348f)
                    curveTo(7.5711f, 18.348f, 3.3451f, 18.018f, 3.0001f, 14.035f)
                    curveTo(2.9971f, 12.387f, 3.5001f, 11.549f, 3.9441f, 10.811f)
                    curveTo(4.3931f, 10.063f, 4.8161f, 9.358f, 4.8161f, 7.695f)
                    curveTo(4.8161f, 4.462f, 7.8021f, 1.0f, 12.2471f, 1.0f)
                    curveTo(16.6921f, 1.0f, 19.6781f, 4.462f, 19.6781f, 7.695f)
                    curveTo(19.6781f, 9.358f, 20.1011f, 10.063f, 20.5501f, 10.811f)
                    curveTo(20.9941f, 11.549f, 21.4971f, 12.387f, 21.4971f, 13.971f)
                    curveTo(21.1481f, 18.018f, 16.9231f, 18.348f, 12.2471f, 18.348f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.1984f, 22.5f)
                    horizontalLineTo(12.1964f)
                    curveTo(11.0754f, 22.499f, 10.0144f, 22.005f, 9.2094f, 21.108f)
                    curveTo(8.9324f, 20.801f, 8.9574f, 20.326f, 9.2654f, 20.05f)
                    curveTo(9.5734f, 19.772f, 10.0474f, 19.797f, 10.3244f, 20.106f)
                    curveTo(10.8424f, 20.683f, 11.5074f, 21.0f, 12.1974f, 21.0f)
                    horizontalLineTo(12.1984f)
                    curveTo(12.8914f, 21.0f, 13.5594f, 20.683f, 14.0784f, 20.105f)
                    curveTo(14.3564f, 19.798f, 14.8304f, 19.773f, 15.1374f, 20.05f)
                    curveTo(15.4454f, 20.327f, 15.4704f, 20.802f, 15.1934f, 21.109f)
                    curveTo(14.3854f, 22.006f, 13.3224f, 22.5f, 12.1984f, 22.5f)
                    close()
                }
            }
        }
        .build()
        return _notification!!
    }

private var _notification: ImageVector? = null
