package com.aniruddhapimple.gds.components.typography

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import androidx.appcompat.widget.AppCompatTextView
import com.aniruddhapimple.gds.R
import com.aniruddhapimple.gds.getThemeColor
import com.aniruddhapimple.gds.getThemeSpacing
import com.aniruddhapimple.gds.themeStyleResId

class PageHeaderTextView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : AppCompatTextView(ContextThemeWrapper(context, context.themeStyleResId(R.attr.typographyStylePageHeader)), attrs, defStyleAttr) {
    init {
        val horizontalSpacing = context.getThemeSpacing(R.attr.spacingDefault)
        val verticalSpacing = context.getThemeSpacing(R.attr.spacingDefault)
        setPadding(horizontalSpacing, verticalSpacing, horizontalSpacing, 0)
        setTextColor(context.getThemeColor(R.attr.colorTypographyDefault))
    }
}