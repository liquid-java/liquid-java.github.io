// Violation: redo() called twice in a row — second call is in state aliveDone.
AbstractUndoableEdit edit = new AbstractUndoableEdit();
edit.undo();
edit.redo();
edit.redo();   // INVALID: redo() requires aliveNotDone(edit),
               //          but edit is in state aliveDone
