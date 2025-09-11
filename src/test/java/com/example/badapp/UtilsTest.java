public void testMd5EmptyInput() {
    String input = "";
    String expected = "d41d8cd98f00b204e9800998ecf8427e";
    String result = Utils.md5(input);
    assertEquals(expected, result);
}