package src

import src.data.DataUtil
import src.data.ErrorData
import src.data.UserData

class Main {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Kotlin: Multiple Constructors Example")

            createUserDataWithPrimaryConstructorOnly()

            createErrorMessageWithPrimaryConstructorOnly()

            createErrorMessageWithSecondaryConstructor()
        }

        fun createUserDataWithPrimaryConstructorOnly() {
            val userData = UserData(DataUtil.USER_NAME_1, DataUtil.PASSWORD_1)
            println(userData.toString())
        }

        fun createErrorMessageWithPrimaryConstructorOnly() {
            val errorMessage = ErrorData(DataUtil.ERROR_MESSAGE_1)
            println(errorMessage)
        }

        fun createErrorMessageWithSecondaryConstructor() {
            val errorMessage = ErrorData(DataUtil.ERROR_MESSAGE_1, DataUtil.LOCATION_SPANISH, DataUtil.LOCALIZE_MESSAGE_1)
            println(errorMessage)
        }
    }
}