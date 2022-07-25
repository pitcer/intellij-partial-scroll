package com.github.pitcer.partialscroll.action.scroll.up

import com.github.pitcer.partialscroll.action.scroll.scrollViewVertically
import com.github.pitcer.partialscroll.settings.PartialScrollSettingsState
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Caret
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.EditorAction
import com.intellij.openapi.editor.actionSystem.EditorActionHandler

class PartialScrollUpViewAction : EditorAction(PartialScrollUpViewActionHandler())

private class PartialScrollUpViewActionHandler : EditorActionHandler() {

    override fun doExecute(editor: Editor, caret: Caret?, dataContext: DataContext?) {
        val settingsService = PartialScrollSettingsState.getInstance()
        editor.scrollViewVertically(-settingsService.scrollViewLines)
        super.doExecute(editor, caret, dataContext)
    }
}
