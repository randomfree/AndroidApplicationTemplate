package ly.android.learnclock

import android.os.Bundle
import ly.android.core.base.AbstractBaseActivity

class WelcomeActivity : AbstractBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}