public void testMainWithoutArguments() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    String[] args = {};
    Main.main(args);
    assertEquals("Starting bad Java app...\n", outContent.toString());
}