package net.monkeyray.mirai

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "net.monkeyray.mirai-economy",
        name = "插件示例",
        version = "0.1.0"
    ) {
        author("MonkeyRay")
        info(
            """
            这是一个测试插件, 
            在这里描述插件的功能和用法等.
        """.trimIndent()
        )
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
        //配置文件目录 "${dataFolder.absolutePath}/"
    }
}
