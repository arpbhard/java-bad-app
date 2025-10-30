public class MainTest {

    @Test
    public void testMainMethodWithArgs() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] args = {"John"};
        Main.main(args);
        assertEquals("Starting bad Java app...\n", outContent.toString());
        System.setOut(System.out);
    }
}