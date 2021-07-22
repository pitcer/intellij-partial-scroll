package com.github.pitcer.partialscroll

import com.intellij.util.ui.FormBuilder
import java.text.NumberFormat
import javax.swing.JFormattedTextField
import javax.swing.JPanel

class PartialScrollSettingsComponent {

    private val panel: JPanel
    private val scrollLinesField: JFormattedTextField

    init {
        val format = NumberFormat.getIntegerInstance()
        format.maximumIntegerDigits = 3
        val field = JFormattedTextField(format)
        field.value = 0
        field.columns = 4
        val panel = FormBuilder.createFormBuilder()
            .addLabeledComponent("Scroll lines", field)
            .panel
        this.scrollLinesField = field
        this.panel = panel
    }

    fun getPanel(): JPanel {
        return this.panel
    }

    fun getScrollLines(): Int {
        return this.scrollLinesField.text.toInt()
    }
}
