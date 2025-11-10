@Test
public void testMainWithNullUser() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Main.main(new String[]{null});
    assertEquals("Starting bad Java app...\n", outContent.toString());
}