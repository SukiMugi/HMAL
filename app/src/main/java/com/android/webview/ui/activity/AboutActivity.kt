package com.android.webview.ui.activity

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView
import com.drakeet.about.*
import com.google.android.webview.BuildConfig
import com.google.android.webview.R

class AboutActivity : AbsAboutActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreateHeader(icon: ImageView, slogan: TextView, version: TextView) {
        icon.setImageResource(R.mipmap.ic_launcher)
        slogan.text = applicationInfo.loadLabel(packageManager)
        version.text = "V" + BuildConfig.VERSION_NAME
    }

    override fun onItemsCreated(items: MutableList<Any>) {
        items.add(Category(getString(R.string.title_about)))
        items.add(Card(getString(R.string.about_description)))

        items.add(Category(getString(R.string.about_how_to_use_title)))
        items.add(Card(getString(R.string.about_how_to_use_description_1)))
        items.add(Line())
        items.add(Card(getString(R.string.about_how_to_use_description_2)))

        items.add(Category(getString(R.string.about_developer)))
        items.add(Contributor(R.drawable.cont_author, "\uD835\uDD93\uD835\uDD9A\uD835\uDD91\uD835\uDD91\uD835\uDD95\uD835\uDD99\uD835\uDD97", "Developer", "https://github.com/Dr-TSNG"))
        items.add(Line())
        items.add(Contributor(R.drawable.cont_k, "Ketal", "Collaborator", "https://github.com/keta1"))
        items.add(Line())
        items.add(Contributor(R.drawable.cont_icon_designer, "辉少菌", "Icon designer", "http://www.coolapk.com/u/1560270"))
        items.add(Line())
        items.add(Contributor(R.drawable.cont_cpp_master, "LoveSy", "Idea provider", "https://github.com/yujincheng08"))

        items.add(Category(getString(R.string.about_open_source)))
        items.add(License("MultiType", "drakeet", License.APACHE_2, "https://github.com/drakeet/MultiType"))
        items.add(License("about-page", "drakeet", License.APACHE_2, "https://github.com/drakeet/about-page"))
        items.add(License("EzXHelper", "KyuubiRan", License.APACHE_2, "https://github.com/KyuubiRan/EzXHelper"))
        items.add(License("libsu", "topjohnwu", License.APACHE_2, "https://github.com/topjohnwu/libsu"))
        items.add(License("okhttp", "square", License.APACHE_2, "https://github.com/square/okhttp"))
        items.add(License("rxhttp", "liujingxing", License.APACHE_2, "https://github.com/liujingxing/rxhttp"))
    }
}
