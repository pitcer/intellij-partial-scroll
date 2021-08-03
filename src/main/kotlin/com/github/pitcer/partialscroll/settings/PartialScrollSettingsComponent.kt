package com.github.pitcer.partialscroll.settings

import com.intellij.util.ui.FormBuilder
import javax.swing.JPanel

class PartialScrollSettingsComponent {

    private val panel: JPanel
    private val scrollLinesField: NumberField

    init {
        val settingsService = PartialScrollSettingsState.getInstance()
        val scrollLinesField = NumberField(settingsService.scrollLines, 3)
        val panel = FormBuilder.createFormBuilder()
            .addLabeledComponent("Scroll lines", scrollLinesField.textField)
            .panel
        this.scrollLinesField = scrollLinesField
        this.panel = panel
    }

    fun getPanel(): JPanel = this.panel

    fun getScrollLines(): Int? = this.scrollLinesField.getNumber()
}
