package com.github.pitcer.partialscroll.action

import com.intellij.openapi.editor.Editor

fun Editor.scrollRelativelyVertically(lines: Int) {
    val currentScrollOffset = this.scrollingModel.verticalScrollOffset
    this.scrollingModel.scrollVertically(currentScrollOffset + lines * this.lineHeight)
}
