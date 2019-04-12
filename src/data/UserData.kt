package src.data

data class UserData(var userName: String, var password:String) {

    override fun toString(): String {
        return "Username = $userName \n" +
                "Password = $password"
    }
}