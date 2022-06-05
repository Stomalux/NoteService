// Вебинар по теме «Generics и коллекции»


import data.Comment
import data.Note
import service.CommentService
import service.NoteService


fun main() {

    val noteService = NoteService()
    val commentService = CommentService()


    val comment1 = Comment()
    val comment2 = Comment(11, false, "Com1", "ComText11-11-11-11")

    commentService.add(comment1)
    commentService.add(comment2)
    val commentAll1 = commentService.getAll()

    val note1 = Note()
    val note2 = Note(1, false, "111", "Text111111111111")
    val note3 = Note(2, false, "111", "Text111111111111",commentAll1 )

    noteService.add(note1)
    noteService.add(note2)
    noteService.add(note3)

    val noteAll = noteService.getAll()
    println(noteAll)
    println(commentAll1)


}