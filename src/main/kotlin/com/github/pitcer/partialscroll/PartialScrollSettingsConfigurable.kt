package com.github.pitcer.partialscroll

import com.intellij.openapi.options.Configurable
import javax.swing.JComponent

class PartialScrollSettingsConfigurable : Configurable {

    private lateinit var settingsComponent: PartialScrollSettingsComponent

    override fun createComponent(): JComponent {
        this.settingsComponent = PartialScrollSettingsComponent()
        return this.settingsComponent.getPanel()
    }

    override fun isModified(): Boolean {
        return PartialScrollSettingsState.scrollLines != this.settingsComponent.getScrollLines()
    }

    override fun apply() {
        PartialScrollSettingsState.scrollLines = this.settingsComponent.getScrollLines()
    }

    override fun getDisplayName(): String {
        return "Partial Scroll Settings"
    }
}
