package net.monkeyray.mirai.data

import kotlinx.serialization.Serializable


@Serializable
data class UserEconomy(
    var coins: Long = 0,
    var totalCheckIn: Int = 0,
    var checkInStreak: Long = 0,
)