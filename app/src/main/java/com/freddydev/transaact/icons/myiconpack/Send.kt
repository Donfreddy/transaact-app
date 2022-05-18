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

public val MyIconPack.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF130F26)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.8049f, 14.8178f)
                    lineTo(14.4619f, 20.7508f)
                    curveTo(14.6219f, 21.0108f, 14.8719f, 21.0078f, 14.9729f, 20.9938f)
                    curveTo(15.0739f, 20.9798f, 15.3169f, 20.9178f, 15.4049f, 20.6228f)
                    lineTo(19.9779f, 5.1778f)
                    curveTo(20.0579f, 4.9048f, 19.9109f, 4.7188f, 19.8449f, 4.6528f)
                    curveTo(19.7809f, 4.5868f, 19.5979f, 4.4458f, 19.3329f, 4.5208f)
                    lineTo(3.877f, 9.0468f)
                    curveTo(3.5839f, 9.1328f, 3.5199f, 9.3788f, 3.5059f, 9.4798f)
                    curveTo(3.4919f, 9.5828f, 3.4879f, 9.8378f, 3.7469f, 10.0008f)
                    lineTo(9.7479f, 13.7538f)
                    lineTo(15.0499f, 8.3958f)
                    curveTo(15.3409f, 8.1018f, 15.8159f, 8.0988f, 16.1109f, 8.3898f)
                    curveTo(16.4059f, 8.6808f, 16.4079f, 9.1568f, 16.1169f, 9.4508f)
                    lineTo(10.8049f, 14.8178f)
                    close()
                    moveTo(14.8949f, 22.4998f)
                    curveTo(14.1989f, 22.4998f, 13.5609f, 22.1458f, 13.1849f, 21.5378f)
                    lineTo(9.3079f, 15.2468f)
                    lineTo(2.9519f, 11.2718f)
                    curveTo(2.2669f, 10.8428f, 1.9089f, 10.0788f, 2.0199f, 9.2758f)
                    curveTo(2.1299f, 8.4728f, 2.6809f, 7.8348f, 3.4549f, 7.6078f)
                    lineTo(18.9109f, 3.0818f)
                    curveTo(19.6219f, 2.8738f, 20.3839f, 3.0708f, 20.9079f, 3.5928f)
                    curveTo(21.4319f, 4.1198f, 21.6269f, 4.8898f, 21.4149f, 5.6038f)
                    lineTo(16.8419f, 21.0478f)
                    curveTo(16.6129f, 21.8248f, 15.9729f, 22.3738f, 15.1719f, 22.4808f)
                    curveTo(15.0779f, 22.4928f, 14.9869f, 22.4998f, 14.8949f, 22.4998f)
                    close()
                }
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
