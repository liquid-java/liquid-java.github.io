// Path: aliveDone -> aliveNotDone -> aliveDone -> aliveNotDone -> aliveDone
AbstractUndoableEdit edit = new AbstractUndoableEdit();
edit.undo();
edit.redo();
edit.undo();
edit.redo();
