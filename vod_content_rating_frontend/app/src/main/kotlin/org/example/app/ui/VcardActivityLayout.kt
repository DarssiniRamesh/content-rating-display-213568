package org.example.app.ui

import android.app.Activity
import android.os.Bundle
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * VcardActivityLayout inflates a minimal layout for the Vcard placeholder screen.
 */
class VcardActivityLayout : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vcard)
    }
}
