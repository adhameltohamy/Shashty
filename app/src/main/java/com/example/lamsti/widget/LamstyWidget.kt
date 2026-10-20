package com.example.lamsti.widget

import androidx.compose.runtime.Composable
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import androidx.glance.material3.GlanceTheme

class LamstyWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: android.content.Context, id: GlanceId) {
        provideContent {
            WidgetContent()
        }
    }

    @Composable
    private fun WidgetContent() {
        GlanceTheme {
            Column(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .padding(16),
                horizontalAlignment = Alignment.Horizontal.Start,
                verticalAlignment = Alignment.Vertical.CenterVertically
            ) {
                Text(
                    text = "لمستي",
                    style = TextStyle(color = ColorProvider(android.graphics.Color.BLACK))
                )
                Text(
                    text = "صباح جميل يبدأ بابتسامة",
                    modifier = GlanceModifier.padding(top = 8)
                )
                Text(
                    text = "الطقس والصورة والساعة هنضيفهم في الخطوات الجاية",
                    modifier = GlanceModifier.padding(top = 8)
                )
            }
        }
    }
}
