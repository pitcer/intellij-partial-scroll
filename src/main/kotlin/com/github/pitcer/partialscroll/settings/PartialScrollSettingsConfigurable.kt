package com.github.pitcer.partialscroll.settings

import com.intellij.openapi.options.Configurable
import javax.swing.JComponent

class PartialScrollSettingsConfigurable : Configurable {

    private lateinit var settingsComponent: PartialScrollSettingsComponent

    override fun createComponent(): JComponent {
        this.settingsComponent = PartialScrollSettingsComponent()
        return this.settingsComponent.getPanel()
    }

    override fun isModified(): Boolean {
        val settingsService = PartialScrollSettingsState.getInstance()
        return settingsService.scrollLines != this.settingsComponent.getScrollLines()
    }

    override fun apply() {
        val scrollLines = this.settingsComponent.getScrollLines()
        if (scrollLines != null && scrollLines >= 0) {
            val settingsService = PartialScrollSettingsState.getInstance()
            settingsService.scrollLines = scrollLines
        }
    }

    override fun getDisplayName(): String = "Partial Scroll"
}
