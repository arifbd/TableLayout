package com.ennoblesoft.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCollapse.setOnClickListener {collapse()}
        btnStretch.setOnClickListener {stretch()}
        btnShrink.setOnClickListener {shrink()}
    }

    private fun collapse() {
        if (!tableLayout.isColumnCollapsed(1)) {
            btnCollapse.text = "Expand"
            tableLayout.setColumnCollapsed(1, true)
            tableLayout.setColumnCollapsed(2, true)
        }else{
            btnCollapse.text = "Collapse"
            tableLayout.setColumnCollapsed(1, false)
            tableLayout.setColumnCollapsed(2, false)
        }
    }

    private fun stretch() {
        if (!tableLayout.isColumnStretchable(0)) {
            btnStretch.text = "Unstretch"
            tableLayout.setColumnStretchable(0,true)
            tableLayout.setColumnStretchable(1,true)
            tableLayout.setColumnStretchable(2,true)
        }else{
            btnStretch.text = "Stretch"
            tableLayout.setColumnStretchable(0, false)
            tableLayout.setColumnStretchable(1, false)
            tableLayout.setColumnStretchable(2, false)
        }
    }

    private fun shrink() {
        if (!tableLayout.isColumnShrinkable(0)) {
            btnShrink.text = "Unshrink"
            tableLayout.setColumnShrinkable(0, true)
            tableLayout.setColumnShrinkable(1, true)
            tableLayout.setColumnShrinkable(2, true)
        }else{
            btnShrink.text = "Shrink"
            tableLayout.setColumnShrinkable(0, false)
            tableLayout.setColumnShrinkable(1, false)
            tableLayout.setColumnShrinkable(2, false)
        }
    }
}
