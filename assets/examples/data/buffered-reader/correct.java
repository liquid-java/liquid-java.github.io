// Path: open -> open -> marked -> marked -> open -> open
BufferedReader br = new BufferedReader(in);
br.read();
br.mark(42);
br.read();
br.reset();
br.read();
