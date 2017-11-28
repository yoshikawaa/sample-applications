package io.github.yoshikawaa.sample.app.todo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoForm implements Serializable {

    public static interface TodoCreate {
    };

    public static interface TodoFinish {
    };

    public static interface TodoDelete {
    }

    private static final long serialVersionUID = 1L;

    @NotNull(groups = { TodoFinish.class, TodoDelete.class })
    private String todoId;

    @NotNull(groups = { TodoCreate.class })
    @Size(min = 1, max = 30, groups = { TodoCreate.class })
    private String todoTitle;
}
