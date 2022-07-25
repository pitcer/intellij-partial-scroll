package com.github.pitcer.partialscroll.settings

import com.intellij.util.ui.FormBuilder
import javax.swing.JPanel

class PartialScrollSettingsComponent {

    private val panel: JPanel
    private val scrollLinesField: NumberField
    private val scrollViewLinesField: NumberField

    init {
        val settingsService = PartialScrollSettingsState.getInstance()
        val scrollLinesField = NumberField(settingsService.scrollLines, 3)
        val scrollViewLinesField = NumberField(settingsService.scrollViewLines, 3)
        val panel = FormBuilder.createFormBuilder()
            .addLabeledComponent("Scroll lines", scrollLinesField.textField)
            .addLabeledComponent("Scroll view lines", scrollViewLinesField.textField)
            .panel
        this.scrollLinesField = scrollLinesField
        this.scrollViewLinesField = scrollViewLinesField
        this.panel = panel
    }

    fun getPanel(): JPanel = this.panel

    fun getScrollLines(): Int? = this.scrollLinesField.getNumber()

    fun getScrollViewLines(): Int? = this.scrollViewLinesField.getNumber()
}
