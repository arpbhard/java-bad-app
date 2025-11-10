public void testMainMethodWithNullArgs() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Main.main(null);

    assertEquals("Starting bad Java app...\n", outContent.toString());
}