package net.monkeyray.mirai

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info
import net.monkeyray.mirai.data.EconomyData
import net.monkeyray.mirai.setting.EconomyConfig

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
        EconomyConfig.reload()
        EconomyData.reload()
        logger.info { "Mirai Economy Plugin loaded" }
    }
}
