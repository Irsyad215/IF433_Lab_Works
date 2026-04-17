package oop_99880_Mohamad.Irsyad.Week08

import oop_99880_Mohamad.Irsyad.Week07.BattleState

class NotificationService {
    fun sendEmail(emailAdress: String) {
        println("Sending email ke $emailAdress")
    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki Email")
        }
    }
}