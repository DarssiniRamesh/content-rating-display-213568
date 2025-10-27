package org.example.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import org.example.app.ui.IndiceActivity

/**
 * PUBLIC_INTERFACE
 * AliasMainActivity serves as a lightweight alias/redirect to the real launcher activity.
 * Some tools may resolve this class from the manifest for entrypoint discovery.
 */
class AliasMainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, IndiceActivity::class.java))
        finish()
    }
}
