package net.monkeyray.mirai.setting

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

object EconomyConfig : AutoSavePluginConfig("EconomyConfig") {
    @ValueDescription("管理员")
    val admin: Long by value(0L)

    @ValueDescription("临时文件存储目录")
    val tmpDir: String by value("tmp")
}