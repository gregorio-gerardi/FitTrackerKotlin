package com.example.gregoriogerardi.fittrackerkotlin.utils

import android.os.Handler
import android.os.Looper
import com.squareup.otto.Bus
import com.squareup.otto.ThreadEnforcer

internal class MainPostingBus : Bus(ThreadEnforcer.ANY) {

    private val handler = Handler(Looper.getMainLooper())

    override fun post(event: Any) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.post(event)
            return
        }
        handler.post { super@MainPostingBus.post(event) }
    }
}
