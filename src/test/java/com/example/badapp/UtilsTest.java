public void testMd5ValidInput() {
    String input = "password123";
    String expected = "482c811da5d5b4bc6d497ffa98491e38";
    String result = Utils.md5(input);
    assertEquals(expected, result);
}