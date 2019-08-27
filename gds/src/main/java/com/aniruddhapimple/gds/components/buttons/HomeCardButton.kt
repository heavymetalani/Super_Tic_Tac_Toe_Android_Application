package com.aniruddhapimple.gds.components.buttons

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.view.ContextThemeWrapper
import androidx.appcompat.widget.AppCompatTextView
import com.aniruddhapimple.gds.R
import com.aniruddhapimple.gds.getThemeColor
import com.aniruddhapimple.gds.getThemeSpacing
import com.aniruddhapimple.gds.themeStyleResId


class HomeCardButton @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : AppCompatTextView(ContextThemeWrapper(context, context.themeStyleResId(R.attr.typographyStyleButton)), attrs, defStyleAttr) {
    init {
        val spacing = context.getThemeSpacing(R.attr.spacingDefault)
        setPadding(spacing, spacing, spacing, spacing)
        setTextColor(context.getThemeColor(R.attr.colorTypographyDefaultInverted))
        gravity = Gravity.RIGHT
        isAllCaps = true
    }
}