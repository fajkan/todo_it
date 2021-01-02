package data;

public class TodoSequencer {


    private static int todoId;

        static int nextTodoId(){
            todoId++;
            return todoId;
        }

        static int reset(){
            todoId = 0;
            return todoId;
        }

}
