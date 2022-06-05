package service

import data.Comment
import data.Note

interface CrudService<T>{
    fun add(item: T): T

    fun getAll() : List<T>
    fun findById(id: Long): T?

}
class CommentService : CrudService<Comment> {

    private val comments = mutableListOf<Comment>()


    override fun add(item: Comment): Comment {
        comments += item
        return comments.last()
    }

    override fun getAll(): List<Comment>  = comments.toList()

   override fun findById(id: Long): Comment? {
        for(comment in comments){
            if (comment.id == id){
                return comment
            }
        }
        return null
    }


}

class NoteService : CrudService<Note> {

    private val notes = mutableListOf<Note>()


    override fun add(item: Note): Note {
        notes += item
        return notes.last()
    }

    override fun getAll(): List<Note>  = notes.toList()

   override fun findById(id: Long): Note? {
        for(note in notes){
            if (note.id == id){
                return note
            }
        }
        return null
    }


}