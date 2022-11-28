package com.github.lvvnv.devtoolslab5

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelpAction: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val text = "Alt + Shift + A: translate text\n" +
                "Alt + Shift + Y: search text in Yandex\n" +
                "Alt + Shift + L: search text in Google\n" +
                "Alt + Shift + O: search text in StackOverflow\n" +
                "Alt + Shift + Q: search text in Quora\n" +
                "Alt + Shift + D: search text in DuckDuckGo\n"
        Messages.showMessageDialog(text, "Hotkeys", Messages.getInformationIcon())
    }
}