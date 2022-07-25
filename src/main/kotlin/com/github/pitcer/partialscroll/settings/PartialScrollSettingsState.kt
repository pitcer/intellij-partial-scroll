package com.github.pitcer.partialscroll.settings

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.components.service
import com.intellij.util.xmlb.XmlSerializerUtil

@State(
    name = "com.github.pitcer.partialscroll.PartialScrollSettings",
    storages = [Storage("PartialScrollSettings.xml")]
)
class PartialScrollSettingsState : PersistentStateComponent<PartialScrollSettingsState> {
    var scrollLines: Int = 0

    var scrollViewLines: Int = 0

    override fun getState(): PartialScrollSettingsState = this

    override fun loadState(state: PartialScrollSettingsState) {
        XmlSerializerUtil.copyBean(state, this)
    }

    companion object {

        fun getInstance(): PartialScrollSettingsState = service()
    }
}
