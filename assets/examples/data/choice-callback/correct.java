// Path: multiple -> multiple -> multiple
// Constructor's last argument is `true`, so the SMT solver
// concludes the result is in state `multiple`.
ChoiceCallback cb = new ChoiceCallback(
    "Pick options", new String[]{"a", "b"}, 0, true);
cb.setSelectedIndexes(new int[]{0});
cb.setSelectedIndexes(new int[]{0, 1});
