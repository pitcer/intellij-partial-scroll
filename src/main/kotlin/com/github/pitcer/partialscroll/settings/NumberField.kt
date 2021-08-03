package com.github.pitcer.partialscroll.settings

import java.text.NumberFormat
import javax.swing.JFormattedTextField

class NumberField(
    initialValue: Int = 0,
    maximumDigits: Int = 3
) {

    val textField: JFormattedTextField

    init {
        val format = NumberFormat.getIntegerInstance()
        format.maximumIntegerDigits = maximumDigits
        val field = JFormattedTextField(format)
        field.value = initialValue
        field.columns = maximumDigits
        this.textField = field
    }

    fun getNumber(): Int? = this.textField.text.toIntOrNull()
}
