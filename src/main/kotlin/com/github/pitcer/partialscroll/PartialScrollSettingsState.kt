package com.github.pitcer.partialscroll

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil

@State(
    name = "com.github.pitcer.partialstate",
    storages = [Storage("PartialScrollSettings.xml")]
)
object PartialScrollSettingsState : PersistentStateComponent<PartialScrollSettingsState> {

    var scrollLines: Int = 0

    override fun getState(): PartialScrollSettingsState {
        return this
    }

    override fun loadState(state: PartialScrollSettingsState) {
        XmlSerializerUtil.copyBean(state, this)
    }
}
