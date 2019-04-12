package src.data

data class ErrorData(val errorMessage : String) {
    constructor(errorMessage: String, location: String, localizeMessage: String) : this(errorMessage)
}
