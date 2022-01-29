package org.desperu.demoives.utils

import com.unity3d.player.UnityPlayer

object CommunicationBridge {

    fun callToUnityWithNoMessage() {
        UnityPlayer.UnitySendMessage("Earth", "CallFromAndroidWithNoMessage", "")
    }

    fun callToUnityWithMessage(param: String) {
        UnityPlayer.UnitySendMessage("Earth", "CallFromAndroidWithMessage", param)
    }
}