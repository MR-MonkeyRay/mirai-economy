package net.monkeyray.mirai.data

import net.mamoe.mirai.console.data.AutoSavePluginData
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

object EconomyData :AutoSavePluginData("EconomyData") {
    @ValueDescription("eco")
    val userEconomy: MutableMap<Long, UserEconomy> by value(mutableMapOf())
}