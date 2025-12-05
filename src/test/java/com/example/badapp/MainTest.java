public void testMainWithArguments() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    String[] args = {"John"};
    Main.main(args);
    assertEquals("Starting bad Java app...\n", outContent.toString());
}