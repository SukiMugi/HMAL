package com.android.webview.ui.util

import android.widget.Toast
import androidx.annotation.StringRes
import com.android.webview.sysApp

fun makeToast(@StringRes resId: Int) {
    Toast.makeText(sysApp, resId, Toast.LENGTH_SHORT).show()
}

fun makeToast(text: CharSequence) {
    Toast.makeText(sysApp, text, Toast.LENGTH_SHORT).show()
}
