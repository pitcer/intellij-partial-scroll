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
        return settingsService.scrollLines != this.settingsComponent.getScrollLines() &&
            settingsService.scrollViewLines != this.settingsComponent.getScrollViewLines()
    }

    override fun apply() {
        val settingsService = PartialScrollSettingsState.getInstance()

        val scrollLines = this.settingsComponent.getScrollLines()
        if (scrollLines != null && scrollLines >= 0) {
            settingsService.scrollLines = scrollLines
        }

        val scrollViewLines = this.settingsComponent.getScrollViewLines()
        if (scrollViewLines != null && scrollViewLines >= 0) {
            settingsService.scrollViewLines = scrollViewLines
        }
    }

    override fun getDisplayName(): String = "Partial Scroll"
}
