package com.github.lvvnv.devtoolslab5

import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class TranslateAction: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.getData(PlatformDataKeys.EDITOR)
        val selectedText = editor?.selectionModel?.selectedText ?: return
        val encoded = URLEncoder.encode(selectedText, StandardCharsets.UTF_8.toString())
        val url = String.format("https://translate.google.com/?hl=en&sl=auto&tl=en&text=%s", encoded)
        BrowserUtil.browse(url)
    }
}