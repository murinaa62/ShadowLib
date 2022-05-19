package com.headgehog.shadowSample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.headgehog.shadowSample.BaseShadowBuilder.Companion.ShadowLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lib  = findViewById<ShadowLib>(R.id.mainLib)

        ShadowLibrary.load(R.drawable.ic_image)
            .withShadowColor(R.color.shadow)
            .withShadowRadius(15)
            .withShadowScale(1.1f)
            .withShadowTransition(top = 5, start = 5)
            .into(lib)
    }
}