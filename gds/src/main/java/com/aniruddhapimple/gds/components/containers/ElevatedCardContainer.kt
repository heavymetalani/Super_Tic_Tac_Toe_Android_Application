package com.aniruddhapimple.gds.components.containers

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.core.view.ViewCompat
import com.aniruddhapimple.gds.R
import com.aniruddhapimple.gds.getThemeSpacing
import com.aniruddhapimple.gds.themeDimensionResId


open class ElevatedCardContainer @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : FrameLayout(context, attrs, defStyleAttr) {

    init {
        setBackgroundResource(R.drawable.gds_bg_card_container)
        val elevation = context.resources.getDimension(context.themeDimensionResId(R.attr.shadowLight))
        ViewCompat.setElevation(this, elevation)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        val margin = context.getThemeSpacing(R.attr.spacingDefault)
        val layoutParams = this.layoutParams as MarginLayoutParams
        layoutParams.setMargins(margin, margin, margin, margin)
    }
}