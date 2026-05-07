// Violation: reset() called twice — second call is in state `open`.
BufferedReader br = new BufferedReader(in);
br.mark(42);
br.read();
br.reset();
br.reset();   // INVALID: reset() requires marked(br),
              //          but br is in state open
