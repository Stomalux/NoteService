package data

data class Note(
    val id: Long = 0,
    val infoDelit: Boolean = false,

    val name: String = "Name-1",
    val text: String = "Text-1",
    val massivComment: List<Comment>? = null


    )