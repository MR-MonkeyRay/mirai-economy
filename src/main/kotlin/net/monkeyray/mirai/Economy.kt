package net.monkeyray.mirai

import net.monkeyray.mirai.data.EconomyData.userEconomy
import net.monkeyray.mirai.data.UserEconomy


object Economy {
    fun getCoins(uid: Long): Long {
        require(uid >= 0) {
            "用户ID需为大于等于0的正整数"
        }

        val ue = userEconomy[uid]
        return if(ue == null){
            userEconomy[uid] = UserEconomy()
            0
        }else{
            ue.coins
        }
    }

    fun setCoins(uid: Long, coins: Long): Boolean {
        require(uid >= 0) {
            "用户ID需为大于等于0的正整数"
        }

        val ue = userEconomy[uid]
        if (ue == null) {
            userEconomy[uid] = UserEconomy(coins = coins)
        } else {
            ue.coins = coins
            userEconomy[uid] = ue
        }

        return runCatching { check(userEconomy[uid] != null) }.isSuccess
    }
}