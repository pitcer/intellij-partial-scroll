package com.github.pitcer.partialscroll.action.scroll

import com.intellij.openapi.editor.Editor

fun Editor.scrollViewVertically(lines: Int) {
    val currentScrollOffset = this.scrollingModel.verticalScrollOffset
    this.scrollingModel.scrollVertically(currentScrollOffset + lines * this.lineHeight)
}

enum class ScrollSelectionOption(internal val withSelection: Boolean) {
    EXTEND_SELECTION(true),
    IGNORE_SELECTION(false)
}

fun Editor.scrollCaretVertically(lines: Int, selectionOption: ScrollSelectionOption) {
    this.caretModel.runForEachCaret {
        it.moveCaretRelatively(0, lines, selectionOption.withSelection, true)
    }
}
