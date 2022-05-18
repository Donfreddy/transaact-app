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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.freddydev.transaact.icons.MyIconPack

public val MyIconPack.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.75f, 16.1543f)
                curveTo(11.336f, 16.1543f, 11.0f, 15.8183f, 11.0f, 15.4043f)
                verticalLineTo(8.0773f)
                curveTo(11.0f, 7.6633f, 11.336f, 7.3273f, 11.75f, 7.3273f)
                curveTo(12.164f, 7.3273f, 12.5f, 7.6633f, 12.5f, 8.0773f)
                verticalLineTo(15.4043f)
                curveTo(12.5f, 15.8183f, 12.164f, 16.1543f, 11.75f, 16.1543f)
                close()
            }
            path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.4165f, 12.4902f)
                horizontalLineTo(8.0835f)
                curveTo(7.6685f, 12.4902f, 7.3335f, 12.1542f, 7.3335f, 11.7402f)
                curveTo(7.3335f, 11.3262f, 7.6685f, 10.9902f, 8.0835f, 10.9902f)
                horizontalLineTo(15.4165f)
                curveTo(15.8305f, 10.9902f, 16.1665f, 11.3262f, 16.1665f, 11.7402f)
                curveTo(16.1665f, 12.1542f, 15.8305f, 12.4902f, 15.4165f, 12.4902f)
                close()
            }
            path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.064f, 2.5f)
                curveTo(4.292f, 2.5f, 2.5f, 4.397f, 2.5f, 7.335f)
                verticalLineTo(16.165f)
                curveTo(2.5f, 19.103f, 4.292f, 21.0f, 7.064f, 21.0f)
                horizontalLineTo(16.436f)
                curveTo(19.209f, 21.0f, 21.0f, 19.103f, 21.0f, 16.165f)
                verticalLineTo(7.335f)
                curveTo(21.0f, 4.397f, 19.209f, 2.5f, 16.436f, 2.5f)
                horizontalLineTo(7.064f)
                close()
                moveTo(16.436f, 22.5f)
                horizontalLineTo(7.064f)
                curveTo(3.437f, 22.5f, 1.0f, 19.954f, 1.0f, 16.165f)
                verticalLineTo(7.335f)
                curveTo(1.0f, 3.546f, 3.437f, 1.0f, 7.064f, 1.0f)
                horizontalLineTo(16.436f)
                curveTo(20.063f, 1.0f, 22.5f, 3.546f, 22.5f, 7.335f)
                verticalLineTo(16.165f)
                curveTo(22.5f, 19.954f, 20.063f, 22.5f, 16.436f, 22.5f)
                close()
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
