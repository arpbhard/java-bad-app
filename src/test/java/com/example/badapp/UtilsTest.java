public void testMd5EmptyInput() {
    String input = "";
    String expectedResult = "d41d8cd98f00b204e9800998ecf8427e";
    assertEquals(expectedResult, Utils.md5(input));
}