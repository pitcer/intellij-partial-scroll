package com.github.pitcer.partialscroll.action.scroll.up

import com.github.pitcer.partialscroll.action.scroll.ScrollSelectionOption
import com.github.pitcer.partialscroll.action.scroll.scrollCaretVertically
import com.github.pitcer.partialscroll.settings.PartialScrollSettingsState
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Caret
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.EditorAction
import com.intellij.openapi.editor.actionSystem.EditorActionHandler

class PartialScrollUpWithSelectionAction : EditorAction(PartialScrollUpWithSelectionActionHandler())

private class PartialScrollUpWithSelectionActionHandler : EditorActionHandler() {

    override fun doExecute(editor: Editor, caret: Caret?, dataContext: DataContext?) {
        val settingsService = PartialScrollSettingsState.getInstance()
        editor.scrollCaretVertically(
            -settingsService.scrollLines,
            ScrollSelectionOption.EXTEND_SELECTION
        )
        super.doExecute(editor, caret, dataContext)
    }
}
