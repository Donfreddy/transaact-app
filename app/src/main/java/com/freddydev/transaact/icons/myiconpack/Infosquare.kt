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

public val MyIconPack.Infosquare: ImageVector
    get() {
        if (_infosquare != null) {
            return _infosquare!!
        }
        _infosquare = Builder(name = "Infosquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(7.664f, 3.5f)
                    curveTo(5.135f, 3.5f, 3.5f, 5.233f, 3.5f, 7.916f)
                    verticalLineTo(16.084f)
                    curveTo(3.5f, 18.767f, 5.135f, 20.5f, 7.664f, 20.5f)
                    horizontalLineTo(16.332f)
                    curveTo(18.864f, 20.5f, 20.5f, 18.767f, 20.5f, 16.084f)
                    verticalLineTo(7.916f)
                    curveTo(20.5f, 5.233f, 18.864f, 3.5f, 16.334f, 3.5f)
                    horizontalLineTo(7.664f)
                    close()
                    moveTo(16.332f, 22.0f)
                    horizontalLineTo(7.664f)
                    curveTo(4.276f, 22.0f, 2.0f, 19.622f, 2.0f, 16.084f)
                    verticalLineTo(7.916f)
                    curveTo(2.0f, 4.378f, 4.276f, 2.0f, 7.664f, 2.0f)
                    horizontalLineTo(16.334f)
                    curveTo(19.723f, 2.0f, 22.0f, 4.378f, 22.0f, 7.916f)
                    verticalLineTo(16.084f)
                    curveTo(22.0f, 19.622f, 19.723f, 22.0f, 16.332f, 22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.994f, 16.75f)
                    curveTo(11.58f, 16.75f, 11.244f, 16.414f, 11.244f, 16.0f)
                    verticalLineTo(12.0f)
                    curveTo(11.244f, 11.586f, 11.58f, 11.25f, 11.994f, 11.25f)
                    curveTo(12.408f, 11.25f, 12.744f, 11.586f, 12.744f, 12.0f)
                    verticalLineTo(16.0f)
                    curveTo(12.744f, 16.414f, 12.408f, 16.75f, 11.994f, 16.75f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.9989f, 9.2041f)
                    curveTo(11.4459f, 9.2041f, 10.9939f, 8.7571f, 10.9939f, 8.2041f)
                    curveTo(10.9939f, 7.6511f, 11.4369f, 7.2041f, 11.9889f, 7.2041f)
                    horizontalLineTo(11.9989f)
                    curveTo(12.5519f, 7.2041f, 12.9989f, 7.6511f, 12.9989f, 8.2041f)
                    curveTo(12.9989f, 8.7571f, 12.5519f, 9.2041f, 11.9989f, 9.2041f)
                    close()
                }
            }
        }
        .build()
        return _infosquare!!
    }

private var _infosquare: ImageVector? = null
